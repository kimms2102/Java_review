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

	void setSpeed(int speed){// 제약조건 Car의 속도는 마이너스가 나올수 없음
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
