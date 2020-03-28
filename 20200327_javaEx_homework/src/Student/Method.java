package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
	
	ArrayList<Student> stu = new ArrayList<Student>();
	String[] title = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
	
	Scanner scan = new Scanner(System.in);
	
	// ����ȭ�� ���
	public int main_print() {
		int select = 0;
		System.out.println("========================");
		System.out.println(" �л�����ó�� ���α׷� ");
		System.out.println(" 1. �л������Է�");
		System.out.println(" 2. �л��������");
		System.out.println(" 3. �л������˻�");
		System.out.println(" 4. �л���������");
		System.out.println(" 5. �л���������");
		System.out.println(" 0. ����");
		System.out.println("-----------------------");
		System.out.print(" ���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		if(!scan.hasNextInt()) {
			scan.next();
			System.out.println("���ڸ� �Է� �����մϴ�.");
			return 999;
		}
		else {
			select = scan.nextInt();
			scan.nextLine();
			return select;
		}
	}
	
	// 1.�л� ���� �Է� ----------------------------------------------------------------------------------
	// �л� �̸�, ���� �Է�
	public void input_sut() {

//		input_dumy();
		
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.print("�л��� �̸��� �Է��� �ּ���.(����ȭ�� - 999) : ");
		name = scan.nextLine();
		if(name.equals("999")) {
			System.out.println("����ȭ������ �̵��մϴ�.");
			return;
		}
		
		kor = score_input(name, 2);
		eng = score_input(name, 3);
		math = score_input(name, 4);
		
		Student ss = new Student(name, kor, eng, math);
		stu.add(ss);
		
		ranking();
		
		print_title();
		System.out.println(ss);
	}
	
	// �����Է�
	public int score_input(String name, int subject_num) {
		int score = 0;
		while(true) {
			System.out.print(name + " �л��� " + title[subject_num] 
								+ "������ �Է��� �ּ���. : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
			else {
				score = scan.nextInt();
				scan.nextLine();
				if(score < 0 || score > 100) {
					System.out.println("������ 0 ~ 100 ���� �Է� �����մϴ�.");
					score = 0;
					continue;
				}
				else {
					return score;
				}
			}
		}
	}
	
	// ���̵����� �Է�
	public void input_dumy() {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// ���̵�����
		String nameArr[] = {"ȫ�浿", "�ں���", "����ȫ", "������", "��ȫ��" };
		int korArr[] = {100, 80, 70, 90, 60};
		int engArr[] = {100, 80, 70, 90, 60};
		int mathArr[] = {100, 80, 70, 90, 60};
		
		for(int i = 0; i < nameArr.length; i++) {
			name = nameArr[i];
			kor = korArr[i];
			eng = engArr[i];
			math = mathArr[i];
			
			Student ss = new Student(name, kor, eng, math);
			stu.add(ss);
		}
	}
	
	// ��� ���
	public void ranking() {
		int count = 1;
		for(int i = 0; i < stu.size(); i++) {
			count = 1;
			Student ss1 = (Student)stu.get(i); 
			for(int j = 0; j < stu.size(); j++) {
				Student ss2 = (Student)stu.get(j);
				if(ss1.total < ss2.total) {
					count++;
				}
			}
			ss1.rank = count;
//			stu.set(i, ss1);
		}
	}
	
	// 2.�л� ���� ��� ----------------------------------------------------------------------------------
	// Ÿ��Ʋ ���
	void print_title() {
		for(int i = 0; i < title.length; i++) {
			System.out.print( title[i] + "\t");
		}
		System.out.println();
	}
	// ��ü ���
	void print_stu() {
		print_title();
		for(int i = 0; i < stu.size(); i++) {
			Student ss = (Student)stu.get(i);
			System.out.println(ss);
		}
	}
	
	// 3.�л� ���� �˻� ----------------------------------------------------------------------------------
	// �̸� �˻�
	public void search_stu() {
		String name = "";
		while(true) {
			System.out.print("�˻��� �л��� �̸� ��ü �Ǵ� �Ϻθ� �Է��� �ּ���. (����ȭ�� - 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				return;
			}
			boolean check = false;
			print_title();
			for(int i = 0; i < stu.size(); i++) {
				Student ss = (Student)stu.get(i);
				if(ss.name.contains(name)) {
					System.out.println(ss);
					check = true;
				}
			}
			if(check == false) {
				System.out.println(name + " �� �˻� ����� �����ϴ�.");
			}
		}
	}
	
	// 4.�л� ���� ���� ----------------------------------------------------------------------------------
	// �л� ���� ����
	public void modify_stu() {
		while(true) {
			System.out.println("===============================================");
			print_stu();			
			int select = 0;
			System.out.print("���� �� �л��� �й��� �Է��� �ּ���.(����ȭ�� - 999) : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
			else {
				select = scan.nextInt();
				scan.nextLine();
				if(select == 999) {
					System.out.println("����ȭ������ �̵��մϴ�.");
					break;
				}
			}
			
			Student ss = null;
			boolean hak_num_check = false;
			loop_for: for(int i = 0; i < stu.size(); i++) {
				ss = (Student)stu.get(i);
				if(ss.hak_num == select) {
					hak_num_check = true;
					modify_2 : while(true) {
						System.out.println("1) �̸�, 2) ��������, 3) ��������, 4) ��������, 999) ����ȭ��");
						System.out.print("������ �׸��� ���ڸ� �Է��� �ּ���. : ");
						if(!scan.hasNextInt()) {
							scan.next();
							System.out.println("���ڸ� �Է� �����մϴ�.");
							continue;
						}
						else {
							select = scan.nextInt();
							scan.nextLine();
							if(select == 999) {
								System.out.println("���� ȭ������ �̵��մϴ�.");
								break;
							}
							if(select < 1 || select > 4) {
								System.out.println("1~4, 999 ���ڸ� �Է� �����մϴ�.");
								select = 0;
								continue;
							}
						}
						
						switch(select) {
							case 1:
								modify_name(ss);
								break loop_for;
							case 2:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
							case 3:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
							case 4:
								modify_score(ss, select);
								ss.set_total_avg();
								ranking();
								break loop_for;
								
							case 999:
								break modify_2;
						}
						
					}// ���� while
				} // if(ss.hak_num == select) 
			} // for ��
			print_title();
			if(hak_num_check == true) {
				System.out.println(ss);
			}
			else {
				System.out.println("�˻��ϴ� �й��� ���� �й� �Դϴ�.");
			}
			
		}// �ٱ� while
	} // modify_stu()
	
	// �̸� ����
	public void modify_name(Student ss) {
		String name;
		System.out.print("������ �̸��� �Է��� �ּ��� : ");
		name = scan.nextLine();
		ss.name = name;
	}
	
	// ���� ����
	public void modify_score(Student ss, int select) {
		int score = 0;
		loop_while: while(true) {
			System.out.print("������ ������ �Է��� �ּ���. : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
			else {
				score = scan.nextInt();
				scan.nextLine();
				if(score < 0 || score >100) {
					System.out.println("������ 0 ~ 100 ���� �Է� �����մϴ�.");
					score = 0;
					continue;
				}
				
				switch (select) {
					case 2: 
						ss.kor = score;
						break loop_while;
					case 3: 
						ss.eng = score;
						break loop_while;
					case 4: 
						ss.math = score;
						break loop_while;
				}
			}
		}
	}
	
	// 5.�л� ���� ���� ----------------------------------------------------------------------------------
	// �л� ���� ����
	public void delete_stu() {
		System.out.println("===============================================");
		print_stu();			
		int del_hak_num = 0;
		while(true) {
			System.out.print("���� �� �л��� �й��� �Է��� �ּ���.(����ȭ�� - 999) : ");
			if(!scan.hasNextInt()) {
				scan.next();
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
			else {
				del_hak_num = scan.nextInt();
				scan.nextLine();
				if(del_hak_num == 999) {
					System.out.println("����ȭ������ �̵��մϴ�.");
					break;
				}
			}

			for(int i = 0; i < stu.size(); i++) {
				Student ss = (Student)stu.get(i);
				String yn_check = "";
				if(ss.hak_num == del_hak_num) {
					System.out.print("������ ���� �Ͻðڽ��ϱ�?(y, n) : ");
					yn_check = scan.nextLine();
					if(yn_check.equalsIgnoreCase("y")) {
						stu.remove(i);
						System.out.println(del_hak_num + " �й��� �л��� ������ ���� �Ͽ����ϴ�.");
						break;
					}
					else if(yn_check.equalsIgnoreCase("n")) {
						System.out.println("������ ��� �Ͽ����ϴ�.");
						break;
					}
					else {
						System.out.println("y, n �� �Է� �����մϴ�.");
						i--;
						continue;
					}
				}
				
				
				
			}
			
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
