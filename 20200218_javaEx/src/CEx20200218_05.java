import java.util.Scanner;

public class CEx20200218_05 {

	static int stu_count = 0; 
	
	public static void main(String[] args) {
		// Student2 class�� ����Ǿ� ����
		
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

		Scanner scan = new Scanner(System.in);
		
		Student2[] stu = new Student2[3];
		
		
			
		Loop_while : while(true) {
			main_print();
			
			switch(scan.nextInt()) {
			case 1:
				System.out.println("���� �߰��� �����ϼ̽��ϴ�.");
				insert(stu);	//�л������߰� �޼��� - �޼��� �и�
				break;
				
				
			case 2:
				System.out.println("���� ������ �����ϼ̽��ϴ�.");
				break;
				
				
			case 3:
				System.out.println("���� ������ �����ϼ̽��ϴ�.");
				break;
				
				
			case 4:
				System.out.println("���� �˻��� �����ϼ̽��ϴ�.");
				break;
				
				
			case 5:
				System.out.println("��� ó���� �����ϼ̽��ϴ�.");
				break;
				
				
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break Loop_while;
				
				
			} //switch
			
		} //while
		
				
	}	// main
	
	// main ��� �޼ҵ�
	static void main_print() {
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
	}
	
	// �й�/�̸�/����/����/����/�հ�/��� �Է� �޼���
	static void insert(Student2[] stu) {
		Scanner scan = new Scanner(System.in);
		
		String insert_name ="";
		
		scan.nextLine();
		
		for(int i = stu_count; i < stu.length; i++) {
			stu[i] = new Student2();	// ���� ���� �� �ִ� ��������
			System.out.print("�̸��� �Է��ϼ���.(999 : ����ȭ��) : ");
			insert_name = scan.nextLine();
			if(insert_name.equals("999")) {
				System.out.println("���� ȭ������ �̵��մϴ�.");
				break;
			}
			stu[i].stu_num = (Student2.first_num += 1);
			// stu[i].stu_num = (Student2.first_num = Student2.first_num + 1)
			stu[i].stu_name = insert_name;
			System.out.print("���������� �Է��ϼ��� : ");
			stu[i].stu_kor = scan.nextInt();
			scan.nextLine();
			System.out.print("���������� �Է��ϼ��� : ");
			stu[i].stu_eng = scan.nextInt();
			scan.nextLine();
			System.out.print("���������� �Է��ϼ��� : ");
			stu[i].stu_math = scan.nextInt();
			scan.nextLine();
			
			stu[i].totla();
			stu[i].average();
			
			CEx20200218_05.stu_count++;
			
			System.out.println(stu_count + "��° �л� : " + stu[i].stu_num + "\t" + stu[i].stu_name + "\t" + stu[i].stu_kor + "\t" 
								+ stu[i].stu_eng + "\t" + stu[i].stu_math + "\t" + stu[i].stu_total + "\t" + stu[i].stu_avg + "\t");
		}
	}
}	// class

