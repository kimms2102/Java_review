package com.korea.ex03;

public abstract class Member implements Task {
	String m_id;
	String m_pw;
	String m_name;
	String m_addr;
	String m_phone;
	
	public Member(String m_id, String m_pw, 
			String m_name, String m_addr, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_addr = m_addr;
		this.m_phone = m_phone;
	}

	@Override
	public void goToWork() {
		System.out.println("출근합니다.");
		
	}

	@Override
	public void leaveWork() {
		System.out.println("퇴근합니다.");
	}
	
	
	
	
}
