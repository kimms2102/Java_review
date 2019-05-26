package a;

public class M {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.field1);
		System.out.println(a.field2);
		System.out.println(a.field3);
		System.out.println(a.field4);
		
		A a1 = new A("하이"); //접근제어자와 오버로딩 
		A a2 = new A(3.01);
		A a3 = new A(3); //private라 되면안되지만 형변환이 되어 double로들어감
		A a4 = new A(true);
		
		a.method1();
		a.method2();
		a.method3();
		//a.method4();
		
		Car c = new Car();
		//c.speed = -100;

	}

}

/*
복습

클래스 A(정보+기능) 정보: 필드 ,기능: 메소드
A a = new A();
A b = new A();

static 

오버로딩 (메소드 이름은 같으나 다른 기능을 구현하고 싶을때.)
매개변수가 다를때.

final int a; //한번더 변수를 넣으면 에러발생.
final static 필드;  //바꿀수없고 모두 공유할수있는것.
---------------------------------------------------------------
패키지= 폴더
이름 정하는 법
숫자나 특수문자로 시작하면 안됨.
$_는 가능
소문자 표기를 관례적으로 사용
java. 이라는 이름으로 사용하면 안됨

ex) com.korea.cclass 
이런 형태로 패키지를 만든다.

com.korea.dclass
com.korea.aclass ---> 윈도우 ...\com\korea\aclass
--------------------------------------
package com.korea.cclass;

import java.util.Scanner; //Scanner은 java.util이라는 폴더안에 있구나 ~~~

import com.korea.dclass.Student;
//import com.naver.aclass.Student;에러 Student 는  이름이겹침
//import com.korea.dclass.*; *->에스터리스크 dclass 패키지를 전부가져옴 //클래스를 전부안쓰는데 에스터리스크를쓰면 메모리 낭비가 발생하기때문에 권장x

public class Main {
	// com.korea.dclass.Student s = new com.korea.dclass.Student(); //불편 Import를 씀
	// Student s = new com.korea.dclass.Student();
	// new com.korea.dclass.Student s = Student();
	
	Student s = new Student();
	
	com.naver.aclass.Student s2 = new com.naver.aclass.Student(); //com.naver.aclass.Student를 가져오기위해
	
	Scanner sc = new Scanner(System.in); //import ctrl+shift+o
	
}
------------------------------------
접근제어자 = 접근제한자
public  모두 사용할수 있는것
protected
default
private 나(클래스)만 사용할수 있는것: 클래스 내부에서만 사용할수 있는것

public> protected>   default   >      private
누구나                 동일 패키지  클래스 내부

getter 와 setter 

클래스의 필드에 직접 접근을 막고 메소드를 통해서 간접적으로 접근하도록 하기위해 만든 메소드 
데이터를 집어넣기위해 setter
데이터를 꺼내기위해 getter

클래스의 변조를 막을수있다.
--------------------------------------------------------------------------
디자인 패턴
클래스 -> 인스턴스화

싱글턴패턴 -> 인스턴스 하나만 만들어서 사용하고자 하는경우
*/
