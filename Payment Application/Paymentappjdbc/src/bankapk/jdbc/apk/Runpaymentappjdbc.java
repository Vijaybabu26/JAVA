package bankapk.jdbc.apk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankapk.jdbc.JdbcDao.PaymentCliDao;
import bankapk.jdbc.entity.*;


public class Runpaymentappjdbc {
	public static List<User> userlist = new ArrayList<User>();
	public static int CurrUserId = -1;
		public static void main(String[] args) {
			int SelectedOption = 0;
			Scanner opt = new Scanner(System.in);
			
			while(true) {
				System.out.println("Please Select One Option");
				System.out.println("1.Register New User");
				System.out.println("2.Login");
				System.out.println("3.Add Bank Account to User");
				System.out.println("Choose an Option:");
				String OptStr = opt.next();
				try {	
				SelectedOption = Integer.parseInt(OptStr);
				}catch(NumberFormatException e){
					e.printStackTrace();
					e.getMessage();	
					System.out.println("Number Format Error. Please Choose Another Option.");
				}catch(ArithmeticException e){
					e.printStackTrace();
					e.getMessage();
					System.out.println("Arthemetic Error. Please Choose Another Option.");
				}catch(Exception e){
					e.printStackTrace();
					e.getMessage();
					System.out.println("Some Errors has Occured. Please Choose Another Option.");
				}finally {
					System.out.println();
				}
				System.out.println("User Selected " + OptStr);
				
				UserOperations ops = new UserOperations();
				
				
				if(OptStr.equalsIgnoreCase("1")) {
					
						RegisterUser();
					
				}else if(OptStr.equalsIgnoreCase("2")) {
					
						Login();
					
				}else if(OptStr.equalsIgnoreCase("3")) {
					
					if(CurrUserId != -1) {
						
					}
					
				}
			}
			
	
		}
		public static void RegisterUser(){
			Scanner opt = new Scanner(System.in); 
			
			UserOperations ops = new UserOperations();
			System.out.println("Please provide user details as asked");
			System.out.println("First Name:");
			String FirstName = opt.next();
			System.out.println("Last Name : ");
			String LastName = opt.next();
			System.out.println("Phone Number : ");
			Long PhoneNo = Long.parseLong(opt.next());
			System.out.println("Date Of Birth : ");
			String DOB = opt.next();
			System.out.println("Address :");
			String Address = opt.next();
			System.out.println("password : ");
			String PassWord = opt.next();
			
			User u = null;
			
			try {
				u = ops.UserRegistration(FirstName, LastName, PhoneNo, DOB, PassWord, Address);
//				userlist.add(u);
				PaymentCliDao db = new PaymentCliDao();
				db.UserRdb(u);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
//			Wallet w = new Wallet();
//			int UserId = u.getUserId();
//			Walletlist.put(UserId, w);
		

		}
		public static void Login() {
			Scanner opt = new Scanner(System.in);
			UserOperations ops = new UserOperations();
			
			System.out.println("Login Through UserId");
			System.out.println("Enter User Id :");
			int UId = opt.nextInt();
			System.out.println("Enter Password :");
			String PassWord = opt.next();
			PaymentCliDao db = new PaymentCliDao();
			if(PaymentCliDao.Logindb(UId, PassWord)) {
				CurrUserId = UId;
				System.out.println("Login Success");
				
			}else {
				System.out.println("Login Failed");
			}
			
		}
		public static void AddBankAcc() {
			Scanner opt = new Scanner(System.in);
			User u = new User();
			
			UserOperations ops = new UserOperations();
			System.out.println("Add Bank Account Details");
			System.out.println("Enter The Account No : ");
			long AccNo = opt.nextLong();
			System.out.println("Enter the Bank Account Name :");
			String AcctBankName = opt.next();
			System.out.println("Enter the Bank Account Type");
			System.out.println("Please Select The Account Type :");
			for(AcctType type : AcctType.values()) {
				System.out.println(" "+ type);
			}
			 AcctType Accty = null;
		        while (Accty == null) {
			try {
				System.out.println("Enter a number from 0 to 3:");
		       int Acct_TypeId = opt.nextInt();

		        if (Acct_TypeId < 0 || Acct_TypeId > 3) {
		            System.out.println("Invalid number. Please enter a number from 0 to 3.");
		        } else {
		            AcctType day = AcctType.values()[Acct_TypeId];
		            System.out.println("You selected: " + Acct_TypeId);
		        }
		
			}catch(IllegalArgumentException ie) {
				System.out.println("Please Select the Correct Acctype : ");
				for(AcctType type : AcctType.values()) {
					System.out.println(" "+ type);
				}
			}
		        }
			System.out.println("Enter the Account IFSC Code :");
			String AcctIFSCCode = opt.next();
			System.out.println("Enter the Account Pin : ");
			int AcctPin = opt.nextInt();
			try {
				BankAccount ba = null;
				
				ba =ops.AddBankAcct(AccNo, AcctBankName, Accty, AcctIFSCCode, AcctPin);
				PaymentCliDao db = new PaymentCliDao();
				PaymentCliDao.UserBankDb(u, ba);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

}
