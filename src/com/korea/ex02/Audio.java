package com.korea.ex02;

public class Audio implements RemotControler {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		this.volume= volume;
		System.out.println("������������"+volume);
	}

}
