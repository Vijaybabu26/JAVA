package Vijay.bank.apk;
import java.util.List;
import java.util.Scanner;

import bankapp.entity.Bankaccount;
import Vijay.bank.apk.entity.User;

	public class Runpaymentapp {
		static int x = 0;
	public static List<User> userlist;
	public static List<Bankaccount> Bankacctlist;
		public static void main(String[] args) {
		int c=-1;	
			int SelectedOption = 0;
		
			while(true) {
				System.out.println("please select one Option");
				System.out.println("1.Register");
				System.out.println("2.Login");
				System.out.println("3.Add Bank Account");
				System.out.println("4.List Of Users");
			System.out.println("5.Current User");
				System.out.println("-1.Quit");
				System.out.println("Choose atleast one Option");
				Scanner opt = new Scanner(System.in); 
				String Optstr = opt.next();	
				System.out.println("User selected " + Optstr);
			try {
				SelectedOption = Integer.parseInt(Optstr);
			}catch(NumberFormatException Ea){
				Ea.printStackTrace();
				Ea.getMessage();			
			}catch(ArithmeticException Ex){
				Ex.printStackTrace();
				Ex.getMessage();
				System.out.println("Some Errors has Occured in Athematic");
			}catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				System.out.println("Some Errors has Occured");
		}
//				finally {
//				System.out.println("Finnally");
//			}
			
			Useroperations ops = new Useroperations();
			
			if(Optstr.equalsIgnoreCase("1")){
				System.out.println("Please provide user details as asked");
				System.out.println("First Name:");
				String fname = opt.next();
				System.out.println("Last Name : ");
				String lname = opt.next();
				System.out.println("Phone No : ");
				long phoneNo = Long.parseLong(opt.next());
				System.out.println("Date Of Birth : ");
				String dob = opt.next();
				System.out.println("Address :");
				String address = opt.next();
				System.out.println("passWord : ");
				String passWord = opt.next();
				
				User u = ops.douserregistration(fname, lname, SelectedOption, dob, address, SelectedOption, passWord);
			for(int i=0;i<userlist.size();i++) {
				if(userlist.get(i)==null) {
					userlist.get(i).setUserId(i);
					break;
				}
					
					
				}
				
			}
		}
			else if(Optstr.equalsIgnoreCase("2")) {
			System.out.println("Login Your ID");
			System.out.println("Enter UserId : ");
			String Uid =opt.next();
			System.out.println("Enter the Password : ");
			String password = opt.next();
			ops.verifyuserid(Uid, password, userlist);
			if (ops.verifyuserid(Uid, password, userlist)) {
				int curruserid = Integer.parseInt(Uid);
				System.out.println("Login Success !");
			}else {
			System.out.println("Login Failed !");
			}
			}
			else if(Optstr.equalsIgnoreCase("3")) {
				
			}
			else if(Optstr.equalsIgnoreCase("4")) {
				ops.printUserlist(userlist);
		}else if(Optstr.equalsIgnoreCase("5")){
			ops.Printcurruserdetails(0, userlist);
		}else if(Optstr.equalsIgnoreCase("-1")) {
		
				System.out.println("You Have Exit");
				break;
				
			}
			}
			
//			if(str.equals("1")||str.equals("2")||str.equals("3")) {
//				SelectedOption = Integer.parseInt(str);
//			}else {
//				System.out.print("Choose option in the range of 1 to 3");
//			}		
		}

	}

