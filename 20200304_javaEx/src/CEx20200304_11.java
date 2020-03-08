import java.util.ArrayList;
import java.util.Scanner;

public class CEx20200304_11 extends Object {

	public static void main(String[] args) {
		// Member class와 연결되어 있음
		
		// 객체를 저장하기 ArrayList
		
		// 1) 회원 입력, 2) 회원 출력
		// Id - 대문자 1개이상, 5자리 이상, 중복체크
		// pw - 특수문자 1개이상, 길이는 8자리 이상
		// 주민번호 - '-' 포함하여 14자리까지 입력
		// 성별은 0, 1만 입력. 아니면 다시 입력
		// 이메일 @, . 있는지 없는지 체크
		
		// 회원 출력 gender 0: 남자, 1: 여자
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		ArrayList<Member> al_mb = new ArrayList<Member>();
		String[] title = { "Id", "PW", "이름", "주민번호", "성별", "이메일", "전화번호" };
		
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("회원정보입력을 선택하셨습니다.");
					
					Member m = new Member();
					m.member_input(al_mb, scan);
					
					al_mb.add(m);
					
					break;
					
				case 2 :
					title_print(title);
					print(al_mb);
					
					
					break;
				case 0 :
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
			
		}
		
	}
	
	static int main_print (Scanner scan) {
		System.out.println("===================================");
		System.out.println("[ 회원정보 프로그램 ]");
		System.out.println(" 1. 회원정보입력");
		System.out.println(" 2. 회원정보출력");
		System.out.println(" 0. 종료");
		System.out.println("-----------------------------------");
		System.out.print("원하는 번호를 입력해 주세요. : ");
		int select = scan.nextInt();
		scan.nextLine();
		
		return select;		
	}
	
	static void title_print(String[] title) {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	static void print(ArrayList<Member> al_mb) {
		for(int i = 0; i < al_mb.size(); i++) {
			Member m = (Member)al_mb.get(i);
			m.print();
		}
	}
}

