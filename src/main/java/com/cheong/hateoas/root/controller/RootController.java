package com.cheong.hateoas.root.controller;

import com.cheong.hateoas.account.api.AccountApi;
import com.cheong.hateoas.company.api.CompanyApi;
import com.cheong.hateoas.employee.api.EmployeeApi;
import com.cheong.hateoas.root.dto.RootResource;
import com.cheong.hateoas.user.api.UserApi;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class RootController {

    @GetMapping
    public HttpEntity<RootResource> findRoot() {
        RootResource rootResource = new RootResource();
        List<Link> links = new ArrayList<>();
        //Root Links
        links.add(linkTo(methodOn(UserApi.class).findAll()).withRel("users"));
        links.add(linkTo(methodOn(CompanyApi.class).findAll(null)).withRel("companies"));
        links.add(linkTo(methodOn(EmployeeApi.class).findAll(null)).withRel("employees"));
        links.add(linkTo(methodOn(AccountApi.class).findAll(null)).withRel("accounts"));
        rootResource.add(links);

        return ResponseEntity.ok(rootResource);
    }

}