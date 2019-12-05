package com.sus.dao;

import com.sus.bean.Subscriber;
import com.sus.bean.SubscriberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscriberMapper {
    long countByExample(SubscriberExample example);

    int deleteByExample(SubscriberExample example);

    int deleteByPrimaryKey(Integer subscriberId);

    int insert(Subscriber record);

    int insertSelective(Subscriber record);

    List<Subscriber> selectByExample(Subscriber example);

    Subscriber selectByPrimaryKey(Integer subscriberId);

    List<Subscriber> selectByExampleWithDormitory(String example);

    Subscriber selectByPrimaryKeyWithDormitory(Integer subscriberId);

    int updateByExampleSelective(@Param("record") Subscriber record, @Param("example") SubscriberExample example);

    int updateByExample(@Param("record") Subscriber record, @Param("example") SubscriberExample example);

    int updateByPrimaryKeySelective(Subscriber record);

    int updateByPrimaryKey(Subscriber record);

    Subscriber login(String subscriberName);
}