package a;

public class M_car {
	public static void main(String[] args) {
		Car c = new Car();
		//c.speed = -100;
		c.setSpeed(100);
		System.out.println("현재속도"+c.getSpeed());
		c.setSpeed(-100);
		System.out.println("현재속도"+c.getSpeed()); // 마이너스이기때문에 실행시 0이나옴
		c.setSpeed(300);
		System.out.println("현재속도"+c.getSpeed()); // 200을 초과하기때문에 실행시 200이나옴
		c.setSpeed(150);
		System.out.println("현재속도"+c.getSpeed());
	
	
		Car c2= new Car();
		S s1 = S.getInstance(); // 이미있는것을 갖다 씀 
		s1.setA(10);
		S s2 = S.getInstance();
		System.out.println(s2.getA());
		s2.setA(20);
		System.out.println(s1.getA());//s1과s2가 같은 인스턴스를 가르킴
		System.out.println(s2.getA());
	
	}
		
		

}
