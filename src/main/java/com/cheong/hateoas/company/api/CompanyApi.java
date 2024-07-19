package com.cheong.hateoas.company.api;

import com.cheong.hateoas.company.assembler.CompanyAssembler;
import com.cheong.hateoas.company.domain.Company;
import com.cheong.hateoas.company.dto.CompanyDTO;
import com.cheong.hateoas.company.service.ICompanyService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompanyApi {

    private final PagedResourcesAssembler<Company> pagedResourcesAssembler;
    private final CompanyAssembler companyAssembler;

    private final ICompanyService companyService;


    public CompanyApi(PagedResourcesAssembler<Company> pagedResourcesAssembler,
                      CompanyAssembler companyAssembler,
                      ICompanyService companyService) {
        this.pagedResourcesAssembler = pagedResourcesAssembler;
        this.companyAssembler = companyAssembler;
        this.companyService = companyService;
    }

    @GetMapping
    public HttpEntity<PagedModel<CompanyDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(pagedResourcesAssembler.toModel(companyService.findAll(pageable), companyAssembler));
    }

    @GetMapping("/{code}")
    public HttpEntity<CompanyDTO> findById(@PathVariable String code) {
        return ResponseEntity.ok(companyAssembler.toModel(companyService.findById(code)));
    }


}
