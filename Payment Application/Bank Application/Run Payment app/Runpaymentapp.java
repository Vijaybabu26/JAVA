package bankapp.apk;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import bankapp.entity.Acctype;
import bankapp.entity.Bankaccount;
import bankapp.entity.User;

public class Runpaymentapp {
	static int x = 0;
	public static List<User> userlist = new ArrayList<User>();
	public static List<Bankaccount> Bankacctlist = new ArrayList<Bankaccount>();
	public static int CurrUserId =-1;
	
	
	public static void main(String[] args) {
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
			System.out.println("-1.Quit / Log Out");
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
			}
			
		}else if(Optstr.equalsIgnoreCase("6")){

			if(CurrUserId != -1) {
					PrintUserBankaccountList();
			}
			
			
		}else if(Optstr.equalsIgnoreCase("-1")) {
			System.out.println("You Have Exit");
			break;
			
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
			} catch (Exception e) {
				e.printStackTrace();
			}
//			for(int i=0;i<userlist.size();i++) {
//				if(userlist.get(i)==null) {
//					userlist.get(i).setUserId(i);
//					break;
//				}
//			}
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
				return true;
			}else {
			System.out.println("Login Failed !");
			return false;
			}
		}
		public static void addBankAccount() {
			Scanner opt = new Scanner(System.in);
			System.out.println("Enter Bank Account Number: ");
			String Bankacctnumber = opt.next(); 
			System.out.println("Enter The Bank Name : ");
			String BankacctBankName = opt.next();
			System.out.println("Enter the Bank Account Pin : ");
			String BankAcctPin = opt.next();
			System.out.println("Enter the Bank IFSC Code:");
			String BankAcctIFSC = opt.next();
			System.out.println("Please Select the Account Type : ");
			System.out.println("SA: SAVINGS");
			System.out.println("CU: CURRENT");
			System.out.println("LN: LOAN");
			System.out.println("SL: SALARY");
			
			
			Bankaccount ba = new Bankaccount();
			ba.setBankacctnumber(Bankacctnumber);
			ba.setBankacctBankName(BankacctBankName);
			ba.setBankAcctPin(BankAcctPin);
			ba.setBankAcctIFSC(BankAcctIFSC);
			ba.setAcctype(Acctype.SAVINGS);
			
			
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
		public static PrintUserBankaccountList() {
			UserOperations ops = new UserOperations();
			Map<User,List<Bankaccount>> mapitems = ops;
		}
}