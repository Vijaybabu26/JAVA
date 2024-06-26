package Shoping.Apk;

import java.util.Scanner;

import Shoping.Entity.Admin;
import Shoping.Entity.Customer;
import Shoping.Entity.Product;

import Shoping.JDBC.ShopingDao;

public class RunShoping {
	public static int CurrAdId = -1;
	public static int CurrCusId = -1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("- - - - - WELCOME TO SHOPING APP - - - - - -");
		System.out.println("1.Admin Register ");
		System.out.println("2.Customer Register ");
		System.out.println("3.Admin Login ");
		System.out.println("4.Customer Login ");
		System.out.println("5.Show Customer List ");
		System.out.println("6.Show Admin List ");
		System.out.println("7.Log Out For Customer Or Admin ");
		System.out.println("8.Admin Access");
		System.out.println("9.Customer Access");
		String Opt = sc.next();
		System.out.println("Selected Option : " + Opt );
			if(Opt.equalsIgnoreCase("1")) {
				AdRegs();
			}else if(Opt.equalsIgnoreCase("2")) {
				CusRegs();
			}else if(Opt.equalsIgnoreCase("3")) {
				if(CurrAdId == -1 && CurrCusId == -1) {
				AdLogin();
				}else {
					System.out.println("Please Log Out The Current Admin Or Customer");
				}
			}else if(Opt.equalsIgnoreCase("4")) {
				if(CurrAdId == -1 && CurrCusId == -1) {
				CusLogin();
				}else {
					System.out.println("Please Log Out The Current Customer Or Admin");
				}
			}else if(Opt.equalsIgnoreCase("5")) {
				System.out.println("- - - - - CUSTOMER LIST - - - - -");
				ShopingDao.CustomerList();
			}else if(Opt.equalsIgnoreCase("6")) {
				System.out.println("- - - - - ADMIN LIST - - - - -");
				ShopingDao.AdminList();
			}else if(Opt.equalsIgnoreCase("7")) {
				CurrAdId = -1;
				CurrCusId = -1;
				System.out.println("- - - - - LOG OUT SUCCESS - - - - -");
			}else if(Opt.equalsIgnoreCase("8")) {
				if(CurrAdId != -1) {
					AdminAccess();
				}else {
					System.out.println("Please Log In As A Admin ");
				}				
			}else if(Opt.equalsIgnoreCase("9")) {
				if(CurrCusId != -1) {
					CustomerAccess();
				}else {
					System.out.println("Please Log In As A Customer");
				}
			}
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
		
		Admin ad = null;
		
		AdOperation Ads = new AdOperation();
		ad = Ads.AdOps(AdFName, AdLName, AdPhNo, AdAdd, AdPass);
		ShopingDao.AdminQ(ad);
	
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
		
		Customer cu = null;
		try {
		AdOperation Ads = new AdOperation();
		cu = Ads.CusOps(CusFName, CusLName, CusPhNo, CusAdd, CusPass);
		ShopingDao.CustomerQ(cu);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void AdLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME ADMIN - - - - -");
		System.out.println("Enter The Admin Id : ");
		int AdId = sc.nextInt();
		System.out.println("Enter The PassWord : ");
		String AdPass = sc.next();
		
		ShopingDao Da = new ShopingDao();
		boolean Adlogin =Da.AdminLogin(AdId, AdPass);
		if(Adlogin) {
			CurrAdId = AdId;
			System.out.println("- - - - - LOGIN SUCCESSFULL - - - - -");
		}else {
			System.out.println("- - - - - LOGIN FAILED - - - - -");
		}
	}
	public static void CusLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - WELCOME CUSTOMER - - - - -");
		System.out.println("Enter The Customer Id : ");
		int CusId = sc.nextInt();
		System.out.println("Enter The Pass Word");
		String CusPass = sc.next();
		
		ShopingDao Da = new ShopingDao();
		boolean Cuslogin =Da.AdminLogin(CusId, CusPass);
		if(Cuslogin) {
			CurrCusId = CusId;
			System.out.println("- - - - - LOGIN SUCCESSFULL - - - - -");
		}else {
			System.out.println("- - - - - LOGIN FAILED - - - - -");
		}
	}
	
	public static void AdminAccess() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("- - - - - WELCOME ADMIN - - - - -");
		System.out.println("1.Add Product");
		System.out.println("2.Admin Products");
		System.out.println("3.Transaction List");
		System.out.println("4.Check Wallet Balance");
		System.out.println("5.Add Money To Wallet");
		System.out.println("6.Back To Main Menu");
		
		String Aopt = sc.next();
		if(Aopt.equalsIgnoreCase("1")) {
			AddProduct();
		}else if(Aopt.equalsIgnoreCase("2")) {
			System.out.println("- - - - -PRODUCTS LIST - - - - -");
			ShopingDao.ProductList();
		}else if(Aopt.equalsIgnoreCase("3")) {
			ShopingDao.AdTransactionList();
		}else if(Aopt.equalsIgnoreCase("4")) {
			ShopingDao.CheckAdWallet();
		}else if(Aopt.equalsIgnoreCase("5")) {
			AddmoneytoAdWallet();
		}else if(Aopt.equalsIgnoreCase("6")) {
			main(null);
		}
		}
	}
	
	public static void AddmoneytoAdWallet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - ADDING AMOUNT TO ADMIN WALLET - - - - -");
		System.out.println("Enter The Amount :");
		double Adamount = sc.nextDouble();
		if(Adamount <= 5000) {
			ShopingDao.AddmoneytoAdWal(Adamount);
			ShopingDao.CheckAdWallet();
		}else {
			System.out.println("Adding Amount Limit Exceeded");
		}
	}
	
	public static void AddProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Product Name :");
		String PName = sc.next();
		System.out.println("Enter The Price Of Product :");
		double PAmount = sc.nextDouble();
		Product p = null;
		try {
		AdOperation ad = new AdOperation();
		p = ad.ProductOps(PName,PAmount);
		
		ShopingDao.AddProducts(p);
	} catch (Exception e) {
		e.printStackTrace();
	}		
	}
	
	public static void CustomerAccess() {
		Scanner sc = new Scanner (System.in);
		while(true) {
		System.out.println("1.Show Available Products ");
		System.out.println("2.Buy Products ");
		System.out.println("3.Add Money to Wallet");
		System.out.println("4.Check Amount In Wallet");
		System.out.println("5.Transaction List");
		System.out.println("6.Orders Status");
		System.out.println("7.Back To Main Menu");
		String opt = sc.next();
		if(opt.equalsIgnoreCase("1")) {
			ShopingDao.Cusproductslist();
		}else if(opt.equalsIgnoreCase("3")) {
			AddmoneytoCusWallet();
		}else if(opt.equalsIgnoreCase("4")) {
			ShopingDao.CheckCusWallet();
		}else if(opt.equalsIgnoreCase("5")) {
			ShopingDao.CusTransactionList();
		}
		}
	}
	
	public static void AddmoneytoCusWallet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- - - - - ADDING AMOUNT TO CUSTOMERS WALLET - - - - -");
		System.out.println("Enter The Amount :");
		double Adamount = sc.nextDouble();
		if(Adamount <= 5000) {
			ShopingDao.AddmoneytoCusWal(Adamount);
			ShopingDao.CheckCusWallet();
		}else {
			System.out.println("Adding Amount Limit Exceeded");
		}
	}
	
	
}
