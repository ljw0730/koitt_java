import java.util.Scanner;

public class CEx20200203_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 첫 번째 숫자를 입력하세요.");
		int input1 = scan.nextInt();
		System.out.println("원하는 두 번재 숫자를 입력하세요.");
		int input2 = scan.nextInt();
		
		int sum = input1 + input2;
		int minus = input1 - input2;
		double g1 = input1 * input2;
		double di = input1 / input2;
		
		System.out.println("두수의 합 : " + sum);
		System.out.println("두수의 차 : " + minus);
		System.out.println("두수의 곱 : " + g1);
		System.out.println("두수의 나누기 : " + di);
		
		scan.close();
		
	}
}
