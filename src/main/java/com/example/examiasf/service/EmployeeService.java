package com.example.examiasf.service;

import com.example.examiasf.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employee);

    List<EmployeeDTO> findAllEmployees();
}
