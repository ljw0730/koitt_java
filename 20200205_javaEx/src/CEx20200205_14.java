import java.util.Scanner;

public class CEx20200205_14 {

	public static void main(String[] args) {
		// [���� ���]
		// 1) �簢�� ���
		// 2) �ﰢ�� ���
		// 3) �� ���� (���� = 3.14)
		
		int select = 0;
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) {
			System.out.println("[ ���� ��� ]");
			System.out.println("1) �簢�� ����  2) �ﰢ�� ����  3) �� ���� (���� : 99)");
			
			select = scan.nextInt();
			if(select == 99) {
				break;
			}
			if(!(select >= 1 && select <=3)) {
				System.out.println("�߸��� ���ڸ� �Է� �ϼ̽��ϴ�.");
				continue;
			}
			
			
			switch(select) {
				case 1:
					while(true) {
						System.out.println("����, ���� ���̸� �Է��ϼ���.(�����ܰ� : 0, ���� : 99)");						
						System.out.printf("���� ���� : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.printf("���� ���� : ");
						num2 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						result = num1 * num2;
						System.out.println("�簢���� ���̴� " + result + " �Դϴ�.");
					}
				case 2:
					while(true) {
						System.out.println("�Ʒ���, ���� ���̸� �Է��ϼ���.(�����ܰ� : 0, ���� : 99)");						
						System.out.printf("�Ʒ��� ���� : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.printf("�Ʒ��� ���� : ");
						num2 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						result = (num1 * num2) * 0.5;
						System.out.println("������ ���̴� " + result + " �Դϴ�.");
					}
				case 3:
					while(true) {
						System.out.println("������ ���̸� �Է��ϼ���.(�����ܰ� : 0, ���� : 99)");						
						System.out.printf("������ ���� : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
												
						result = (num1 * num1) * 3.141592;
						System.out.println("������ ���̴� " + result + " �Դϴ�.");
					}
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
	}	// main

} // class
