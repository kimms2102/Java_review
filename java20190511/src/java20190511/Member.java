package java20190511;

public class Member {
	String m_id;
	String m_pw;
	String m_name;
	String m_phone;
	
	Member(String m_id){
		this.m_id=m_id;
	}
	Member(String m_id, String m_pw){
		this.m_id=m_id;
		this.m_pw=m_pw;
	}
	Member(String m_id, String m_pw, String m_name){
		this.m_id=m_id;
		this.m_pw=m_pw;
		this.m_name=m_name;
	}
	Member(String m_id, String m_pw, String m_name, String m_phone){
		this.m_id=m_id;
		this.m_pw=m_pw;
		this.m_name=m_name;
		this.m_phone=m_phone;
	}
	
	public void prt() {
		System.out.println("�̸�"+this.m_name);
		System.out.println("��������"+this.m_phone);
		System.out.println("���̵�"+this.m_id);
		System.out.println("���"+this.m_pw);
	}
}


