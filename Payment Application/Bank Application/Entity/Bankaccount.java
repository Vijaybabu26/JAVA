package bankapp.entity;

import java.util.List;

public class Bankaccount {
	private String Bankacctno;
	private String BankacctName;
	private Acctype Acctype;
	private String AcctIFSC;
	private String Pin;
	private List<Bankaccount> Bankacctlist;
	public String getBankacctno() {
		return Bankacctno;
	}
	public void setBankacctno(String bankacctno) {
		Bankacctno = bankacctno;
	}
	public String getBankacctName() {
		return BankacctName;
	}
	public void setBankacctName(String bankacctName) {
		BankacctName = bankacctName;
	}
	public Acctype getAcctype() {
		return Acctype;
	}
	public void setAcctype(Acctype acctype) {
		Acctype = acctype;
	}
	public String getAcctIFSC() {
		return AcctIFSC;
	}
	public void setAcctIFSC(String acctIFSC) {
		AcctIFSC = acctIFSC;
	}
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	
}
