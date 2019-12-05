package com.sus.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sus.bean.Floor;
import com.sus.bean.Msg;
import com.sus.service.FloorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/floor")
public class FloorController {
    @Resource
    FloorService floorServiceImpl;

    /**
     * 查询所有楼栋
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/getFloor")
    @ResponseBody
    public Msg getFloorJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
        System.out.println("执行getFloorJson");
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及分页的大小
        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        List<Floor> subscribers = floorServiceImpl.showAll();
        //使用PageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(subscribers, 5);
        return Msg.success().add("pageInfo", page);
    }

    /**
     * 添加保存楼栋
     * @param floor
     * @param result
     * @return
     */
    @RequestMapping(value = "/saveFloor", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveFloor(@Valid Floor floor, BindingResult result) {
        System.out.println("添加保存楼栋");
        floorServiceImpl.saveSubscriber(floor);
        return Msg.success();

    }
    /**
     * 检查用户名是否可用
     * @param floorName
     * @return
     */
    @RequestMapping("/checkFloorName")
    @ResponseBody
    public Msg checkFloorName(@RequestParam("floorName") String floorName){
        System.out.println(floorName);
        //数据库用户名重复校验
        boolean b=floorServiceImpl.checkFloorName(floorName);
        if (b){
            return Msg.success();
        }else{
            return Msg.fail().add("va_msg","用户名不可用");
        }
    }

    /**
     * 根据ID查询当前修改的楼栋信息
     * @param floorId
     * @return
     */
    @RequestMapping(value = "/getUpdateFloor/{floorId}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getUpdateFloor(@PathVariable("floorId") Integer floorId){
        Floor floor = floorServiceImpl.getUpdateFloor(floorId);
        return Msg.success().add("floor",floor);
    }

    /**
     * 保存修改的楼栋名
     * @param floor
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateFloor/{floorId}",method = RequestMethod.PUT)
    public Msg saveSubscriber(Floor floor){
        System.out.println(floor);
        floorServiceImpl.updateSubscriber(floor);
        return Msg.success();
    }
    /**
     * 单个批量二合一删除
     * 批量删除：1-2-3
     * 单个删除：1
     * @param floorIds
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteFloor/{floorIds}",method = RequestMethod.DELETE)
    public Msg deleteFloor(@PathVariable("floorIds")String floorIds){
        System.out.println("删除");
        //批量删除
        if (floorIds.contains("-")){
            System.out.println("多个删除");
            List<Integer> del_floorIds = new ArrayList<>();
            String[] str_floorIds = floorIds.split("-");
            //组装id的集合
            for (String string : str_floorIds){
                del_floorIds.add(Integer.parseInt(string));
            }
            floorServiceImpl.deleteBath(del_floorIds);
        }else {
            System.out.println("单个删除");
            Integer floorId = Integer.parseInt(floorIds);
            floorServiceImpl.deleteFloor(floorId);
        }

        return Msg.success();
    }
}
