package com.sus.test;
import com.sus.bean.*;
import com.sus.dao.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * 测试dao层的工作
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
    1、导入SpringTest模块
    2、@ContextConfiguration指定Spring配置文件的位置
    3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    SubscriberMapper subscriberMapper;

    @Autowired
    FloorMapper floorMapper;
    @Autowired
    DormitoryMapper dormitoryMapper;
    @Autowired
    DeviceMapper deviceMapper;
    @Autowired
    AnnouncementMapper announcementMapper;
    @Autowired
    SqlSession sqlSession;
    /**
     * 测试SubscriberMapper
     */
    @Test
    public void  testCRUD(){
      /* ///1、创建springIOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从容器中获取mapper
        SubscriberMapper bean = ioc.getBean(SubscriberMapper.class);*/
        System.out.println(subscriberMapper);
        System.out.println(dormitoryMapper);

        //插入楼栋名
//        floorMapper.insertSelective(new Floor(null,"和园2号"));
//        floorMapper.insertSelective(new Floor(null,"和园3号"));
        //插入宿舍名
//        dormitoryMapper.insertSelective(new Dormitory(null,"102",1));
        //插入用户
//        subscriberMapper.insertSelective(new Subscriber(null,"测试用户1","123456",1,2));
        //插入device表
//        deviceMapper.insertSelective(new Device(null,"测试",2,"损坏","admin"));
        //插入announcement
//        announcementMapper.insertSelective(new Announcement(null,"测试","测试","2019",1));
        
        //批量插入
//        SubscriberMapper mapper = sqlSession.getMapper(SubscriberMapper.class);
//        for(int i=0;i<1000;i++){
//           // String s = UUID.randomUUID().toString().substring(0, 5) + i;
//            mapper.insertSelective(new Subscriber(null,"测试用户"+(i+2),"123456",1,1));
//        }
//        System.out.println("批量完成");

        Subscriber subscriber=subscriberMapper.selectByPrimaryKey(1);
        System.out.println(subscriber.getSubscriberName());

    }
}
