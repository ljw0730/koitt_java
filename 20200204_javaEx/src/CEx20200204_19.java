import java.util.Scanner;

public class CEx20200204_19 {

	public static void main(String[] args) {

		
		int check = 1;	// ���α׷� �����ϴ� üũ����
		int input = 0;	// ���ϴ� ���� ���߱� �Է� ��
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0�� �Է��ϸ� ���α׷��� ����˴ϴ�.");
		check = scan.nextInt();
		
		do {
			
			System.out.printf("1~10 ���� ���ϴ� ���ڸ� �Է��ϼ���. : ");
			input = scan.nextInt(); // 1 ~ 10 ������ �����Է�

			System.out.printf("�Է��� ���� : %d\n", input);
			
		} while(!(check == 0));
			
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
		
	} // main
} // class
