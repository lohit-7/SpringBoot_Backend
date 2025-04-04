package com.example.backendprj.DAO;

import java.util.*;
import com.example.backendprj.domain.EmployeeEntity;

public interface EmployeeDAO {

    EmployeeEntity getAllEmployee();

    List<EmployeeEntity> getAllEmpById(Long empId);

    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity UpdateEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity deleteEmp(Long empId);
}
