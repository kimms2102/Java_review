package com.korea.ex03;

public class Executive extends Member{

	public Executive(String m_id, String m_pw, String m_name,
			String m_addr, String m_phone, String grade) {
		super(m_id, m_pw, m_name, m_addr, m_phone);
		// TODO Auto-generated constructor stub
	}

	public Employee humanResourceFire(Employee e) {
		System.out.println(e.getM_name()+"�� �ذ��մϴ�.");
		e.setGrade("�ذ����");
		return e;
	}

	@Override
	public void todo() {
		System.out.println("�ӿ���������");
		
	}



}
