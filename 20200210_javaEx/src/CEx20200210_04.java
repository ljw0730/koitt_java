import java.util.Scanner;

public class CEx20200210_04 {
	public static void main(String[] args) {

		// 가위바위보 게임을 만들어 보세요.
		
		int select = 0;
		int user = 0;
		int com = 0;
		
		int game_count = 0;
		int win_count = 0;
		int lose_count = 0;	// 1: 승리 / -1: 패배
		
		int[] win_lose_check = new int[10];
		
		
		Scanner scan = new Scanner(System.in);
				
		Loop1: while(true) {
			System.out.println("=====================================");
			System.out.println("[ 가위 바위 보 게임 ]");
			System.out.println("게임시작[1] / 승패확인[2] / 종료[0]");
			select = scan.nextInt();
			
			if (select == 0) {
				break;
			}
			else if (select == 1) {
				while (game_count < 10) {
					System.out.println("=====================================");
					
					System.out.println((game_count + 1) + "번째 판!!");
					System.out.println("가위! 바위! 보!");
					System.out.printf("가위[1] / 바위[2] / 보[3] / 종료[0] : ");
					user = scan.nextInt();
					
					if(user == 0) {
						break Loop1;
					}
					else if (user < 1 && user > 3) {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
					
					com = (int)(Math.random() * 3) + 1;
					
					switch (user) {
						case 1:
							switch (com) {
								case 1:
									System.out.println("user : 가위 / com : 가위");
									System.out.println("비겼습니다.");
									System.out.println("가위바위보를 다시합니다.");
									continue;
								case 2:
									System.out.println("user : 가위 / com : 바위");
									System.out.println("졌습니다.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
								case 3:
									System.out.println("user : 가위 / com : 보");
									System.out.println("이겼습니다.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
							}
												
							break;
						case 2:
							switch (com) {
								case 1:
									System.out.println("user : 바위 / com : 가위");
									System.out.println("이겼습니다.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
								case 2:
									System.out.println("user : 바위 / com : 바위");
									System.out.println("비겼습니다.");
									System.out.println("가위바위보를 다시합니다.");
									continue;
								case 3:
									System.out.println("user : 바위 / com : 보");
									System.out.println("졌습니다.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
							}
							
							break;
						case 3:
							switch(com) {
								case 1:
									System.out.println("user : 보 / com : 가위");
									System.out.println("졌습니다.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
								case 2:
									System.out.println("user : 보 / com : 바위");
									System.out.println("이겼습니다.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
								case 3:
									System.out.println("user : 보 / com : 보");
									System.out.println("비겼습니다.");
									System.out.println("가위바위보를 다시합니다.");
									continue;
							}
							
							break;
					}	//user switch
				}	//가위바위보 while
				
				System.out.printf("승률 : %.1f %%\n", ((float)(win_count * 100) / game_count));
				
			}	// 게임시작 if
			else if (select == 2) {
				if(win_lose_check[0] == 0) {
					System.out.println("먼저 가위바위보 게임을 진행해 주세요.");
					continue Loop1;
				}
				
				for (int i = 0; i < 10; i++) {
					if(win_lose_check[i] == 1) {
						System.out.println((i+1) + "번째 승부 : 승리");
					}
					else if(win_lose_check[i] == -1) {
						System.out.println((i+1) + "번째 승부 : 패배");
					}
				}
			}
		
		
		}	// 전체 while
		System.out.println("게임을 종료합니다.");
		
	}	// main
} //class
