import java.util.Scanner;

public class CEx20200205_09 {

	public static void main(String[] args) {
	
		// ���� 2���� �Է¹޾�
		// �Է¹��� 2���� �ܸ� ���� ������ ���
	
	
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int dan = 0;
	
		Loop1: while(true) { // �ܸ� ���, �ܺ��� ���
			System.out.println("������ ������� ����");
			System.out.println("1) ���� �����ܸ� ���");
			System.out.println("2) ���� �����ܺ��� ���");
			System.out.println("���ϴ� �Ŵ��� �����ϼ���.(���� : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break Loop1;
			}
			
			if(!(select >= 1 && select <=2)) {
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
				System.out.println();
				continue Loop1;
			}
			
			while(true) {	// 1�� �������� ��
				System.out.println("�ܸ� ����ϴ� ���� �����ϼ̽��ϴ�.");
				System.out.println("���ϴ� ���� �Է��ϼ���. (���� : 0)");
				dan = scan.nextInt();
				
				if(dan == 0) {
					System.out.println("������������ �̵��մϴ�.");
					System.out.println("--------------------------");
					break;
				}
				
				for(int i = dan; i <= dan; i ++) {
					for (int j = 1; j <=9; j ++) {
						
						
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println("--------------------------");
				}
			}
			
		} // Loop1 while
		
		scan.close();
	}	// main

} // class
