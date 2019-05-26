package com.korea.ex03;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static Employee[] empList = new Employee[100];
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------");
			System.out.println("1.사원등록 2.로그인 3.종료");
			System.out.println("선택");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.println("사원등록");
				signUp();
				break;
			case 2:
				System.out.println("로그인");
				signIn();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다."); 
				run = false;
				break;
			default:
				System.out.println("잘못입력하셨습니당. 다시확인해주세용");
			}
		}
		
	}

	private static void signIn() {
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = in.nextLine();
		
		for(int i=0;i<=empList.length;i++) {
			if(empList[i]==null) {
				System.out.println("회원정보업음");
				break;
			}else if(empList[i].getM_id().equals(id)
					&&empList[i].getM_pw().equals(pw)) {
				System.out.println("로그인 성공");
				break;
			}
		}
		
	}

	private static void signUp() {
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = in.nextLine();
		System.out.println("이름를 입력하세요");
		String name = in.nextLine();
		System.out.println("주소를 입력하세요");
		String addr = in.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phone = in.nextLine();
		System.out.println("등급을 입력하세요");
		String grade = in.nextLine();
		
		Employee m =new Employee(id, pw, name, addr, phone, grade);
		
		for(int i=0; i<=empList.length;i++) {
			if(empList[i]==null) {
				empList[i]=m;
				break;
			}
		}
	}

}
