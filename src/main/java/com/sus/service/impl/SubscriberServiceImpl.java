package com.sus.service.impl;

import com.sus.bean.Msg;
import com.sus.bean.Subscriber;
import com.sus.bean.SubscriberExample;
import com.sus.dao.SubscriberMapper;
import com.sus.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberServiceImpl implements SubscriberService{
    @Autowired
    SubscriberMapper subscriberMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Subscriber> showAll() {
        return subscriberMapper.selectByExampleWithDormitory(null);
    }

    /**
     * 用户保存
     * @param subscriber
     */
    @Override
    public void saveSubscriber(Subscriber subscriber) {
        subscriberMapper.insertSelective(subscriber);
    }

    /**
     * 检验用户名是否可用
     * @param subscriberName
     * @return true:代表当前姓名可用
     *          false：代表当前姓名不可用
     */
    @Override
    public boolean checkUser(String subscriberName) {
        SubscriberExample example = new SubscriberExample();
        SubscriberExample.Criteria criteria = example.createCriteria();
        criteria.andSubscriberNameEqualTo(subscriberName);
        long count = subscriberMapper.countByExample(example);
        return count==0;
    }

    /**
     * 按照用户Id查询用户
     * @param subscriberId
     * @return
     */
    @Override
    public Subscriber getSubscriber(Integer subscriberId) {
        Subscriber subscriber = subscriberMapper.selectByPrimaryKeyWithDormitory(subscriberId);
        return subscriber;
    }
    /**
     * 用户更新
     * @param subscriber
     */
    @Override
    public void updateSubscriber(Subscriber subscriber) {
        subscriberMapper.updateByPrimaryKeySelective(subscriber);
    }

    /**
     * 用户删除
     * @param subscriberId
     */
    @Override
    public void deleteSubscriber(Integer subscriberId) {
        subscriberMapper.deleteByPrimaryKey(subscriberId);
    }

    /**
     * 多个用户的删除
     * @param subscriberIds
     */
    @Override
    public void deleteBath(List<Integer> subscriberIds) {
        SubscriberExample example = new SubscriberExample();
        SubscriberExample.Criteria criteria = example.createCriteria();
        criteria.andSubscriberIdIn(subscriberIds);
        subscriberMapper.deleteByExample(example);
    }
}
