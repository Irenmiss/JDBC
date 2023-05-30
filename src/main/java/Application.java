import model.City;
import model.Employee;
import service.EmployeeDAO;
import service.EmployeeDAOImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "ext,yfz,fpf23!";
        final String url = "jdbc:postgresql://localhost:5432/skypro";
        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee WHERE id = (?)")) {
            statement.setInt(1, 3);
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                int age = resultSet.getInt(5);
                String gender = resultSet.getString(4);
                System.out.println(first_name);
                System.out.println(last_name);
                System.out.println(age);
                System.out.println(gender);
            }
        }
        Connection connection = DriverManager.getConnection(url, user, password);
        EmployeeDAO employeeDAO = new EmployeeDAOImpl(connection);
//        Employee employee = new Employee(9, "User", "Test", "test", 111, 17);
//        employeeDAO.add(employee);
        List<Employee> employeeList = new ArrayList<>(employeeDAO.getAllEmployees());
        employeeList.forEach(System.out::println);
//        System.out.println(employeeDAO.getById(9));
//            employeeDAO.updateEmployeeById(9, "Update", "Update", "Update", 222, 20);
//        System.out.println(employeeDAO.getById(9));
            employeeDAO.deleteEmployeeById(9);
        System.out.println(employeeDAO.getById(9));
    }
}