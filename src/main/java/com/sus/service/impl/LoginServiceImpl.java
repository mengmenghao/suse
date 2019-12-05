package com.sus.service.impl;

import com.sus.bean.Subscriber;
import com.sus.dao.SubscriberMapper;
import com.sus.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    SubscriberMapper subscriberMapper;
    @Override
    public Subscriber login(String subscriberName) {
        Subscriber subscriber=subscriberMapper.login(subscriberName);
        return subscriber;
    }
}
