import java.util.Scanner;

public class CEx20200210_05 {
	public static void main(String[] args) {

		// 가위바위보 게임을 만들어 보세요.
		
		int select = 0;	//첫번째 선택변수
		int count = 10;
		int user = 0;	//user가 낸 가위바위보 변수
		int com = 0;	//com 이 낸 가위바위보 변수
		int win = 0;	// 승리 횟수 변수
		int draw = 0;	// 무승부 횟수 변수
		int lose = 0;	// 패배 횟수 변수
		
		String[] confirm = new String[10];	//승패확인
		
		Scanner scan = new Scanner(System.in);
		
		while(true ) {
			System.out.println("-----------------------------------");
			System.out.println("[가위바위보 게임/승패확인 프로그램]");
			System.out.println("-----------------------------------");
			System.out.println(" 1) 가위바위보 게임   2) 승패확인");
			System.out.println("번호를 선택해 주세요.(종료 : 0)");
			
			select = scan.nextInt();
			if(select == 0) {
				break;
			}
			
			switch(select) {
				case 1:
					System.out.println("가위바위보 START");
					
					break;
					
				case 2:
					System.out.println("승패확인 START");
					break;
			}
		}
		
	}	// main
} //class
