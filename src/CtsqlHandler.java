import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtsqlHandler {
	 
	 static String driver = "com.transtools.jdbc.CtsqlJdbcDriver";
	 static String dbService = "6666";
	 static String dbHost = "192.168.1.2";
	 static String dbPath = "/home/ctl/logivaln";
	 static String dbName = "logival";
	 static String dbUser = "ctl";
	 static String dbPassword = "ctluser777";
	 static Connection connection = null;
	 
	
	public static Connection getConnection() throws SQLException {
		 if(connection == null) {
			 CtsqlHandler ctsqlHandler = new CtsqlHandler();
			 ctsqlHandler.registerDriver(driver);
			 String url = ctsqlHandler.createUrl( dbHost, dbService, dbPath, dbName );
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
	
	private String createUrl(String dbHost, String dbService, String dbPath, String dbName)
	{
		String url = "jdbc:ctsql";
		url += "://" + dbHost;
		if ( (dbService != null) && (dbService.length() > 0) )
			url += ":" + dbService;
		url += "/" + dbName;
		url +=  ";DBPATH=" + dbPath;
		return url; 
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