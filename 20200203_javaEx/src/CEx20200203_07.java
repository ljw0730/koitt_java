import java.util.Scanner;

public class CEx20200203_07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("대문자를 입력하세요.");
		//charAt(n) : String로 입력 받는 글자에서 n번째 글자를 가져온다.
		//여기서 n은 배열의 주소처럼 처음인덱스가 0이다.
		char ch = scan.next().charAt(0);
		System.out.println("소문자는 : " + (char)(ch + 32));
		
		System.out.println("\n소문자를 입력하세요.");
		char ch2 = scan.next().charAt(0);
		System.out.println("대문자는 : " + (char)(ch2 - 32));
		
		scan.close();
		
	}
}
