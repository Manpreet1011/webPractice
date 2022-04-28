package com.manna.JameswayEmployee.DAO;

import com.manna.JameswayEmployee.domain.Employee;
import com.manna.JameswayEmployee.mapper.EmployeeMapper;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.config.JdbcNamespaceHandler;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


//@ToString
@Repository


public class EmployeeDAO {

private NamedParameterJdbcTemplate template;

    public EmployeeDAO(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
//    JdbcTemplate template;
//
//    public EmployeeDAO(JdbcTemplate template) {
//        this.template = template;
//    }

    public void createEmployee(Employee emp) {
        String sql = "insert into employee values(:id,:name )";
        template.update(sql,new BeanPropertySqlParameterSource(emp));
    }

    public void display(Employee employee) {
        System.out.println(employee);
    }

    public void deleteEmployee(Employee employee) {
        template.update("delete from employee where  EId = id", new BeanPropertySqlParameterSource(employee));
    }

    public void updateEmployee(String name, int id) {
        String sql = "update employee set name = :name where id= id";
        Map<String, Object> map= new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        template.update(sql,map);
    }

    public Employee getById(int id) {
        String sql = "select * from employee where eid = :id";
        // EmployeeMapper mapper=new EmployeeMapper();
        return template.queryForObject(sql, Collections.singletonMap("id",id),new EmployeeMapper());


    }
}
