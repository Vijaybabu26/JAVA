package bankapp.entity;

public class Wallet {
	private  double Balance;

	private double Walletlimit;
	private int userId;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
	
	public double getWalletlimit() {
		return Walletlimit;
	}
	public void setWalletlimit(double walletlimit) {
		Walletlimit = walletlimit;
	}
		
}