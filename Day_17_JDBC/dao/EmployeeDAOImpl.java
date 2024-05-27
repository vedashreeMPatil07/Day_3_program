package dao;
import model.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
	    private static final String USER = "root";
	    private static final String PASSWORD = "password";

	    static {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void addEmployee(Employee employee) {
	        String query = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setString(1, employee.getName());
	            stmt.setString(2, employee.getDepartment());
	            stmt.setDouble(3, employee.getSalary());
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void updateEmployee(Employee employee) {
	        String query = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setString(1, employee.getName());
	            stmt.setString(2, employee.getDepartment());
	            stmt.setDouble(3, employee.getSalary());
	            stmt.setInt(4, employee.getId());
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteEmployee(int id) {
	        String query = "DELETE FROM employees WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setInt(1, id);
	            stmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public Employee getEmployeeById(int id) {
	        String query = "SELECT * FROM employees WHERE id = ?";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setInt(1, id);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                return new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"), rs.getDouble("salary"));
	            }
	        } catch (SQLExce`ption e) {
	            e.printStackTrace();
	        }
	        return null;
	    }


	    @Override
	    public List<Employee> getAllEmployees() {
	        List<Employee> employees = new ArrayList<>();
	        String query = "SELECT * FROM employees";
	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {
	            while (rs.next()) {
	                employees.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"), rs.getDouble("salary")));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return employees;
	    }

}
