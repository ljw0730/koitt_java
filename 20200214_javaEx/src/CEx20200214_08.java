import java.util.Scanner;

public class CEx20200214_08 {
	public static void main(String[] args) {
		// 소문자는 대문자로, 대문자를 소문자로
		
		String str = "";
		char ch = ' ';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소문자나 대문자를 입력해 주세요. : ");
		str = scan.nextLine();
		ch = str.charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자를 소문자로 : " + (char)(ch+32));
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자를 대문자로 : " + (char)(ch-32));
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
	}	//main
}	//class
