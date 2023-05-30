package aop.service;

import aop.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EmployeeService {
    public List<Employee> getAllEmployee();
}
