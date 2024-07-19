package com.cheong.hateoas.account.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO extends RepresentationModel<AccountDTO> {

    private String firstName;

    private String lastName;

    private EmailAddressDTO emailAddress;

    private ContactDTO contact;

    private Instant lastActive;


}
