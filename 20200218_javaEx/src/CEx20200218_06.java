import java.util.Scanner;

public class CEx20200218_06 {

	public static void main(String[] args) {
		//  Lotto_num , Lotto_user_num class 와 연결됨
		
		// 로또당첨번호 당첨번호 6개, 보너스 번호(랜덤) 
		// 내가 입력한 번호 class	입력번호 6개, 일치개수, 등수, 금액 
		// 입력 > 회차입력 > 번호6자리 입력
		// 회차 검색해서 -> 몇개 일치하는지? 등수 몇등인지? 금액은 얼마인지?
		// 1등 10억-6개, 2등 1억-5개보너스1개, 3등 1천만-5개, 4등 1십만-4개, 5등 1만-3개
		// 옵션 : 금액 - 1판에 1천원 / 초기자금 1만원
		
		// 로또번호 배열 생성
		// 로또번호 1~45 입력
		// 로또번호 랜덤으로 섞기
		// 입력하는 번호 객체 10개 생성
		// 입력 10개 받음
		// 출력
		
		
		// 로또번호 배열 생성
		int[] lotto = new int[45];
		int same = 0;
		
		
		//입력하는 번호 객체 10개 생성
		Lotto_user[] user = new Lotto_user[10];
		
		Scanner scan = new Scanner(System.in);
		
		// 로또번호 1~45 입력
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		
		// 로또번호 랜덤으로 섞기
		shuffle(lotto);
		
		//번호입력 
		for(int i = 0; i < user.length; i++) {
			//입력하는 번호 객체 10개 생성
			user[i] = new Lotto_user();
			for(int j = 0; j < 6; j++) {
				System.out.println((i+1) + "번째 " + (j+1) + "번 로또번호를 입력해 주세요.");
				user[i].lotto_num[j] = scan.nextInt();
				
				// 로또번호와 입력번호를 일치비교
				if(lotto[i] == user[i].lotto_num[j]) {
					same++;
				}
			}
			
			user[i].same_num = same;
			
			switch(same) {
				case 0:
					user[i].rank = 7;
					user[i].reward = 0;
					break;
				case 1:
					user[i].rank = 6;
					user[i].reward = 0;
					break;
				case 2:
					user[i].rank = 5;
					user[i].reward = 0;
					break;
				case 3:
					user[i].rank = 4;
					user[i].reward = 10000;
					break;
				case 4:
					user[i].rank = 3;
					user[i].reward = 10000000;
					break;
				case 5:
					user[i].rank = 2;
					user[i].reward = 100000000;
					break;
				case 6:
					user[i].rank = 1;
					user[i].reward = 1000000000;
					break;
				
			} //switch
		} //for
		
		System.out.println("로또번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println(" 보너스 번호 : " + lotto[6]);
		
		System.out.println("입력번호 10번");
		for(int i = 0; i < user[i].lotto_num.length; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("입력번호 : " + user[i].lotto_num[j] + " ");
			}
			System.out.print("일치개수 : " + user[i].same_num + " ");
			System.out.print("등수 : " + user[i].rank + " ");
			System.out.print("상금 : " + user[i].reward + " ");
			System.out.println();
		}
		
		
		
		
		
//		int[] ball = new int[45];
//		int[] lotto = new int [7];
//		
//		int game_count = 3;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		// 로또번호 뽑기
//		lotto_num(ball, lotto);
//		
//		Lotto_user[] user = new Lotto_user[3];
//		
//		// user 입력
//		//user_input(user, scan);
//		
//		//
//		
//		
////		for(int i = 0; i < game_count; i++) {
////			for(int j = 0; j < user.user[i].length; j++) {
////				System.out.print((i+1) + "차 게임 - " + (j+1) + "번째 번호를 입력해 주세요. : ");
////				user.user[i][j] = scan.nextInt();
////			}
////			System.out.println();
////			System.out.println("=======================================");
////		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.print("로또 번호 : ");
//		for(int i = 0; i < lotto.length-1; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.print(" / 보너스 : " + lotto[6]);
		
		
		
	}	//main
	
	// 섞기 메소드
	static void shuffle(int[] lotto) {
		
		int temp = 0;
		int num = 0;
		
		for(int i = 0; i < 200; i++) {
			num = (int)(Math.random()*45);
			
			temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
	}
	
	
	
	
	
	
//	static void lotto_num(int[] ball, int[] lotto) {
//		int temp = 0;
//		int ball_index = 0;
//		
//		for(int i = 0; i < ball.length; i++) {
//			ball[i] = i+1;
//		}
//		
//		for(int i = 0; i < 200; i++) {
//			ball_index = (int)(Math.random()*45);
//			
//			temp = ball[0];
//			ball[0] = ball[ball_index];
//			ball[ball_index] = temp;
//		}
//		
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = ball[i];
//		}
//	}
//	
//	static void user_input(Lotto_user_num user, Scanner scan) {
//		
//	}
	
}	// class

