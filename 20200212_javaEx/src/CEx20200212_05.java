import java.util.Scanner;

public class CEx20200212_05 {
	public static void main(String[] args) {
		// ���ڿ��� �Է¹޾�
		// �ҹ��� -> �빮�� / �빮�� -> �ҹ��ڷ�
		// ��ȯ�Ͽ� ���
		
		Scanner scan = new Scanner(System.in);
		
		String in_str = "";
		String result = "";
		int len = 0;
		
		char ch = ' ';
		
		while (true) {
			System.out.printf("���ڿ��� �Է��� �ּ���.(���� : 0) : ");
			in_str = scan.next();
			
			if(in_str.equals("0")) {
				break;
			}
			
			len = in_str.length();
						
			for(int i = 0; i < len; i++) {
				ch = in_str.charAt(i);
				
				if(ch >= 'a' && ch <='z') {
					ch = (char)(ch-32);
					result += ch;
				}
				else if(ch >= 'A' && ch <='Z') {
					ch = (char)(ch+32);
					result += ch;
				}
			}
			System.out.printf("��ȯ�� ���ڿ���                   : " + result);
			System.out.println("");
			
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}
