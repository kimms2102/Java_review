package a;

public class S {//싱글턴패턴
	private static S aa = new S();
	
	//생성장
	private S() {}
	
	static S getInstance() { //static 이용 싱글턴패턴
		if(aa == null) {
			aa = new S();
		}
		return aa;
	}
	//필드
	private int a = 0;

	
	//메소드
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
