package java20190518_question;
//¹®Á¦
public class Account {
	
	int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<0) {
			return ;
		}else if(balance<=1000000 && balance>=0) {
			this.balance = balance;
		}else if(balance>=1000000){
			return ;
		}
		
	}
	
	
	
}
