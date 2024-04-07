package Shoping.Entity;

public class Customer {
	private int CusId;
	private String FirstName;
	private String LastName;
	private long PhoneNo;
	private String Address;
	private String PassWord;
	
	public int getCusId() {
		return CusId;
	}
	public void setCusId(int cusId) {
		CusId = cusId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
}
