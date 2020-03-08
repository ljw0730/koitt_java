import java.util.Scanner;

public class CEx20200204_16 {

	public static void main(String[] args) {
		
		int input_num = 0;	// 입력한 숫자
		int check = (int)(Math.random() * 10) + 1;

		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.println("1-10까지 숫자를 입력하세요.");
			System.out.println("종료하시려면 x, X를 입력해주세요.");
			char input_ch = scan.next().charAt(0);
			
			if(input_ch == 'x' || input_ch =='X') {
				break;
			}
			
			input_num = input_ch - '0';
			
			if(check == input_num) {
				System.out.printf("당첨입니다. 당첨번호 %d", check);
				System.out.printf("\n입력번호 %d\n", input_num);
				
				//무한 루프 while문을 빠져 나옴.
				break;
			}
			else {
				System.out.printf("낙첨되셨습니다. 다시 도전하세요.\n", check);
			}
		}
		
		System.out.println("시스템이 종료되었습니다.");
		
		scan.close();
		
	}

}
