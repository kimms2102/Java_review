package a;

public class S {//�̱�������
	private static S aa = new S();
	
	//������
	private S() {}
	
	static S getInstance() { //static �̿� �̱�������
		if(aa == null) {
			aa = new S();
		}
		return aa;
	}
	//�ʵ�
	private int a = 0;

	
	//�޼ҵ�
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}
