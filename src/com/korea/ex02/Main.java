package com.korea.ex02;

public class Main {

	public static void main(String[] args) {
		RemotControler rc= new Television();
	//	rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println("--------------------");
		
		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(5);
		stv.search("쇼미더머니");
		stv.turnOff();
		
		RemotControler rc2= new SmartTV();
		rc2.turnOn();
		rc2.setVolume(5);
		//rc2.search("쇼미더머니");부모에 search메소드가 없기때문에 불가능
		rc2.turnOff();
	}

}
