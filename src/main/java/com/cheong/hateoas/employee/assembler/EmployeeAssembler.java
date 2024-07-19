package com.cheong.hateoas.employee.assembler;

import com.cheong.hateoas.employee.domain.Employee;
import com.cheong.hateoas.employee.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeAssembler implements RepresentationModelAssembler<Employee, EmployeeDTO> {
    @Override
    public EmployeeDTO toModel(Employee entity) {
        return null;
    }
}
