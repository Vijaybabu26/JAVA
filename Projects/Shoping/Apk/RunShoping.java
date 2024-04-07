package Shoping.Apk;

import java.util.Scanner;

public class RunShoping {
	public static int CurrId = -1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("- - - - - WELCOME TO SHOPING - - - - - -");
		System.out.println("1.Admin Register ");
		System.out.println("2.Customer Register ");
		System.out.println("3.Admin Login ");
		System.out.println("4.Customer Login ");
		System.out.println("5.Show Customer List ");
		System.out.println("6.show Admin List ");
		String Opt = sc.next();
		System.out.println("Selected Option : " + Opt );
		if(Opt.equalsIgnoreCase("1")) {
			AdRegs();
		}else if(Opt.equalsIgnoreCase("2")) {
			CusRegs();
		}else if(Opt.equalsIgnoreCase("3")) {
			AdLogin();
		}else if(Opt.equalsIgnoreCase("4")) {
			CusLogin();
		}else if(Opt.equalsIgnoreCase("5")) {
			
		}else if(Opt.equalsIgnoreCase("6")) {
			
		}
	}
	public static void AdRegs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME ADMIN - - - - -");
		System.out.println("Enter The First Name : ");
		String AdFName = sc.next();
		System.out.println("Enter The Last Name : ");
		String AdLName = sc.next();
		System.out.println("Enter The Mobile No : ");
		long AdPhNo = sc.nextLong();
		System.out.println("Enter The Address : ");
		String AdAdd = sc.next();
		System.out.println("Enter The PassWord : ");
		String AdPass = sc.next();
		
		AdOperation Ads = new AdOperation();
		Ads.AdOps(AdFName, AdLName, AdPhNo, AdAdd, AdPass);
	
	}
	public static void CusRegs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME CUSTOMER - - - - -");
		System.out.println("Enter The First Name : ");
		String CusFName = sc.next();
		System.out.println("Enter The Last Name : ");
		String CusLName = sc.next();
		System.out.println("Enter The Mobile No : ");
		long CusPhNo = sc.nextLong();
		System.out.println("Enter The Address : ");
		String CusAdd = sc.next();
		System.out.println("Enter The PassWord : ");
		String CusPass = sc.next();
		
		AdOperation Ads = new AdOperation();
		Ads.CusOps(CusFName, CusLName, CusPhNo, CusAdd, CusPass);
		
		
	}
	public static void AdLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME ADMIN - - - - -");
		System.out.println("Enter The Admin Id : ");
		int AdId = sc.nextInt();
		System.out.println("Enter The Pass Word");
		String AdPass = sc.next();
		
		
		
		
	}
	public static void CusLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME CUSTOMER - - - - -");
		System.out.println("Enter The Customer Id : ");
		int CusId = sc.nextInt();
		System.out.println("Enter The Pass Word");
		String CusPass = sc.next();
		
	}
}
