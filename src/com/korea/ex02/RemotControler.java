package com.korea.ex02;

public interface RemotControler {//Ŭ�����ƴ�
	//�����밡�� ex) final, static
	public final static int MAX_VOLUME= 10;//�Ƚ����� final static�� �ڵ����� �ٴ´�.
	public int MIN_VOLUME= 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
