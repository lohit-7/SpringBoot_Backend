package com.example.backendprj.DAO;

import com.example.backendprj.domain.EmployeeEntity;
import com.example.backendprj.repository.EmployeeRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@Slf4j

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
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity UpdateEmployee(Long empId, EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmp(Long empId) {
        employeeRepository.deleteById(empId);
    }
}
