package com.ghani.learnthymeleaf.service;

import com.ghani.learnthymeleaf.entity.Employee;
import com.ghani.learnthymeleaf.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public ModelAndView getEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", employeeRepo.findAll());
        return mav;
    }

    @Override
    public ModelAndView addEmployeeForm() {
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee newEmployee = new Employee();
        mav.addObject("employee", newEmployee);
        return mav;
    }

    @Override
    public ModelAndView updateEmployeeForm(Long id) {
        return null;
    }

    @Override
    public String saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        return null;
    }
}
