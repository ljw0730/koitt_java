import java.util.ArrayList;
import java.util.Scanner;

public class CEx20200304_11 extends Object {

	public static void main(String[] args) {
		// Member class�� ����Ǿ� ����
		
		// ��ü�� �����ϱ� ArrayList
		
		// 1) ȸ�� �Է�, 2) ȸ�� ���
		// Id - �빮�� 1���̻�, 5�ڸ� �̻�, �ߺ�üũ
		// pw - Ư������ 1���̻�, ���̴� 8�ڸ� �̻�
		// �ֹι�ȣ - '-' �����Ͽ� 14�ڸ����� �Է�
		// ������ 0, 1�� �Է�. �ƴϸ� �ٽ� �Է�
		// �̸��� @, . �ִ��� ������ üũ
		
		// ȸ�� ��� gender 0: ����, 1: ����
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		ArrayList<Member> al_mb = new ArrayList<Member>();
		String[] title = { "Id", "PW", "�̸�", "�ֹι�ȣ", "����", "�̸���", "��ȭ��ȣ" };
		
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("ȸ�������Է��� �����ϼ̽��ϴ�.");
					
					Member m = new Member();
					m.member_input(al_mb, scan);
					
					al_mb.add(m);
					
					break;
					
				case 2 :
					title_print(title);
					print(al_mb);
					
					
					break;
				case 0 :
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
			
		}
		
	}
	
	static int main_print (Scanner scan) {
		System.out.println("===================================");
		System.out.println("[ ȸ������ ���α׷� ]");
		System.out.println(" 1. ȸ�������Է�");
		System.out.println(" 2. ȸ���������");
		System.out.println(" 0. ����");
		System.out.println("-----------------------------------");
		System.out.print("���ϴ� ��ȣ�� �Է��� �ּ���. : ");
		int select = scan.nextInt();
		scan.nextLine();
		
		return select;		
	}
	
	static void title_print(String[] title) {
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
	}
	
	static void print(ArrayList<Member> al_mb) {
		for(int i = 0; i < al_mb.size(); i++) {
			Member m = (Member)al_mb.get(i);
			m.print();
		}
	}
}

