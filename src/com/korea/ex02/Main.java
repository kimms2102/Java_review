package com.korea.ex02;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		
		//����
		acc.deposit(10000);
		System.out.println("���ݾ�:"+acc.getBalance());
		
		//���
		try {
			acc.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();//getMessage�߿�
			System.out.println(message);
			System.out.println();
			e.printStackTrace();//printStackTrace��� ���ܰ� �߻��ߴ��� �����ϴ��ڵ�
		}

	}

}
