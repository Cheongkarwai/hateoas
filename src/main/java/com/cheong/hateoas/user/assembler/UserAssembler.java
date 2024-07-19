package com.cheong.hateoas.user.assembler;

import com.cheong.hateoas.subscription.controller.SubscriptionController;
import com.cheong.hateoas.subscription.dto.SubscriptionDTO;
import com.cheong.hateoas.user.api.UserApi;
import com.cheong.hateoas.user.domain.User;
import com.cheong.hateoas.user.dto.UserDTO;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class UserAssembler implements RepresentationModelAssembler<User, UserDTO> {


    @Override
    public UserDTO toModel(User entity) {

        UserDTO userDTO = UserDTO.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .subscription(SubscriptionDTO.builder()
                        .name(entity.getSubscription().getName())
                        .build())
                .build();
        userDTO.add(linkTo(methodOn(UserApi.class).findById(entity.getId())).withSelfRel());
        userDTO.add(linkTo(methodOn(UserApi.class).save(null)).withRel("save"));
        userDTO.add(linkTo(methodOn(UserApi.class).updateStatusById(entity.getId())).withRel("status"));
        userDTO.add(linkTo(methodOn(SubscriptionController.class).findById(entity.getSubscription().getName())).withRel("subscription"));


        return userDTO;
    }
}
