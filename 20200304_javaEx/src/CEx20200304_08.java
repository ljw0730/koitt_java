import java.util.Scanner;

public class CEx20200304_08 extends Object {

	public static void main(String[] args) {
		//String 메서드 - length(), charAt()
		
		// 비밀번호를 입력받습니다.
		// 1. 특수문자 1개라도 있어야 합니다.
		// 2. 대문자가 1개라도 있어야 합니다.
		// 3. 길이는 8자리 이상
		// 아니면 다시 입력하세요.
		
		String pw = "";
		final int MIN_LEN = 8;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("특수문자 1개이상, 대문자 1개이상, 8자리 이상");
			System.out.println("비밀번호를 입력해 주세요. (종료) : ");
			pw = scan.nextLine();
			
			if(pw.length() < MIN_LEN) {
				System.out.println("8자리 이상이어야 합니다. 다시 입력해 주세요.");
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
//				System.out.println("특수문자가 있습니다. : " + ch2);
//			}
			
			if(capital_check == false) {
				System.out.println("대문자가 1개 이상 있어야 합니다. 다시 입력해 주세요.");
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
//				System.out.println("특수문자가 있습니다. : " + ch2);
//			}
			
			if(special_check == false) {
				System.out.println("특수문자가 1개 이상 있어야 합니다. 다시 입력해 주세요.");
				continue;
			}
		}
	}
}

