import java.util.Scanner;

public class CEx20200205_16 {

	public static void main(String[] args) {
		// for���� ����ؼ� �հ�
		// 5�� ����� �����ؼ� ������ ���� ���ϴ� ���α׷�
		// �Է� 2���� �޾Ƽ� (ex 2�� 40 -> 5�� ����� ����ϰ�
		// �հ踦 ���Ͻÿ�.
		// �� ��� ���ϱ⸦ �ߴ��� �Բ� ����� �غ�����.
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 :
		while(true) {
			sum = 0;
			count = 0;
			
			System.out.println("A���� B������ �հ�(5�� �������)");
			System.out.println("�ΰ��� ���� �Է� �ϼ���.(���� : 0)");
			System.out.printf("ù ��° �� : ");
			num1 = scan.nextInt();
			
			if(num1 == 0) {
				break;
			}
			
			while(true) {
				System.out.printf("�� ��° �� : ");
				num2 = scan.nextInt();
				if(num1 == 0) {
					break Loop1;
				}
				
				if(num2 <= num1) {
					System.out.println("�� ���� ���� ù ���� ������ �۽��ϴ�.");
				} else {
					break;
				}
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
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
	}	// main

} // class
