package in.cdac;

public class Transactions {
	private int txId;
	private String txDate;
	private float txAmount;
	private boolean txStatus;
	private boolean txArrears;
	
	
	public int getTxId() {
		return txId;
	}


	public void setTxId(int txId) {
		this.txId = txId;
	}


	public String getTxDate() {
		return txDate;
	}


	public void setTxDate(String txDate) {
		this.txDate = txDate;
	}


	public float getTxAmount() {
		return txAmount;
	}


	public void setTxAmount(float txAmount) {
		this.txAmount = txAmount;
	}


	public boolean isTxStatus() {
		return txStatus;
	}


	public void setTxStatus(boolean txStatus) {
		this.txStatus = txStatus;
	}


	public boolean isTxArrears() {
		return txArrears;
	}


	public void setTxArrears(boolean txArrears) {
		this.txArrears = txArrears;
	}


	public Transactions(int txId, String txDate, float txAmount, boolean txStatus, boolean txArrears) {
		this.txId = txId;
		this.txDate = txDate;
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}
	
	public String toString() {
        return "Transaction{id=" + txId + ", Date=" + txDate +
               ", amount=" + txAmount + ", status=" + txStatus +
               ", arrears=" + txArrears + "}";
    }
	
}
