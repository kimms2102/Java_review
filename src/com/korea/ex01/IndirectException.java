package com.korea.ex01;

public class IndirectException {

	public static void main(String[] args) throws NullPointerException{
		
	
			method1();
		
	}

	private static void method1()  throws NullPointerException{
		
			String data = null;
			System.out.println(data.toString());
		
	}

}
