import java.util.Scanner;

public class CEx20200217_02 {

	public static void main(String[] args) {
		// 4. 대문자 입력시 소문자 출력 프로그램
		// ( 기본 - 대문자만 1개 입력시 소문자로 변환 ) 
		// ( 옵션 - 대문자 입력시 소문자로, 소문자 입력시 대문자로 문자열 입력 가능 )

		String str = "";
		int len = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력해 주세요 : ");
		str = scan.next();
		
		len = str.length();
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				result += (char)((str.charAt(i))-32);
			}
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				result += (char)((str.charAt(i))+32);
			} 
		}
		
		System.out.println("변경 전 : " + str);
		System.out.println("변경 후 : " + result);
	}

}
