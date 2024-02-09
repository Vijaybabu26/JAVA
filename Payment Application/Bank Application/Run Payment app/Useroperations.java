package Vijay.bank.apk;

import Vijay.bank.apk.entity.User;

import java.lang.Math;

public class Useroperations {
		public User douserregistration(String FName,String lName,long phoneNo,String dob,String address,int userId,String passWord) {
			User u = new User();
			u.setFirstName(FName);
			u.setLastName(lName);
			u.setPhoneNo(phoneNo);
			u.setDateOfBirth(dob);
			u.setAddress(address);
			u.setUserId();
			u.setPassWord(passWord);
			return u;
		}
		public void printUserlist(User[] users) {
			for (int i = 0;i<users.length;i++) {
				if(users[i]!=null) {
					System.out.println("User Details Of"+users[i].getFirstName());
					System.out.println(users[i]);
				}
			}
			
		}
		int i=0;
		public boolean verifyuserid(String userId,String password,User[] users) {
			if(String.valueOf(users[i].equals(userId)) != null) {
				if(password.equals(password)) {
					return true;
				}
			}
			return false;
		}
	}

