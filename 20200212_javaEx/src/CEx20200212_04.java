import java.util.Scanner;

public class CEx20200212_04 {
	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾�
		// ���ڿ� ��ü�� �빮��/�ҹ��ڷ� ġȯ
		// ��ȯ�Ͽ� ���
		
		Scanner scan = new Scanner(System.in);
		
		String in_str = "";
		String result = "";
		String result1 = "";
		int len = 0;
		
		char ch = ' ';
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ���. >> (����:0) ");
			in_str = scan.next();
			
			if(in_str.equals("0")) {
				break;
			}
			
			result = in_str.toUpperCase();	// ��� ���ڸ� �빮�ڷ� ġȯ
			result1 = in_str.toLowerCase();   // ��� ���ڸ� �ҹ��ڷ� ġȯ
			len = in_str.length();	//���ڿ� ����
			
			System.out.println("�빮�� : " + result);
			System.out.println("�ҹ��� : " + result1);
			System.out.println("���ڿ� ���� : " + len);
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
