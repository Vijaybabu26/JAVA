package bankapp.entity;

public class Wallet {
	private int defaultBal = 0;
	private int UserId;
	private int amountlimit;
	public int getDefaultBal() {
		return defaultBal;
	}
	public void setDefaultBal(int defaultBal) {
		this.defaultBal = defaultBal;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getAmountlimit() {
		return amountlimit;
	}
	public void setAmountlimit(int amountlimit) {
		this.amountlimit = amountlimit;
	}
	
	
}
