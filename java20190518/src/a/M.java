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
