package service;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void add(Employee employee);

    Employee getById(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    void deleteEmployeeById(int id);

    List<Employee> getAllEmployees();
}
