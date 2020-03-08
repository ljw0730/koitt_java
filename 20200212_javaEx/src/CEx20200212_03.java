import java.util.Scanner;

public class CEx20200212_03 {
	public static void main(String[] args) {
		// 영문 소문자를 입력 받아서 
		// 대문자 변환하는 프로그램
		
		char input = ' ';
		char output = ' ';
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("대문자 또는 소문자를 입력하세요.(종료 : 0) : ");
			input = scan.next().charAt(0);
			
			if(input == '0') {
				break;
			}
			
			if(input >= 'a' && input <= 'z') {
				output = (char)(input - 32);
			}
			else if (input >= 'A' && input <='Z')	{
				output = (char)(input + 32);
			}
			System.out.println("입력한 값 : " + input);
			System.out.println("출력한 값 : " + output);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
