package com.korea.ex02;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws BalanceInsufficientException { //throws�� ���ܸ� ������
		if(balance <money) {
			throw new BalanceInsufficientException("�ܾ׺���:"+ //throw�� ���ܸ��߻����Ѷ�
		(money-balance)+"���ڶ�");
		}
	}
}
