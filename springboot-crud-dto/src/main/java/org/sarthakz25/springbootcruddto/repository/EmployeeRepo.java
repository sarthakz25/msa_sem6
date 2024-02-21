package org.sarthakz25.springbootcruddto.repository;

import org.sarthakz25.springbootcruddto.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository // needed in theory exam
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
