package com.example.backendprj.service;

import com.example.backendprj.model.EmployeeModel;

import java.util.*;

public interface EmployeeService {
    public List<EmployeeModel> getAllEmp();

    public Optional<EmployeeModel> getEmpById(Long empId);

    public EmployeeModel saveEmp(EmployeeModel employeeModel);

    public EmployeeModel updateEmp(Long empId, EmployeeModel employeeModel);

    public void deleteEmp(Long empId);
}
