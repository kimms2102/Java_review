package java20190511;

public class ClassName {
	//�ν��Ͻ� ���(�ʵ�,�żҵ�)
	int field1;
	void method1() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	//�������(�ʵ�, �޼ҵ�)
	static int field2;
	static void method2() {
		System.out.println("Ŭ���� �޼ҵ�");
	}
	
	//�����ʱ�ȭ���
	static {
		field2 = 10;
		method2();
		//field1 = 10; ����
		//method1(); ����
	}
	static void method3() {
		System.out.println("Ŭ���� �޼ҵ�2");
		field2 = 10;
		method2();
		//������������ ȣ���ϰ� ���°Ŵ� ����
		//this.field1 = 10; ��������� �ν��Ͻ� ����� ����ϴ°��� �Ұ��� ����
		//this.method1(); ��������� �ν��Ͻ� ����� ����ϴ°��� �Ұ���  ����
	}
	void method4() {
		this.field1=10;
		this.method1();
		field2=10;
		method2();
	}
}

