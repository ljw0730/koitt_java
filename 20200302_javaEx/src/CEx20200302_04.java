import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_04 {

	public static void main(String[] args) {
		// Stu_info class�� ����Ǿ����� 
		
		Vector<Stu_info> list = new Vector<Stu_info>();
		String[] title = { "�й�", "�̸�", "�а�", "�г�", "��ȭ" };
		
//		String[] name = { "ȫ�浿","�̼���", "ȫ�浿"};
//		String[] major = { "�İ���","������", "������" };
//		int[] grade = {1, 2, 2};
//		String[] tell = {"02-1666-7777", "010-1111-1111", "010-2222-2222" };
//		list.add(new Stu_info(name[0], major[0], grade[0], tell[0]));
//		list.add(new Stu_info(name[1], major[1], grade[1], tell[1]));
//		list.add(new Stu_info(name[2], major[2], grade[2], tell[2]));
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1) �л������Է�, 2) ���, 3) �˻�");
			System.out.print("���ϴ� ��ȣ�� �Է��� �ּ���.");
			int num = scan.nextInt();
			scan.nextLine();
			switch (num) {
				case 1:
					while(true) {
						System.out.println("�̸��� �Է��ϼ���.(����ȭ��: 99) : ");
						String name1 = scan.nextLine();
						if(name1.equals("99")) {
							System.out.println("����ȭ������ �̵��մϴ�.");
							break;
						}
						
						System.out.println("������ �Է��ϼ��� : ");
						String major1 = scan.nextLine();
						System.out.println("�г��� �Է��ϼ��� : ");
						int grade1 = scan.nextInt();
						scan.nextLine();
						System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
						String tell1 = scan.nextLine();
						
						list.add(new Stu_info(name1, major1, grade1, tell1));
					}
										
					break;
					
				case 2:
					if(list.isEmpty()) {
						System.out.println("�����Ͱ� �����ϴ�.");
						break;
					}
					
					for(int i = 0; i < title.length; i++) {
						System.out.print(title[i] + "\t");
					}
					System.out.println();
					
					for(int i = 0; i < list.size(); i++) {
						Stu_info stu = new Stu_info();
						stu = (Stu_info)list.get(i);
						
						System.out.print(stu.hak_num + "\t");
						System.out.print(stu.name + "\t");
						System.out.print(stu.major + "\t");
						System.out.print(stu.grade + "\t");
						System.out.print(stu.tell + "\t");
						System.out.println();
					}
					
					break;
					
				case 3:
					while(true) {
						System.out.print("�˻��� �̸��� �Է��� �ּ���.(����ȭ�� : 99) : ");
						String name2 = scan.nextLine();
						if(name2.equals("99")) {
							System.out.println("����ȭ������ �̵��մϴ�.");
							break;
						}
						
						System.out.println("ã�� �л��� ");
						
						for(int i = 0; i < title.length; i++) {
							System.out.print(title[i] + "\t");
						}
						System.out.println();
						
						boolean check = false;
						for(int i = 0; i < list.size(); i++) {
							Stu_info stu = (Stu_info)list.get(i);
							if(name2.equals(stu.name)) {
								
								System.out.print(stu.hak_num + "\t");
								System.out.print(stu.name + "\t");
								System.out.print(stu.major + "\t");
								System.out.print(stu.grade + "\t");
								System.out.print(stu.tell + "\t");
								System.out.println();
								
								check = true;
							}
						}
						
						if(check == false) {
							System.out.println("ã�� �л��� �����ϴ�.");
						}
						
					}
					
					break;
			}
		}
	}
}
