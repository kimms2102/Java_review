package a;

public class Car {
	private int speed = 0;
	private String color = "red";
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void setSpeed(int speed){// �������� Car�� �ӵ��� ���̳ʽ��� ���ü� ����
		if(speed <=0 ) {
			this.speed = 0;
			return;		
		}else if(speed >= 200){
			this.speed=200;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	int getSpeed(){
		return this.speed;
	}
	
}
