package com.ea.HrmsApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public String getEmployee(){
        return "Karthik KK";
    }

}
