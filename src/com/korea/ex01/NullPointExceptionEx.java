package com.korea.ex01;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());
			}catch(NullPointerException e) {
				System.out.println("���ܰ� �߻��߽��ϴ�.");
			}
		System.out.println("���� ó������ ����ɹ���");
	}

}
