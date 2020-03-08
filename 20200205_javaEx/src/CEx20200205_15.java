import java.util.Scanner;

public class CEx20200205_15 {

	public static void main(String[] args) {
		// 1. 랜덤수가 5개
		// 입력한 수 : 5개 5개를 연속으로 입력합니다.
		// 예) 12457
		// 몇개를 맞췄는지? 확인하는 프로그램
		// [상금]
		// 3개 맞으면 100만원 / 2개 맞으면 10만원 / 1개 맞으면 1만원
		// [출력형태]
		// 랜덤수 : 35247
		// 입력수 : 12457
		// 같은수 입력 : 1개
		// 상금 : 얼마
		
		// 랜덤수에서의 중복 생각해보기
		
		
		// 맞은 갯수
		int count =0;
		
		// 0~9 램덤 생성
		
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		int num4 = (int)(Math.random() * 10);
		int num5 = (int)(Math.random() * 10);
		
		
		
		// 입력값
		Scanner scan = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력하세요.");
		String input = scan.nextLine();
		
		//input.charAt(0)
		if(num1 == (input.charAt(0) - '0')) {
			count++;
		}
		if(num2 == (input.charAt(1) - '0')) {
			count++;
		}
		if(num3 == (input.charAt(2) - '0')) {
			count++;
		}
		if(num4 == (input.charAt(3) - '0')) {
			count++;
		}
		if(num5 == (input.charAt(4) - '0')) {
			count++;
		}
		
		System.out.println("랜덤 수 : "+ num1 + num2 + num3 + num4 + num5);
		System.out.println("입력 수 : " + input);
		System.out.println("같은수 입력 : " + count);
		
		switch (count) {
			case 0:
				System.out.println("상금 : 0원" );
				break;
			case 1:
				System.out.println("상금 : 1만원" );
				break;
			case 2:
				System.out.println("상금 : 10만원" );
				break;
			case 3: case 4: case 5:
				System.out.println("상금 : 100만원" );
				break;
	
			default:
				break;
		}
		
		scan.close();
		
	}	// main

} // class
