import java.util.Scanner;

public class Homework_student {


	public static void main(String[] args) {
		
		final int TOTAL_STUDENT_COUNT = 5;
		
		String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		Student[] stu = new Student[TOTAL_STUDENT_COUNT];
		int select = 0;
		int stu_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			select = main_print(scan);
			switch (select) {
				case 1:
					System.out.println("--------------------------------");
					System.out.println("�л������Է��� ���� �ϼ̽��ϴ�.");
					stu_count = stu_input(stu, stu_count, subject, scan);	
					
					break;
					
				case 2:
					System.out.println("--------------------------------");
					System.out.println("�л���������� ���� �ϼ̽��ϴ�.");
					stu_print(stu, stu_count, subject);
					
					break;
					
				case 3:
					System.out.println("--------------------------------");
					System.out.println("�л����ó���� ���� �ϼ̽��ϴ�.");
					ranking(stu, stu_count);
					System.out.println("���ó���� �Ϸ� �Ǿ����ϴ�.");
					
					break;
					
				case 4:
					System.out.println("--------------------------------");
					System.out.println("�л������˻��� ���� �ϼ̽��ϴ�.");
					stu_search(stu, stu_count, scan, "�˻�");
					
					break;
					
				case 5: 
					System.out.println("--------------------------------");
					System.out.println("�л����������� ���� �ϼ̽��ϴ�.");
					stu_modify(stu, stu_count, scan);
					
					break;
				
				case 6: 
					System.out.println("--------------------------------");
					System.out.println("�л����������� ���� �ϼ̽��ϴ�.");
					stu_del(stu, stu_count, subject, TOTAL_STUDENT_COUNT, scan);
					
					break;
					 
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
			
		}
		
	} //main
	
	// ����ȭ�� ���
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==================================");
		System.out.println("    [�л��������� ���α׷�] ");
		System.out.println("      1. �л������Է�");
		System.out.println("      2. �л��������");
		System.out.println("      3. �л����ó��");
		System.out.println("      4. �л������˻�");
		System.out.println("      5. �л���������");
		System.out.println("      6. �л���������");
		System.out.println("      0. ����");
		System.out.println("----------------------------------");
		System.out.print("   ���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	// �л� �̸�, �����, �����, ���м��� �Է�
	// �Էµ� ����� �հ�� ��� ���
	static int stu_input(Student[] stu, int stu_count, String[] subject, Scanner scan) {
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = stu_count; i < stu.length; i ++) {
			System.out.print("�л��� �̸��� �Է��� �ּ���.(����ȭ�� : 999) : ");
			name = scan.nextLine();
			if(name.equals("999")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;
			}
			while(true) {
				System.out.print(name + " �л��� " + subject[2] + " ������ �Է��� �ּ��� : ");
				kor = scan.nextInt();
				if(kor < 0 || kor > 100) {
					System.out.println("������ �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.print(name + " �л��� " + subject[3] + " ������ �Է��� �ּ��� : ");
				eng = scan.nextInt();
				if(eng < 0 || eng > 100) {
					System.out.println("������ �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			while(true) {
				System.out.print(name + " �л��� " + subject[4] + " ������ �Է��� �ּ��� : ");
				math = scan.nextInt();
				if(math < 0 || math > 100) {
					System.out.println("������ �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			scan.nextLine();
			stu[i] = new Student(name, kor, eng, math);
			stu_count++;
			
			stu[i].total();
			stu[i].average();
		}
			
		return stu_count;
	}
	
	// �л����� ���
	static void stu_print(Student[] stu, int stu_count, String[] subject) {
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
			
		for(int i = 0; i < stu_count; i++) {
			one_stu_print(stu, i);
		}
	}
	
	// �Ѹ��� ���� ���
	static void one_stu_print(Student[] stu, int i) {
		System.out.print(stu[i].hak_num + "\t");
		System.out.print(stu[i].name + "\t");
		System.out.print(stu[i].kor + "\t");
		System.out.print(stu[i].eng + "\t");
		System.out.print(stu[i].math + "\t");
		System.out.print(stu[i].total + "\t");
		System.out.print(stu[i].avg + "\t");
		System.out.print(stu[i].rank + "\t");
		System.out.println();
	}
	
	// �л� ��� ó��
	static void ranking(Student[] stu, int stu_count) {
		int rank_count = 1;
		
		for(int i = 0; i < stu_count; i++) {
			rank_count = 1;
			for(int j = 0; j < stu_count; j++) {
				if(stu[i].total < stu[j].total) {
					rank_count++;
				}
			}
			
			stu[i].rank = rank_count;
		}
	}
	
	// �л����� �˻�
	// �л����� ������ ù �̸� �˻��� ���� ��� 
	static int[] stu_search(Student[] stu, int stu_count, Scanner scan, String menu) {
		System.out.print("������ "+ menu + "�� �л��� �̸��� �Է��� �ּ���. (����ȭ�� : 999) : ");
		String name = "";
		name = scan.nextLine();

		int[] save_hak_num = new int[stu_count];
		int save_hak_num_count = 0;
		
		if(name.equals("999")) {
			System.out.println("����ȭ������ �̵��մϴ�.");
			for(int i = 0; i < save_hak_num.length; i++) {
				save_hak_num[i] = 0;
			}
			return save_hak_num;
		}
		
		for(int i = 0; i < stu_count; i++) {
			if(name.equals(stu[i].name)) {
				one_stu_print(stu, i);
				save_hak_num[save_hak_num_count] = stu[i].hak_num;
				save_hak_num_count++;
			}
		}
		
		return save_hak_num;
	}
	
	//�л����� ����
	static void stu_modify(Student[] stu, int stu_count, Scanner scan) {
		while(true) {
			int[] save_hak_num = new int[stu_count];
			save_hak_num = stu_search(stu, stu_count, scan, "����");
			
			if(save_hak_num[0] == 0) {
				break;
			}
			
			int select_hak_num = 0;
			while(true) {
				System.out.print("������ ������ �л��� �й��� �Է��� �ּ���. : ");
				select_hak_num = scan.nextInt();
				scan.nextLine();
				
				boolean check = false;
				for(int i = 0; i < save_hak_num.length; i++) {
					if(save_hak_num[i] == select_hak_num) {
						check = true;
					}
				}
				if(check == false) {
					System.out.println("�й��� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
				break;
			}
			
			System.out.println("1. �̸�, 2. �����, 3. �����, 4. ���м���");
			System.out.print("������ �׸��� �Է��� �ּ���. : ");
			int select_num = 0;
			select_num = scan.nextInt();
			scan.nextLine();
			switch (select_num) {
				case 1:
					System.out.print("������ �̸��� �Է��� �ּ��� : ");
					stu[select_hak_num - 1].name = scan.nextLine();
					break;
				case 2:
					System.out.print("������ ���������� �Է��� �ּ��� : ");
					stu[select_hak_num - 1].kor = scan.nextInt();
					scan.nextLine();
					break;
				case 3:
					System.out.print("������ ���������� �Է��� �ּ��� : ");
					stu[select_hak_num - 1].eng = scan.nextInt();
					scan.nextLine();
					break;
				case 4:
					System.out.print("������ ���������� �Է��� �ּ��� : ");
					stu[select_hak_num - 1].math = scan.nextInt();
					scan.nextLine();
					break;
			}
			
			one_stu_print(stu, select_hak_num-1);
			
			System.out.print("������ �� �Ͻðڽ��ϱ�?(Y, N)");
			String more = scan.nextLine();
			if(more.equals("Y") || more.equals("y")) {
				continue;
			}
			break;
		}
	}
	
	//�л����� ����
	static void stu_del(Student[] stu, int stu_count, String[] subject, int TOTAL_STUDENT_COUNT ,Scanner scan) {
		stu_print(stu, stu_count, subject);
		
		System.out.print("�л������� ������ �й��� �Է��� �ּ���. (����ȭ�� : 999) : ");
		int del_hak_num = scan.nextInt();
		scan.nextLine();
		
		if(del_hak_num == 999) {
			System.out.println("����ȭ������ �̵��մϴ�.");
			return;
		}
		
		Student[] temp_stu = new Student[TOTAL_STUDENT_COUNT];
		System.arraycopy(stu, 0, temp_stu, 0, del_hak_num-1);
		System.arraycopy(stu, del_hak_num, temp_stu, del_hak_num-1, (stu.length-del_hak_num));
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = null;
		}
		System.arraycopy(temp_stu, 0, stu, 0, temp_stu.length);
		
		stu_count--;
		
		stu_print(stu, stu_count, subject);
	}
	
}
