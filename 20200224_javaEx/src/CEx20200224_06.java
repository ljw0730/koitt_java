import java.util.Scanner;

public class CEx20200224_06 {

	public static void main(String[] args) {
		// Student2 Class�� ����Ǿ� ����.
		
		// 3���� �л��� �Է¹޾�
		// �й� �̸� ���� ���� ���� �հ� ��� ���
		// �й��� 1���� 1�� ���� - �ڵ��Էµǵ���
		// �Էºκ��� �޼ҵ�� �и�
		// ��ºκе� �޼ҵ�� �и�
		// ���ó�� �޼ҵ�� �и�
		// ���� ����
		// 1. �л������Է�
		// 2. �л��������
		// 3. �л���������
		// 4. �л����ó��
		// 5. ����

		Student2[] stu = new Student2[3];
		String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		int select = 0;
		
		Scanner scan = new Scanner(System.in);
		Loop1: while(true) {
			select = mainPrint(scan);
			
			switch(select) {
			case 1:
				System.out.println("�л������Է��� ���� �ϼ̽��ϴ�.");
				stuInput(stu, subject, scan);							
				
				break;
				
			case 2:
				System.out.println("�л���������� ���� �ϼ̽��ϴ�.");
				stuPrint(stu, subject);
				
				break;
				
			case 3:
				System.out.println("�л����������� ���� �ϼ̽��ϴ�.");
				modify(stu, scan);				
				break;
				
			case 4:
				System.out.println("�л����ó���� ���� �ϼ̽��ϴ�.");
				ranking(stu);				
				System.out.println("�л����ó���� �Ϸ� �Ǿ����ϴ�.");

				break;
				
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				break Loop1;
			}
			
		}
		
	}

	static int mainPrint(Scanner scan) {
		int select = 0;
		System.out.println("=========================");
		System.out.println("[ �л�����ó�� ���α׷� ]");
		System.out.println(" 1. �л������Է�");
		System.out.println(" 2. �л��������");
		System.out.println(" 3. �л���������");
		System.out.println(" 4. �л����ó��");
		System.out.println(" 5. ����");
		System.out.println("-------------------------");
		System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static void stuInput(Student2[] stu, String[] subject,  Scanner scan) {
		Loop2: for(int i = 0; i < stu.length; i++) {
			stu[i] = new Student2();
			System.out.print(stu[i].hak_num + "�� �л��� �̸��� �Է��� �ּ���.(����ȭ�� : 999) : ");
			stu[i].name = scan.nextLine();
			if(stu[i].name.equals("999")) {
				stu[i].name = "";
				break;
			}
			while(true) {
				System.out.print(stu[i].name + " �л��� " + subject[2] + "������ �Է��� �ּ���.(����ȭ�� : 999) : ");
				stu[i].kor = scan.nextInt();
				if(stu[i].kor == 999) {
					stu[i].kor = 0;
					break Loop2;
				}
				else if (stu[i].kor < 0 || stu[i].kor > 100){
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				else {
					break;
				}
			}
			while(true) {
				System.out.print(stu[i].name + " �л��� " + subject[3] + "������ �Է��� �ּ���.(����ȭ�� : 999) : ");
				stu[i].eng = scan.nextInt();
				if(stu[i].eng == 999) {
					stu[i].eng = 0;
					break Loop2;
				}
				else if (stu[i].eng < 0 || stu[i].eng > 100){
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				else {
					break;
				}
			}
			while(true) {
				System.out.print(stu[i].name + " �л��� " + subject[4] + "������ �Է��� �ּ���.(����ȭ�� : 999) : ");
				stu[i].math = scan.nextInt();
				scan.nextLine();
				if(stu[i].math == 999) {
					stu[i].math = 0;
					break Loop2;
				}
				else if (stu[i].math < 0 || stu[i].math > 100){
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				else {
					break;
				}
			}
			
			stu[i].total();
			stu[i].average();
		}
	}
	
	static void stuPrint(Student2[] stu, String[] subject) {
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < stu.length; i++) {
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
		System.out.println();
	}
	
	static void modify(Student2[] stu, Scanner scan) {
		int check_hak_num = 0;
		int count = 0;
		int change_select = 0;
		String change_name = "";
		int change_score = 0;
		
		System.out.print("������ �л��� �й��� �Է��� �ּ���.(����ȭ�� : 999) : ");
		check_hak_num = scan.nextInt();
		scan.nextLine();
		if(check_hak_num == 999) {
			return;
		}
		
		for(int i = 0; i < stu.length; i++) {
			if(check_hak_num == stu[i].hak_num) {
				break;
			}
			count++;
		}
		
		System.out.println("1. �̸� / 2. �������� / 3. �������� / 4. �������� / 999. ����ȭ��");
		System.out.print("������ �׸��� �����ϼ���. : ");
		change_select = scan.nextInt();
		scan.nextLine();
		
		switch(change_select) {
			case 1:
				System.out.print("������ �̸��� �Է��� �ּ���.(����ȭ�� : 999) : ");
				change_name = scan.nextLine();
				if(change_name.equals("999")) {
					return;
				}
				stu[count].name = change_name;
				break;
			
			case 2:
				System.out.print("������ ���������� �Է��� �ּ���.(����ȭ�� : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].kor = change_score;
				break;

			case 3:
				System.out.print("������ ���������� �Է��� �ּ���.(����ȭ�� : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].eng = change_score;
				break;
				
			case 4:
				System.out.print("������ ���������� �Է��� �ּ���.(����ȭ�� : 999) : ");
				change_score = scan.nextInt();
				scan.nextLine();
				if(change_score == 999) {
					return;
				}
				stu[count].math = change_score;
				break;
				
			case 999:
				return;
		}
		stu[count].total();
		stu[count].average();
		ranking(stu);
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
	
	static void ranking(Student2[] stu) {
		for(int i = 0; i < stu.length; i++) {
			int rank_count = 1;
			for(int j = 0; j < stu.length; j++) {
				if(stu[i].total < stu[j].total) {
					rank_count++;
				}
			}
			stu[i].rank = rank_count;
		}
	}
	
}
