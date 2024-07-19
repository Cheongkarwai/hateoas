package com.cheong.hateoas.company.assembler;

import com.cheong.hateoas.company.api.CompanyApi;
import com.cheong.hateoas.company.domain.Company;
import com.cheong.hateoas.company.dto.CompanyDTO;
import com.cheong.hateoas.root.dto.RootResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class CompanyAssembler implements RepresentationModelAssembler<Company, CompanyDTO> {

    @Override
    public CompanyDTO toModel(Company entity) {

        RootResource rootResource = new RootResource();
        List<Link> links = new ArrayList<>();
        //Root Links
        links.add(linkTo(methodOn(CompanyApi.class).findAll(null)).withRel("companies"));

        return null;
    }
}
