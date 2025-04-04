package com.example.backendprj.DAO;

import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getAllEmpById(Long empId) {
        return employeeRepository.findById(empId);
    }

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public EmployeeEntity UpdateEmployee(Long empId, EmployeeEntity employeeEntity) {
        return null;
    }

    @Override
    public void deleteEmp(Long empId) {

    }
}
