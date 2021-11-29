package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	private static DBConn dbConn = new DBConn();
	
	public static DBConn getInstance() {
		return dbConn;
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("connect OK");
			String url = "jdbc:mariadb://localhost:3306/example";
			con = DriverManager.getConnection(url,"root","121212");
			System.out.println("DB OK");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
		return con;
	}
}
