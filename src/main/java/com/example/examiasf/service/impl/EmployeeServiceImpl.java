package com.example.examiasf.service.impl;

import com.example.examiasf.dao.EmployeeRepository;
import com.example.examiasf.dto.EmployeeDTO;
import com.example.examiasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeDTO createEmployee(EmployeeDTO employee) {
        return employeeRepository.save(employee);
    }
}
