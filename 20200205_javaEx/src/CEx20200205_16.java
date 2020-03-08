import java.util.Scanner;

public class CEx20200205_16 {

	public static void main(String[] args) {
		// for문을 사용해서 합계
		// 5의 배수만 제외해서 숫자의 합을 구하는 프로그램
		// 입력 2개를 받아서 (ex 2와 40 -> 5의 배수는 재외하고
		// 합계를 구하시오.
		// 총 몇번 더하기를 했는지 함께 출력을 해보세요.
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 :
		while(true) {
			sum = 0;
			count = 0;
			
			System.out.println("A에서 B까지의 합계(5의 배수제외)");
			System.out.println("두개의 수를 입력 하세요.(종료 : 0)");
			System.out.printf("첫 번째 수 : ");
			num1 = scan.nextInt();
			
			if(num1 == 0) {
				break;
			}
			
			while(true) {
				System.out.printf("두 번째 수 : ");
				num2 = scan.nextInt();
				if(num1 == 0) {
					break Loop1;
				}
				
				if(num2 <= num1) {
					System.out.println("두 번재 수가 첫 번재 수보다 작습니다.");
				} else {
					break;
				}
			}
			
			for(int i = num1; i <= num2; i++) {
				if(i % 5 == 0) {
					continue;
				}
				sum += i;
				count++;
			}
			
			System.out.println("총 " + count + "번의 합이 있었으며,");
			System.out.println(num1 + "에서 " + num2 + "까지의 5의배수를 제외한 합은 " + sum + "입니다.");
			System.out.println("------------------------------------------");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
	}	// main

} // class
