package com.example.backendprj.DAO;

import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity getAllEmployee() {
        return null;
    }

    @Override
    public List<EmployeeEntity> getAllEmpById(Long empId) {
        return List.of();
    }

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public EmployeeEntity UpdateEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public EmployeeEntity deleteEmp(Long empId) {
        return null;
    }
}
