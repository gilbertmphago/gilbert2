package org.example.controller;

import org.example.model.employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employees")
    public List<employee> getAllEmployees(){


        return employeeRepository.findAll();
    }
   @PostMapping
    // build create employee REST API
   public employee createEmployee(@RequestBody employee Employee){
        return employeeRepository.save(Employee);
   }

}
