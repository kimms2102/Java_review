package a;

public class M_car {
	public static void main(String[] args) {
		Car c = new Car();
		//c.speed = -100;
		c.setSpeed(100);
		System.out.println("����ӵ�"+c.getSpeed());
		c.setSpeed(-100);
		System.out.println("����ӵ�"+c.getSpeed()); // ���̳ʽ��̱⶧���� ����� 0�̳���
		c.setSpeed(300);
		System.out.println("����ӵ�"+c.getSpeed()); // 200�� �ʰ��ϱ⶧���� ����� 200�̳���
		c.setSpeed(150);
		System.out.println("����ӵ�"+c.getSpeed());
	
	
		Car c2= new Car();
		S s1 = S.getInstance(); // �̹��ִ°��� ���� �� 
		s1.setA(10);
		S s2 = S.getInstance();
		System.out.println(s2.getA());
		s2.setA(20);
		System.out.println(s1.getA());//s1��s2�� ���� �ν��Ͻ��� ����Ŵ
		System.out.println(s2.getA());
	
	}
		
		

}
