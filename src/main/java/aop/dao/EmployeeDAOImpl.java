package aop.dao;

import aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        Session session =sessionFactory.getCurrentSession();
        List<Employee> allEmployee = session.createQuery("from Employee", Employee.class).getResultList();
        return allEmployee;
    }
}
