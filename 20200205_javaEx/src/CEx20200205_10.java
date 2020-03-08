import java.util.Scanner;

public class CEx20200205_10 {

	public static void main(String[] args) {
	
		// [�μ��� ��Ģ���� ���α׷�]
		// 1) ���ϱ�
		// 2) ����
		// 3) ���ϱ�
		// 4) ������
		// 5) ������ ���
		// ���ϴ� ���ڸ� �Է��ϼ���.(���� : 0)
		// 1�� �����ϰԵǸ� �μ��� �Է��ϼ���.(������ �̵� : 0)
		// ex) 1,2 �μ��� ���� �� : 3
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("[�μ��� ��Ģ���� ���α׷�]");
		
		while (true) {
			System.out.println("1)���ϱ� 2)���� 3)���ϱ� 4)������ 5)������ ���");
			System.out.printf("���ϴ� ���ڸ� �Է��ϼ��� : ");
			select = scan.nextInt();
			
			if(select == 0) {
				 System.out.println("���α׷��� �����մϴ�. ( _ _ )");
				 break;
			}
			if(select <= 0 || select >=9) {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}
			
			if(select == 1) {
				System.out.println("1)���ϱ⸦ �����ϼ̽��ϴ�.");
				while(true) {
					System.out.println("���ϰ� ���� �μ��� �Է��ϼ���.(������ �̵� : 0)");
					System.out.printf("ù ��° ���� : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�� ��° ���� : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�μ��� ���� : %d + %d = %d\n", num1, num2, (num1+num2));
					
				}
			}
			else if (select == 2) {
				System.out.println("2)���⸦ �����ϼ̽��ϴ�.");
				while(true) {
					System.out.println("���� ���� �μ��� �Է��ϼ���.(������ �̵� : 0)");
					System.out.printf("ù ��° ���� : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�� ��° ���� : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�μ��� ���� : %d + %d = %d\n", num1, num2, (num1-num2));
					
				}
			}
			else if (select == 3) {
				System.out.println("3)���ϱ⸦ �����ϼ̽��ϴ�.");
				while(true) {
					System.out.println("���ϰ� ���� �μ��� �Է��ϼ���.(������ �̵� : 0)");
					System.out.printf("ù ��° ���� : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�� ��° ���� : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�μ��� ���� : %d + %d = %d\n", num1, num2, (num1*num2));
					
				}
			}
			else if (select == 4) {
				System.out.println("4)�����⸦ �����ϼ̽��ϴ�.");
				while(true) {
					System.out.println("������ ���� �μ��� �Է��ϼ���.(������ �̵� : 0)");
					System.out.printf("ù ��° ���� : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�� ��° ���� : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("������ �̵��մϴ�.");
						break;
					}
					System.out.printf("�μ��� ������� : %d + %d = %d\n", num1, num2, (num1/num2));
					
				}
			}
			else if(select == 5) {
				System.out.println("5)������ ����� �����ϼ̽��ϴ�.");
				System.out.println("����ϰ� ���� �� ���ڸ� �Է��ϼ���.(������ �̵� : 0)");
				System.out.printf("�� �� : ");
				num1 = scan.nextInt();
				if(num1 == 0 ) {
					System.out.println("������ �̵��մϴ�.");
					break;
				}
				System.out.printf("<  %d ��  >\n", num1);
				for(int i = num1; i <= num1; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
				}
			}
			
		}
		
		scan.close();
		
	}	// main

} // class
