package bankapp.apk;

import bankapp.entity.Wallet;
	
public class WalletOps {
	static int defaultamount = 0;
	public static int Addmoney(int a) {
		Wallet w1 = new Wallet();
		w1.setAmountlimit(5000);
		defaultamount = a+defaultamount;
		
		if(defaultamount>w1.getAmountlimit()) {
			System.out.println("Limit Exceded to wallet");
			defaultamount = defaultamount-a;
		}
		return defaultamount;
	}

	
}
