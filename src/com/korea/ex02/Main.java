package com.korea.ex02;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		
		//예금
		acc.deposit(10000);
		System.out.println("예금액:"+acc.getBalance());
		
		//출금
		try {
			acc.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();//getMessage중요
			System.out.println(message);
			System.out.println();
			e.printStackTrace();//printStackTrace어디서 예외가 발생했는지 추적하는코드
		}

	}

}
