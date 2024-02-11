package bankapp.apk;

import java.util.List;

import java.lang.Math;

import bankapp.entity.User;

public class Useroperations {
	public User douserregistration(String FName,String lName,long phoneNo,String dob,String address,int userId,String passWord) {
		User u = new User();
		u.setFirstName(FName);
		u.setLastName(lName);
		u.setPhoneNo(phoneNo);
		u.setDateOfBirth(dob);
		u.setAddress(address);
		u.setUserId(userId);
		u.setPassWord(passWord);
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
	public boolean verifyuserid(String userId,String password,List<User> Users) {
		if(String.valueOf(Users.get(i).equals(userId))!= null) {
			if(password.equals(password)) {
				return true;
			}
		}
		return false;
	}
	public void Printcurruserdetails(int userId,List<User> Users) {
		for (int i = 0;i<Users.size();i++) {
			if(Users.get(i).getUserId() !=userId) {
				System.out.println(userId);
				break;
			}
			
			
		}
		
	}
}
