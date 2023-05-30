package aop.service;

import aop.dao.EmployeeDAO;
import aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }
}
