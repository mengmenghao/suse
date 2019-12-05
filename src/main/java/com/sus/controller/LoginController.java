package com.sus.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sus.bean.Msg;
import com.sus.bean.Subscriber;
import com.sus.service.LoginService;
import com.sus.service.SubscriberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理登录请求
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {
    @Resource
    LoginService loginServiceImpl;
    @Resource
    SubscriberService subscriberServiceImpl;

    @RequestMapping("{page}")
    public String main(@PathVariable String page){
        System.out.println("restful");
        return page;
    }

    @RequestMapping("/login")
    public String login(Subscriber subscriber, HttpSession session){
        System.out.println("用户名："+subscriber.getSubscriberName());

        Subscriber subscribers=loginServiceImpl.login(subscriber.getSubscriberName());
        System.out.println(subscribers);
        //System.out.println(subscribers.getSubscriberName());
        if (subscriber.getSubscriberName().equals("")||subscriber.getSubscriberName()==null){
            System.out.println("请输入用户名");
            return "redirect:/index.jsp";
        }else if(subscribers.equals("") || subscribers==null){
            System.out.println("无此账户");
            return "redirect:/index.jsp";
            //return "admin";
        }else if (subscribers.getSubscriberPassword()==null){
            System.out.println("请输入密码");
            return "redirect:/index.jsp";
        }else if (!(subscribers.getSubscriberPassword().equals(subscriber.getSubscriberPassword()))){
            System.out.println("密码错误");
            return "redirect:/index.jsp";
        }else if (subscribers.getSubscriberPermission().equals(3)){
            System.out.println("管理员");
            session.setAttribute("users", subscribers);
            return "inde";
        }else if(subscribers.getSubscriberPermission().equals(2)){
            session.setAttribute("users", subscribers);
            return "sustube";
        }else if (subscribers.getSubscriberPermission().equals(1)){
            session.setAttribute("users", subscribers);
            return "student";
        }else {
            return "banned";
        }

    }

    /**
     * 查询所有用户数据（分页查询)
     * @return
     */
    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        System.out.println("执行emps");
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及分页的大小
        PageHelper.startPage(pn,5);
        //startPage后面紧跟的这个查询就是一个分页查询
        List<Subscriber> subscribers = subscriberServiceImpl.showAll();
        //使用PageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page=new PageInfo(subscribers,5);
        model.addAttribute("pageInfo",page);
        return "admin";
    }

    /**
     * 导入Jackson包
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/emfs")
    @ResponseBody
    public Msg getEmpsEithJson(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        System.out.println("执行emfs");
        //引入PageHelper分页插件
        //在查询之前只需要调用,传入页码，以及分页的大小
        PageHelper.startPage(pn,5);
        //startPage后面紧跟的这个查询就是一个分页查询
        List<Subscriber> subscribers = subscriberServiceImpl.showAll();
        //使用PageInfo包装查询后的结果,只需要将pageInfo交给页面就行了
        //封装了详细的分页信息，包括有我们查询出来的数据,传入连续显示的页数
        PageInfo page=new PageInfo(subscribers,5);
        return Msg.success().add("pageInfo",page);
    }

    /**
     * 用户保存
     * 1、支持JSR303校验
     * 2、导入Hibernate-Validator
     * @param subscriber
     * @return
     */
    @RequestMapping(value="/emf", method =RequestMethod.POST)
    @ResponseBody
    public Msg saveSubscribers(@Valid Subscriber subscriber, BindingResult result){
        System.out.println("保存用户验证");
        if (result.hasErrors()) {
            //校验失败，应该返回失败，在模态框中显示校验失败的错误信息
            Map<String,Object> map = new HashMap<>();
            List<FieldError> errors =  result.getFieldErrors();
            for (FieldError fieldError:errors){
                System.out.println("错误的字段名"+fieldError.getField());
                System.out.println("错误的信息"+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return Msg.fail().add("errorFields",map);
        }else {
            subscriberServiceImpl.saveSubscriber(subscriber);
            return Msg.success();
        }
    }

    /**
     * 检查用户名是否可用
     * @param subscriberName
     * @return
     */
    @RequestMapping("checkUser")
    @ResponseBody
    public Msg checkUser(@RequestParam("subscriberName") String subscriberName){
        System.out.println(subscriberName);
        //先判断用户名是否是合法表达式
        String regx = "(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})";
        if(!subscriberName.matches(regx)){
            return Msg.fail().add("va_msg","用户名必须是4-16位数字和字母的组合或者2-5位中文");
        }
        //数据库用户名重复校验
        boolean b=subscriberServiceImpl.checkUser(subscriberName);
        if (b){
            return Msg.success();
        }else{
            return Msg.fail().add("va_msg","用户名不可用");
        }
    }

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
     * @param subscriberId
     * @return
     */
//    @RequestMapping(value = "/saveSubscriber/{subscriberId}",method = RequestMethod.PUT)
//    @ResponseBody
//    public Msg saveSubscriber(@PathVariable("subscriberId") Integer subscriberId){
//        System.out.println("保存更改信息");
//        Subscriber subscriber = subscriberServiceImpl.getSubscriber(subscriberId);
//        return Msg.success().add("subscriber",subscriber);
//    }

    /**
     * 根据Id查询员工
     * @param subscriberId
     * @return
     */
    @RequestMapping(value = "/getSubscriber/{subscriberId}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getSubscriber(@PathVariable("subscriberId") Integer subscriberId){
        Subscriber subscriber = subscriberServiceImpl.getSubscriber(subscriberId);
        return Msg.success().add("subscriber",subscriber);
    }

}
