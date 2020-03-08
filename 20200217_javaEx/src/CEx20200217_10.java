import java.util.Scanner;

public class CEx20200217_10 {
	public static void main(String[] args) {
		// ��ȣ ���� ���� �ۼ��� ��ȸ��
		// 1�� �Է� �� ��� ���
		// 2�� �Է� �� ��� ���
		// 3�� �Է� �� ��� ���...
		
		// - ���� ���� ���� - 
		// 1. �Խ��� ����Ʈ/�ۺ���
		// 2. �۾���(�Է�)
		// 3. �ۻ���
		// 0. ����
		
		String[] subject = { "��ȣ", "����", "����", "�ۼ���", "��ȸ��" };
		Bulletin_Board[] bb = new Bulletin_Board[2];
		
		int bb_num = 0;
		int bb_view_count = 0;
		
		Scanner scan = new Scanner(System.in);
				
		for(int i = 0; i < bb.length; i++) {
			bb[i] = new Bulletin_Board();
			System.out.println("[ �Խ��� �� ��� ]");
			
			// �۹�ȣ �Է�
			bb[i].num = bb_num+1;
						
			// ���� �Է�
			System.out.print("������ �Է��� �ּ���. (���� : 0) : ");
			bb[i].title = scan.nextLine();
			if(bb[i].title.equals("0")) {
				bb[i].title = null;
				break;
			}
			
			// ���� �Է�
			System.out.print("������ �Է��� �ּ��� : ");
			bb[i].content = scan.nextLine();
			
			// �ۼ��� �Է�
			System.out.print("�ۼ��ڸ� �Է��� �ּ���. : ");
			bb[i].name = scan.nextLine();

			// ��ȸ�� �Է�
			bb[i].view_count = bb_view_count;
			
			bb_num++;	// �۹�ȣ �ڵ�����
			
			System.out.println("==============================");
			System.out.println("      [ �� ����Ʈ ��� ]");
			for(int j = 0; j < subject.length; j++) {
				System.out.print(subject[j] + "\t");
			}
			System.out.println();
			
			for(int j = 0; j < bb_num; j++) {
				bb[j].print();
			}
			System.out.println("==============================");
		}
		
		scan.close();
		
	}
}


