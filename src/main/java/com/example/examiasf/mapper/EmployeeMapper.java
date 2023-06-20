package com.example.examiasf.mapper;

import com.example.examiasf.dto.EmployeeDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeDTO> {
    @Override
    public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmployeeDTO item = new EmployeeDTO();
        item.setId(rs.getInt("id"));
        item.setName(rs.getString("name"));
        item.setWage(rs.getBigDecimal("wage"));
        return item;
    }
}
