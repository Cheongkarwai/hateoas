package com.cheong.hateoas.subscription.dto;

import com.cheong.hateoas.user.dto.UserDTO;
import lombok.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Relation(collectionRelation = "subscriptions")
public class SubscriptionDTO extends RepresentationModel<SubscriptionDTO>{

    private String name;

}
