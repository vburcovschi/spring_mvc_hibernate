package aop.controller;

import aop.dao.EmployeeDAO;
import aop.entity.Employee;
import aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/addEmployee")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.removeEmployee(id);
        return "redirect:/";
    }
}
