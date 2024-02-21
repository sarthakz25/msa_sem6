package org.sarthakz25.springbootcruddto.service;

import lombok.AllArgsConstructor;
import org.sarthakz25.springbootcruddto.dto.EmployeeDTO;
import org.sarthakz25.springbootcruddto.entity.Employee;
import org.sarthakz25.springbootcruddto.mapper.EmpMapper;
import org.sarthakz25.springbootcruddto.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {
    EmployeeRepo repo;

    @Override
    public EmployeeDTO createEmp(EmployeeDTO employeeDTO) {
        // to convert dto to jpa
        Employee employee = EmpMapper.mapToEmp(employeeDTO);

        Employee newEmp = repo.save(employee);

        // to convert jpa to dto
        EmployeeDTO savedEmpDto = EmpMapper.mapToEmpDTO(newEmp);

        return savedEmpDto;
    }

    @Override
    public EmployeeDTO getEmpById(int id) {
        Optional<Employee> optionalEmployee = repo.findById(id);
        Employee employee = optionalEmployee.get();

        return EmpMapper.mapToEmpDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmp() {
        List<Employee> employees = repo.findAll();
        return employees.stream().map(EmpMapper::mapToEmpDTO).collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO updateEmp(EmployeeDTO employeeDTO) {
        Employee existingEmp = repo.findById(employeeDTO.getId()).get();
        existingEmp.setName(employeeDTO.getName());
        existingEmp.setEmail(employeeDTO.getEmail());
        existingEmp.setSalary(employeeDTO.getSalary());

        Employee updatedEmp = repo.save(existingEmp);

        return EmpMapper.mapToEmpDTO(updatedEmp);
    }

    @Override
    public void deleteEmp(int id) {
        repo.deleteById(id);
    }
}



