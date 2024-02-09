package Vijay.bank.apk.entity;



	public class User extends Object{
		private String firstName;
		private String lastName;
		private long phoneNo;
		private String DateOfBirth;
		private String Address;
		private int userId;
		private String passWord; 
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getDateOfBirth() {
			return DateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId() {
			this.userId = ((int) (Math.random()*1000+100));
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		//Payment Account
		public String toString() {
			return this.userId+":"+ this.firstName +":"+ this.lastName + ":"+this.phoneNo+":"+this.DateOfBirth+":"+this.Address+":"+this.passWord;
		}
		
	}
