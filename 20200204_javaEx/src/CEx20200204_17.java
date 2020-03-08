import java.util.Scanner;

public class CEx20200204_17 {
	public static void main(String[] args) {
		
		// 입력받은 숫자와 난수비교 4번
		// 당첨되면 입력했던 숫자 보여주기
		// 마지막으로 낙첨 되면 입력했던 숫자 보여주기

		int input_num = 0;	// 입력한 숫자
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int check = (int)(Math.random() * 10) + 1;
		int count = 1;

		Scanner scan = new Scanner(System.in);
	
		while(count <= 4) {
			System.out.println("1-10까지 숫자를 입력하세요.");
			System.out.println("종료하시려면 x, X를 입력해주세요.");
			char input_ch = scan.next().charAt(0);
			
			if(input_ch == 'x' || input_ch =='X') {
				break;
			}
			
			input_num = input_ch - '0';
			
			switch (count) {
				case 1 :
					num1 = input_num;
					break;
				case 2 :
					num2 = input_num;
					break;
				case 3 :
					num3 = input_num;
					break;
				case 4 :
					num4 = input_num;
					break;
			}
			
			if(check == input_num) {
				System.out.printf("당첨입니다. ", check);
				
				switch(count) {
					case 1 :
						System.out.printf(" 입력번호 %d \n", num1);
						break;
					case 2 :
						System.out.printf(" 입력번호 %d %d \n", num1, num2);
						break;
					case 3 :
						System.out.printf(" 입력번호 %d %d %d\n", num1, num2, num3);
						break;
					case 4 :
						System.out.printf(" 입력번호 %d %d %d %d\n", num1, num2, num3, num4);
						break;
				}
				
				
				//무한 루프 while문을 빠져 나옴.
				break;
			}
			else {
				System.out.printf("낙첨되셨습니다. 다시 도전하세요.\n", check);
				if (count == 4) {
					System.out.printf("당첨번호 %d\n입력번호 %d %d %d %d\n", check, num1, num2, num3, num4);
				}
				count++;
			}
		}
		
		System.out.println("시스템이 종료되었습니다.");
		
		scan.close();
	}

}
