package com.cheong.hateoas.account.api;

import com.cheong.hateoas.account.dto.AccountDTO;
import com.cheong.hateoas.account.domain.Account;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/accounts")
public class AccountApi {

    @GetMapping
    public HttpEntity<PagedModel<Account>> findAll(Pageable pageable) {
        return null;
    }

    @GetMapping("/me")
    public HttpEntity<AccountDTO> findCurrentLoggedInUserAccount() {
        return ResponseEntity.ok()
                .build();
    }

    @PutMapping("/me")
    public HttpEntity<Void> updateCurrentLoggedInUserAccount() {
        return ResponseEntity.ok()
                .build();
    }

    @DeleteMapping("/me")
    public HttpEntity<Void> deleteCurrentLoggedInUserAccount() {
        return ResponseEntity.ok()
                .build();
    }

    @PostMapping
    public HttpEntity<Void> save() {
        return ResponseEntity.created(URI.create("a"))
                .build();
    }

}
