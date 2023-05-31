package aop.dao;

import aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployee() {
        Session session =sessionFactory.getCurrentSession();
        List<Employee> allEmployee = session.createQuery("from Employee", Employee.class).getResultList();
        return allEmployee;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }


}
