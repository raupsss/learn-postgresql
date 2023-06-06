package com.ghani.learnthymeleaf.service;

import com.ghani.learnthymeleaf.entity.Employee;
import org.springframework.web.servlet.ModelAndView;

public interface EmployeeService {

    ModelAndView getEmployees();
    ModelAndView addEmployeeForm();
    ModelAndView updateEmployeeForm(Long id);
    String saveEmployee(Employee employee);
    String deleteEmployee(Long id);


}
