package b;

import a.A;

public class Mb {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.field1);
		System.out.println(a.field2);
		System.out.println(a.field3);
		System.out.println(a.field4);
		
		A a1 = new A("����"); //���������ڿ� �����ε� 
		A a2 = new A(3.01); //�ٸ���Ű����ȵ�
		A a3 = new A(3); //�ٸ���Ű����ȵ�
		A a4 = new A(true); //�ٸ���Ű����ȵ�
		
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		

	}

}
