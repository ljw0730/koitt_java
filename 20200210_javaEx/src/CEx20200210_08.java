import java.util.Scanner;

public class CEx20200210_08 {
	public static void main(String[] args) {
		// 강사님 ver.
		
		// 1 ~ 10 카드
		// 배열로 1 ~ 10까지 숫자 카드를 만든다.
		// 컴퓨터의 배열 1 ~ 10까지 숫자카드를 만든다.
		// 컴퓨터 랜덤으로 섞기
		//
		// 자신이 원하는 배열의 숫자 카드를 제시해서
		// 자신이 높으면 승리
		// 같으면 무승부 / 낮으면 패배
		// 승률을 구해보세요.
		
		// user_card 낸것을 순차적으로 프린트 해보세요.
		// 중복으로 카드를 내면 중복입니다. 다시 선택하세요.

		int[] user_card = new int[10];	// 유저 카드 10장
		int[] com_card = new int[10];	// 컴퓨터 카드 10장
		
		int com_index = 0;	// 컴카드 배열 순번 변수
		int temp = 0;		//배열 섞을때 쓰는 변수
		
		int user_select_card = 0; // 유저가 선택한 카드
		int win = 0;	// 승리횟수
		int draw = 0;	// 무승부 횟수
		int lose = 0;	// 패배 횟수
		
		// 숫자 1~10 입력
		for(int i = 0; i < 10; i++) {
			user_card[i] = (i+1);	// user 카드 1~10까지 숫자 입력
			com_card[i] = (i+1);	// com 카드 1~10까지 숫자 입력
			
		}
		
		
		//컴퓨터 카드 섞기
		for(int i = 0; i < 200; i ++) {
			com_index = (int)(Math.random()*10); // com_card 배열번호 0~9까지 난수
			
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		
		Scanner scan = new Scanner(System.in);
		
		// user_card 번호 입력 받아 com_card 비교
		for(int i = 0; i < 10; i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10");
			System.out.println("카드 1~10 중 카드 1개를 뽑아주세요.");
			user_select_card = scan.nextInt();
			
			if(user_card[user_select_card - 1]  -  com_card[i] > 0 ) {
				System.out.println((i+1) + "번째 : 승리");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				win++;
				
				for(int j = 0; j < 10; j++) {
					System.out.printf(user_card[i] + " ");
				}
				System.out.println("");
			}
			else if(user_card[user_select_card - 1] == com_card[i]) {
				System.out.println((i+1) + "번째 : 무승부");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				draw++;
				
				for(int j = 0; j < 10; j++) {
					System.out.printf(user_card[i] + " ");
				}
				System.out.println("");
			}
			else {
				System.out.println((i+1) + "번째 : 패배");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				lose++;
			}	//if
		}	//for
		
		System.out.printf("승률 : %.1f%%\n", (float)win/10*100);
		
		scan.close();
		
	}	// main
} //class
