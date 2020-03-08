import java.util.Scanner;

public class CEx20200205_07 {

	public static void main(String[] args) {
	
		// 입력을 받아 입력받은 수를 포함 이후 구구단만 출력
		// 1~9 사이만 입력 받기
		// 강사님 ver.
	
		Scanner scan = new Scanner(System.in);
		int dan = 0;
	
		
		
		while(true) {
			System.out.println("출력하고 싶은 단을 입력하세요.(종료 : 0)");
		
			dan = scan.nextInt();
			
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(!(dan >= 1 && dan <= 9)) {
				System.out.print("1에서 9까지의 숫자를 입력하세요. : ");
				continue; // 1~9까지 수가 아니면 다시 while실행
			}
			
			for(int i = dan; i <= 9; i ++) {
				for (int j = 1; j <=9; j ++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println("--------------------------");
			}
			
			break;
		}
		
		scan.close();
	}	// main

} // class
