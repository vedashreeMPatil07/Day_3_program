package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
	/*DBUtil.java: Provides a utility method to establish a connection to the database.*/
	 private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_db";
	    private static final String JDBC_USERNAME = "root";
	    private static final String JDBC_PASSWORD = "root";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
	    }
}
