import java.util.Scanner;

public class CEx20200218_04 {

	public static void main(String[] args) {
		// Student class�� ����Ǿ� ����
		
		// �л����� ó�� ���α׷� (�л� �� : 10��)
		// �л� - class : �й� / �̸� / ���� / ���� / ���� / �հ� / ��� / ���
		// �й��� 1000���� ���� �ڵ����� ����� ������...
		// ���ѹݺ�
		// [ �л�����ó�����α׷� ]
		// 1. �����߰� - �����߰��� �Է��ϼ̽��ϴ�.-> �й��Է��ϼ���. -> �̸�,����,����,����
		// 2. �������� - ������ �л��� �й��� �Է��ϼ���.
		//     1. �̸� 2. ���� 3. ���� 4. ����
		//      -> �̸��� �Է��ϼ���> ȫ�浿 -> ȫ�浿 �̸��� �����Ǿ����ϴ�.
		// 3. �������� - ������ �л��� �й��� �Է��ϼ���.
		// 4. �����˻�
		// 5. ���ó��
		// 0. ����
		
		Student[] stu = new Student[3];
		
		
		int select = 0;
		int stu_count = 0;
		int stu_ID_count = 1000;
		int subject_count = 3;
		int change_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop_while : while(true) {
			System.out.println("[ �л�����ó�� ���α׷�]");
			System.out.println("========================");
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.println("4. �����˻�");
			System.out.println("5. ���ó��");
			System.out.println("0. ����");
			System.out.println("========================");
			System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
			select = scan.nextInt();
			scan.nextLine();
			System.out.println("========================");
			
			switch(select) {
				case 1:
					System.out.println("�����߰��� �Է��ϼ̽��ϴ�.");
					for(int i = stu_count; i < stu.length; i++) {
						stu[i] = new Student();
						stu[i].input(stu[i], stu_ID_count);
						
						stu[i].sum(stu[i]);
						stu[i].average(stu[i], subject_count);
					
						stu_count++;
					}
					
					
					
					Student.output_title();
					for(int i = 0; i < stu.length; i++) {
						stu[i].all_output(stu[i]);
					}
					
					break;
				
				case 2:
					System.out.println("���������� �Է��ϼ̽��ϴ�.");
					Student.modify(stu);
					
					Student.output_title();
					for(int i = 0; i < stu.length; i++) {
						stu[i].all_output(stu[i]);
					}
					break;
					
				case 0:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop_while;
					
			}
			
			
			
		}
		
		
	}	// main
	
}	// class

