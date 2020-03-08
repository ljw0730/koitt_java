import java.util.Scanner;

public class CEx20200212_04 {
	public static void main(String[] args) {
		// 문자열을 입력받아
		// 문자열 전체를 대문자/소문자로 치환
		// 변환하여 출력
		
		Scanner scan = new Scanner(System.in);
		
		String in_str = "";
		String result = "";
		String result1 = "";
		int len = 0;
		
		char ch = ' ';
		
		while(true) {
			System.out.print("문자를 입력하세요. >> (종료:0) ");
			in_str = scan.next();
			
			if(in_str.equals("0")) {
				break;
			}
			
			result = in_str.toUpperCase();	// 모든 문자를 대문자로 치환
			result1 = in_str.toLowerCase();   // 모든 문자를 소문자로 치환
			len = in_str.length();	//문자열 길이
			
			System.out.println("대문자 : " + result);
			System.out.println("소문자 : " + result1);
			System.out.println("문자열 길이 : " + len);
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
