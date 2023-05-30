import model.Employee;
import service.EmployeeDAO;
import service.EmployeeDAOImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        Employee employee = new Employee(9, "User", "Test", "test", 111, 17);
//        employeeDAO.add(employee);
//        System.out.println(employee);
        List<Employee> employeeList = new ArrayList<>(employeeDAO.getAllEmployees());
//        employeeDAO.deleteEmployeeById(11);
        System.out.println(employeeDAO.getById(9));
        employeeList.forEach(System.out::println);
        System.out.println(employeeDAO.getById(10));

    }
}