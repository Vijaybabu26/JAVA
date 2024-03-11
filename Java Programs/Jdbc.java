package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String [] args) {
		//Step1 = Create JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			ResultSet rs = Stm.executeQuery("Select * from test_emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " +rs.getString(3) );
			}
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
