import java.util.Scanner;

public class CEx20200203_29 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요. : ");
		
		int i = scan.nextInt();
				
		System.out.print("두번째 수를 입력하세요. : ");
		int j = scan.nextInt();
		
		System.out.print("부호를 입력하세요. : ");
		String str = scan.next();
		char ch = str.charAt(0);
			
		int result = 0;
		
		switch (ch) {
			case '+' :
				result = i + j;
				System.out.println("두수의 합 : " + result);
				break;
			case '-' :
				result = i + j;
				System.out.println("두수의 차 : " + result);
				break;
			case '*' :
				result = i * j;
				System.out.println("두수의 곱 : " + result);
				break;
			case '/' :
				result = i / j;
				System.out.println("두수의 나눔 : " + result);
				break;

		}
		
		scan.close();
		
	}
}
