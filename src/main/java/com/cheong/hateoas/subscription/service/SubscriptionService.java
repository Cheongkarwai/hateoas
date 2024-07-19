package com.cheong.hateoas.subscription.service;

import com.cheong.hateoas.subscription.domain.Subscription;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SubscriptionService implements ISubscriptionService {


    @Override
    public List<Subscription> findAll() {
        return List.of(Subscription.builder()
                .name("Hi")
                .build());
    }

    @Override
    public Subscription findById(String id) {
        return Subscription.builder()
                .name("Hi")
                .build();
    }
}
