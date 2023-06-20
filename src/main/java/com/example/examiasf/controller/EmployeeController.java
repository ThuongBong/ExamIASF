package com.example.examiasf.controller;

import com.example.examiasf.dto.EmployeeDTO;
import com.example.examiasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String list(Model model) {
        List<EmployeeDTO> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }
}
