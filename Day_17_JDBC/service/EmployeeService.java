package service;
import model.Employee;
import java.util.List;
public interface  EmployeeService {
	 void addEmployee(Employee employee);
	    void updateEmployee(Employee employee);
	    void deleteEmployee(int id);
	    Employee getEmployeeById(int id);
	    List<Employee> getAllEmployees();
}
