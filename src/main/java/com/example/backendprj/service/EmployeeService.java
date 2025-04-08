package com.example.backendprj.service;

import com.example.backendprj.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface EmployeeService {
    public List<EmployeeModel> getAllEmp();

    public EmployeeModel getEmpById(Long empId);

    public String saveEmp(EmployeeModel employeeModel);

    public EmployeeModel updateEmp(Long empId, EmployeeModel employeeModel);

    public void deleteEmp(Long empId);
}
