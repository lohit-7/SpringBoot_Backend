package com.example.backendprj.service;

import com.example.backendprj.DAO.EmployeeDAO;
import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.mapper.EmployeeMapper;
import com.example.backendprj.model.EmployeeModel;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Override
    public List<EmployeeModel> getAllEmp() {
        List<EmployeeEntity> employeeEntities = employeeDAO.getAllEmployee();

        return employeeEntities.stream().map(EmployeeMapper ::getEmployeeListFromEntity).collect(Collectors.toList());
    }

    @Override
    public String saveEmp(EmployeeModel employeeModel) {
      EmployeeEntity employeeEntity = EmployeeMapper.addToEmployeeEntity(employeeModel);

       employeeDAO.addEmployee(employeeEntity);

       return "created successfully";
    }

    @Override
    public EmployeeModel getEmpById(Long empId) {
        return employeeDAO.getAllEmpById(empId)
                .map(EmployeeMapper::getEmployeeListFromEntity)
                .orElse(null);
    }

    @Override
    public void deleteEmp(Long empId) {
        employeeDAO.deleteEmp(empId);
    }

    @Override
    public EmployeeModel updateEmp(Long empId, EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = employeeDAO.getAllEmpById(empId).get();

        if (employeeEntity != null) {
            employeeEntity.setFirstName(employeeModel.getFirstName());
            employeeEntity.setLastName(employeeModel.getLastName());
            employeeEntity.setPhoneNumber(employeeModel.getPhoneNumber());
            employeeEntity.setEmail(employeeModel.getEmail());
            employeeEntity.setAddress(employeeModel.getAddress());
            employeeEntity.setAadharNumber(employeeModel.getAadharNumber());
            employeeEntity.setCreatedDate(employeeModel.getCreatedDate());

            employeeEntity = employeeDAO.addEmployee(employeeEntity);

            return EmployeeMapper.getEmployeeListFromEntity(employeeEntity);
        }
        return null;
    }
}
