package in.cdac;

public class Transactions {
	private int txId;
	private String txDate;
	private float txAmount;
	private boolean txStatus;
	private boolean txArrears;
	
	public Transactions(int txId, String txDate, float txAmount, boolean txStatus, boolean txArrears) {
		this.txId = txId;
		this.txDate = txDate;
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}
	
}
