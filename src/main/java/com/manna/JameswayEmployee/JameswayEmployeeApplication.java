package com.manna.JameswayEmployee;

import com.manna.JameswayEmployee.DAO.EmployeeDAO;
import com.manna.JameswayEmployee.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.Locale;

@SpringBootApplication
public class JameswayEmployeeApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(JameswayEmployeeApplication.class, args);
        Employee employee= Employee.builder().id(40).name("Harry").build();
        Employee employee1= Employee.builder().id(41).name("Man").build();
        EmployeeDAO emp=(EmployeeDAO) context.getBean(EmployeeDAO.class);
        emp.createEmployee(employee);
       // emp.display(employee);
        emp.createEmployee(employee1);
        //emp.display(employee1);
        //emp.deleteEmployee(employee);
        //emp.display(employee);
        //emp.display(employee1);
       // emp.display(emp.getById(40));
        System.out.println(emp.getById(41));


    }
}
