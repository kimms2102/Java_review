package com.korea.cclass;

import java.util.Scanner; //Scanner은 java.util이라는 폴더안에 있구나 ~~~

import com.korea.dclass.Student;
//import com.naver.aclass.Student;에러 Student 는  이름이겹침
//import com.korea.dclass.*; *->에스터리스크 dclass 패키지를 전부가져옴 //클래스를 전부안쓰는데 에스터리스크를쓰면 메모리 낭비가 발생하기때문에 권장x

public class Main {
	// com.korea.dclass.Student s = new com.korea.dclass.Student(); //불편 Import를 씀
	// Student s = new com.korea.dclass.Student();
	// new com.korea.dclass.Student s = Student();
	
	Student s1 = new Student();
	
	com.naver.aclass.Student s2 = new com.naver.aclass.Student(); //com.naver.aclass.Student를 가져오기위해
	
	Scanner sc = new Scanner(System.in); //import ctrl+shift+o
	
	//s1.prt();
	public static void main(String[] args) {
		Student s = new Student();
		// TODO Auto-generated method stub

		s.ppp();
		System.out.println(s.name);//public
		System.out.println(s.age);//private 에러
		System.out.println(s.major);//default 에러
	}
	
	
	
}
