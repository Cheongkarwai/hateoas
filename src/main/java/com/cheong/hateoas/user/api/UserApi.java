package com.cheong.hateoas.user.api;

import com.cheong.hateoas.user.assembler.UserAssembler;
import com.cheong.hateoas.user.domain.User;
import com.cheong.hateoas.user.dto.UserDTO;
import com.cheong.hateoas.user.dto.UserInput;
import com.cheong.hateoas.user.service.IUserService;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserApi {

    private final UserAssembler userAssembler;

    private final PagedResourcesAssembler<User> pagedResourcesAssembler;

    private final IUserService userService;

    public UserApi(UserAssembler userAssembler,
                   PagedResourcesAssembler<User> pagedResourcesAssembler,
                   IUserService userService) {
        this.userAssembler = userAssembler;
        this.pagedResourcesAssembler = pagedResourcesAssembler;
        this.userService = userService;
    }

    @GetMapping
    public HttpEntity<PagedModel<UserDTO>> findAll(){
        return ResponseEntity.ok(pagedResourcesAssembler.toModel(userService.findAll(), userAssembler));
    }

    @GetMapping("/{id}")
    public HttpEntity<UserDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userAssembler.toModel(userService.findById(id)));
    }

    @PostMapping
    public HttpEntity<Void> save(@RequestBody UserInput userInput) {
        userService.save(userInput);
        return ResponseEntity.created(URI.create("aaa"))
                .build();
    }

    @PutMapping("/{id}")
    public HttpEntity<Void> updateById(@PathVariable Long id, @RequestBody UserInput userInput){
        userService.update(id, userInput);
        return ResponseEntity.noContent()
                .build();
    }

    @DeleteMapping("/{id}")
    public HttpEntity<Void> deleteById(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/status")
    public HttpEntity<Void> updateStatusById(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

}
