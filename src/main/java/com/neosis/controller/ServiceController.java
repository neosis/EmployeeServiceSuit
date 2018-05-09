package com.neosis.controller;

import com.neosis.services.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/getemployeedetails")
    public Employee getempEmployeeEmployee(@RequestParam(value = "id", defaultValue = "0") String id){
        Employee employee = new Employee(id);
        return employee;
    }

}
