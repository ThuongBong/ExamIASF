package com.example.examiasf.service.impl;

import com.example.examiasf.dao.EmployeeRepository;
import com.example.examiasf.dto.EmployeeDTO;
import com.example.examiasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeDTO> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
