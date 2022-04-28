package com.manna.JameswayEmployee.mapper;

import com.manna.JameswayEmployee.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Employee.builder().id(rs.getInt("EID")).name(rs.getString("NAME")).build();

    }
}
