package com.cheong.hateoas.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveDTO {

    private String name;

    private long yearlyEntitlement;

    private long monthlyEntitlement;

    private long total;

    private long taken;
}
