package com.cheong.hateoas.company.service;

import com.cheong.hateoas.company.domain.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICompanyService {

    Page<Company> findAll(Pageable pageable);

    Company findById(String code);
}
