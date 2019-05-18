package a;

public class A {
	public String field1;
	String field2;
	private String field3;
	protected String field4;
	
	public A() {}
	public A(String a){}
	A(double b){}
	private A(int c){}
	protected A(boolean d){}
	
	public void method1() {field3="3";}//내부안에서는 사용가능
	void method2() {method3();}
	private void method3() {}
	protected void method4() {}
}
