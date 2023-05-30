package aop.controller;

import aop.dao.EmployeeDAO;
import aop.entity.Employee;
import aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showEmployee(Model model){

        List<Employee> allEmployee = employeeService.getAllEmployee();
        model.addAttribute("allEmpls",allEmployee);
        return "all-employees";
    }

}
