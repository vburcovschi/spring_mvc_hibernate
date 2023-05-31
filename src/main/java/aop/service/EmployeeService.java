package aop.service;

import aop.entity.Employee;

import javax.transaction.Transactional;
import java.util.List;


public interface EmployeeService {
    public List<Employee> getAllEmployee();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void removeEmployee(int id);
}
