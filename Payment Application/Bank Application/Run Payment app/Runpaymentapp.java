package bankapp.apk;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import bankapp.entity.Acctype;
import bankapp.entity.Bankaccount;
import bankapp.entity.User;
import bankapp.entity.Wallet;

public class Runpaymentapp {
	static int x = 0;
	public static List<User> userlist = new ArrayList<User>();
	public static List<Bankaccount> Bankacctlist = new ArrayList<Bankaccount>();
	public static int CurrUserId =-1;
	
	
	public static void main(String[] args) {
//		Fileops fileOps = new Fileops();
//		 try {
//			List<User> userData = fileOps.fileToUser();
//			for(User u : userData) {
//				System.out.println(u.getUserId()+" "+u.getFirstName()+" "+u.getLastName()+" "+u.getPhoneNo()+" "+u.getDateOfBirth()+" "+u.getAddress());
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//	}
		int SelectedOption = 0;
		Scanner opt = new Scanner(System.in); 
		
		while(true) {
			System.out.println("please select one Option");
			System.out.println("1.Register New User");
			System.out.println("2.Login");
			System.out.println("3.Add Bank Account");
			System.out.println("4.List Of Users");
			System.out.println("5.Current User");
			System.out.println("6. List of All User Bank Account");
			System.out.println("7.Add Money To Wallet(self)");
			System.out.println("8.Send Money To Other User(DEPOSIT)");
			System.out.println("9.User Can Withdraw The Money(WITHDRAW)");
			System.out.println("10.Mini Statement of transaction");
			System.out.println("11.Delete Bank Account");
			System.out.println("12.To Log Out The User");
			System.out.println("-1.Quit / Exit From Command");
			System.out.println("Choose an Option: ");
			
			String Optstr = opt.next();	
			
		try {
			
			SelectedOption = Integer.parseInt(Optstr);
		
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
		
			System.out.println("User selected " + Optstr);
			
			Useroperations ops = new Useroperations();
			
		if(Optstr.equalsIgnoreCase("1")){
			
			registerUser();
			
		}
		else if(Optstr.equalsIgnoreCase("2")) {
			
			loginUser();
			
			
		}
		else if(Optstr.equalsIgnoreCase("3")) {
			
			if(ValidateCurrUser()) {
				
			addBankAccount();
			
			}
		}else if(Optstr.equalsIgnoreCase("4")) {
			ops.printUserlist(userlist);
			
			
		}else if(Optstr.equalsIgnoreCase("5")){
			
			if(CurrUserId != -1) {
			ops.Printcurruserdetails(CurrUserId);
			}else{
				System.out.println("No User Has Logged In");
			}
			
		}else if(Optstr.equalsIgnoreCase("6")){

			if(CurrUserId != -1) {
				PrintCurrUserBankaccountList();
			}
			
			
		}else if(Optstr.equalsIgnoreCase("7")) {
			if(CurrUserId != -1) {
				
				addWallet(CurrUserId);
				
			}else {
			System.out.println("User Must Log In to Add Money to wallet");
			}
		}else if(Optstr.equalsIgnoreCase("8")) {
			if(CurrUserId != -1) {
				
			}
		}else if(Optstr.equalsIgnoreCase("9")) {
			if(CurrUserId != -1) {
				
			}
		}else if(Optstr.equalsIgnoreCase("10")) {
			if(CurrUserId != -1) {
				
			}
		}
		else if(Optstr.equalsIgnoreCase("11")) {
			if(CurrUserId != -1) {
				DelBankAcc();
			}
		}else if(Optstr.equalsIgnoreCase("12")) {
			if(CurrUserId != -1) {
				logout();
		}else if(Optstr.equalsIgnoreCase("-1")) {
			System.out.println("You Have Exit");
			break;
			
				}
			}
		}
	}
		public static void registerUser(){
			Scanner opt = new Scanner(System.in); 
			
			Useroperations ops = new Useroperations();
			System.out.println("Please provide user details as asked");
			System.out.println("First Name:");
			String fname = opt.next();
			System.out.println("Last Name : ");
			String lname = opt.next();
			System.out.println("Phone Number : ");
			Long phoneNo = Long.parseLong(opt.next());
			System.out.println("Date Of Birth : ");
			String dob = opt.next();
			System.out.println("Address :");
			String address = opt.next();
			System.out.println("password : ");
			String passWord = opt.next();
			
			User u;
			
			try {
				u = ops.douserregistration(fname, lname, phoneNo, dob, passWord, address);
				userlist.add(u);
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		public static boolean loginUser() {
			Scanner opt = new Scanner(System.in); 
			Useroperations ops = new Useroperations();
			
			System.out.println("Login Using UserID");
			System.out.println("Enter UserId : ");
			String Uid =opt.next();
			System.out.println("Enter the Password : ");
			String password = opt.next();
			
			if (ops.verifyuserid(Uid, password)) {
				CurrUserId = Integer.parseInt(Uid);
				System.out.println("Login Successful");
				return true;
			}else {
			System.out.println("Login Failed !");
			return false;
			}
		}
		public static void addBankAccount() {
			
			Bankaccount ba = new Bankaccount();
			
			Scanner opt = new Scanner(System.in);
			System.out.println("Enter Bank Account Number: ");
			String Bankacctnumber = opt.next(); 
			System.out.println("Enter The Bank Name : ");
			String BankacctBankName = opt.next();
			System.out.println("Enter the Bank Account Pin : ");
			String BankAcctPin = opt.next();
			System.out.println("Enter the Bank IFSC Code:");
			String BankAcctIFSC = opt.next();
			System.out.println("Please Select the Following Account Type : ");
//			System.out.println("SA: SAVINGS");
//			System.out.println("CU: CURRENT");
//			System.out.println("LN: LOAN");
//			System.out.println("SL: SALARY");
			for(Acctype type : Acctype.values()) {
				System.out.println(" "+ type);
			}									//Account Type Enum Selection.
			try {
			String Acty = opt.next();
			Acctype Accty = Acctype.valueOf(Acty);
			ba.setAcctype(Accty);
			}catch(IllegalArgumentException ie) {
				System.out.println("Please Select the Correct Acctype : ");
				for(Acctype type : Acctype.values()) {
					System.out.println(" "+ type);
				}
			}
			
			
			ba.setBankacctnumber(Bankacctnumber);
			ba.setBankacctBankName(BankacctBankName);
			ba.setBankAcctPin(BankAcctPin);
			ba.setBankAcctIFSC(BankAcctIFSC);
			ba.setUserId(CurrUserId);
			
			
			for(User u:userlist) {
				if(u.getUserId() == CurrUserId) {
					u.getBankacctlist().add(ba);
				}
			}
			
			Bankacctlist.add(ba);
			
		}
		public static boolean ValidateCurrUser() {
			if(CurrUserId != -1) {
				return true;
			}else {
				return false;
			}
		}
		public static void PrintCurrUserBankaccountList() {
			Useroperations ops = new Useroperations();
			Map<User,List<Bankaccount>> mapItems = ops.getUserBankAccount();
			for(User u : mapItems.keySet()) {
				List<Bankaccount> baList = mapItems.get(u);
				System.out.println(u);
				if(baList != null) {
					for(Bankaccount ba : baList) {
						System.out.println("-->" + ba.printBankAcctDetails());
					}
				}
			}
			
		}
		public static void addWallet(int UserId) {

			Scanner sc = new  Scanner(System.in);
			System.out.println("Enter Amount to Add Wallet : ");
			double amount = sc.nextDouble();
			
//			User u = userlist.get(UserId);
////			if(u==null) {
////				System.out.println("User not Fount");
////				return;
////			}
			
			Wallet w = new Wallet();
//			if(CurrUserId == u.getUserId()) {
			w.setWalletlimit(10000);
						if(amount <= 1000) {				
						Wallet.setBalance(Wallet.getBalance()+amount);
						if(Wallet.getBalance()> w.getWalletlimit()) {
							System.out.println("Wallet amount Exceeded. Wallet Limit is 10000.");
							Wallet.setBalance(Wallet.getBalance()-amount);
						}
						System.out.println("Your Current Balance In wallet : "+Wallet.getBalance());
	
					}else {
						System.out.println("Maximum Amount Deposit Limit is 1000");
					
					}
				}
//			}
			

		public static void DelBankAcc() {
			
			  Scanner opt = new Scanner(System.in);
			  Bankaccount ba = new Bankaccount();
			    System.out.println("Enter Bank Account Number: ");
			    String accnum = opt.next();
			    for(User u : userlist) {
			    	if(u.getUserId() == CurrUserId) {
			    		java.util.Iterator<Bankaccount> iterator = Bankacctlist.iterator();
			            while (iterator.hasNext()) {
			                Bankaccount ub = iterator.next();
			                if(ub.getBankacctnumber().equals(accnum)) {
			                    iterator.remove();
			                    System.out.println("Deleted " + ub.getBankacctnumber());
			                    break;
			                }
			            }
			    	}
			    }
			    
			    
//			    boolean acctFound = false;
//			    for (int i = 0; i < Bankacctlist.size(); i++) {
//		            if(String.valueOf(Bankacctlist.get(i).getBankacctnumber()).equals(accnum)) {
//		            	if(ba.getBankacctnumber().equals(Bankacctlist.get(i).getBankacctnumber())) {
//		            		acctFound = true;
//		            		Bankacctlist.remove(i);
//		            		System.out.println("Deleted"+ba.getBankacctnumber());
//		            	}
//		            }
//		            
//		        }
			    

		
		}
		public static void logout() {
			CurrUserId = -1;
			System.out.println("User has Log out");
		}
}