import java.util.Scanner;

public class CEx20200205_18 {

	public static void main(String[] args) {
		// for���� ����ؼ� �հ�
		// 5�� ����� �����ؼ� ������ ���� ���ϴ� ���α׷�
		// �Է� 2���� �޾Ƽ� (ex 2�� 40 -> 5�� ����� ����ϰ�
		// �հ踦 ���Ͻÿ�.
		// �� ��� ���ϱ⸦ �ߴ��� �Բ� ����� �غ�����.
		
		int check = 0;
				
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int count = 0;
		
		String jumin = "";	// �ֹι�ȣ
		int age = 0;	// ����
		String mf = "";
		
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 :
		while(true) {
			System.out.println("[ ���ռ��� ���α׷� ]");
			System.out.println(" 1) �μ��� ���ϴ� ���α׷�");
			System.out.println(" 2) �ֹι�ȣ ���� ��� ���α׷�");
			System.out.println(" 3) �ֹι�ȣ ����Ȯ�� ���α׷�");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(���� : 99)");
			
			check = scan.nextInt();
			
			if(check == 99) {
				break;
			}
			else if(!(check >= 1 && check <=3)) {
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�. 1~3���� �Է��� �ּ���.");
				continue;
			}
			
			switch (check) {
				case 1:
					// �μ��� ���ϴ� ���α׷�
					while(true) {
						sum = 0;
						count = 0;
						
						System.out.println("A���� B������ �հ�(5�� �������)");
						System.out.println("�ΰ��� ���� �Է� �ϼ���.(�����̵�: 0 / ���� : 99)");
						System.out.printf("ù ��° �� : ");
						num1 = scan.nextInt();
						
						if(num1 == 99) {
							break Loop1 ;
						}
						else if (num1 == 0) {
							continue Loop1;
						}
									
						System.out.printf("�� ��° �� : ");
						num2 = scan.nextInt();
						if(num1 == 99) {
							break Loop1;
						}
							
						if(num2 < num1) {
							int temp = 0;
							temp = num1;
							num1 = num2;
							num2 = temp;
						}
						
						for(int i = num1; i <= num2; i++) {
							if(i % 5 == 0) {
								continue;
							}
							sum += i;
							count++;
						}
						
						System.out.println("�� " + count + "���� ���� �־�����,");
						System.out.println(num1 + "���� " + num2 + "������ 5�ǹ���� ������ ���� " + sum + "�Դϴ�.");
						System.out.println("------------------------------------------");
					}
				case 2:
					// �ֹι�ȣ ���� ��� ���α׷�
					// 880101-1011198
					while(true) {
						System.out.println("�ֹι�ȣ�� �Է��ϼ���.(�����̵� : 0 / ���� : 99)");
						jumin = scan.next();
						
						if(jumin.equals("99")) {
							break Loop1;
						}
						else if(jumin.equals("0")) {
							continue Loop1;
						}
						
						//�ֹι�ȣ ���
						//charAt(0)
						//str.substring(0, 2) - 0�� ���� 2��° �ձ��� ©����� �ʹ�.
						if(jumin.charAt(7) == '1' || jumin.charAt(7) == '2') {
							String ju_check = "19" + jumin.substring(0, 2);
							age = 2019 - Integer.parseInt(ju_check) + 2;
							System.out.println("����� ���̴� " + age + " �� �Դϴ�.");
						}
						else if (jumin.charAt(7) == '3' || jumin.charAt(7) == '3'){
							String ju_check = "20" + jumin.substring(0, 2);
							age = 2019 - Integer.parseInt(ju_check) + 2;
							System.out.println("����� ���̴� " + age + " �� �Դϴ�.");
						}
						else {
							//�ֹι�ȣ error
							System.out.println("�ֹι�ȣ�� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
							continue;
						}
					}
				case 3:
					// �ֹι�ȣ ����Ȯ�� ���α׷�
					// 880101-1011198
					while(true) {
						System.out.println("�ֹι�ȣ�� �Է��ϼ���.(�����̵� : 0 / ���� : 99)");
						jumin = scan.next();
						
						if (jumin.equals("99")) {
							break Loop1;
						}
						else if (jumin.equals("0")) {
							continue Loop1;
						}
						
						if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
							mf = "����";
						}
						else if (jumin.charAt(7) == '2' || jumin.charAt(7) == '4') {
							mf = "����";
						}
						else {
							System.out.println("�ֹι�ȣ�� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
							continue;
						}
						System.out.println("����� ������ " + mf + " �Դϴ�.");
						
					}
			}
			
		}
		
	
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
	}	// main

} // class
