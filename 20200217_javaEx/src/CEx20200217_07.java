import java.util.Scanner;

public class CEx20200217_07 {
	public static void main(String[] args) {
		// Student Class�� ����Ǿ� ����		
		
		// 5���� �л��� �̸�, ����, ����, ���� ������ �Է¹�������.
		// �հ� ��ճ���
		
		// �л���ü ����
		Student[] stu = new Student[5];
				
				
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���" };
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student();

			// �̸� �Է�
			System.out.print((i+1) + "��° �л��� �̸��� �Է��� �ּ���. : ");
			stu[i].name = scan.nextLine();
			
			// ���� �Է�
			System.out.print(stu[i].name + " �л��� ���������� �Է��� �ּ��� : ");
			stu[i].kor = scan.nextInt();
			System.out.print(stu[i].name + " �л��� ���������� �Է��� �ּ��� : ");
			stu[i].eng = scan.nextInt();
			System.out.print(stu[i].name + " �л��� ���������� �Է��� �ּ��� : ");
			stu[i].math = scan.nextInt();
			scan.nextLine();
			
			// �հ���
			stu[i].total();
			
			// ��հ��
			stu[i].average();
		}			
		
		
		// Ÿ��Ʋ ���
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		// �̸�, ����, �հ�, ��� ���
		for(int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor + "\t");
			System.out.print(stu[i].eng + "\t");
			System.out.print(stu[i].math + "\t");
			System.out.print(stu[i].total + "\t");
			System.out.print(stu[i].avg + "\t");
			System.out.println();
		}
		
		scan.close();		
	}
}


