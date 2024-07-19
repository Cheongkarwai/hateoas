package com.cheong.hateoas.employee.dto;

import com.cheong.hateoas.account.dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO extends RepresentationModel<EmployeeDTO> {

    private AccountDTO account;

    private List<LeaveDTO> leaves;

    private CompanyDTO company;

    private List<ClaimDTO> claims;
}
