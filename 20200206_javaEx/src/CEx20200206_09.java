import java.util.Scanner;

public class CEx20200206_09 {
	public static void main(String[] args) {
		// 가위바위보 게임
		// 컴퓨터의 랜덤으로 가위바위보 게임 진행
		// 가위1 / 바위2 / 보3
		// 10번 진행 (시간되면 입력 받은 횟수로 진행)
		// 이김 -> 승리 / 무승부 -> 무승부 / 짐 -> 패배 출력
		// 몇번 승리 했는지 출력
		
		int my_hand = 0;		//내가 내는 가위바위보
		int com_hand = 0;		// 컴퓨터가 내는 가위바위보
		
		String yn = "";				// 게임을 더 할것인지?
		
		int game_count = 0;		// 몇판할건지?
		int gaming_count = 0;	// 현재몇판째인지
		int win_count = 0;		// 이긴 횟수
		int tie_count = 0;		// 무승부 횟수	// 무승부 없음
		int defeat_count = 0;	//진 횟수
		String win_defeat = "";	// 1 : 승리 2 : 패배
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) {
			System.out.println("[ 가위! 바위! 보!!! 게임 ]");
			System.out.printf("몇번 하실건지 정해 주세요.(종료 : 0) : ");
			game_count = scan.nextInt();
			if(game_count == 0 ) {
				break;
			}
			System.out.println(game_count + "번의 가위바위보 게임을 진행합니다.");
			
			while(gaming_count < game_count) {
				System.out.println("====================================");
				System.out.println("가위바위보를 시작 합니다.");
				System.out.println((gaming_count+1) + "번째 판");
				System.out.printf("가위! 바위! 보!!! (종료 : 0) : ");
				my_hand = scan.nextInt();
				if(my_hand == 0) {
					break Loop1;
				}
				else if((my_hand < 1 || my_hand >3)) {
					System.out.println("가위바위보가 아니잖아요. 다시내세요.");
					continue;
				}
				
				com_hand = (int)(Math.random()*3)+1;
				
				System.out.println(com_hand);
				
				switch (my_hand) {
					case 1:
						switch(com_hand) {
							case 1:
								System.out.println("나는 가위! 상대도 가위!");
								System.out.println("비겼습니다. 다시할게요.");
								continue;
							case 2:
								System.out.println("나는 가위! 상대는 바위!");
								System.out.println("졌습니다.");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
							case 3:
								System.out.println("나는 가위! 상대는 보!");
								System.out.println("이겼습니다.");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
						}
						break;
						
					case 2:
						switch(com_hand) {
						case 1:
							System.out.println("나는 바위! 상대는 가위!");
							System.out.println("이겼습니다.");
							win_count++;
							gaming_count++;
							win_defeat += "1";
							break;
						case 2:
							System.out.println("나는 바위! 상대도 바위!");
							System.out.println("비겼습니다. 다시할게요.");
							continue;
						case 3:
							System.out.println("나는 바위! 상대는 보!");
							System.out.println("졌습니다.");
							defeat_count++;
							gaming_count++;
							win_defeat += "2";
							break;
							
						}
						break;
						
					case 3:
						switch(com_hand) {
						case 1:
							System.out.println("나는 보! 상대는 가위!");
							System.out.println("졌습니다.");
							defeat_count++;
							gaming_count++;
							win_defeat += "2";
							break;
						case 2:
							System.out.println("나는 보! 상대는 바위!");
							System.out.println("이겼습니다.");
							win_count++;
							gaming_count++;
							win_defeat += "1";
							break;
						case 3:
							System.out.println("나는 보! 상대도 보!");
							System.out.println("비겼습니다. 다시할게요.");
							continue;
						}
						break;
				}
							
			}
			
			
			System.out.println("====================================");
			for(int i = 0; i < gaming_count; i++) {
				if(win_defeat.charAt(i) == '1') {
					System.out.println((i+1) + "번재 판 : 승리");
				}
				else if (win_defeat.charAt(i) == '2') {
					System.out.println((i+1) + "번재 판 : 패배");
				}
				
			}
			
			System.out.println("전적 - 승리: " + win_count + " 패배: " + defeat_count);
			int winning_rate = (win_count * 100) / game_count;
			System.out.println("승률은 " + winning_rate + "% 입니다.");
			
			
			while(true) {
				System.out.println("다시 가위바위보를 하시겠습니까?(Y/N)");
				yn = scan.next();
				
				//equalsIgnoreCase : 대소문자 상관없이 비교
				if(yn.equalsIgnoreCase("y")) {
					
					//변수 초기화
					game_count = 0;
					gaming_count = 0;	
					win_count = 0;		
					tie_count = 0;		
					defeat_count = 0;	
					win_defeat = "";
					yn = "";
					
					continue Loop1;
				}
				else if(yn.equalsIgnoreCase("n")) {
					break Loop1;
				}
				else {
					System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				}
			}
		}
		
		System.out.printf("가위바위보 게임을 종료합니다.");
		
		scan.close();
		
	}	//main
}	// class
	
