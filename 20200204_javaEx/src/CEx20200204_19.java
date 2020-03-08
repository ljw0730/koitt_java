import java.util.Scanner;

public class CEx20200204_19 {

	public static void main(String[] args) {

		
		int check = 1;	// 프로그램 종료하는 체크숫자
		int input = 0;	// 원하는 숫자 맞추기 입력 값
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("0을 입력하면 프로그램이 종료됩니다.");
		check = scan.nextInt();
		
		do {
			
			System.out.printf("1~10 까지 원하는 숫자를 입력하세요. : ");
			input = scan.nextInt(); // 1 ~ 10 까지의 숫자입력

			System.out.printf("입력한 숫자 : %d\n", input);
			
		} while(!(check == 0));
			
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
		
	} // main
} // class
