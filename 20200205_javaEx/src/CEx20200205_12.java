import java.util.Scanner;

public class CEx20200205_12 {

	public static void main(String[] args) {
		// 1) �ݿø�
		// 2) �ø�
		// 3) ����
		// 4) �ݿø� �ڸ��� ����
		
		// ���ϴ� ��ȣ�� �Է��ϼ���.
		
		// 1�� ���� �� 
		// �Ҽ��� ����� �Ǽ��� �Է��ϼ���.
		// 3.1454 -> 3, 4.523 -> 5
		
		// 4�� ���ý�
		// �Ǽ��� �Է��ϼ���. -> 3.1452
		// �ݿø� �� �ڸ��� �Է� 2
		// ��°�ڸ����� �ݿø� ���� 3.1
		
		
		Scanner scan = new Scanner(System.in);
		int sel = 0;	// ���� ����
		double num_d = 0.0d;	// �Է� ���� �Ҽ��� ����
		int value = 0;
		double value_d = 0.0d;
		int i = 0;
				
		System.out.println("[�Ҽ��� ��� ���α׷�]");
				
		while (true) {
			System.out.println("1)�ݿø� 2)�ø� 3)���� 4)1~5��°�ڸ� �ݿø� (���� : 99)");
			sel = scan.nextInt();
			
			if(sel == 99) {
				break;
			}
			
			System.out.printf("����� �Ҽ��� �Է��� �ּ���.(xx.xxx)");
			num_d = scan.nextDouble();
			
			if(sel == 1) {
				value = (int)(Math.round(num_d));
				System.out.println("�ݿø��� ���� " + value + " �Դϴ�.");
			}
			if(sel == 2) {
				value = (int)(Math.ceil(num_d));
				System.out.println("�ø��� ���� " + value + " �Դϴ�.");
			}
			if(sel == 3) {
				value = (int)(Math.floor(num_d));
				System.out.println("������ ���� " + value + " �Դϴ�.");
			}
			if(sel == 4) {
				System.out.println("�Ҽ� ��°�ڸ����� �ݿø� �Ұǰ���?");
				sel = scan.nextInt();
				switch (sel) {
					case 1:
						i = 1;
						break;
					case 2:
						i = 10;
						break;
					case 3:
						i = 100;
						break;
					case 4:
						i = 1000;
						break;
					case 5:
						i = 10000;
						break;
				}
				
				value_d = (int)Math.round(num_d*i)/(double)i;
				System.out.println(sel + "��°�ڸ� �ݿø� ���� " + value_d + " �Դϴ�.");
				 
			}
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
	}	// main

} // class
