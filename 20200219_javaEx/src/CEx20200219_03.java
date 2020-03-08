import java.util.Scanner;

public class CEx20200219_03 {
	
	public static void main(String[] args) {
		// 넓이 구하기 프로그램
		// 1. 직사각형 2. 직삼각형 3. 마름모 4. 정사각형 5.원
		// 직사각형 -> 가로*세로
		// 직삼각형 -> 가로*세로*0.5
		// 마름모 -> 대각선*다른대각선*0.5
		// 정사각형 -> 가로*가로
		// 원 -> 반지름*반지름*3.14
		// while(true) -> switch 1,2,3 -> 메소드로 분리 해볼것
		// 1. 2개 받아야함, 2. 2개 받아야함, 3. 1개 받아야함.
		// 4. 1개 받아야함, 5. 1개 받아야함
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		double result = 0;
				
		Loop1 :while(true) {
			print();
			
			select = scan.nextInt();
			
			switch (select) {
				case 1:
					System.out.println("직사각형 넓이");
					result = rectangle();
					System.out.println("넓이는 : " + result);
					break;
	
				case 2:
					System.out.println("직삼각형 넓이");
					result = right_triangle();
					System.out.println("넓이는 : " + result);
					break;
					
				case 3:
					System.out.println("마름모 넓이");
					result = diamond();
					System.out.println("넓이는 : " + result);
					break;
				case 4:
					System.out.println("정사각형 넓이");
					result = square();
					System.out.println("넓이는 : " + result);
					break;
				case 5:
					System.out.println("원 넓이");
					result = circle();
					System.out.println("넓이는 : " + result);
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}

		}
		
	}	// main
	
	static int input(String str) {
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print(str + " 길이를 입력 해주세요. : ");
		input = scan.nextInt();	
		scan.nextLine();
		
		return input;
	}
	
	static void print() {
		System.out.println("=============================");
		System.out.println("  [ 넓이 구하기 프로그램 ]");
		System.out.println("=============================");
		System.out.println(" 1. 직사각형 / 2. 직삼각형");
		System.out.println(" 3. 마름모   / 4. 정삼각형");
		System.out.println(" 5. 원       / 0. 종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력해 주세요.");
	}
	
	static double rectangle() {
		double result = 0.0d;
		int input1 = input("가로");
		int input2 = input("세로");
		
		result = input1 * input2;
		return result;
	}
	
	static double right_triangle() {
		double result = 0;
		int input1 = input("밑변");
		int input2 = input("높이");
		
		result = input1 * input2 * 0.5;
		return result;
	}
	
	static double diamond() {
		double result = 0;
		int input1 = input("대각선");
		int input2 = input("다른 대각선");
		
		result = input1 * input2 * 0.5;
		return result; 
	}
	
	static double square() {
		double result = 0;
		int input1 = input("가로");
		
		result = input1 * input1;
		return result;
	}
	
	static double circle() {
		double result = 0;
		int input1 = input("반지름");
		
		result = input1 * input1 * 3.14;
		return result;
	}
}	//class

