import java.util.Scanner;

public class CEx20200226_07 {

	public static void main(String[] args) {
		// Card, Deck class와 연결되어 있음
		
		// 카드게임 프로그램
		// 1. 카드게임 시작 -> user, com각 3장
		// 2. 1장씩 추가 -> user, com 각 1장 추가
		//    각 7장 된 경우 끝
		// 3. 종료
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		final int GET_CARD_NUM = 7;
		
		Deck d = new Deck();
		
		Card[] user = new Card[GET_CARD_NUM];
		Card[] com = new Card[GET_CARD_NUM];
		int user_com_card_count = 0;
		
			
		int[] card_count = new int[1];
		card_count[0] = 0;
		
		int[] user_kind_count = new int[] { 0, 0, 0, 0 };
		int[] com_kind_count = new int[] { 0, 0, 0, 0 };

		
		Loop1: while(true) {
			select = mainPrint(scan);
			
			switch (select) {
				case 1:
					System.out.println("카드게임을 시작 합니다.");
					d.shuffle();			
					System.out.println("카드 3장을 드립니다.");
					take_first_card(d, user, card_count);
					take_first_card(d, com, card_count);
					user_com_card_count = 3;
					System.out.println("user");
					print(user);
					System.out.println("com");
					print(com);
					
					break;
	
				case 2:
					if(user_com_card_count >= 7) {
						System.out.println("7장 모두 받으셨습니다.");
						System.out.println("----------------------");
						break;
					}
					take_one(d, user, user_com_card_count, card_count);
					take_one(d, com, user_com_card_count, card_count);
					user_com_card_count++;
					System.out.println("user");
					print(user);
					System.out.println("com");
					print(com);
					
					break;
					
				case 3:
					System.out.println("user");
					check_card(user, user_kind_count);
					System.out.println("com");
					check_card(com, com_kind_count);
					
					
					break;
				
				case 4:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
			
		}

	} //main
	
	static int mainPrint (Scanner scan) {
		int select = 0;
		System.out.println("[ 카드게임 프로그램 ]");
		System.out.println(" 1. 카드게임 시작");
		System.out.println(" 2. 1장씩 추가");
		System.out.println(" 3. 카드종류개수체크");
		System.out.println(" 4. 종료");
		System.out.print(" 원하는 번호를 입력해 주세요. : ");
		select = scan.nextInt();
		scan.nextLine();
		System.out.println("=================================");
		
		return select;
	}
	
	static void take_first_card(Deck d, Card[] c, int[] card_count) {
		for(int i = 0; i < 3; i++) {
			c[i] = new Card();
			c[i] = d.pick(card_count[0]);
			card_count[0]++;
		}
	}
	
	static void take_one(Deck d, Card[] c, int user_com_card_count, int[] card_count) {
		c[user_com_card_count] = new Card();
		c[user_com_card_count] = d.pick(card_count[0]);
		card_count[0]++;
	}
	
	static void check_card(Card[] c, int[] kind_count) {
		for(int i = 0; i < c.length; i++) {
			switch(c[i].kind) {
				case Card.CLOVER:
					kind_count[0]++;
					break;
					
				case Card.HEART : 
					kind_count[1]++;
					break;
					
				case Card.DIAMOND : 
					kind_count[2]++;
					break;
					
				case Card.SPADE : 
					kind_count[3]++;
					break;
			}
		}
		
		System.out.println("CLOVER : " + kind_count[0]	+ " / HEARD : " + kind_count[1]
							+ " / Diamond : " + kind_count[2] + " / SPADE : " + kind_count[3]);
		System.out.println("----------------------");
	}
	
	static void print(Card[] c) {
		for(int i = 0; i < c.length; i++) {
			if(c[i] != null) {
				System.out.println(c[i]);
			}
		}
		System.out.println("-------------------");
	}

}	//CEx20200226_07 class
