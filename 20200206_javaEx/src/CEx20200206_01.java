import java.util.Scanner;

public class CEx20200206_01 {
	public static void main(String[] args) {
		// [ ���θ� ] 
		// �ڽ��� ���� 1�� ����
		// ���θ����� 1���� ��ǰ�� ����
		// �ڽ��� ���¿��� ��ǰ������ ���ִ� ���α׷�
		
		int my_bank = 5000000;	// �� ���� �ʱ� �ڱ� 500����
		int p_num = 0;	// ���Ż�ǰ ��ȣ
	
		
		Scanner scan = new Scanner(System.in);
		
		String product1 = "��ǻ��";
		String product2 = "TV";
		String product3 = "����Ʈ��";
		
		int product1_won = 1300000;	// 1)�� ��ǰ����
		int product2_won = 990000;	// 2)�� ��ǰ����
		int product3_won = 880000;	// 3)�� ��ǰ����

		String list1 = "";	// ���� ���
		int point = 0;		// ����Ʈ
		
		Loop1 : 		
		while(true) {
			System.out.println("=============================");
			System.out.println("[ ��X��Ʈ ���θ� ]");
			System.out.printf("  1) ��ǻ�� - %d��\n", product1_won);
			System.out.printf("  2) TV - %d��\n", product2_won);
			System.out.printf("  3) ����Ʈ�� - %d��\n", product3_won);
			System.out.printf("  4) �ݾ� ����");
			System.out.printf("�����ϰ� ���� ��ǰ�� �����ϼ���.(���� : 0) : ");
			
			p_num = scan.nextInt();
			if (p_num == 0) {
				break Loop1;
			}
			
			switch (p_num) {
			case 1:
				if(my_bank < product1_won) {
					System.out.println("�ܾ��� ���� �մϴ�.");
					System.out.println("���� �ܾ� : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product1_won;
				point += (product1_won * 0.1);
				System.out.println(product1 + " 1�븦 ���� �߽��ϴ�.");
				System.out.println(product1+ " 1���� ������ " + product1_won + "�� �Դϴ�.");
			
				list1 += "��ǻ�� 1�� ";
				break;
			
			case 2:
				if(my_bank < product2_won) {
					System.out.println("�ܾ��� ���� �մϴ�.");
					System.out.println("���� �ܾ� : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product2_won;
				point += (product2_won * 0.1);
				System.out.println(product2 + " 1�븦 ���� �߽��ϴ�.");
				System.out.println(product2 + " 1���� ������ " + product2_won + "�� �Դϴ�.");
				
				list1 += "TV 1�� ";
				break;
			
			case 3:
				if(my_bank < product3_won) {
					System.out.println("�ܾ��� ���� �մϴ�.");
					System.out.println("���� �ܾ� : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product3_won;
				point += (product3_won * 0.1);
				System.out.println(product3 + " 1�븦 ���� �߽��ϴ�.");
				System.out.println(product3 + " 1���� ������ " + product3_won + "�� �Դϴ�.");
				
				list1 += "����Ʈ�� 1�� ";
				break;

			case 4:
				System.out.println("������ �ݾ��� �Է��ϼ���.");
				int carge = scan.nextInt();
				my_bank += carge;
				System.out.printf("%d���� �����Ǿ����ϴ�.\n", carge);
			default:
				break;
			}
						
			System.out.println("=============================");
			System.out.println("���� �ܾ��� " + my_bank + "�� �Դϴ�.");
			System.out.println("=============================");
			System.out.println("������ ����Ʈ�� " + point + "P �Դϴ�.");
			System.out.println("=============================");
			System.out.println("���� ���Ÿ�� : " + list1);
			System.out.println("=============================");
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
	}
	
}
