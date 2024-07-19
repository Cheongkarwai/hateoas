package com.cheong.hateoas.company.repository;

import com.cheong.hateoas.company.domain.Company;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CompanyRepository extends CassandraRepository<Company, String> {


}
