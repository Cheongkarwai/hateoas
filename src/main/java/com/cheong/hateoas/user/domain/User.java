package com.cheong.hateoas.user.domain;

import com.cheong.hateoas.subscription.domain.Subscription;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private Subscription subscription;
}
