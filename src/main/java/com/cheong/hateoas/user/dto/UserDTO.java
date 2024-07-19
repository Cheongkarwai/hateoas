package com.cheong.hateoas.user.dto;

import com.cheong.hateoas.subscription.dto.SubscriptionDTO;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Relation(collectionRelation = "users", itemRelation = "user")
public class UserDTO extends RepresentationModel<UserDTO> {

    private Long id;

    private String username;

    private SubscriptionDTO subscription;
}
