package Shoping.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Shoping.Entity.Admin;



public class ShopingDao {
	public static void UserRdb(Admin ad) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Paymentapp", "root", "root");
			Statement Stm = Con.createStatement();
			String Adquery = "";
			Stm.executeUpdate(Adquery);
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}	
	}

}
