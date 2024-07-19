package com.cheong.hateoas.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO extends RepresentationModel<CompanyDTO> {

    private String code;

    private String name;
}
