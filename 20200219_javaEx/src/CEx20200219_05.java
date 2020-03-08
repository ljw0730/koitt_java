import java.util.Scanner;

public class CEx20200219_05 {
	
	public static void main(String[] args) {
		// 팩토리얼 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		long result = 0;
		System.out.print("원하는 숫자를 입력해 주세요 : ");
		
		result = factorial(scan.nextInt());
		System.out.println("결과 값 : " + result);
		
	}	// main
	
	static long factorial(int n) {
		long result = 0L;
		if(n == 1) {
			result = 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
}	//class

