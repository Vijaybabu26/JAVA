package bankapp.entity;

import java.sql.Date;

public class Transaction {
	private int TxnId;
	private Date timestamp;
	private double amount;
	
	private Transactiontype Txnsrc;
	private int UserId;
	private Transactiontype TxnDest;
	
	public int getTxnId() {
		return TxnId;
	}


	public void setTxnId(int txnId) {
		TxnId = txnId;
	}


	public Date getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public Transactiontype getTxnsrc() {
		return Txnsrc;
	}


	public void setTxnsrc(Transactiontype txnsrc) {
		Txnsrc = txnsrc;
	}


	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		UserId = userId;
	}


	public Transactiontype getTxnDest() {
		return TxnDest;
	}


	public void setTxnDest(Transactiontype txnDest) {
		TxnDest = txnDest;
	}
	
	@Override
	public String toString() {
		return "--->" +": Transaction ID " + TxnId + "Transaction date : " + timestamp 
				+ "Transaction Amount: "+amount + "Transaction Source Type" + Txnsrc 
				+" Amount sent to UserId "+ UserId + "Transaction Destination Type"
				+ TxnDest ;
	}
	
}