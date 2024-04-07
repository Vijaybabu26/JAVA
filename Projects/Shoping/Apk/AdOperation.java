package Shoping.Apk;

import Shoping.Entity.Admin;
import Shoping.Entity.Customer;

public class AdOperation {
	public Admin AdOps(String AdFName,String AdLName,long AdPhNo,String AdAdd,String AdPass) {
		
		Admin Ad = new Admin();
		
		Ad.setFirstName(AdFName);
		Ad.setLastName(AdLName);
		Ad.setPhoneNo(AdPhNo);
		Ad.setAddress(AdAdd);
	    Ad.setPassWord(AdPass);
		return Ad;
		
	}
	public Customer CusOps(String CusFName,String CusLName,long CusPhNo,String CusAdd,String CusPass){
		Customer Cu = new Customer();
		
		Cu.setFirstName(CusFName);
		Cu.setLastName(CusLName);
		Cu.setPhoneNo(CusPhNo);
		Cu.setAddress(CusAdd);
		Cu.setPassWord(CusPass);
		return Cu;
		
	}
	public static boolean ValidateCurrId() {
		if(RunShoping.CurrId != -1) {
			return true;
		}else {
			return false;
		}
	}
}
