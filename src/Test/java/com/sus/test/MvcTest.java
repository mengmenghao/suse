package com.sus.test;

import com.github.pagehelper.PageInfo;
import com.sus.bean.Subscriber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * 使用Spring测试模块提供的测试请求功能，测试Crud请求的正确性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringJUnitWebConfig(locations = {"classpath:applicationContext.xml","classpath:springMvc.xml"})
public class MvcTest {
    //传入SpringMvc的ioc
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求，获取到处理结果
    MockMvc mockMvc;
    @Before
    public void initMokcMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPage() throws Exception{
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/loginController/emfs").param("pn", "5")).andReturn();
        //请求成功以后，请求域中会有pageInfo:我们可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        System.out.println(request);
        PageInfo attribute = (PageInfo) request.getAttribute("pageInfo");
        System.out.println(attribute);
        System.out.println("当前页码："+attribute.getPageNum());
        System.out.println("总页码："+attribute.getPages());
        System.out.println("总记录数："+attribute.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int[] navigatepageNums = attribute.getNavigatepageNums();
        for (int i:navigatepageNums){
            System.out.print("  "+i);
        }
        //获取用户数据
        List<Subscriber> list = attribute.getList();
        for (Subscriber subscriber:list){
            System.out.println("ID:"+subscriber.getSubscriberId());
            System.out.println("Name:"+subscriber.getSubscriberName());
        }

    }
}
