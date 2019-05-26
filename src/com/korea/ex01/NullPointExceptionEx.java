package com.korea.ex01;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());
			}catch(NullPointerException e) {
				System.out.println("예외가 발생했습니다.");
			}
		System.out.println("예외 처리이후 실행될문장");
	}

}
