package com.example.examiasf.dto;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Employees")
public class EmployeeDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private BigDecimal wage;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Integer id, String name, BigDecimal wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }
}
