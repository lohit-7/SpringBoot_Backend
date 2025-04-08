package com.example.backendprj.service;

import com.example.backendprj.DAO.EmployeeDAO;
import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.mapper.EmployeeMappers;
import com.example.backendprj.model.EmployeeModel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@NoArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired(required = true)
    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeModel> getAllEmp() {
        List<EmployeeEntity> employeeEntities = employeeDAO.getAllEmployee();

        return employeeEntities.stream().map(EmployeeMappers::getEmployeeListFromEntity).collect(Collectors.toList());
    }

    @Override
    public String saveEmp(EmployeeModel employeeModel) {
      EmployeeEntity employeeEntity = EmployeeMappers.addToEmployeeEntity(employeeModel);

       employeeDAO.addEmployee(employeeEntity);

       return "created successfully";
    }

    @Override
    public EmployeeModel getEmpById(Long empId) {
        return employeeDAO.getAllEmpById(empId)
                .map(EmployeeMappers::getEmployeeListFromEntity)
                .orElse(null);
    }

    @Override
    public void deleteEmp(Long empId) {
        employeeDAO.deleteEmp(empId);
    }

    @Override
    public EmployeeModel updateEmp(Long empId, EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = employeeDAO.getAllEmpById(empId).get();

        if(employeeEntity != null){
            employeeEntity.setFirstName(employeeModel.getFirstName());
            employeeEntity.setLastName(employeeModel.getLastName());
            employeeEntity.setPhoneNumber(employeeModel.getPhoneNumber());
            employeeEntity.setEmail(employeeModel.getEmail());
            employeeEntity.setAddress(employeeModel.getAddress());
            employeeEntity.setAadharNumber(employeeModel.getAadharNumber());

            employeeEntity = employeeDAO.addEmployee(employeeEntity);

            return EmployeeMappers.getEmployeeListFromEntity(employeeEntity);
        }
        return null;
    }
}
