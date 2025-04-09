package com.example.backendprj.controllers;

import com.example.backendprj.model.EmployeeModel;
import com.example.backendprj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<EmployeeModel>> getAllEmp(){
        List<EmployeeModel> employeeModels = employeeService.getAllEmp();
        return ResponseEntity.ok(employeeModels);

    }

    @PostMapping("/post")
    public ResponseEntity<String> saveEmp(@RequestBody EmployeeModel employeeModel){
        String emp = employeeService.saveEmp(employeeModel);
        return ResponseEntity.ok(emp);
    }

    @GetMapping("/{empId}")
    public ResponseEntity<EmployeeModel> getEmpById(@PathVariable("empId") Long empId){

        EmployeeModel employeeModel = employeeService.getEmpById(empId);
        return ResponseEntity.ok(employeeModel);
    }

    @PutMapping("/{empId}")
    public ResponseEntity<EmployeeModel> updateEmp(@PathVariable("empId") Long empId, @RequestBody EmployeeModel employeeModel){
        EmployeeModel employeeModel1 = employeeService.updateEmp(empId, employeeModel);
        return  ResponseEntity.ok(employeeModel1);

    }

    @DeleteMapping("/{empId}")
    public ResponseEntity<?> deleteEmp(@PathVariable("empId") Long empId){
        employeeService.deleteEmp(empId);
        return ResponseEntity.ok("deleted successfully");
    }
}


