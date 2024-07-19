package com.cheong.hateoas.subscription.service;

import com.cheong.hateoas.subscription.domain.Subscription;

import java.util.List;

public interface ISubscriptionService {

    List<Subscription> findAll();

    Subscription findById(String id);
}
