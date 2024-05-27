package presentation;
import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EmployeeManagementApp {
	 private EmployeeService employeeService = new EmployeeServiceImpl();

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            EmployeeManagementApp app = new EmployeeManagementApp();
	            app.createAndShowGUI();
	        });
	    }

	    private void createAndShowGUI() {
	        JFrame frame = new JFrame("Employee Management");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 400);

	        JPanel panel = new JPanel();
	        frame.add(panel);
	        placeComponents(panel);

	        frame.setVisible(true);
	    }

	    private void placeComponents(JPanel panel) {
	        panel.setLayout(null);

	        // Add ID label and text field
	        JLabel idLabel = new JLabel("Employee ID:");
	        idLabel.setBounds(10, 20, 100, 25);
	        panel.add(idLabel);

	        JTextField idText = new JTextField(20);
	        idText.setBounds(120, 20, 165, 25);
	        panel.add(idText);

	        // Add search button
	        JButton searchButton = new JButton("Search");
	        searchButton.setBounds(300, 20, 80, 25);
	        panel.add(searchButton);

	        // Add labels to display employee details
	        JLabel nameLabel = new JLabel("Name:");
	        nameLabel.setBounds(10, 60, 80, 25);
	        panel.add(nameLabel);

	        JLabel nameValue = new JLabel("");
	        nameValue.setBounds(100, 60, 300, 25);
	        panel.add(nameValue);

	        JLabel deptLabel = new JLabel("Department:");
	        deptLabel.setBounds(10, 90, 80, 25);
	        panel.add(deptLabel);

	        JLabel deptValue = new JLabel("");
	        deptValue.setBounds(100, 90, 300, 25);
	        panel.add(deptValue);

	        JLabel salaryLabel = new JLabel("Salary:");
	        salaryLabel.setBounds(10, 120, 80, 25);
	        panel.add(salaryLabel);

	        JLabel salaryValue = new JLabel("");
	        salaryValue.setBounds(100, 120, 300, 25);
	        panel.add(salaryValue);

	        // Add action listener to the search button
	        searchButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int employeeId = Integer.parseInt(idText.getText());
	                Employee employee = employeeService.getEmployeeById(employeeId);
	                if (employee != null) {
	                    nameValue.setText(employee.getName());
	                    deptValue.setText(employee.getDepartment());
	                    salaryValue.setText(String.valueOf(employee.getSalary()));
	                } else {
	                    JOptionPane.showMessageDialog(panel, "Employee not found", "Error", JOptionPane.ERROR_MESSAGE);
	                    nameValue.setText("");
	                    deptValue.setText("");
	                    salaryValue.setText("");
	                }
	            }
	        });
	    }
}
