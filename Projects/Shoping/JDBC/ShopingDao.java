package Shoping.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.UUID;

import Shoping.Apk.RunShoping;
import Shoping.Entity.Admin;
import Shoping.Entity.Customer;
import Shoping.Entity.Product;



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
	public static void AddProducts(Product p) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="insert into Products_Info(Product_Name,Product_Price,Admin_Id) values "
					+ "('"+p.getProduct_Name()+"','"+p.getProduct_Price()+"','"+p.getAdmin_Id()+"')";
			Stm.executeUpdate(pquery);
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void ProductList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="Select * from Products_Info where Admin_Id = '"+RunShoping.CurrAdId+"' ";
			ResultSet res = Stm.executeQuery(pquery);
			while(res.next()) {
				System.out.println("Product Id : "+res.getInt(1)+" - - Product Name : "+res.getString(2)+" - - Product Price : "+res.getDouble(3));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void AddmoneytoAdWal(double Adamount) {
		Admin ad =new Admin();
		String Type = "CREDIT";
		LocalDateTime date = LocalDateTime.now();
		UUID txn = UUID.randomUUID();
		String TxnId = "W"+txn.toString();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String Mquery = "Update Admin_Info Set Curr_Wallet_Bal = Curr_Wallet_Bal + '"+Adamount+"' where Admin_Id = '"+RunShoping.CurrAdId+"'";
			String Txquery = "insert into Admin_Transaction (Ad_Txn_Id,Ad_Txn_Date,Ad_Txn_Amount,Ad_Txn_Type, Ad_Id, Ad_Product_ID,Cus_Id) values "
					+ "('"+TxnId+"','"+date+"','"+Adamount+"','"+Type+"','"+RunShoping.CurrAdId+"','"+1+"','"+1+"')";
			Stm.executeUpdate(Txquery);
			Stm.executeUpdate(Mquery);
	}catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	}
	public static void CheckAdWallet() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="Select Curr_Wallet_Bal from Admin_Info where Admin_Id = '"+RunShoping.CurrAdId+"' ";
			ResultSet res = Stm.executeQuery(pquery);
			while(res.next()) {
				System.out.println("Current Wallet Balance : " + res.getDouble(1));
			}
			Stm.close();
	}catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
		}
	}
	public static void AdTransactionList() {
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="Select * from Admin_Transaction where Ad_Id = '"+RunShoping.CurrAdId+"' ";
			ResultSet res = Stm.executeQuery(pquery);
			while(res.next()) {
				System.out.println("Transaction Id : " + res.getString(1));
			}
	}catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
	}
	}
	
	public static void Cusproductslist() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="Select * from Products_Info";
			ResultSet res = Stm.executeQuery(pquery);
			while(res.next()) {
				System.out.println("Product Id : "+res.getInt(1)+" - - Product Name : "+res.getString(2)+" - - Product Price : "+res.getDouble(3));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void AddmoneytoCusWal(double Cusamount) {
		Admin ad =new Admin();
		String Type = "CREDIT";
		LocalDateTime date = LocalDateTime.now();
		UUID txn = UUID.randomUUID();
		String TxnId = "W"+txn.toString();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String Mquery = "Update Customer_Info Set Curr_Wallet_Bal = Curr_Wallet_Bal + '"+Cusamount+"' where Cus_Id = '"+RunShoping.CurrCusId+"'";
			String Txquery = "insert into Cus_Transaction (Cus_TxnId,Cus_Txn_Date,Cus_Txn_Amount,Cus_Txn_Type, Cus_Id, Product_Id) values "
					+ "('"+TxnId+"','"+date+"','"+Cusamount+"','"+Type+"','"+RunShoping.CurrCusId+"','"+1+"')";
			Stm.executeUpdate(Txquery);
			Stm.executeUpdate(Mquery);
			}catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		}
	public static void CheckCusWallet() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
			Statement Stm = Con.createStatement();
			String pquery ="Select Curr_Wallet_Bal from Customer_Info where Cus_Id = '"+RunShoping.CurrCusId+"' ";
			ResultSet res = Stm.executeQuery(pquery);
			while(res.next()) {
				System.out.println("Current Wallet Balance : " + res.getDouble(1));
			}
			Stm.close();
	}catch (ClassNotFoundException | SQLException e) {
	
	e.printStackTrace();
		}
	}
	public static void CusTransactionList() {
			try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopingapp", "root", "root");
					Statement Stm = Con.createStatement();
					String pquery ="Select * from Cus_Transaction where Cus_Id = '"+RunShoping.CurrCusId+"' ";
					ResultSet res = Stm.executeQuery(pquery);
					while(res.next()) {
						System.out.println("Transaction Id : " + res.getString(1));
					}
			}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			}
	}
}
