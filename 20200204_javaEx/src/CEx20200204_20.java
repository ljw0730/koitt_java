import java.util.Scanner;

public class CEx20200204_20 {

	public static void main(String[] args) {
		// 1 ~ 100 난수
		// 입력값과 난수 비교
		// 입력값이 크면 '랜덤 숫자는 입력값 보다 작습니다.'
		// 입력값이 작으면 '랜덤 숫자는 입력값 보다 큽니다.'
				
		int input = 0;
		int min = 1;
		int max = 100;
		
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 100)+1;
		
		System.out.println("===== Up/Down 게임 (1~100) ====="); 
		
		while(true) {
			System.out.printf("숫자를 입력해주세요 : ");
			input = scan.nextInt();
			
			if(input > max) {
				System.out.println("전의 입력 보다 큰수를 입력하였습니다.");
				continue;
			}
			if(input < min) {
				System.out.println("전의 입력 보다 작은수를 입력하였습니다.");
				continue;
			}
			
			if (input > ran) {
				System.out.println("랜덤 숫자는 입력값 보다 작습니다.");
				
				max = input;
			}
			else if (input < ran) {
				System.out.println("랜덤 숫자는 입력값 보다 큽니다.");
				
				min = input;
			}
			else if (input == ran){
				System.out.println("정답입니다.");
				break;
			}
		} //while
		
		System.out.println("게임을 종료합니다.");
		
		scan.close();
		
	} // main
} // class
