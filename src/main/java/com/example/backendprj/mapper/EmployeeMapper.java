package com.example.backendprj.mapper;

import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.model.EmployeeModel;
import lombok.*;

@Builder

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class EmployeeMapper {

    public static EmployeeEntity addToEmployeeEntity(EmployeeModel employeeModel){
        return EmployeeEntity.builder()
                .firstName(employeeModel.getFirstName())
                .lastName(employeeModel.getLastName())
                .phoneNumber(employeeModel.getPhoneNumber())
                .email(employeeModel.getEmail())
                .address(employeeModel.getAddress())
                .aadharNumber(employeeModel.getAadharNumber())
                .createdDate(employeeModel.getCreatedDate())
                .build();
    }

    public static EmployeeModel getEmployeeListFromEntity(EmployeeEntity employeeEntity){
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmpId(employeeEntity.getEmpId());
        employeeModel.setFirstName(employeeEntity.getFirstName());
        employeeModel.setLastName(employeeEntity.getLastName());
        employeeModel.setPhoneNumber(employeeEntity.getPhoneNumber());
        employeeModel.setEmail(employeeEntity.getEmail());
        employeeModel.setAddress(employeeEntity.getAddress());
        employeeModel.setAadharNumber(employeeEntity.getAadharNumber());
        employeeModel.setCreatedDate(employeeEntity.getCreatedDate());
        return employeeModel;
    }
}
