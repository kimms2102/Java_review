package java20190511;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner in = new Scanner(System.in);
		Member[] m_list = new Member[100];//Ŭ�����������ִ� 100���� �迭 �ν��Ͻ��� ����.
		while(run) {
			menu();
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
			case 1:
				System.out.println("ȸ�������� �����ϰڽ��ϴ�.");
				System.out.println("���̵� �Է����ּ���");
				String id = in.nextLine();
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String pw = in.nextLine();
				System.out.println("�̸��� �Է��ϼ���");
				String name = in.nextLine();
				System.out.println("���������� �Է��ϼ���");
				String phone = in.nextLine();
				
				Member m = new Member(id,pw,name,phone);
				for(int i= 0; i<m_list.length; i++) {
					if(m_list[i]==null){
						m_list[i] = m;
						break;
					}
				}
				System.out.println("ȸ�������� �׷�Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("�α����� �����ϰڽ��ϴ�.");
				int chk =0;
				System.out.println("���̵� �Է��ϼ���.");
				String l_id= in.nextLine();
				for(int i=0;i<m_list.length;i++) {
					if(m_list[i] != null) {
						if(m_list[i].m_id.equals(l_id)) {
							System.out.println("���̵� �ֽ��ϴ�.");
							chk=1;
							System.out.println("��й�ȣ�� �Է��ϼ���.");
							String l_pw = in.nextLine();
							if(m_list[i].m_id.equals(l_pw)) {
							System.out.println("�α��μ���");
							m_list[i].prt();
						}else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
							break;
						}
					}
				}else {
					break;
				}
				if(chk==0) {
					System.out.println("���̵� ã���� �����ϴ�.");
					System.out.println("�ٽ� Ȯ���� ������.");
				}
			}
			break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���.");
				break;
			}
		}
	}
	private static void menu() {
		System.out.println("--");
		System.out.println("1.ȸ������ 2.�α��� 3.����");
		System.out.println("--");
		System.out.println("���ڼ���");
		
		
	}

}
