package java20190511;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner in = new Scanner(System.in);
		Member[] m_list = new Member[100];//클래스담을수있는 100개의 배열 인스턴스를 만듦.
		while(run) {
			menu();
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
			case 1:
				System.out.println("회원가입을 진행하겠습니다.");
				System.out.println("아이디를 입력해주세요");
				String id = in.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String pw = in.nextLine();
				System.out.println("이름을 입력하세요");
				String name = in.nextLine();
				System.out.println("저나버노을 입력하세요");
				String phone = in.nextLine();
				
				Member m = new Member(id,pw,name,phone);
				for(int i= 0; i<m_list.length; i++) {
					if(m_list[i]==null){
						m_list[i] = m;
						break;
					}
				}
				System.out.println("회원가입이 롼료되었습니다.");
				break;
			case 2:
				System.out.println("로그인을 진행하겠습니다.");
				int chk =0;
				System.out.println("아이디를 입력하세요.");
				String l_id= in.nextLine();
				for(int i=0;i<m_list.length;i++) {
					if(m_list[i] != null) {
						if(m_list[i].m_id.equals(l_id)) {
							System.out.println("아이디가 있습니다.");
							chk=1;
							System.out.println("비밀번호를 입력하세요.");
							String l_pw = in.nextLine();
							if(m_list[i].m_id.equals(l_pw)) {
							System.out.println("로그인성공");
							m_list[i].prt();
						}else {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}
					}
				}else {
					break;
				}
				if(chk==0) {
					System.out.println("아이디를 찾을수 없습니다.");
					System.out.println("다시 확인해 보세요.");
				}
			}
			break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
				break;
			}
		}
	}
	private static void menu() {
		System.out.println("--");
		System.out.println("1.회원가입 2.로그인 3.종료");
		System.out.println("--");
		System.out.println("숫자선택");
		
		
	}

}
