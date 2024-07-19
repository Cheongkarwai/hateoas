package com.cheong.hateoas.account.assembler;

import com.cheong.hateoas.account.dto.AccountDTO;
import com.cheong.hateoas.account.domain.Account;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class AccountAssembler implements RepresentationModelAssembler<Account, AccountDTO> {

    @Override
    public AccountDTO toModel(Account entity) {
        return null;
    }
}
