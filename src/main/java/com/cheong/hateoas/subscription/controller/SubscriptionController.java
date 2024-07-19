package com.cheong.hateoas.subscription.controller;

import com.cheong.hateoas.subscription.assembler.SubscriptionAssembler;
import com.cheong.hateoas.subscription.dto.SubscriptionDTO;
import com.cheong.hateoas.subscription.service.ISubscriptionService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    private final SubscriptionAssembler subscriptionAssembler;

    private final ISubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionAssembler subscriptionAssembler,
                                  ISubscriptionService subscriptionService){
        this.subscriptionAssembler = subscriptionAssembler;
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public HttpEntity<CollectionModel<SubscriptionDTO>> findAll(){
        return ResponseEntity.ok(subscriptionAssembler.toCollectionModel(subscriptionService.findAll()));
    }

    @GetMapping("/{id}")
    public HttpEntity<SubscriptionDTO> findById(@PathVariable String id){
        return ResponseEntity.ok(subscriptionAssembler.toModel(subscriptionService.findById(id)));
    }
}
