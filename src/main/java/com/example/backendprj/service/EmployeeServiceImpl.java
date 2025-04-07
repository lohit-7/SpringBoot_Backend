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
    public EmployeeModel saveEmp(EmployeeModel employeeModel) {
        return null;
    }

    @Override
    public Optional<EmployeeModel> getEmpById(Long empId) {
        return Optional.empty();
    }

    @Override
    public void deleteEmp(Long empId) {

    }
}
