package com.korea.dclass;

public class Student {
	public String name = "홍길동"; // 누구나 공개되는 정보
	private int age = 30; //클래스 내부에서만 사용하는 정보
	String major = "도술";
	protected String s_Num = "175677";
	
	private void prt() {
		System.out.println("학생명: "+ name);
	}
	
	public void ppp(){
		prt();
	}
}
