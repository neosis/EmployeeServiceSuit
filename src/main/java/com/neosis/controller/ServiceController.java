package com.neosis.controller;

import com.neosis.services.Assignments;
import com.neosis.services.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/getemployeedetails")
    public Employee getempEmployeeEmployee(@RequestParam(value = "id", defaultValue = "0") String id){
        return new Employee(id);
    }

    @RequestMapping("/getemployeeassignments")
    public Assignments getemployeeassignments(@RequestParam(value = "id", defaultValue = "0") String id){
        return new Assignments(id);
    }

}
