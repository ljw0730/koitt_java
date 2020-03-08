import java.util.Scanner;

public class CEx20200212_05 {
	public static void main(String[] args) {
		// 문자열을 입력받아
		// 소문자 -> 대문자 / 대문자 -> 소문자로
		// 변환하여 출력
		
		Scanner scan = new Scanner(System.in);
		
		String in_str = "";
		String result = "";
		int len = 0;
		
		char ch = ' ';
		
		while (true) {
			System.out.printf("문자열을 입력해 주세요.(종료 : 0) : ");
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
			System.out.printf("변환된 문자열은                   : " + result);
			System.out.println("");
			
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
