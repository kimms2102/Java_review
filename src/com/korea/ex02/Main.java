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
		stv.search("��̴��Ӵ�");
		stv.turnOff();
		
		RemotControler rc2= new SmartTV();
		rc2.turnOn();
		rc2.setVolume(5);
		//rc2.search("��̴��Ӵ�");�θ� search�޼ҵ尡 ���⶧���� �Ұ���
		rc2.turnOff();
	}

}
