import java.util.Scanner;

public class CEx20200205_13 {

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
		
		int select1 = 0;		// ��ȣ���ú���
		double num1 = 0.0d;		// �Ǽ��� �޴� ����
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) { // ��ü �ݺ�
			System.out.println("[�Ҽ��� �ڸ��� ó�� ���α׷�]");
			System.out.println("  1) �ݿø�");
			System.out.println("  2) �ø�");
			System.out.println("  3) ����");
			System.out.println("  4) 1~3°�ڸ� �ݿø�");
	
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(���� : 99)");
			select1 = scan.nextInt();
			
			if(select1 == 99) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			if(!(select1 >= 1 && select1 <=4)) {
				System.out.println("1~4�� ������ ��ȣ�� �Է��ϼ���.");
				System.out.println("-------------------------------");
				continue;
			}
			
			switch (select1) {	// ������ ���α׷� �ݺ�
				case 1 :
					while(true) {
						System.out.println("�Ǽ��� �Է����ּ���. (�����̵� : 0 / ���� : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("�Ǽ� �ݿø� �� : " + Math.round(num1));
						
					}
				case 2 :
					while(true) {
						System.out.println("�Ǽ��� �Է����ּ���. (�����̵� : 0 / ���� : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("�Ǽ� �ø� �� : " + Math.ceil(num1));
						
					}
				case 3 :
					while(true) {
						System.out.println("�Ǽ��� �Է����ּ���. (�����̵� : 0 / ���� : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("�Ǽ� ���� �� : " + Math.floor(num1));
						
					}
					
				case 4 :
					while(true) {
						System.out.println("�Ǽ��� �Է����ּ���. (�����̵� : 0 / ���� : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("�Ҽ� ��°�ڸ����� �ݿø� �Ұǰ���?");
						select1 = scan.nextInt();
						if(!(select1 >= 1 && select1 <=3)) {
							System.out.println("�Ҽ��� 3°�ڸ������� �ݿø� �� �� �ֽ��ϴ�.");
							continue;
						}
						
						
						switch (select1) {
							case 1 :
								System.out.println("�Ҽ� ù°�ڸ� �ݿø� �� : " + Math.round(num1));
								break;
							case 2 :
								System.out.println("�Ҽ� �����ڸ� �ݿø� �� : " + Math.round(num1*10)/10.0f);
								break;
							case 3 :
								System.out.println("�Ҽ� �����ڸ� �ݿø� �� : " + Math.round(num1*100)/100.0f);
								break;
						}
						
					}
			} 
			
		} // ��ü�ݺ� while
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}	// main

} // class
