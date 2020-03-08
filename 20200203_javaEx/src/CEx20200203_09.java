import java.util.Scanner;

public class CEx20200203_09 {

	public static void main(String[] args) {
		// 숫자 7개를 한번에 받아서 2547312
		// 첫번째 숫자 : 2
		// 두번째 숫자 : 5
		// ...
		// 각각의 숫자를 더해 보세요.
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		String str = input + "";
		
		int input1 = str.charAt(0) - '0';
		int input2 = str.charAt(1) - '0';
		int input3 = str.charAt(2) - '0';
		int input4 = str.charAt(3) - '0';
		int input5 = str.charAt(4) - '0';
		int input6 = str.charAt(5) - '0';
		int input7 = str.charAt(6) - '0';
		
		int sum = input1 + input2 + input3 + input4 + input5 + input6 + input7;
		int cha = input1 - input2 - input3 - input4 - input5 - input6 - input7;
		int g1 = input1 * input2 * input3 * input4 * input5 * input6 * input7;
		int di = input1 / input2 / input3 / input4 / input5 / input6 / input7;
		
		System.out.println("숫자의 합 : " + sum);
		System.out.println("숫자의 차 : " + cha);
		System.out.println("숫자의 곱 : " + g1);
		System.out.println("숫자의 나누기 : " + di);
		
		scan.close();
		
	}
	
}
