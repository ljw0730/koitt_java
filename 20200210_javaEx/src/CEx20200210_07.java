import java.util.Scanner;

public class CEx20200210_07 {
	public static void main(String[] args) {
		// 1 ~ 10 카드
		// 배열로 1 ~ 10까지 숫자 카드를 만든다.
		// 컴퓨터의 배열 1 ~ 10까지 숫자카드를 만든다.
		// 컴퓨터 랜덤으로 섞기
		//
		// 자신이 원하는 배열의 숫자 카드를 제시해서
		// 자신이 높으면 승리
		// 같으면 무승부 / 낮으면 패배
		// 승률을 구해보세요.
		
		int[] userCard = new int[10];	// 유저 카드 배열
		int[] comCard = new int[10];	// 컴퓨터 카드 배열
				
		int temp = 0;		//섞기 위한 임시 변수
		int ran_index = 0;	//컴퓨터 카드 배열 섞기 위한 랜덤 인덱스
		
		int set_myCard = 0;		// 내가 낼 카드의 입력을 받는 변수
			
		int game_count = 0;		// 현재 몇판째인가
		int win_count = 0;		// 이긴 횟수
		int draw_count = 0;		// 무승부 횟수
		int lose_count = 0;		// 진 횟수

		int [] win_lose = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < userCard.length; i++) {
			userCard[i] = (i+1);
			comCard[i] = (i+1);
		}
		
		// 컴퓨터 카드 섞기
		for(int i = 0; i < 200; i++) {
			//0 ~ 9까지 배열 index 번호 생성
			ran_index = (int)(Math.random()*10);
			
			temp = comCard[0];
			comCard[0] = comCard[ran_index];
			comCard[ran_index] = temp;
		}
		System.out.println("===============================");
		System.out.println("=========== 카 드 게 임 ===========");
		System.out.println("===============================");
		
		
		while (game_count < 10) {
			System.out.println((game_count + 1) + "번째 게임을 시작합니다.");
			System.out.printf("낼 카드를 선택하세요.(1~10)(종료 - 99) : ");
			set_myCard = scan.nextInt() - 1;
			if(set_myCard == 99) {
				break;
			}
			else if (set_myCard < -1 || set_myCard >10) {
				System.out.println("입력이 잘되었습니다. 다시 선택해 주세요.");
				continue;
			}
			
			if (userCard[set_myCard] == 0) {
				System.out.println("이미 한번 낸 카드입니다. 다시 선택해 주세요.");
				System.out.printf("내실 수 있는 카드는 ");
				for(int i = 0; i < userCard.length; i ++) {
					if (!(userCard[i] == 0)) {
						System.out.printf("%d, ", userCard[i]);
					}
				}
				System.out.printf(" 입니다.\n");
				continue;
			}
			
			if(userCard[set_myCard] > comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("승리");
				win_count++;
				win_lose[game_count] = 1;
				System.out.println("========================================== ");
			}
			else if(userCard[set_myCard] == comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("무승부");
				draw_count++;
				win_lose[game_count] = 0;
				System.out.println("========================================== ");
			}
			else if(userCard[set_myCard] < comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("패배");
				lose_count++;
				win_lose[game_count] = -1;
				System.out.println("========================================== ");
			}
			
			userCard[set_myCard] = 0;
			game_count++;
		}
		
		for(int i = 0; i < win_lose.length; i++) {
			if(win_lose[i] == 1) {
				System.out.println((i+1) + "번째 승부 : 승리");
			}
			else if(win_lose[i] == 0) {
				System.out.println((i+1) + "번째 승부 : 무승부");
			}
			else if(win_lose[i] == -1) {
				System.out.println((i+1) + "번째 승부 : 패배");
			}
		}
		System.out.printf("승리 : %d회 / 무승부 : %d회 / 패배 : %d회\n", win_count, draw_count, lose_count);		
		System.out.printf("승률 : %.1f%%\n", ((float)(win_count*100)/game_count));
			
		System.out.println("게임을 종료합니다.");
		
		scan.close();
		
	}	// main
} //class
