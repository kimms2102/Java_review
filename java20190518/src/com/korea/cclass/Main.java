package com.korea.cclass;

import java.util.Scanner; //Scanner�� java.util�̶�� �����ȿ� �ֱ��� ~~~

import com.korea.dclass.Student;
//import com.naver.aclass.Student;���� Student ��  �̸��̰�ħ
//import com.korea.dclass.*; *->�����͸���ũ dclass ��Ű���� ���ΰ����� //Ŭ������ ���ξȾ��µ� �����͸���ũ������ �޸� ���� �߻��ϱ⶧���� ����x

public class Main {
	// com.korea.dclass.Student s = new com.korea.dclass.Student(); //���� Import�� ��
	// Student s = new com.korea.dclass.Student();
	// new com.korea.dclass.Student s = Student();
	
	Student s1 = new Student();
	
	com.naver.aclass.Student s2 = new com.naver.aclass.Student(); //com.naver.aclass.Student�� ������������
	
	Scanner sc = new Scanner(System.in); //import ctrl+shift+o
	
	//s1.prt();
	public static void main(String[] args) {
		Student s = new Student();
		// TODO Auto-generated method stub

		s.ppp();
		System.out.println(s.name);//public
		System.out.println(s.age);//private ����
		System.out.println(s.major);//default ����
	}
	
	
	
}
