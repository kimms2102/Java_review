package com.korea.ex01;

public class DoubleExceptionEx {
	public static void main(String[] args) {
	try {
	int[] num= {1,2,3};
	
	for(int i=0;i<=num.length;i++) {
		System.out.println(num[i]);
		}
	
	String data = "A101";
	int value = Integer.parseInt(data);
	System.out.println(value);
	}catch(NumberFormatException |ArrayIndexOutOfBoundsException e ) {//ĳġ�� �������ΰ�� ���������� �����������ش�.
		
	}catch(Exception e) {
		
	}
		
	
	}
}
