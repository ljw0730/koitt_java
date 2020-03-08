import java.util.Scanner;

public class CEx20200219_01 {
	
	public static void main(String[] args) {
		// 사칙연산 프로그램
		
		Scanner scan = new Scanner(System.in);
		
//		int input1 = 0, input2 = 0;
		int[] input = new int[2];
		int result = 0;
		
		Loop_while : while(true) {
			System.out.println("  [ 사칙연산 프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1. 더하기 / 2. 빼기");
			System.out.println("3. 곱하기 / 4. 나누기");
			System.out.println("0. 종료");
			System.out.println("-------------------------");
			System.out.print("해당하는 프로그램을 선택하세요. : ");
			
			switch(scan.nextInt()) {
				case 1:
					System.out.println("더하기 프로그램");
					input = print(input);
					
					//add메소드 호출
					result = CEx20200219_01.add(input[0], input[1]);
					System.out.println("결과값 : " + result);
					break;
					
				case 2:
					System.out.println("빼기 프로그램");
					input = print(input);
					
					// subtract 메소드 호출
					result = CEx20200219_01.subtract(input[0], input[1]);
					System.out.println("결과 값 : " + result);
					break;
					
				case 3:
					System.out.println("곱하기 프로그램");
					input = print(input);
					
					
					// Multiplication 메소드 호출
					result = CEx20200219_01.multiplication(input[0], input[1]);
					System.out.println("결과 값 : " + result);
					
					break;
					
				case 4:
					System.out.println("나누기 프로그램");
					input = print(input);
					
					result = CEx20200219_01.division(input[0], input[1]);
					System.out.println("결과 값 : " + result);
					
					break;
					
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop_while;
			}
			
		}
		
	}	//main
	
	// print 메소드
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		input[0] = scan.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		input[1] = scan.nextInt();
		
		return input;
	}
	
	// 더하기 메소드
	static int add(int a, int b) {
		int result = 0;
		result = a + b;
		
		return result;
	}
	
	// 빼기 메소드
	static int subtract(int a, int b) {
		int result = 0;
		result = a - b;
		
		return result;
	}
	
	// 곱하기 메소드
	static int multiplication(int a, int b) {
		int result = 0;
		result = a * b;
		
		return result;
	}
	
	// 나누기 메소드
	static int division(int a, int b) {
		int result = 0;
		result = a / b;
		
		return result;
	}
	
	
}	//class
