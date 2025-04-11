package com.example.backendprj.service;

import com.example.backendprj.DAO.EmployeeDAO;
import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.mapper.EmployeeMappers;
import com.example.backendprj.model.EmployeeModel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@NoArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired(required = true)
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeModel> getAllEmp() {
        try {
            List<EmployeeEntity> employeeEntities = employeeDAO.getAllEmployee();
            return employeeEntities.stream()
                    .map(EmployeeMappers::getEmployeeListFromEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); // or throw a custom exception
        }
    }

    @Override
    public String saveEmp(EmployeeModel employeeModel) {
        try {
            EmployeeEntity employeeEntity = EmployeeMappers.addToEmployeeEntity(employeeModel);
            employeeDAO.addEmployee(employeeEntity);
            return "Created successfully";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error saving employee: " + e.getMessage();
        }
    }

    @Override
    public EmployeeModel getEmpById(Long empId) {
        try {
            if (empId != null) {
                return employeeDAO.getAllEmpById(empId)
                        .map(EmployeeMappers::getEmployeeListFromEntity)
                        .orElse(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteEmp(Long empId) {
        try {
            employeeDAO.deleteEmp(empId);
        } catch (Exception e) {
            e.printStackTrace();
            // Optionally throw a custom exception or log error
        }
    }

    @Override
    public EmployeeModel updateEmp(Long empId, EmployeeModel employeeModel) {
        try {
            Optional<EmployeeEntity> optionalEntity = employeeDAO.getAllEmpById(empId);
            if (optionalEntity.isPresent()) {
                EmployeeEntity employeeEntity = optionalEntity.get();
                employeeEntity.setFirstName(employeeModel.getFirstName());
                employeeEntity.setLastName(employeeModel.getLastName());
                employeeEntity.setPhoneNumber(employeeModel.getPhoneNumber());
                employeeEntity.setEmail(employeeModel.getEmail());
                employeeEntity.setAddress(employeeModel.getAddress());
                employeeEntity.setAadharNumber(employeeModel.getAadharNumber());

                employeeEntity = employeeDAO.addEmployee(employeeEntity);
                return EmployeeMappers.getEmployeeListFromEntity(employeeEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
