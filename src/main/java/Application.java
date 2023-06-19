import service.CityDAO;
import service.CityDAOImpl;
import service.EmployeeDAO;
import service.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

//        Employee employee = new Employee("Test", "Testy", "test", 100, new City("Moscow"));
//        employeeDAO.create(employee);
//
////        System.out.println(employeeDAO.readById(24));
//
//
//        employeeDAO.deleteEmployee(employee);
//        List<Employee> employeeList = employeeDAO.readAll();
//        employeeList.forEach(System.out::println);


//        City city = new City("Surgut");
//        cityDAO.create(city);
//        System.out.println(cityDAO.readById(26));
//        List<City> cityList = cityDAO.readAll();
//        cityList.forEach(System.out::println);
        System.out.println(cityDAO.readById(26));

    }
}