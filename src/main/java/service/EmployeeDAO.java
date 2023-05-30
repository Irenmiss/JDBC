package service;

import model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void add(Employee employee);

    Employee getById(int id);

    List<Employee> getAllEmployees();

    void updateEmployeeById(int id, String firstName, String lastName, String gender, int age, int cityId);

    void deleteEmployeeById(int id);
}
