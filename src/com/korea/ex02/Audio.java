package com.korea.ex02;

public class Audio implements RemotControler {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		this.volume= volume;
		System.out.println("현재오디오볼륨"+volume);
	}

}
