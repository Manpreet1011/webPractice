package com.manna.JameswayEmployee.controller;

//import jdk.internal.icu.text.NormalizerBase;
import com.manna.JameswayEmployee.DAO.EmployeeDAO;
import com.manna.JameswayEmployee.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private EmployeeDAO employeeDAO;

    public HomeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("name","Manpreet Singh");
        Employee employee = employeeDAO.getById(40);
        model.addAttribute("emp",employee);
        return "index";
    }
}
