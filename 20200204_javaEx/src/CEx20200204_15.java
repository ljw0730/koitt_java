import java.util.Scanner;

public class CEx20200204_15 {
	public static void main(String[] args) {
		
		int input_num = 0;	// �Է��� ����
		int input_num2 = 0;	
		int check = (int)(Math.random() * 100) + 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("1-100���� ���ڸ� �Է��ϼ���.");
		input_num = scan.nextInt();
		if(check == input_num) {
			System.out.printf("��÷�Դϴ�. ��÷��ȣ %d", check);
			System.out.printf("\n�Է¹�ȣ %d, %d\n", input_num, input_num2);
		}
		
		System.out.println("1-100���� ���ڸ� �Է��ϼ���.");
		input_num2 = scan.nextInt();
		if(check == input_num2) {
			System.out.printf("��÷�Դϴ�. ��÷��ȣ %d", check);
			System.out.printf("\n�Է¹�ȣ %d, %d\n", input_num, input_num2);
		}
		else {
			System.out.printf("��÷�Ǽ̽��ϴ�. ��÷��ȣ %d", check);
			System.out.printf("\n�Է¹�ȣ %d, %d\n", input_num, input_num2);
		}
		
		System.out.println("�ý����� ����Ǿ����ϴ�.");
		
		scan.close();
		
	}
}
