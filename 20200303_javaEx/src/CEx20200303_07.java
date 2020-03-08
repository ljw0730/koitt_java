import java.util.Scanner;
import java.util.Vector;

public class CEx20200303_07 {

	public static void main(String[] args) {
		// 1)�л������Է�, 2)�л������Է�,
		// 3)�л��������(��� ���), 4)�л����� ���(��� ���)
		// 5)�л������˻� - �й�, �̸��˻� 6)�л������˻� - �й�, �̸��˻�
		// 1)�л������Է� -> �й�, �̸�, ��, �г�
		// 2)�л�����ó�� -> �й�, �̸�, ����, ����, �հ�, ���, ���
		// 2)�� �й��Է½� 1)�� �й��� ���Ͽ� ������ �����߰� ������ ���ٰ� ���
		// 2)�й��Է� �� �̸� �ڵ����� �Է�
		// ArrayList�� �ۼ�
		
		Vector<Stu_info> info = new Vector<Stu_info>();
		String[] info_title = { "�й�", "�̸�", "�а�", "�г�" };
		
		Vector<Stu_score> score = new Vector<Stu_score>();
		String[] score_title = { "�й�", "�̸�", "����", "����", "�հ�", "���", "���" };
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			switch (select) {
				case 1:
					System.out.println("�л� ���� �Է��� �����ϼ̽��ϴ�.");
					info_input(info, scan);
					
					break;
					
				case 2:
					System.out.println("�л� ���� �Է��� �����ϼ̽��ϴ�.");
					score_input(info, score, info_title, scan);
										
					break;
					
				case 3:
					System.out.println("�л� ���� ����� �����ϼ̽��ϴ�.");
					info_print(info, info_title);
					
					break;
					
				case 4:
					System.out.println("�л� ���� ����� �����ϼ̽��ϴ�.");
					score_print(score, score_title);
					
					break;
					
				case 5:
					System.out.println("�л� ���� �˻��� �����ϼ̽��ϴ�.");
					
					Loop2: while(true) {
						
						System.out.print("1. �й� �˻�, 2. �̸� �˻� / 999. ����ȭ�� : ");
						select = scan.nextInt();
						scan.nextLine();
						
						switch (select) {
						case 1:
							search_info_hak_num(info, info_title, scan);
							
							break;

						case 2:
							search_info_name(info, info_title, scan);
							
							break;
							
						case 999 :
							System.out.println("����ȭ������ �̵��մϴ�.");
							break Loop2;
						}
					}
					
					break;
					
				case 6:
					System.out.println("�л� ���� �˻��� �����ϼ̽��ϴ�.");
					Loop3: while(true) {
						System.out.print("1. �й� �˻�, 2. �̸� �˻� / 999. ����ȭ�� : ");
						select = scan.nextInt();
						scan.nextLine();
						
						switch (select) {
						case 1:
							search_score_hak_num(score, score_title, scan);
							
							break;

						case 2:
							search_score_name(score, score_title, scan);
							
							break;
							
						case 999 :
							System.out.println("����ȭ������ �̵��մϴ�.");
							break Loop3;
						}
					}
					
					break;
					
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
			
		}
		
		
	} //main
	
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("===================================");
		System.out.println("[ �л� ����/���� ���� ���α׷� ]");
		System.out.println(" 1. �л� ���� �Է�");
		System.out.println(" 2. �л� ���� �Է�");
		System.out.println(" 3. �л� ���� ���");
		System.out.println(" 4. �л� ���� ���");
		System.out.println(" 5. �л� ���� �˻�");
		System.out.println(" 6. �л� ���� �˻�");
		System.out.println(" 0. ����");
		System.out.println("-----------------------------------");
		System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static void info_input(Vector<Stu_info> info, Scanner scan) {
		String name = "";
		String major = "";
		int grade = 0;
		
		while(true) {
			System.out.print("�л��� �̸��� �Է��� �ּ���.(����ȭ�� : 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;
			}
			
			System.out.print(name + " �л��� ���� �Է��� �ּ���. : ");
			major = scan.nextLine();
			System.out.print(name + " �л��� �г��� �Է��� �ּ���. : ");
			grade = scan.nextInt();
			scan.nextLine();
			
			info.add(new Stu_info(name, major, grade));
			System.out.println(name + " �л��� ���� �Է��� �Ϸ� �Ǿ����ϴ�.");
		}
	}
	
	static void score_input(Vector<Stu_info> info, Vector<Stu_score> score, String[] info_title, Scanner scan) {
		String name = "";
		int kor = 0;
		int eng = 0;
		
		while(true) {
			int scan_hak_num = 0;
			System.out.print("������ �Է��� �л��� �й��� �Է��� �ּ���. (����ȭ�� : 999) : ");
			scan_hak_num = scan.nextInt();
			scan.nextLine();
			if(scan_hak_num == 999) {
				break;
			}

			boolean check_hak_num = false;
			for(int i = 0; i < info.size(); i++) {
				Stu_info si = (Stu_info)info.get(i);
				if(si.hak_num == scan_hak_num) {
					info_title_print(info_title);
					info_print_sub(si);
					
					name = si.name;
					
					System.out.print(name + " �л��� ������� �Է��� �ּ��� : ");
					kor = scan.nextInt();
					System.out.print(name + " �л��� ������� �Է��� �ּ��� : ");
					eng = scan.nextInt();
					scan.nextLine();
					
					score.add(new Stu_score(scan_hak_num, name, kor, eng));
					
					check_hak_num = true;
				} //if
			}// for
			if(check_hak_num == false) {
				System.out.println("�Է��Ͻ� �й��� �л��� �����ϴ�. �ٽ� �Է��� �ּ���.");
			}
			
		}//while
	}// score_input �޼ҵ�
	
	static void info_print(Vector<Stu_info> info, String[] info_title) {
		info_title_print(info_title);
		
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			info_print_sub(si);
		}
	}
	
	static void info_title_print(String[] info_title) {
		for(int i = 0; i < info_title.length; i++) {
			System.out.print(info_title[i] + "\t");
		}
		System.out.println();
	}
	
	static void info_print_sub(Stu_info si) {
		System.out.print(si.hak_num + "\t");
		System.out.print(si.name + "\t");
		System.out.print(si.major + "\t");
		System.out.print(si.grade + "\t");
		System.out.println("");
	}
	
	static void score_print(Vector<Stu_score> score, String[] score_title) {
		score_title_print(score_title);
		
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			score_print_sub(ss);
		}
	}
	
	static void score_title_print(String[] score_title) {
		for(int i = 0; i < score_title.length; i++) {
			System.out.print(score_title[i] + "\t");
		}
		System.out.println();
	}
	
	static void score_print_sub(Stu_score ss) {
		System.out.print(ss.hak_num + "\t");
		System.out.print(ss.name + "\t");
		System.out.print(ss.kor + "\t");
		System.out.print(ss.eng + "\t");
		System.out.print(ss.total + "\t");
		System.out.print(ss.avg + "\t");
		System.out.print(ss.rank + "\t");
		System.out.println();
	}
		
	static void search_info_hak_num(Vector<Stu_info> info, String[] info_title, Scanner scan) {
		int scan_hak_num = 0;
		System.out.print("�˻��� �л��� �й��� �Է��� �ּ���. (����ȭ�� : 999) : ");
		scan_hak_num = scan.nextInt();
		scan.nextLine();
		
		boolean check_hak_num = false;
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			if(si.hak_num == scan_hak_num) {
				info_title_print(info_title);
				info_print_sub(si);
				check_hak_num = true;
			}
		}
		if(check_hak_num == false) {
			System.out.println("�Է��Ͻ� �й��� �л��� �����ϴ�. �ٽ� �Է��� �ּ���.");
		}
		
	}
	
	static void search_info_name(Vector<Stu_info> info, String[] info_title, Scanner scan) {
		String scan_name = "";
		System.out.print("�˻��� �л��� �̸��� �Է��� �ּ���. (����ȭ�� : 999)");
		scan_name = scan.nextLine();
		
		boolean check_name = false;
		
		info_title_print(info_title);
		for(int i = 0; i < info.size(); i++) {
			Stu_info si = (Stu_info)info.get(i);
			if(si.name.equals(scan_name)) {
				info_print_sub(si);
				check_name = true;
			}
		
		}
		if(check_name = true) {
			System.out.println("�Է��Ͻ� �̸��� �л��� �����ϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	
	static void search_score_hak_num(Vector<Stu_score> score, String[] score_title, Scanner scan) {
		int scan_hak_num = 0;
		System.out.print("�˻��� �л��� �й��� �Է��� �ּ���. (����ȭ�� : 999) : ");
		scan_hak_num = scan.nextInt();
		scan.nextLine();
		
		boolean check_hak_num = false;
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			if(ss.hak_num == scan_hak_num) {
				score_title_print(score_title);
				score_print_sub(ss);
				check_hak_num = true;
			}
		}
		
		if(check_hak_num == false) {
			System.out.println("�Է��Ͻ� �й��� �л��� �����ϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	
	static void search_score_name(Vector<Stu_score> score, String[] score_title, Scanner scan) {
		String scan_name = "";
		System.out.print("�˻��� �л��� �̸��� �Է��� �ּ���. (����ȭ�� : 999)");
		scan_name = scan.nextLine();
		
		boolean check_name = false;
		
		score_title_print(score_title);
		for(int i = 0; i < score.size(); i++) {
			Stu_score ss = (Stu_score)score.get(i);
			if(ss.name.equals(scan_name)) {
				score_print_sub(ss);
				check_name = true;
			}
		}
		if(check_name == false) {
			System.out.println("�Է��Ͻ� �̸��� �л��� �����ϴ�. �ٽ� �Է��� �ּ���.");
		}
	}
	
} //class
