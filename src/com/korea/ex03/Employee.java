package com.korea.ex03;

public class Employee extends Member {

	private String grade;
	
	public Employee(String m_id, String m_pw, String m_name, String m_addr,
			String m_phone,String grade) {
		super(m_id, m_pw, m_name, m_addr, m_phone);
		this.grade = grade;
	}

	@Override
	public void todo() {
		System.out.println("사원이업무를합니다");
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getM_name() {
		return m_name;
	}
	public String getM_id() {
		return m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	
	
}
