import java.util.Scanner;

public class CEx20200205_05 {

	public static void main(String[] args) {
	
		// 입력을 받아 입력받은 수를 포함 이후 구구단만 출력
		// 1~9 사이만 입력 받기
	
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요.(1~9 / 0:종료) : ");
		int input = scan.nextInt();
	
		Loo1: while(true) {
			if(input == 0) {
				break;
			}
			else if(input <= 1 || input >= 9) {
				System.out.print("단수를 다시 입력하세요 (1~9 / 0:종료) : ");
				input = scan.nextInt();
				if(input == 0) {
					break;
				}
			}
			else {
				for (int i = 2; i <= 9; i++) {
					if (i < input) {
						continue;
					}
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println("--------------------------");
					
					if(i == 9) {
						break Loo1;
					}
				}
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}

}
