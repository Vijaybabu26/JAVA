package bankapp.apk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bankapp.entity.User;

public class PaymentCLIDAO {
	public void UserDb(User u) throws ClassNotFoundException,SQLException{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentapp","root","root");
			Statement Stmt = Con.createStatement();
			String query = "insert into user_info (First_Name,Last_Name,Phone_Num,DOB,Address,Wallet_Balance)"+
			"values('"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getPhoneNo()+"','"+u.getDateOfBirth()+"','"+u.getAddress()+"','"+0+"')";
			Stmt.executeUpdate(query);
			Con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
