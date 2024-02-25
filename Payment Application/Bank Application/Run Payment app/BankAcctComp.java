package bankapp.apk;

import java.util.Comparator;

import bankapp.entity.Bankaccount;

public class BankAcctComp implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Bankaccount ba1 = (Bankaccount) obj1;
		Bankaccount ba2 = (Bankaccount) obj2;
		if(ba1.getBankacctnumber().equals(ba2.getBankacctBankName())) {
			return 0;	
		}else if(Long.valueOf(ba1.getBankacctnumber())< Long.valueOf(ba2.getBankacctBankName())){
			return 1;
		}else {
			return -1;
		}
		
	}

}
