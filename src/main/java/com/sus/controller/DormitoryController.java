package com.sus.controller;

import com.sus.bean.Dormitory;
import com.sus.bean.Floor;
import com.sus.bean.Msg;
import com.sus.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
        System.out.println();
        //查出的所有楼栋信息
        List<Floor> list = dormitoryServiceImpl.getDormitoriess();
        return Msg.success().add("dormitory",list);
    }

}
