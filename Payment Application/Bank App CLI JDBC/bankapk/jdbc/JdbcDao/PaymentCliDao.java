package bankapk.jdbc.JdbcDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bankapk.jdbc.entity.BankAccount;
import bankapk.jdbc.entity.User;

public class PaymentCliDao {
	
	
	public static void UserRdb(User u) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String Uquery = "insert into User_Info(First_Name,Last_Name,Phone_No,Date_Of_Birth,Address,PassWord,Curr_Wallet_Balance)" + "values +"
					+ "('"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getPhoneNo()+"','"+u.getDateOfBirth()+"','"+u.getAddress()+"','"+u.getPassWord()+"','"+0+"')";
			Stm.executeUpdate(Uquery);
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}	
	}
	public static boolean Logindb(int Uid ,String PassWord) {
		User u = new User();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String Uquery = "Select * from User_Info where User_Id = '"+u.getUserId()+"'and PassWord ='"+u.getPassWord()+"'";
			
			ResultSet res = Stm.executeQuery(Uquery);
			if(res.next()) {
				System.out.println("Login successful!");
				return true;
			}else{
				
				System.out.println("Login Failed!");
				
			}
			Stm.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	public static void UserBankDb(User u, BankAccount ba) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String BankQuery = "insert into Bank_Account_Details (Bank_AcctNo,Bank_AcctBankName,Acct_TypeId,Bank_IFSC_Code,Bank_AcctPin,User_Id,Curr_Bank_Balance)+"
					+ "values('"+ba.getAccNo()+"','"+ba.getAcctBankName()+"','"+ba.getBankAcctType()+"','"+ba.getAcctIFSCCode()+"','"+ba.getAcctPin()+"','"+u.getUserId()+"','"+0+"')";
			Stm.executeUpdate(BankQuery);
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
	public static void PrintUserList() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String UserList = "Select * from User_Info";
			ResultSet res = Stm.executeQuery(UserList);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void CurrLoginUserId() {
		User u = new User();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String CurrLoginUser = "Select * from User_Info where User_Id = '"+u.getUserId()+"'";
			ResultSet res = Stm.executeQuery(CurrLoginUser);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void BankAcctList() {
		BankAccount ba = new BankAccount();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			Statement Stm = Con.createStatement();
			String BankUserList = "Select * from Bank_Account_Details where User_Id = '"+ba.getUserId()+"'";
			ResultSet res = Stm.executeQuery(BankUserList);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			Stm.close();
		}catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
}
	

