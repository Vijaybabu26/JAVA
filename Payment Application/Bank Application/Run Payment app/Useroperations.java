package bankapp.apk;

import java.util.List;

import bankapp.entity.Bankaccount;
import bankapp.entity.User;

public class Useroperations {
	
	List<User> users = null;
	List<Bankaccount> Bankacctlist = null;
	
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
		return u;
	}
	public void printUserlist(List<User> Users) {
		for (int i = 0;i<Users.size();i++) {
			if(Users.get(i)!=null) {
				System.out.println("User Details Of"+Users.get(i).getFirstName());
				System.out.println(Users.get(i));
			}
		}
		
	}
	int i=0;
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
	public void Printcurruserdetails(int userId,List<User> Users) {
		for(User u : users) {
			if(u.getUserId() == userId) {
				System.out.println(u);
			}else {
				System.out.println("No User Has Been Logged In.");
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
}
