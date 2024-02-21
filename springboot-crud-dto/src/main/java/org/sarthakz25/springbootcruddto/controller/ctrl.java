package org.sarthakz25.springbootcruddto.controller;

import lombok.AllArgsConstructor;
import org.sarthakz25.springbootcruddto.dto.EmployeeDTO;
import org.sarthakz25.springbootcruddto.service.EmpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ctrl {
    EmpService service;

    @PostMapping("/create")
    public ResponseEntity<EmployeeDTO> createEmp(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeDTO newEmp = service.createEmp(employeeDTO);

        return new ResponseEntity<>(newEmp, HttpStatus.CREATED);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<EmployeeDTO> getEmpById(@PathVariable("id") int id) {
        EmployeeDTO employee = service.getEmpById(id);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDTO>> getAllEmp() {
        List<EmployeeDTO> employees = service.getAllEmp();

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDTO> updateEmp(@PathVariable("id") int id, @RequestBody EmployeeDTO employeeDTO) {
        employeeDTO.setId(id);
        EmployeeDTO updatedEmp = service.updateEmp(employeeDTO);

        return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable int id) {
        service.deleteEmp(id);

        return new ResponseEntity<>("employee with id:" + id + " deleted!", HttpStatus.OK);
    }
}
