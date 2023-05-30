package service;

import model.Employee;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

import org.hibernate.Transaction;

import javax.persistence.Query;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void add(Employee employee) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        try (session) {
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getById(int id) {
        try (Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        try (session) {
            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    public void deleteEmployeeById(int id) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        try (session) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createNativeQuery("DELETE FROM employee WHERE id = :id");
            query.setParameter("id", id);
            query.executeUpdate();
            transaction.commit();
        }
    }

    public List<Employee> getAllEmployees() {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        try (session) {
            return session.createQuery("FROM Employee").list();
        }
    }
}