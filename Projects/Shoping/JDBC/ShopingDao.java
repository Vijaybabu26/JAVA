package Shoping.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Shoping.Entity.Admin;
import Shoping.Entity.Customer;



public class ShopingDao {
	public static void CustomerQ(Customer cu) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String cquery = "insert into Customer_Info(Cus_Fname,Cus_Lname,Cus_PNo,Cus_Address,Cus_PassWord,Curr_Wallet_Bal) values"
					+ "('"+cu.getCusFirstName()+"','"+cu.getCusLastName()+"','"+cu.getCusPhoneNo()+"','"+cu.getCusAddress()+"','"+cu.getCusPassWord()+"','"+0+"')";
			Stm.executeUpdate(cquery);
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}	
	}
	
	public static void AdminQ(Admin Ad) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String adquery = "insert into Admin_Info(Admin_Fname,Admin_Lname,Admin_PNO,Admin_Address,Admin_PassWord,Curr_Wallet_Bal) values"
					+ "('"+Ad.getAdFirstName()+"','"+Ad.getAdLastName()+"','"+Ad.getAdPhoneNo()+"','"+Ad.getAdAddress()+"','"+Ad.getAdPassWord()+"','"+0+"')";
			Stm.executeUpdate(adquery);
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void CustomerList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String adquery ="Select * from Customer_Info";
			ResultSet res = Stm.executeQuery(adquery);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void AdminList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String adquery ="Select * from Admin_Info";
			ResultSet res = Stm.executeQuery(adquery);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public boolean AdminLogin(int AdId,String AdPass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String adquery ="Select Admin_Id,Admin_PassWord from Admin_Info where Admin_Id = ? and Admin_PassWord = ?";
			PreparedStatement ps = Con.prepareStatement(adquery);
			ps.setInt(1, AdId);
			ps.setString(2, AdPass);
			ResultSet res = ps.executeQuery();
			Stm.close();
            return res.next();
			
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean CustomerLogin(int CusId,String CusPass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String adquery ="Select Cus_Id,Cus_PassWord from Admin_Info where Cus_Id = ? and Cus_PassWord = ?";
			PreparedStatement ps = Con.prepareStatement(adquery);
			ps.setInt(1, CusId);
			ps.setString(2, CusPass);
			ResultSet res = ps.executeQuery();
			Stm.close();
            return res.next();
			
			
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
