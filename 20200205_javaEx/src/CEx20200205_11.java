import java.util.Scanner;

public class CEx20200205_11 {

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
		// ����� ver.
		
		Scanner scan = new Scanner(System.in);
		int select1 = 0; // ó�� ���� ����
		int num1 = 0;
		int num2 = 0;
		
		Loop1: 		
		while(true) { // ��ü �ý���
			System.out.println("[ ��Ģ���� ���α׷� ]");
			System.out.println("---------------------");
			System.out.println("1) ������ ���");
			System.out.println("2) ����");
			System.out.println("3) ���ϱ�");
			System.out.println("4) ������");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(����:99)");
			
			select1 = scan.nextInt();
			
			if(select1 == 99) { // 0�϶� ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(!(select1>= 1 && select1 <=9)) { // 1~9���� ���ڸ� �Է°���
				System.out.println("1~9������ ���ڸ� �Է��ϼ���.");
				continue;
			}
			
			switch (select1) {	// ��Ģ���� ����
				case 1:
					Loop2 :
					while(true) {
//						System.out.println("���ϰ� ���� �μ��� �Է��ϼ���.(�����̵�: 0, �ý��� ����:99)");
						System.out.println("1) ���ϴ� �����ܸ� ���");
						System.out.println("2) ���ϴ� �ܺ��� ���");
						System.out.println("���ϴ� ������ ��¼� �� �Է��ϼ���.(�����̵�: 0, �ý��� ����:99)");
						num1 = scan.nextInt();
						
						if(num1 == 0) {
							continue Loop1;
						}
						else if(num1 == 99) {
							break Loop1;
						}
						
						switch (num1 ) {
							case 1 :
								while (true) {
									System.out.println("���ϴ� �� ���� �Է��ϼ���.(�����̵� : 0, ���� : 99)");
									num2 = scan.nextInt();
									
									if(num2 == 0 ) {
										continue Loop2;
									}
									if(num2 == 99) {
										break Loop1;
									}
									
									for(int i = num2; i <= num2; i++) {
										for (int j = 1; j <= 9; j++) {
											System.out.println(i + " * " + j + " = " + (i*j));
										}
									}
									System.out.println("------------------------");
								}
								
							case 2 :
								for(int i = num1; i <= 9; i++) {
									for (int j = 1; j <= 9; j++) {
										System.out.println(i + " * " + j + " = " + (i*j));
									}
								}
								break;
						}
						
												
						
//						if(num1 == 0) {
//							continue Loop1;
//						}
//						else if(num1 == 99) {
//							break Loop1;
//						}
//						System.out.println("1�� �� �Է��ϼ���");
//						num2 = scan.nextInt();
//						
//						System.out.println("�μ��� �� : " + (num1+num2));
					} // ���ϱ� while
				case 2:
					while(true) {
						System.out.println("���� ���� �μ��� �Է��ϼ���.(�����̵�: 0, �ý��� ����:99)");
						num1 = scan.nextInt();
						if(num1 == 0) {
							continue Loop1;
						}
						else if(num1 == 99) {
							break Loop1;
						}
						System.out.println("1�� �� �Է��ϼ���");
						num2 = scan.nextInt();
						
						System.out.println("�μ��� �� : " + (num1-num2));
					} // ���� while
	
				default:
				break;
			}
			
			
			
		} // ���� �ý��� while
		
		System.out.println("�ý����� �����մϴ�.");
		
	}	// main

} // class
