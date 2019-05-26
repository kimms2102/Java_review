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
	public void withdraw(int money) throws BalanceInsufficientException { //throws는 예외를 던져라
		if(balance <money) {
			throw new BalanceInsufficientException("잔액부족:"+ //throw는 예외를발생시켜라
		(money-balance)+"모자람");
		}
	}
}
