import java.util.Scanner;
import java.util.ArrayList;

public class Member {
	
	final int MIN_ID_LEN = 5;
	final int MIN_PW_LEN = 8;
	final int S_NUMBER_LEN = 14;
	
	String id;
	String pw;
	String name;
	String s_number; // �ֹ���ȣ
	int gender; // ����
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
			System.out.print("ID�� �Է��� �ּ���.(����ȭ�� : 999) : ");
			id = scan.nextLine();
			if(id.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				return 999;
			
			}
			
			if(id.length() < MIN_ID_LEN) {
				System.out.println("ID�� 5�ڸ� �̻� �Է��ϼž� �մϴ�. �ٽ��Է��� �ּ���.");
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
				System.out.println("�빮�� 1�� �̻� �Է��ϼž� �մϴ�. �ٽ� �Է��� �ּ���.");
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
				System.out.println("�ߺ��� ���̵� �Դϴ�. �ٽ� �Է��� �ּ���.");
				id = null;
				continue;
			}
			
			System.out.println("���̵� ���������� �Է� �Ǿ����ϴ�.");
			return 0;
		}
		
	}
	
	void pw_input(Scanner scan) {
		while(true) {
			System.out.print("�н����带 �Է��� �ּ���. : ");
			pw = scan.nextLine();
			
			if(pw.length() < MIN_PW_LEN) {
				System.out.println("�н������ 8�ڸ� �̻� �Է��ϼž� �մϴ�. �ٽ��Է��� �ּ���.");
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
				System.out.println("Ư������ 1�� �̻� �Է��ϼž� �մϴ�. �ٽ� �Է��� �ּ���.");
				pw = null;
				continue;
			}
			
			System.out.println("�н����尡 ���������� �Է� �Ǿ����ϴ�.");
			break;
		}
	}
	
	void name_input(Scanner scan) {
		System.out.print("�̸��� �Է��� �ּ��� : ");
		name = scan.nextLine();
		System.out.println("�̸��� ���������� �Է� �Ǿ����ϴ�.");
	}
	
	void s_number_input(Scanner scan) {
		while(true) {
			System.out.print("�ֹι�ȣ�� �Է��� �ּ���. (- ����): ");
			s_number = scan.nextLine();
			if(s_number.length() != S_NUMBER_LEN) {
				System.out.println("�� 14�ڸ� �̾�� �մϴ�. �ٽ� �Է����ּ���.");
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
				System.out.println("'-'�� ���ԵǾ� ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				s_number = null;
				continue;
			}
			
			String[] check_str = s_number.split("-");
			if(check_str[0].length() != 6) {
				System.out.println("���ڸ��� 6�ڸ��� �ƴմϴ�. �ٽ� �Է����ּ���.");
				s_number = null;
				continue;
			}
			
			System.out.println("�ֹι�ȣ�� ���������� �Է� �Ǿ����ϴ�.");
			break;
		}
	}
	
	void gender_input(Scanner scan) {
		while(true) {
			System.out.print("������ �Է��� �ּ���.(���� - 0 / ���� - 1) : ");
			gender = scan.nextInt();
			scan.nextLine();
			if(gender != 0 && gender != 1) {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.println("������ ���������� �Է� �Ǿ����ϴ�.");
			break;
		}
	}
	
	void email_input(Scanner scan) {
		while(true) {
			
			System.out.print("�̸����� �Է��� �ּ���. : ");
			email = scan.nextLine();
			
			boolean at = false;
			boolean dat = false;
			at = email.contains("@");
			dat = email.contains(".");
			
			if(at == true && dat == true) {
				System.out.println("���������� �Է� �ϼ̽��ϴ�.");
			}
			else if(at == false && dat == true) {
				System.out.println("@�� �����ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			else if(at == true && dat == false) {
				System.out.println(".�� �����ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			else if(at == false && dat == false) {
				System.out.println("@ �� .�� �����ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
				
			break;
		}
	}
	
	void tell_input(Scanner scan) {
		while(true) {
			System.out.print("��ȭ��ȣ�� �Է��� �ּ���.('-' ����) : ");
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
				System.out.println("'-'�� 2���� �ƴմϴ�. �ٽ��Է��� �ּ���.");
				continue;
			}
			
			System.out.println("��ȭ��ȣ�� ���������� �ԷµǾ����ϴ�.");
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
			gender_str = "����";
		}
		else if(gender == 1) {
			gender_str = "����";
		}
		System.out.print(gender_str + "\t");
		System.out.print(email + "\t");
		System.out.print(tell + "\t");
		System.out.println();
		
	}
} //class
