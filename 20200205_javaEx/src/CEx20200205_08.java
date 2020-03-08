import java.util.Scanner;

public class CEx20200205_08 {

	public static void main(String[] args) {
	
		// 숫자 2개를 입력받아
		// 입력받은 2개의 단만 빼고 나머지 출력
		// 강사님 ver.
	
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		int dan2 = 0;
	
		while(true) {
			System.out.println("출력하고 싶은 않은 2개의 단을 입력하세요.(종료 : 0)");
			System.out.println("첫번째 숫자 : ");
			dan = scan.nextInt();
			
			System.out.println("두번째 숫자 : ");
			dan2 = scan.nextInt();
			
			if(dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(!(dan >= 1 && dan <= 9)) {
				System.out.print("1에서 9까지의 숫자를 입력하세요. : ");
				continue; // 1~9까지 수가 아니면 다시 while실행
			}
			
			for(int i = 2; i <= 9; i ++) {
				for (int j = 1; j <=9; j ++) {
					if(i == dan || i == dan2) {
						continue;
					}
					
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println("--------------------------");
			}
			
			break;
		}
		
		scan.close();
	}	// main

} // class
