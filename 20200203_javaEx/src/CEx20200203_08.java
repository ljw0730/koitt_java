import java.util.Scanner;

public class CEx20200203_08 {

	public static void main(String[] args) {
		//두자리수 이상의 입력받아 각 수의 합을 구하라.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두자리 수를 입력하세요 : ");
		
		String str = scan.nextLine();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		//char의 값을 정수로 변경하려면 -'0' 을 하면된다.
		int num1 = ch1 - '0';
		int num2 = ch2 - '0';
		
		int sum = num1 + num2;
		int cha = num1 - num2;
		int g1 = num1 * num2;
		int di = num1 / num2;
		
		System.out.println("두 수의 합은 : " + sum);
		System.out.println("두 수의 차는 : " + cha);
		System.out.println("두 수의 곱은 : " + g1);
		System.out.println("두 수의 누나기는 : " + di);
		
		scan.close();
		
		
		// char to int
		// char ch = '20'
		// int input = ch - '0';
		
		// int to string
		// int input = 20;
		// String ch = input + "";
		
		// string to int
		// String ch = "2000";
		// int input = Integer.parseInt(ch);
	}

}
