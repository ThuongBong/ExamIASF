package com.example.examiasf.dao;

import com.example.examiasf.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Long> {
}
