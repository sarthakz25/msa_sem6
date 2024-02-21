package org.sarthakz25.springbootcruddto.mapper;

import org.sarthakz25.springbootcruddto.dto.EmployeeDTO;
import org.sarthakz25.springbootcruddto.entity.Employee;

public class EmpMapper {
    // to convert jpa entity into dto
    public static EmployeeDTO mapToEmpDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getSalary()
        );

        return employeeDTO;
    }

    // to convert dto into jpa entity
    public static Employee mapToEmp(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getName(),
                employeeDTO.getEmail(),
                employeeDTO.getSalary()
        );

        return employee;
    }

}
