package com.sus.service;

import com.sus.bean.Subscriber;

import java.util.List;

public interface SubscriberService {
    List<Subscriber> showAll();

    void saveSubscriber(Subscriber subscriber);

    boolean checkUser(String subscriberName);

    Subscriber getSubscriber(Integer subscriberId);

    void updateSubscriber(Subscriber subscriber);

    void deleteSubscriber(Integer subscriberId);

    void deleteBath(List<Integer> subscriberIds);
}
