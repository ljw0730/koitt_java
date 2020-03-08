import java.util.Scanner;

public class Student {
	
	int stu_ID;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	static String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
	
	static Scanner scan = new Scanner(System.in);
	
	void input(Student stu, int stu_ID_count) {
		// �й��Է�
		stu.stu_ID = stu_ID_count;
		
		// �̸��Է�
		System.out.print("�̸��� �Է��ϼ���. : ");
		stu.name = scan.nextLine();
		
		// �������� �Է�
		System.out.print(stu.name + " �л��� ���������� �Է��ϼ���. : ");
		stu.kor = scan.nextInt();
		scan.nextLine();
		
		// �������� �Է�
		System.out.print(stu.name + " �л��� ���������� �Է��ϼ���. : ");
		stu.eng = scan.nextInt();
		scan.nextLine();
		
		// �������� �Է�
		System.out.print(stu.name + " �л��� ���������� �Է��ϼ���. : ");
		stu.math = scan.nextInt();
		scan.nextLine();
	}
	
	void sum(Student stu) {
		stu.total = stu.kor + stu.eng + stu.math;
	}
	
	void average(Student stu, int subject_count) {
		stu.avg = stu.total / subject_count;
	}
	
	static void modify(Student[] stu) {
		int count = 0;
		int select2 = 0;
		String name_select ="";
		String temp_str = "";
		int temp_int = 0;
				
		System.out.println("������ �л��� �̸��� �Է��� �ּ���. : ");
		name_select = scan.nextLine();
		
		for(int i = 0; i < stu.length; i++) {
			if(stu[i].name.equals(name_select)) {
				break;
			}
			else {
				count++;
			}
		}
		
		System.out.println("========================");
		System.out.println("1. �̸�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("========================");
		System.out.print("������ ��ȣ�� �Է��� �ּ���. : ");
		select2 = scan.nextInt();
		scan.nextLine();
		
		switch(select2) {
			case 1:
				System.out.print("������ �̸��� �Է��� �ּ���. : ");
				temp_str = scan.nextLine();
				
				stu[count].name = temp_str;
				break;
				
			case 2:
				System.out.println("������ ���������� �Է��� �ּ���. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].kor = temp_int;
				break;
				
			case 3:
				System.out.println("������ ���������� �Է��� �ּ���. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].eng = temp_int;
				break;
				
			case 4:
				System.out.println("������ ���������� �Է��� �ּ���. : ");
				temp_int = scan.nextInt();
				scan.nextLine();
				
				stu[count].math = temp_int;
				break;
		}
		
	}
	
	
	
	
	
	static void output_title() {
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
	}
	
	void all_output(Student stu) {
		System.out.print(stu.stu_ID + "\t");
		System.out.print(stu.name + "\t");
		System.out.print(stu.kor + "\t");
		System.out.print(stu.eng + "\t");
		System.out.print(stu.math + "\t");
		System.out.print(stu.total + "\t");
		System.out.print(stu.avg + "\t");
		System.out.print(stu.rank + "\t");
		System.out.println();
	}
}
