package com.sus.controller;

import com.sus.bean.Msg;
import com.sus.bean.Subscriber;
import com.sus.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理和用户有关的信息
 */
@Controller
@RequestMapping("/subscriber")
public class SubscriberController {
    @Autowired
    SubscriberService subscriberServiceImpl;
    /**
     * 如果直接发送Ajax=PUT形式的请求
     * 封装的数据除了ID全是null
     *
     * 问题：
     * 请求体中有数据
     * subscriber对象封装不上
     *
     * 原因：
     * Tomcat:
     *      1、将请求体中的数据，封装一个map;
     *      2、request.getParameter("subscriberName")就会从这个map中取值
     *      3、SpringMVC封装POJO对象的时候
     *              会把POJO中每个属性的值，request.getParamter("subscriberPassword");
     * AJAX发送PUT请求引发的血案：
     *       PUT请求，请求体中的数据，request.getParameter("subscriberName")拿不到
     *       Tomcat一看是PUT不会封装请求体中的数据为map，只有POST形式的请求才封装请求体为map
     *我们要能支持直接发送PUT之类的请求还要封装请求体中的数据
     * 1、配置上HttpPutFormContentFilter：
     * 2、他的作用：将请求体中的数据包装成一个map
     * 3、request被重新包装，request.getParameter()被重写，就会从自己封装的map中获取数据
     * @param subscriber
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveSubscriber/{subscriberId}",method = RequestMethod.PUT)
    public Msg saveSubscriber(Subscriber subscriber){
        System.out.println(subscriber);
        subscriberServiceImpl.updateSubscriber(subscriber);
        return Msg.success();
    }

    /**
     * 单个批量二合一删除
     * 批量删除：1-2-3
     * 单个删除：1
     * @param subscriberIds
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/deleteSubscriber/{subscriberIds}",method = RequestMethod.DELETE)
    public Msg deleteSubscriber(@PathVariable("subscriberIds")String subscriberIds){
        //批量删除
        if (subscriberIds.contains("-")){
            List<Integer> del_subscriberIds = new ArrayList<>();
            String[] str_subscriberIds = subscriberIds.split("-");
            //组装id的集合
            for (String string : str_subscriberIds){
                del_subscriberIds.add(Integer.parseInt(string));
            }
            subscriberServiceImpl.deleteBath(del_subscriberIds);
        }else {
            Integer subscriberId = Integer.parseInt(subscriberIds);
            subscriberServiceImpl.deleteSubscriber(subscriberId);
        }

        return Msg.success();
    }
}
