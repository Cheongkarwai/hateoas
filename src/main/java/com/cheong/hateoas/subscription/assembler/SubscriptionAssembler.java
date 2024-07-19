package com.cheong.hateoas.subscription.assembler;

import com.cheong.hateoas.subscription.controller.SubscriptionController;
import com.cheong.hateoas.subscription.domain.Subscription;
import com.cheong.hateoas.subscription.dto.SubscriptionDTO;
import com.cheong.hateoas.user.dto.UserDTO;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class SubscriptionAssembler extends RepresentationModelAssemblerSupport<Subscription, SubscriptionDTO> {


    public SubscriptionAssembler() {
        super(SubscriptionController.class, SubscriptionDTO.class);
    }

    @Override
    public SubscriptionDTO toModel(Subscription entity) {
        SubscriptionDTO subscriptionDTO = SubscriptionDTO
                .builder()
                .name(entity.getName())
                .build();
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername("Hi");
        //subscriptionDTO.setUser(userDTO);

        subscriptionDTO.add(linkTo(methodOn(SubscriptionController.class).findById(subscriptionDTO.getName())).withSelfRel());
       // subscriptionDTO.add(linkTo(methodOn(UserController.class).findById(entity.getUserDTO().getId())).withRel("user"));

        System.out.println(subscriptionDTO.getLinks());
        return subscriptionDTO;
    }

    @Override
    public CollectionModel<SubscriptionDTO> toCollectionModel(Iterable<? extends Subscription> entities) {
        CollectionModel<SubscriptionDTO> actorModels = super.toCollectionModel(entities);

        actorModels.add(linkTo(methodOn(SubscriptionController.class).findAll()).withSelfRel());

        return actorModels;
    }
}
