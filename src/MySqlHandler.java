
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlHandler {
	
	 static String driver = "com.transtools.jdbc.CtsqlJdbcDriver";
	 static String dbPort = "3306";
	 static String dbHost = "192.168.1.51";
	 static String dbName = "app_logival";
	 static String dbUser = "localdev";
	 static String dbPassword = "localdev";
	 static Connection connection = null;
	 
	
	public static Connection getConnection() throws SQLException {
		 if(connection == null) {
			 MySqlHandler mysqlHandler = new MySqlHandler();
			 mysqlHandler.registerDriver(driver);
			 String url = mysqlHandler.createUrl();
			 System.out.println( "Creating connecction to " + url + " ..." );
			 connection = DriverManager.getConnection(url, dbUser, dbPassword);		 
		 }
		 return connection;
	}
	
	public static void close() {
		try {
			if(connection != null && !connection.isClosed()) {
				connection.close();
				connection = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.print("SQLException: ");
	        System.err.println(e.getMessage());
		}
	}
	
	private String createUrl()
	{
		return "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;
	}
	
	private void registerDriver(String driver) {
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException e) {
          System.err.print("ClassNotFoundException: ");
          System.err.println(e.getMessage());
        }
	}
}

