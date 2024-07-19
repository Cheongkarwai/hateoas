package com.cheong.hateoas.employee.api;

import com.cheong.hateoas.employee.dto.EmployeeDTO;
import com.cheong.hateoas.employee.dto.EmployeeInput;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeApi {

    @GetMapping
    public HttpEntity<PagedModel<EmployeeDTO>> findAll(Pageable pageable){
        return null;
    }

    @GetMapping("/{id}")
    public HttpEntity<EmployeeDTO> findById(@PathVariable Long id){
        return null;
    }

    @PostMapping
    public HttpEntity<Void> save(@RequestBody EmployeeInput employeeInput){
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public HttpEntity<Void> updateById(@PathVariable Long id, @RequestBody EmployeeInput employeeInput){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public HttpEntity<Void> deleteById(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }
}
