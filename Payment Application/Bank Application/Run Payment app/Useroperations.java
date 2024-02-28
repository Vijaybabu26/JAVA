package bankapp.apk;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bankapp.entity.Bankaccount;
import bankapp.entity.User;
import bankapp.entity.Wallet;

public class Useroperations {
	List<User>users = Runpaymentapp.userlist;
	List<Bankaccount> Bank = Runpaymentapp.Bankacctlist;
	Map<Integer , Wallet> Walletlist = Runpaymentapp.Walletlist; 
	
//	List<User> users = null;
//	List<Bankaccount> Bankacctlist = null;
//	Map<Integer, Wallet> Walletlist = null;
//	public Useroperations() {
//		users = Runpaymentapp.userlist;
//		Bankacctlist = Runpaymentapp.Bankacctlist;
//		Walletlist = Runpaymentapp.Walletlist;
//	}
	
	public User douserregistration(String Fname,String Lname,long phoneNo,String dob,String passWord,String address)throws Exception {
		User u = new User();
		u.setFirstName(Fname);
		u.setLastName(Lname);
		u.setPhoneNo(phoneNo);
		u.setDateOfBirth(dob);
		u.setAddress(address);
		u.setPassWord(passWord);
		
		if((Fname+Lname).length()>50) {
			throw new Exception();
		}
		u.setUserId((int)(Math.random()*1000)+100);
		Fileops fo = new Fileops();
		fo.WriteUsertofile(u);
		return u;
	}
	public void printUserlist(List<User> Users) {
		for(User u:Users) {
			if(Users != null) {
				System.out.println("User Details of "+ u.getFirstName());
				System.out.println(u);
			}
		}
			
		
		
		/*
		 * for (int i = 0;i<Users.size();i++) { if(Users.get(i)!=null) {
		 * System.out.println("User Details Of"+Users.get(i).getFirstName());
		 * System.out.println(Users.get(i)); } }
		 */
		
	}
	
	public boolean verifyuserid(String userId,String password) {
		for(int i=0;i<users.size();i++) {
		if(String.valueOf(users.get(i).getUserId()).equals(userId)) {
			if(password.equals(users.get(i).getPassWord())) {
				return true;
				}
			}
		}
		return false;
	}
	public void Printcurruserdetails(int userId) {
		for(User u : users) {
			if(u.getUserId() == userId) {
				System.out.println(u);
			}else {
				System.out.println("No User Has Been Logged In.");
				break;
			}
		}	
		
		/*
		 * for (int i = 0;i<Users.size();i++) { if(Users.get(i).getUserId() !=userId) {
		 * System.out.println(users.get(i)); break; }
		 * 
		 * 
		 * }
		 */
		
	}
	public Map<User,List<Bankaccount>> getUserBankAccount(){
//		Map<User,BankAccount> userBankAcctMap = new HashMap<User,BankAccount>();
		Map<User, List<Bankaccount>> userBankAcctMap = new HashMap<User, List<Bankaccount>>() ;
		
		for(User u : users) {
			
			if(users != null) {
				
				userBankAcctMap.put(u,u.getBankacctlist());
			}
		}
		return userBankAcctMap;
	}
	public void addMoneytoWallet(double amount) {
		if(Walletlist.containsKey(Runpaymentapp.CurrUserId)) {
			Walletlist.get(Runpaymentapp.CurrUserId).setBalance(Walletlist.get(Runpaymentapp.CurrUserId).getBalance()+amount);
			System.out.println("Your Current Balance in your wallet : "+Walletlist.get(Runpaymentapp.CurrUserId).getBalance());
			
		}
	}
	public double checkWalletBalance(){
		System.out.println("Your Current Balance in Your Wallet : ");
		return Walletlist.get(Runpaymentapp.CurrUserId ).getBalance();
	}
}