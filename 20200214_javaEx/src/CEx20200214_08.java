import java.util.Scanner;

public class CEx20200214_08 {
	public static void main(String[] args) {
		// �ҹ��ڴ� �빮�ڷ�, �빮�ڸ� �ҹ��ڷ�
		
		String str = "";
		char ch = ' ';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ҹ��ڳ� �빮�ڸ� �Է��� �ּ���. : ");
		str = scan.nextLine();
		ch = str.charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("�빮�ڸ� �ҹ��ڷ� : " + (char)(ch+32));
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ��ڸ� �빮�ڷ� : " + (char)(ch-32));
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		
		
	}	//main
}	//class
