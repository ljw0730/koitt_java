import java.util.Scanner;

public class CEx20200203_08 {

	public static void main(String[] args) {
		//���ڸ��� �̻��� �Է¹޾� �� ���� ���� ���϶�.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� ���� �Է��ϼ��� : ");
		
		String str = scan.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		//char�� ���� ������ �����Ϸ��� -'0' �� �ϸ�ȴ�.
		int num1 = ch1 - '0';
		int num2 = ch2 - '0';
		
		int sum = num1 + num2;
		int cha = num1 - num2;
		int g1 = num1 * num2;
		int di = num1 / num2;
		
		System.out.println("�� ���� ���� : " + sum);
		System.out.println("�� ���� ���� : " + cha);
		System.out.println("�� ���� ���� : " + g1);
		System.out.println("�� ���� ������� : " + di);
		
		scan.close();
		
		
		// char to int
		// char ch = '20'
		// int input = ch - '0';
		
		// int to string
		// int input = 20;
		// String ch = input + "";
		
		// string to int
		// String ch = "2000";
		// int input = Integer.parseInt(ch);
	}

}
