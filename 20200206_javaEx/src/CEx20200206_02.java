import java.util.Scanner;

public class CEx20200206_02 {
	public static void main(String[] args) {
		// 1. 쇼핑몰 화면 구현
		// 2. 번호 입력
		// 3. 제품을 구매
		//    잔고가 제품금액과 비교
		//    잔고에서 제품 금액 을뺀다.
		// 4. 구매목록 저장
		// 5. 잔고, 구매금액 출력
		
		int select = 0;
		
		int my_bank = 5000000;	// 초기금액
		int charge = 0;			// 충전금액
		int point = 0;			// 적립 포인트
		int using_money = 0;	// 사용한 금액
		
		int product1_won = 1300000;	// 컴퓨터 가격
		int product2_won = 990000;	// TV 가격
		int product3_won = 880000;	// 스마트폰 가격
		
		String product1 = "컴퓨터";
		String product2 = "TV";
		String product3 = "스마트폰";
		
		int product1_count = 0;
		int product2_count = 0;
		int product3_count = 0;
		String product_count_str = "";
			
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {
			System.out.println(" ============================= ");
			System.out.println(" [ 이X트 쇼핑몰 ] ");
			System.out.printf(" 1) %s (%d원)\n", product1, product1_won);
			System.out.printf(" 2) %s (%d원)\n", product2, product2_won);
			System.out.printf(" 3) %s (%d원)\n", product3, product3_won);
			System.out.println(" 4) 충전");
			System.out.println(" 5) 사용금액 / 잔액 / 포인트 확인");
			System.out.println(" 7) 포인트 전환");
			System.out.println(" 0) 종료");

			select = scan.nextInt();
			if(select == 0) {
				break;
			}
			
			switch (select) {
				case 1:
					if(my_bank < product1_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product1 + "을 1대 구매하셨습니다.");
					System.out.println(product1 + "을 1대 가격은 " + product1_won + "원 입니다.");
					product1_count++;
					my_bank -= product1_won;
					point += (product1_won * 0.02);
					using_money += product1_won;
					break;
	
				case 2:
					if(my_bank < product2_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product2 + "을 1대 구매하셨습니다.");
					System.out.println(product2 + "을 1대 가격은 " + product2_won + "원 입니다.");
					product2_count++;
					my_bank -= product2_won;
					point += (product2_won * 0.02);
					using_money += product2_won;
					break;
					
				case 3:
					if(my_bank < product3_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product3 + "을 1대 구매하셨습니다.");
					System.out.println(product3 + "을 1대 가격은 " + product3_won + "원 입니다.");
					product3_count++;
					my_bank -= product3_won;
					using_money += product3_won;
					point += (product3_won * 0.02);
					break;
					
				case 4:
					System.out.println("얼마의 금액을 충전 하시겠습니까?");
					charge = scan.nextInt();
					if(charge == 0) {
						continue Loop1;
					}
					
					my_bank += charge;
					System.out.println(charge + "원을 충전하셨습니다.");
					break;
				case 5:
//					System.out.printf("현재 잔액 : %d원\n", my_bank);
					System.out.printf("현재까지 사용한 금액 : %d원\n", using_money);
//					System.out.printf("현재 포인트 : %dP\n", point);
					break;
				case 7:
					System.out.printf("현재 포인트 : %dP\n", point);
					System.out.println("현재포인트를 돈으로 전환합니다.");
					my_bank += point;
					point = 0;
					break;
			}
			
			if(select >=1 && select <= 3) {
				product_count_str = "총 ";
				if(product1_count > 0) {
					product_count_str = product_count_str + product1 + product1_count + "대 ";
				}
				if(product2_count > 0) {
					product_count_str = product_count_str + product2 + product2_count + "대 ";
				}
				if(product3_count > 0) {
					product_count_str = product_count_str + product3 + product3_count + "대 ";
				}
				System.out.println(product_count_str + "를 구매하셨습니다.");
			}
			
			
			System.out.println(" ============================= ");
			System.out.println("현재 잔액은 " + my_bank + "원 입니다.");
			System.out.println("현재 포인트 " + point + "P 입니다.");
			
		}
		
		
		System.out.println(" ============================= ");
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	
}
