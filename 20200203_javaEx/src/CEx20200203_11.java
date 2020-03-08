import java.util.Scanner;

public class CEx20200203_11 {
	
	public static void main(String[] args) {
		// 3번의 숫자를 입력 받아서 printf 를 사용하여
		// 5+4+2 = 11
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자 : ");
		int input1 = scan.nextInt();
				
		System.out.printf("두번째 숫자 : ");
		int input2 = scan.nextInt();
				
		System.out.printf("세번째 숫자 : ");
		int input3 = scan.nextInt();
				
		System.out.printf("세수의 합은 : %d + %d + %d = %d%n",
				          input1, input2, input3
				          , input1 + input2 + input3);
		
		System.out.printf("세수의 차는 : %d - %d - %d = %d%n",
						  input1, input2, input3
						  , input1 - input2 - input3);
		
		double d = input1 / input2 / input3;
		
		System.out.printf("세수의 나눗셈은 : %.2f", d);
		
		scan.close();
		
		
	}
}
