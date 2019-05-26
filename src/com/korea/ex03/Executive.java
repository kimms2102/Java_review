package com.korea.ex03;

public class Executive extends Member{

	public Executive(String m_id, String m_pw, String m_name,
			String m_addr, String m_phone, String grade) {
		super(m_id, m_pw, m_name, m_addr, m_phone);
		// TODO Auto-generated constructor stub
	}

	public Employee humanResourceFire(Employee e) {
		System.out.println(e.getM_name()+"를 해고합니다.");
		e.setGrade("해고상태");
		return e;
	}

	@Override
	public void todo() {
		System.out.println("임원업무시작");
		
	}



}
