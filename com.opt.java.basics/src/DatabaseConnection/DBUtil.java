
package DatabaseConnection;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static final String DB_DRIVER_CLASS = "driverClassName";
	private static final String DB_USERNAME = "username";
	private static final String DB_PASSWORD = "password";
	private static final String DB_URL = "url";
	
	private static Connection connection = null;
	private static Properties properties = null;
	
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("src/DatabaseConnection/connection.properties"));
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(
					properties.getProperty(DB_URL),
					properties.getProperty(DB_USERNAME),
					properties.getProperty(DB_PASSWORD));
		}
		catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
