package com.cheong.hateoas.company.service;

import com.cheong.hateoas.company.domain.Company;
import com.cheong.hateoas.company.repository.CompanyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public Page<Company> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Company findById(String code) {
        return null;
    }

}
