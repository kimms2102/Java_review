package com.korea.ex02;

public class SmartTV implements RemotControler,Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Ƽ���մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Ƽ�񸦲��ϴ�..");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume<0) {
			this.volume = MIN_VOLUME;
		}else if(volume>=10){
			this.volume = MAX_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("����Ƽ�񺼷�"+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

}
