package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc01 {
	public static void main(String [] args) {
		//Step1 = Create JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			int k = Stm.executeUpdate("insert into test_emp values(07, \"Saindav\" , \"2002-01-25\")");
			System.out.println("Inserted " + k + " row(s) into the table.");
			ResultSet rs = Stm.executeQuery("select * from test_emp");
			while(rs.next()){
			System.out.println(rs.getInt(1)+ rs.getString(2)+rs.getString(3));	
			}
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
