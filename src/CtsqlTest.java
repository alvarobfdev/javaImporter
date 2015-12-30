import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class CtsqlTest {

	public static void main(String[] args) {
		
		CtsqlTest ctsqlTest = new CtsqlTest();
		//ctsqlTest.queryCtsql("SELECT * from condic_tasacion where codcli = 111", 17);
		ctsqlTest.importFacturacion(2015);
		
	}
	
	public void queryCtsql(String query, int columns) {
		Connection connectionCtsql;
		try {
			connectionCtsql = CtsqlHandler.getConnection();
			Statement statementCtsql = connectionCtsql.createStatement();
			ResultSet resultQuery = statementCtsql.executeQuery(query);
			while(resultQuery.next()) {
				for(int i=1; i<=columns; i++) {
					System.out.print(resultQuery.getString(i)+"|");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void importFacturacion(int ejefac) {
		try {
			Connection connectionCtsql = CtsqlHandler.getConnection();
			Statement statementCtsql = connectionCtsql.createStatement();
			ResultSet resultQuery = statementCtsql.executeQuery("SELECT * FROM cabfactu where fecfac >"+"'27/12/"+ejefac+"'");
			ResultSetMetaData metaDataCtsql = resultQuery.getMetaData();
			Connection connectionMysql = MySqlHandler.getConnection();
			Statement statementMysql = connectionMysql.createStatement();
			String table = "cabfactu";
			int columns = 25;
			int dates[] = {6};
			transferToMysqlTable(resultQuery, metaDataCtsql, statementMysql, table, columns, dates);
			
			resultQuery = statementCtsql.executeQuery("SELECT * FROM linfactu where ejefac="+ejefac);
			metaDataCtsql = resultQuery.getMetaData();
			table = "linfactu";
			columns = 17;
			int dates_lin[] = {8};
			transferToMysqlTable(resultQuery, metaDataCtsql, statementMysql, table, columns, dates_lin);
			statementMysql.executeUpdate(""
					+ "UPDATE `cabfactu` cf "
					+ "JOIN linfactu lf ON cf.codemp = lf.`codemp`  "
					+ "AND  cf.cenfac = lf.cenfac  "
					+ "AND cf.serfac = lf.serfac  "
					+ "AND cf.ejefac = lf.ejefac  "
					+ "AND cf.numfac = lf.numfac "
					+ "SET lf.`cabfactu_id` = cf.id"
			);
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			CtsqlHandler.close();
			MySqlHandler.close();
		}
	}
	
	

	private void transferToMysqlTable(ResultSet resultQuery, ResultSetMetaData metaDataCtsql, Statement statementMysql,
			String table, int columns, int[] dates) throws SQLException  {
		
		String insertBuilder;
		String columnsBuilder;
		String resultsBuilder;
		
		while(resultQuery.next()) {
			insertBuilder = "INSERT INTO "+table;
			columnsBuilder = "(";
			resultsBuilder = "(";
			try {
				for(int i = 1; i <= columns; i++) {
					
					String result = resultQuery.getString(i);
					String columnName = metaDataCtsql.getColumnName(i);
					if(contains(dates, i)) {
	
						final String OLD_FORMAT = "dd/MM/yyyy";
						final String NEW_FORMAT = "yyyy-MM-dd";
	
						String oldDateString = result;
	
						SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
						java.util.Date d;
						try {
							d = sdf.parse(oldDateString);
							sdf.applyPattern(NEW_FORMAT);
							result = sdf.format(d);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
					if(result != null && !result.equals("null")) {
						if(i>1) {
							columnsBuilder += ", ";
							resultsBuilder += ", ";
						}
						columnsBuilder += columnName;
						result = scape_quotes(result);
						resultsBuilder += "'"+result+"'";
					}
				}
				columnsBuilder += ")";
				resultsBuilder += ")";
				insertBuilder += columnsBuilder + " VALUES " + resultsBuilder;
				System.out.println(insertBuilder);
				statementMysql.executeUpdate(insertBuilder);
				//System.out.println("Insertado:" + resultsBuilder);
				//System.out.println(insertBuilder);
			} catch (MySQLIntegrityConstraintViolationException e) {
				
				if(e.getErrorCode() == 1062) {
					System.out.println("Duplicado: "+resultsBuilder);
				}
				else throw e;
				
			}	
		}
		
	}
	
	private String scape_quotes(String str) {
		str = str.replace("'", "\\'");
		return str;
	}
	
	private boolean contains(int[] array, int num) {
		for(int i = 0; i< array.length; i++) {
			if(array[i] == num)
				return true;
		}
		return false;
	}
	
	

}
