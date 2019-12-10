package com.sus.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sus.bean.Dormitory;
import com.sus.bean.Floor;
import com.sus.bean.Msg;
import com.sus.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * 处理与宿舍楼栋有关的请求
 */
@Controller
@RequestMapping("/dormitory")
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryServiceImpl;

    /**
     * 返回所有的楼栋信息
     */
    @RequestMapping("/getFloor")
    @ResponseBody
    public Msg getFloor(){
        System.out.println("访问楼栋信息");
        //查出的所有楼栋信息
        List<Floor> list = dormitoryServiceImpl.getFloor();
        return Msg.success().add("floor",list);
    }

    @RequestMapping("/getDormitory")
    @ResponseBody
    public Msg getDormitory(@RequestParam(value = "floorId",defaultValue = "1")Integer floorId){
        System.out.println("访问寝室信息");
        System.out.println(floorId);
        //查出的所有楼栋信息
        List<Dormitory> list = dormitoryServiceImpl.getDormitory(floorId);
        return Msg.success().add("dormitory",list);
    }

    @RequestMapping(value = "/getDormitories/{floorId}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getDormitorys(@PathVariable("floorId")Integer floorId){
        System.out.println("更改访问寝室信息");
        System.out.println(floorId);
        //查出的所有楼栋信息
        List<Dormitory> list = dormitoryServiceImpl.getDormitories(floorId);
        return Msg.success().add("dormitory",list);
    }
    @RequestMapping(value = "/getFloors",method = RequestMethod.GET)
    @ResponseBody
    public Msg getFloors(){
        System.out.println("更改访问寝室信息");
        //查出的所有楼栋信息
        List<Floor> list = dormitoryServiceImpl.getDormitories();
        return Msg.success().add("dormitory",list);
    }
    /**
     * 查询当前楼栋所有寝室
     *
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/getDormitory/{FloorId}")
    @ResponseBody
    public Msg getDormitory(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model, @PathVariable("FloorId") Integer FloorId) {
        System.out.println("执行getDormitory");
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及分页的大小
        PageHelper.startPage(pn, 5);
        //startPage后面紧跟的这个查询就是一个分页查询
        List<Dormitory> dormitories = dormitoryServiceImpl.showAll(FloorId);
        //使用PageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page = new PageInfo(dormitories, 5);
        return Msg.success().add("pageInfo", page);
    }
    /**
     * 检查寝室名是否可用
     * @param dormitoryName
     * @return
     */
    @RequestMapping("/checkDormitoryName")
    @ResponseBody
    public Msg checkDormitoryName(@RequestParam("dormitoryName") String dormitoryName, @RequestParam("floorId") Integer floorId){
        System.out.println(dormitoryName);
        System.out.println(floorId);
        //数据库用户名重复校验
        boolean b=dormitoryServiceImpl.checkDormitoryName(dormitoryName,floorId);
        if (b){
            return Msg.success();
        }else{
            return Msg.fail().add("va_msg","寝室名不可用");
        }
    }
    /**
     * 添加保存寝室
     * @param dormitory
     * @param result
     * @return
     */
    @RequestMapping(value = "/saveDormitory", method = RequestMethod.POST)
    @ResponseBody
    public Msg saveFloor(@Valid Dormitory dormitory, BindingResult result) {
        System.out.println("添加保存楼栋");
        System.out.println(dormitory.getFloorId());
        System.out.println(dormitory.getDormitoryName());
        dormitoryServiceImpl.saveDormitory(dormitory);
        return Msg.success();

    }
    /**
     * 根据ID查询当前修改的寝室信息
     * @param dormitoryId
     * @return
     */
    @RequestMapping(value = "/getUpdateDormitory/{dormitoryId}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getUpdateFloor(@PathVariable("dormitoryId") Integer dormitoryId){
        System.out.println("修改寝室信息时的寝室ID："+dormitoryId);
        Dormitory dormitory = dormitoryServiceImpl.getUpdateDormitory(dormitoryId);
        return Msg.success().add("dormitory",dormitory);
    }
    /**
     * 保存修改的寝室名
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateDormitory/{dormitoryId}",method = RequestMethod.PUT)
    public Msg saveSubscriber(@PathVariable Integer dormitoryId, String dormitoryName){
        System.out.println("保存修改的寝室名"+dormitoryName);
        System.out.println("保存修改的寝室的ID"+dormitoryId);
        dormitoryServiceImpl.updateDormitory(dormitoryId,dormitoryName);
        return Msg.success();
    }

    /**
     * 单个批量二合一删除
     * 批量删除：1-2-3
     * 单个删除：1
     * @param dormitoryIds
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteDormitory/{dormitoryIds}",method = RequestMethod.DELETE)
    public Msg deleteFloor(@PathVariable("dormitoryIds")String dormitoryIds){
        System.out.println("删除");
        //批量删除
        if (dormitoryIds.contains("-")){
            System.out.println("多个删除");
            List<Integer> del_dormitoryIds = new ArrayList<>();
            String[] str_dormitoryIds = dormitoryIds.split("-");
            //组装id的集合
            for (String string : str_dormitoryIds){
                del_dormitoryIds.add(Integer.parseInt(string));
            }
            dormitoryServiceImpl.deleteBath(del_dormitoryIds);
        }else {
            System.out.println("单个删除");
            Integer dormitoryId = Integer.parseInt(dormitoryIds);
            dormitoryServiceImpl.deleteDormitory(dormitoryId);
        }

        return Msg.success();
    }

}
