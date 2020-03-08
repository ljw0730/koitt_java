import java.util.Scanner;

public class CEx20200211_15 {
	public static void main(String[] args) {
		// 1. 소수점 숫자 2개를 입력을 받는데
		// 2. 사칙연산
		// 3. 소수점은 2째자리 까지 나타날 수 있도록 해보세요.
		double num1 = 0.0d;
		double num2 = 0.0d;
		
		double temp = 0.0d;
		
		double sum = 0.0d;
		double cha = 0.0d;
		double gob = 0.0d;
		double nan = 0.0d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[소수점 숫자 사칙연산]");
		System.out.print("첫번째 소수점 숫자를 입렵하세요. : ");
		num1 = scan.nextDouble();
		System.out.print("두번째 소수점 숫자를 입력하세요. : ");
		num2 = scan.nextDouble();
		
		temp = num1 + num2;
		sum = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 - num2;
		cha = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 * num2;
		gob = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 / num2;
		nan = Math.round(temp*100)/100.0d;
		temp = 0.0d;
				
		System.out.println("두 소수점 숫자의 합 : " + sum);
		System.out.println("두 소수점 숫자의 차 : " + cha);
		System.out.println("두 소수점 숫자의 곱 : " + gob);
		System.out.println("두 소수점 숫자의 나누기 : " + nan);
		
		

		
		
		
	}	//main
}	//class
