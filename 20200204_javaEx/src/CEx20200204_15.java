import java.util.Scanner;

public class CEx20200204_15 {
	public static void main(String[] args) {
		
		int input_num = 0;	// 입력한 숫자
		int input_num2 = 0;	
		int check = (int)(Math.random() * 100) + 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("1-100까지 숫자를 입력하세요.");
		input_num = scan.nextInt();
		if(check == input_num) {
			System.out.printf("당첨입니다. 당첨번호 %d", check);
			System.out.printf("\n입력번호 %d, %d\n", input_num, input_num2);
		}
		
		System.out.println("1-100까지 숫자를 입력하세요.");
		input_num2 = scan.nextInt();
		if(check == input_num2) {
			System.out.printf("당첨입니다. 당첨번호 %d", check);
			System.out.printf("\n입력번호 %d, %d\n", input_num, input_num2);
		}
		else {
			System.out.printf("낙첨되셨습니다. 당첨번호 %d", check);
			System.out.printf("\n입력번호 %d, %d\n", input_num, input_num2);
		}
		
		System.out.println("시스템이 종료되었습니다.");
		
		scan.close();
		
	}
}
