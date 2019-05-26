package com.korea.ex03;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static Employee[] empList = new Employee[100];
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------");
			System.out.println("1.������ 2.�α��� 3.����");
			System.out.println("����");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.println("������");
				signUp();
				break;
			case 2:
				System.out.println("�α���");
				signIn();
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�."); 
				run = false;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ�Ȯ�����ּ���");
			}
		}
		
	}

	private static void signIn() {
		System.out.println("���̵� �Է��ϼ���");
		String id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String pw = in.nextLine();
		
		for(int i=0;i<=empList.length;i++) {
			if(empList[i]==null) {
				System.out.println("ȸ����������");
				break;
			}else if(empList[i].getM_id().equals(id)
					&&empList[i].getM_pw().equals(pw)) {
				System.out.println("�α��� ����");
				break;
			}
		}
		
	}

	private static void signUp() {
		System.out.println("���̵� �Է��ϼ���");
		String id = in.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String pw = in.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String name = in.nextLine();
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr = in.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
		String phone = in.nextLine();
		System.out.println("����� �Է��ϼ���");
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
