package com.korea.ex02;

public class SmartTV implements RemotControler,Searchable {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티비를켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를끕니다..");
		
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
		System.out.println("현재티비볼륨"+this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다.");
	}

}
