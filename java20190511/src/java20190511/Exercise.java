package java20190511;

class Rectangle{
	int jung(int a) {
		return a*a;
	}
	
	int jic(int a, int b) {
		return a*b;
	}	
}

public class Exercise {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle();
		int c = a.jung(5);
		int d = a.jic(3, 4);
		
		System.out.println(c);
		System.out.println(d);
		
	}

}
