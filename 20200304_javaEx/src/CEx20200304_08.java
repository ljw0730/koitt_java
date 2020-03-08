import java.util.Scanner;

public class CEx20200304_08 extends Object {

	public static void main(String[] args) {
		//String �޼��� - length(), charAt()
		
		// ��й�ȣ�� �Է¹޽��ϴ�.
		// 1. Ư������ 1���� �־�� �մϴ�.
		// 2. �빮�ڰ� 1���� �־�� �մϴ�.
		// 3. ���̴� 8�ڸ� �̻�
		// �ƴϸ� �ٽ� �Է��ϼ���.
		
		String pw = "";
		final int MIN_LEN = 8;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Ư������ 1���̻�, �빮�� 1���̻�, 8�ڸ� �̻�");
			System.out.println("��й�ȣ�� �Է��� �ּ���. (����) : ");
			pw = scan.nextLine();
			
			if(pw.length() < MIN_LEN) {
				System.out.println("8�ڸ� �̻��̾�� �մϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			boolean special_check = false;
			boolean capital_check = false;
			
			char ch = ' ';
//			char ch2 = ' ';
			for(int i = 0; i < pw.length(); i++) {
				ch = pw.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					capital_check = true;
//					ch2 = ch;
				}
			}
//			if(special_check == true) {
//				System.out.println("Ư�����ڰ� �ֽ��ϴ�. : " + ch2);
//			}
			
			if(capital_check == false) {
				System.out.println("�빮�ڰ� 1�� �̻� �־�� �մϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			
			for(int i = 0; i < pw.length(); i++) {
				ch = pw.charAt(i);
				if((ch >= '!' && ch <= '/') || (ch >= ':' && ch <= '@') || (ch >= '[' && ch <= '`') || (ch >= '{' && ch <= '~')) {
					special_check = true;
//					ch2 = ch;
				}
			}
			
//			if(capital_check == true) {
//				System.out.println("Ư�����ڰ� �ֽ��ϴ�. : " + ch2);
//			}
			
			if(special_check == false) {
				System.out.println("Ư�����ڰ� 1�� �̻� �־�� �մϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
		}
	}
}

