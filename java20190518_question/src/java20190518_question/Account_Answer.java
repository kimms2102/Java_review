package java20190518_question;

public class Account_Answer {
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	
	int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(MIN_BALANCE<= balance && balance>=MAX_BALANCE) {
			this.balance = balance;
	}
	
	}
}
