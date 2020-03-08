import java.util.Scanner;
import java.util.ArrayList;

public class Member {
	
	final int MIN_ID_LEN = 5;
	final int MIN_PW_LEN = 8;
	final int S_NUMBER_LEN = 14;
	
	String id;
	String pw;
	String name;
	String s_number; // 주민전호
	int gender; // 성별
	String email;
	String tell;
	
	Member () {
		
	}
	
	Member(String id, String pw, String name, String s_number, int gender, String email, String tell) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.s_number = s_number;
		this.gender = gender;
		this.email = email;
		this.tell = tell;
	}
	
	void member_input(ArrayList<Member> al_mb, Scanner scan) {
		int break_check = 0;
		break_check = id_input(al_mb, scan);
		if(break_check == 999) {
			return;
		}
		
		pw_input(scan);
		name_input(scan);
		s_number_input(scan);
		gender_input(scan);
		email_input(scan);
		tell_input(scan);		
	}
	
	int id_input(ArrayList<Member> al_mb, Scanner scan) {
		while(true) {
			System.out.print("ID를 입력해 주세요.(이전화면 : 999) : ");
			id = scan.nextLine();
			if(id.equals("999")) {
				System.out.println("이전화면으로 이동합니다.");
				return 999;
			
			}
			
			if(id.length() < MIN_ID_LEN) {
				System.out.println("ID는 5자리 이상 입력하셔야 합니다. 다시입력해 주세요.");
				id = null;
				continue;
			}
			
			char ch = ' ';
			boolean capital_check = false;
			for(int i = 0; i < id.length(); i++) {
				ch = id.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					capital_check = true;
				}
			}
			if (capital_check == false) {
				System.out.println("대문자 1개 이상 입력하셔야 합니다. 다시 입력해 주세요.");
				id = null;
				continue;
			}
			
			boolean id_check = false;
			for(int i = 0; i < al_mb.size(); i++) {
				Member m = (Member)al_mb.get(i);
				if(this.id.equals(m.id)) {
					id_check = true;
				}
			}
			if(id_check == true) {
				System.out.println("중복된 아이디 입니다. 다시 입력해 주세요.");
				id = null;
				continue;
			}
			
			System.out.println("아이디가 정상적으로 입력 되었습니다.");
			return 0;
		}
		
	}
	
	void pw_input(Scanner scan) {
		while(true) {
			System.out.print("패스워드를 입력해 주세요. : ");
			pw = scan.nextLine();
			
			if(pw.length() < MIN_PW_LEN) {
				System.out.println("패스워드는 8자리 이상 입력하셔야 합니다. 다시입력해 주세요.");
				pw = null;
				continue;
			}
			
			char ch = ' ';
			boolean special_check = false;
			for(int i = 0; i < pw.length(); i++) {
				ch = pw.charAt(i);
				if((ch >= '!' && ch <= '/') || (ch >= ':' && ch <= '@') || (ch >= '[' && ch <= '`') || (ch >= '{' && ch <= '~')) {
					special_check = true;
				}
			}
			if (special_check == false) {
				System.out.println("특수문자 1개 이상 입력하셔야 합니다. 다시 입력해 주세요.");
				pw = null;
				continue;
			}
			
			System.out.println("패스워드가 정상적으로 입력 되었습니다.");
			break;
		}
	}
	
	void name_input(Scanner scan) {
		System.out.print("이름을 입력해 주세요 : ");
		name = scan.nextLine();
		System.out.println("이름이 정상적으로 입력 되었습니다.");
	}
	
	void s_number_input(Scanner scan) {
		while(true) {
			System.out.print("주민번호를 입력해 주세요. (- 포함): ");
			s_number = scan.nextLine();
			if(s_number.length() != S_NUMBER_LEN) {
				System.out.println("총 14자리 이어야 합니다. 다시 입력해주세요.");
				s_number = null;
				continue;
			}
			
			char ch = ' ';
			boolean check = false;
			for(int i = 0; i < s_number.length(); i++) {
				ch = s_number.charAt(i);
				if(ch == '-') {
					check = true;
				}
			}
			if (check == false) {
				System.out.println("'-'이 포함되어 있지 않습니다. 다시 입력해 주세요.");
				s_number = null;
				continue;
			}
			
			String[] check_str = s_number.split("-");
			if(check_str[0].length() != 6) {
				System.out.println("앞자리가 6자리가 아닙니다. 다시 입력해주세요.");
				s_number = null;
				continue;
			}
			
			System.out.println("주민번호가 정상적으로 입력 되었습니다.");
			break;
		}
	}
	
	void gender_input(Scanner scan) {
		while(true) {
			System.out.print("성별을 입력해 주세요.(남자 - 0 / 여자 - 1) : ");
			gender = scan.nextInt();
			scan.nextLine();
			if(gender != 0 && gender != 1) {
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력하세요.");
				continue;
			}
			
			System.out.println("성별이 정상적으로 입력 되었습니다.");
			break;
		}
	}
	
	void email_input(Scanner scan) {
		while(true) {
			
			System.out.print("이메일을 입력해 주세요. : ");
			email = scan.nextLine();
			
			boolean at = false;
			boolean dat = false;
			at = email.contains("@");
			dat = email.contains(".");
			
			if(at == true && dat == true) {
				System.out.println("정상적으로 입력 하셨습니다.");
			}
			else if(at == false && dat == true) {
				System.out.println("@가 없습니다. 다시 입력해 주세요.");
				continue;
			}
			else if(at == true && dat == false) {
				System.out.println(".이 없습니다. 다시 입력해 주세요.");
				continue;
			}
			else if(at == false && dat == false) {
				System.out.println("@ 와 .이 없습니다. 다시 입력해 주세요.");
				continue;
			}
				
			break;
		}
	}
	
	void tell_input(Scanner scan) {
		while(true) {
			System.out.print("전화번호를 입력해 주세요.('-' 포함) : ");
			tell = scan.nextLine();
			
			char ch = ' ';
			int check_count = 0;
			for(int i = 0; i < tell.length(); i++) {
				ch = tell.charAt(i);
				if(ch == '-') {
					check_count++;
				}
			}
			
			if(check_count != 2) {
				System.out.println("'-'가 2개가 아닙니다. 다시입력해 주세요.");
				continue;
			}
			
			System.out.println("전화번호가 정상적으로 입력되었습니다.");
			break;
		}
	}
	
	
	void print() {
			
		System.out.print(id + "\t");
		System.out.print(pw + "\t");
		System.out.print(name + "\t");
		System.out.print(s_number + "\t");
		
		String gender_str = "";
		if(gender == 0) {
			gender_str = "남자";
		}
		else if(gender == 1) {
			gender_str = "여자";
		}
		System.out.print(gender_str + "\t");
		System.out.print(email + "\t");
		System.out.print(tell + "\t");
		System.out.println();
		
	}
} //class
