package com.ghani.learnthymeleaf.controller;

import com.ghani.learnthymeleaf.entity.Employee;
import com.ghani.learnthymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ModelAndView getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm(){
        return employeeService.addEmployeeForm();
    }

    @GetMapping("/updateEmployeeForm")
    public ModelAndView updateEmployeeForm(@RequestParam Long id){
        return employeeService.updateEmployeeForm(id);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam Long id){
        return employeeService.deleteEmployee(id);
    }



}
