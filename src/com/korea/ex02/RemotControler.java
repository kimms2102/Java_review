package com.korea.ex02;

public interface RemotControler {//클래스아님
	//상수사용가능 ex) final, static
	public final static int MAX_VOLUME= 10;//안써져도 final static이 자동으로 붙는다.
	public int MIN_VOLUME= 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
