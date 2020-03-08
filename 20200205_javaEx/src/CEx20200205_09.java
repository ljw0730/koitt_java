import java.util.Scanner;

public class CEx20200205_09 {

	public static void main(String[] args) {
	
		// 숫자 2개를 입력받아
		// 입력받은 2개의 단만 빼고 나머지 출력
	
	
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int dan = 0;
	
		Loop1: while(true) { // 단만 출력, 단부터 출력
			System.out.println("구구단 출력형태 선택");
			System.out.println("1) 선택 구구단만 출력");
			System.out.println("2) 선택 구구단부터 출력");
			System.out.println("원하는 매뉴를 선택하세요.(종료 : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break Loop1;
			}
			
			if(!(select >= 1 && select <=2)) {
				System.out.println("숫자를 잘못 입력하였습니다.");
				System.out.println();
				continue Loop1;
			}
			
			while(true) {	// 1번 선택했을 때
				System.out.println("단만 출력하는 것을 선택하셨습니다.");
				System.out.println("원하는 단을 입력하세요. (이전 : 0)");
				dan = scan.nextInt();
				
				if(dan == 0) {
					System.out.println("선택페이지로 이동합니다.");
					System.out.println("--------------------------");
					break;
				}
				
				for(int i = dan; i <= dan; i ++) {
					for (int j = 1; j <=9; j ++) {
						
						
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println("--------------------------");
				}
			}
			
		} // Loop1 while
		
		scan.close();
	}	// main

} // class
