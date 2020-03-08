import java.util.Scanner;
import java.util.Vector;

public class CEx20200302_03 {

	public static void main(String[] args) {
		// Stu_info class�� ����Ǿ����� 
		
		Vector<Stu_info> stu_info = new Vector<Stu_info>();
		String[] str = { "�й�", "�̸�", "�а�", "�г�", "��ȭ" };
		
		Scanner scan = new Scanner(System.in);
		
		int stu_count = 0;
		
		stu_info_input(stu_info, stu_count, scan);
		stu_info_print(stu_info, str);
	}
	
	static void stu_info_input(Vector<Stu_info> stu_info, int stu_count, Scanner scan) {
		String name = "";
		String major = "";
		int grade = 0;
		String tell = "";
		
		while(true) {
			if(stu_count == 2) {
				break;
			}
			
			System.out.print("�̸��� �Է��� �ּ��� : ");
			name = scan.nextLine();
			
			System.out.print("�а��� �Է��� �ּ��� : ");
			major = scan.nextLine();
			
			System.out.print("�г��� �Է��� �ּ��� : ");
			grade = scan.nextInt();
			scan.nextLine();
			
			System.out.print("��ȭ��ȣ�� �Է��� �ּ��� : ");
			tell = scan.nextLine();
			
			stu_info.add(new Stu_info(name, major, grade, tell));
			
			System.out.println("1���� �л������� �Է¿Ϸ� �Ǿ����ϴ�.");
			
			stu_count++;
		}
	}

	static void stu_info_print(Vector<Stu_info> stu_info, String[] str) {
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < stu_info.size(); i++) {
			Stu_info s = new Stu_info();
			s = stu_info.get(i);
			
			System.out.print(s.hak_num + "\t");
			System.out.print(s.name + "\t");
			System.out.print(s.major + "\t");
			System.out.print(s.grade + "\t");
			System.out.print(s.tell + "\t");
			System.out.println();
		}
	}
}
