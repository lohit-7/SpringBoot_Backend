package com.example.backendprj.DAO;

import java.util.*;
import com.example.backendprj.domain.EmployeeEntity;

public interface EmployeeDAO {

    List<EmployeeEntity> getAllEmployee();

    Optional<EmployeeEntity> getAllEmpById(Long empId);

    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity UpdateEmployee(Long empId, EmployeeEntity employeeEntity);

    void deleteEmp(Long empId);
}
