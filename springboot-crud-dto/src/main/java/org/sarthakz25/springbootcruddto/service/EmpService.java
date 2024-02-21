package org.sarthakz25.springbootcruddto.service;

import org.sarthakz25.springbootcruddto.dto.EmployeeDTO;

import java.util.List;

public interface EmpService {
    EmployeeDTO createEmp(EmployeeDTO employeeDTO);

    EmployeeDTO getEmpById(int id);

    List<EmployeeDTO> getAllEmp();

    EmployeeDTO updateEmp(EmployeeDTO employeeDTO);

    void deleteEmp(int id);
}
