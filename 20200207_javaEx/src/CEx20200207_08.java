import java.util.Scanner;

public class CEx20200207_08 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 블랙커피 (커피 10)
		// 흑당커피 (커피 7 설탕 5)
		// 카페라떼	(커피 5 우유 5)
		// 밀크커피 (커피 4 우유 3 설탕 2)
		// 현재 자판기에는 커피 100, 설탕 50, 우유 70 들어있음
		// 9) 관리자 모드 (로그인, 현재 잔여량 표시)
		// 눌렀을때 자판기 잔여량이 없으면
		// "현재 재료가 부족한 상태입니다. 관리자에게 연락해주세요."
		
		final int COFFEE1 = 100;
		final int COFFEE2 = 300;
		final int COFFEE3 = 200;
		final int COFFEE4 = 100;
		
		int input_money = 0;
				
		String id = "aaa";
		String pw = "123";
		String input_id = "";
		String input_pw = "";
		int login_count = 0;
		
		int ja_coffee = 100;
		int ja_sugar = 50;
		int ja_milk = 70;
		
		int charge = 0;
		
		int select = 0;
		int sell_count = 0;
		int sell_won = 0;
		
		String coffee1 = "블랙커피";
		String coffee2 = "흑당커피";
		String coffee3 = "카페라떼";
		String coffee4 = "밀크커피";
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" [ 커 피 자 판 기 ]");
		
		Loop1:
		while(true) {
			System.out.printf("돈을 넣어주세요. : ");
			input_money += scan.nextInt();
			
			if(input_money >= COFFEE1) {
				System.out.println("1) " + coffee1);
			}
			
			if(input_money >= COFFEE2) {
				System.out.println("2) " + coffee2);	
			}
			
			if(input_money >= COFFEE3) {
				System.out.println("3) " + coffee3);
			}
			
			if(input_money >= COFFEE4) {
				System.out.println("4) " + coffee4);
			}
			
			System.out.println("9) 관리자 모드");
			System.out.println("0) 판매종료");
			
			select = scan.nextInt();
			
			if(select == 0) {
				break;
			}
			
			switch (select) {
				case 1 :
					if(ja_coffee < 10) {
						System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
						break;
					}
					ja_coffee -= 10;
					sell_count++;
					sell_won += COFFEE1;
					input_money -= COFFEE1;
					System.out.println("블랙커피가 나왔습니다.");
					System.out.println("현재 잔액은 " + input_money + "원 입니다.");
					break;
				case 2 :
					if(ja_coffee < 7 || ja_sugar < 5) {
						System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
						break;
					}
					ja_coffee -= 7;
					ja_sugar -= 5;
					sell_count++;
					sell_won += COFFEE2;
					input_money -= COFFEE2;
					System.out.println("흑당커피가 나왔습니다.");	
					System.out.println("현재 잔액은 " + input_money + "원 입니다.");
					break;
				case 3 :
					if(ja_coffee < 5 || ja_milk < 5) {
						System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
						break;
					}
					ja_coffee -= 5;
					ja_milk -= 5;
					sell_count++;
					sell_won += COFFEE3;
					input_money -= COFFEE3;
					System.out.println("카페라떼가 나왔습니다.");
					System.out.println("현재 잔액은 " + input_money + "원 입니다.");
					break;
				case 4 :
					if(ja_coffee < 4 || ja_sugar < 2 || ja_milk < 3) {
						System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
						break;
					}
					ja_coffee -= 4;
					ja_sugar -= 2;
					ja_milk -= 3;
					sell_count++;
					sell_won += COFFEE4;
					input_money -= COFFEE4;
					System.out.println("밀크커피가 나왔습니다.");
					System.out.println("현재 잔액은 " + input_money + "원 입니다.");
					break;
					
				case 9 :
					System.out.println("관리자 모드입니다. 로그인을 해주세요.");
					Loop2:
					while (true) {
						if(login_count >= 5) {
							System.out.println("로그인 시도를 5번 실패 하셨습니다.");
							break Loop1;
						}
						
						System.out.printf("아이디 : ");
						input_id = scan.next();
						if(!(input_id.equals(id))) {
							login_count++;
							System.out.println("아이디가 일치하지 않습니다. 로그인 실패 횟수 : " + login_count);
							continue;
						}
						
						while(true) {
							if(login_count >= 5) {
								System.out.println("로그인 시도를 5번 실패 하셨습니다.");
								break Loop1;
							}
							
							System.out.printf("패스워드 : ");
							input_pw = scan.next();
							if(!(input_pw.equals(pw))) {
								login_count++;
								System.out.println("패스워드가 일치하지 않습니다. 로그인 실패 횟수 : " + login_count);
								continue;
							}
							else {
								break  Loop2;
							}
						}// 패스워드 while
				
					} //관리자 로그인 while
					
					admin: while(true) {
						System.out.println("===============");
						System.out.println("  관리자 모드  ");
						System.out.println("===============");
						
						System.out.println("1) 재고/판매량");
						System.out.println("2) 재료보충");
						System.out.println("9) 이전단계");
						System.out.println("0) 판매종료");
						select = scan.nextInt();
						
						switch (select) {
							case 1:
								System.out.println("---------------");
								System.out.println("[ 전체 재고량 ]");
								System.out.println("---------------");
								System.out.println("커피 " + ja_coffee + "g 설탕 " + ja_sugar + "g 우유 " + ja_milk +"g");
												
								System.out.println("총판매수 : " + sell_count + "잔");
								System.out.println("* 총판매금액 : " + sell_won + "원");
								break;
							case 2:
								System.out.println("---------------");
								System.out.println("[  재료 보충  ]");
								System.out.println("---------------");
								
								System.out.printf("커피를 얼마나 보충하시겠습니까? : ");
								charge = scan.nextInt();
								ja_coffee += charge;
								System.out.println("현재 커피량 : " + ja_coffee + "g");
								System.out.printf("설탕를 얼마나 보충하시겠습니까? : ");
								charge = scan.nextInt();
								ja_sugar += charge;
								System.out.println("현재 설탕량 : " + ja_sugar + "g");
								System.out.printf("우유를 얼마나 보충하시겠습니까? : ");
								charge = scan.nextInt();
								ja_milk += charge;
								System.out.println("현재 설탕량 : " + ja_milk + "g");
								
								break;
							case 9 :
								continue Loop1;
							case 0 :
								break Loop1;
	
						} //관리자 모드 switch
					} // 관리자 모드 while
			} //switch
			
		}	//Loop1 while
		
		System.out.println("판매를 종료합니다.");
		
		scan.close();
	}	//main

}	//class
