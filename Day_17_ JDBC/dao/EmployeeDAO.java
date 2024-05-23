package dao;
import model.Employee;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDAO {
//EmployeeDAO.java: Contains methods to perform CRUD operations on the employees table.
	 public void addEmployee(Employee employee) throws SQLException {
	        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

	        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, employee.getName());
	            stmt.setString(2, employee.getDepartment());
	            stmt.setDouble(3, employee.getSalary());
	            stmt.executeUpdate();
	        }
	    }

	    public List<Employee> getAllEmployees() throws SQLException {
	        List<Employee> employees = new ArrayList<>();
	        String sql = "SELECT * FROM employees";

	        try (Connection conn = DBUtil.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                Employee employee = new Employee();
	                employee.setId(rs.getInt("id"));
	                employee.setName(rs.getString("name"));
	                employee.setDepartment(rs.getString("department"));
	                employee.setSalary(rs.getDouble("salary"));
	                employees.add(employee);
	            }
	        }
	        return employees;
	    }
	    public Employee getEmployeeById(int id)
	    {
	    	String sql ="SELECT * FROM employees where id=?";
	    	return null;
	    }

	    public void updateEmployee(Employee employee) throws SQLException {
	        String sql = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";

	        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setString(1, employee.getName());
	            stmt.setString(2, employee.getDepartment());
	            stmt.setDouble(3, employee.getSalary());
	            stmt.setInt(4, employee.getId());
	            stmt.executeUpdate();
	        }
	    }

	    public void deleteEmployee(int id) throws SQLException {
	        String sql = "DELETE FROM employees WHERE id = ?";

	        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, id);
	            stmt.executeUpdate();
	        }
	    }
}
