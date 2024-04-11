package Shoping.Apk;

import Shoping.Entity.Admin;
import Shoping.Entity.Customer;


public class AdOperation {
	public Admin AdOps(String AdFName,String AdLName,long AdPhNo,String AdAdd,String AdPass) {
		
		Admin Ad = new Admin();
		
		Ad.setAdFirstName(AdFName);
		Ad.setAdLastName(AdLName);
		Ad.setAdPhoneNo(AdPhNo);
		Ad.setAdAddress(AdAdd);
	    Ad.setAdPassWord(AdPass);
		return Ad;
		
	}
	public Customer CusOps(String CusFName,String CusLName,long CusPhNo,String CusAdd,String CusPass){
		Customer Cu = new Customer();
		
		Cu.setCusFirstName(CusFName);
		Cu.setCusLastName(CusLName);
		Cu.setCusPhoneNo(CusPhNo);
		Cu.setCusAddress(CusAdd);
		Cu.setCusPassWord(CusPass);
		return Cu;
		
	}
	public static boolean ValidateCurrId() {
		if(RunShoping.CurrCusId != -1) {
			return true;
		}else {
			return false;
		}
	}
}
