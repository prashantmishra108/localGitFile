package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class data {
		// settings required to connect to database using Type4 driver
		private static String userName = "";//"ATAHDC";
		private static String password = "";//"HDCATA";
		public static Connection connection = null;;
		/**
		 * @param driverType
		 *            - Pass "Type1" or "Type4"
		 * @return Connection
		 */
		// @SuppressWarnings("finally")
		public static Connection getDBConnection () {
			if (connection == null) {// checks whether connection is already open
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("1");
					connection = DriverManager.getConnection("jdbc:oracle:thin:@10.201.174.33:1521:orcl", userName,
								password);System.out.println("1");
					connection.setAutoCommit(false);
					}
				catch (ClassNotFoundException exception) {}  
				catch (SQLException e) {e.printStackTrace();}
				
			 return connection;
			} else{System.out.println("1");return connection;}
			
		}
	}
