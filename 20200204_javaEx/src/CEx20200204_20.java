import java.util.Scanner;

public class CEx20200204_20 {

	public static void main(String[] args) {
		// 1 ~ 100 ����
		// �Է°��� ���� ��
		// �Է°��� ũ�� '���� ���ڴ� �Է°� ���� �۽��ϴ�.'
		// �Է°��� ������ '���� ���ڴ� �Է°� ���� Ů�ϴ�.'
				
		int input = 0;
		int min = 1;
		int max = 100;
		
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 100)+1;
		
		System.out.println("===== Up/Down ���� (1~100) ====="); 
		
		while(true) {
			System.out.printf("���ڸ� �Է����ּ��� : ");
			input = scan.nextInt();
			
			if(input > max) {
				System.out.println("���� �Է� ���� ū���� �Է��Ͽ����ϴ�.");
				continue;
			}
			if(input < min) {
				System.out.println("���� �Է� ���� �������� �Է��Ͽ����ϴ�.");
				continue;
			}
			
			if (input > ran) {
				System.out.println("���� ���ڴ� �Է°� ���� �۽��ϴ�.");
				
				max = input;
			}
			else if (input < ran) {
				System.out.println("���� ���ڴ� �Է°� ���� Ů�ϴ�.");
				
				min = input;
			}
			else if (input == ran){
				System.out.println("�����Դϴ�.");
				break;
			}
		} //while
		
		System.out.println("������ �����մϴ�.");
		
		scan.close();
		
	} // main
} // class
