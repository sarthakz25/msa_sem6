package org.sarthakz25.springbootcruddto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.sarthakz25.springbootcruddto.entity.Address;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    int id;
    String name;
    String email;
    double salary;
    Address address;
}
