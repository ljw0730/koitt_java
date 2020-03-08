import java.util.Scanner;

public class CEx20200206_03 {
	public static void main(String[] args) {
		// 1. 쇼핑몰 화면 구현
		// 2. 번호 입력
		// 3. 제품을 구매
		//	  - 결제 방법 선택
		//		1. 현금 결제 / 2. 카드결제
		//		 카드 결제 선택하셨습니다.
		//		 카드 결제 하시겠습니까?
		//		 yes
		//		 결제처리중 
		//       -> (int)(Math.random*2)
		//			0이면 -> 정상 결제
		//			1이면 -> 비정상 결제
		//    잔고가 제품금액과 비교
		//    잔고에서 제품 금액 을뺀다.
		// 4. 구매목록 저장
		// 5. 잔고, 구매금액 출력
		
		int select = 0;		// 전체메뉴 선택
		int pay_select = 0;	// 결제방법 선택
		int pay_yes_no = 0;	// 카드 결제 할것인지 yes, no
		
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
		
		int product1_count = 0;			// 1번 제품을 몇개 샀는지
		int product2_count = 0;			// 2번 제품을 몇개 샀는지
		int product3_count = 0;			// 3번 제품을 몇개 샀는지
		String product_count_str = "";	// 총 XXX를 샀습니다. 글귀를 위한 변수
			
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {	// 전체 while
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

					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- 결제 방법 선택 ---");
						System.out.println("1)현금결제 2)카드결제 3)이전단계");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("현금결제를 선택하셨습니다.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("카드결제를 선택하셨습니다.");
							System.out.println("카드결제 하시겠습니까?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//카드 결제 중
								System.out.println("결제 처리 중!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("결제가 정상적으로 처리 됬습니다.");
									break;
								}
								else if(ran == 1) {
									System.out.println("결제 처리중 오류가 발생했습니다.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// 결제처리 while
					
					if(my_bank < product1_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product1 + "을 1대 구매하셨습니다.");
					System.out.println(product1 + "을 1대 가격은 " + product1_won + "원 입니다.");
					
					if (pay_select == 2) {
						my_bank -= product1_won;
					}
					product1_count++;
					point += (product1_won * 0.02);
					using_money += product1_won;
					break;
	
				case 2:
					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- 결제 방법 선택 ---");
						System.out.println("1)현금결제 2)카드결제 3)이전단계");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("현금결제를 선택하셨습니다.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("카드결제를 선택하셨습니다.");
							System.out.println("카드결제 하시겠습니까?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//카드 결제 중
								System.out.println("결제 처리 중!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("결제가 정상적으로 처리 됬습니다.");
									break;
								}
								else if(ran == 1) {
									System.out.println("결제 처리중 오류가 발생했습니다.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// 결제처리 while
					
					if(my_bank < product2_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product2 + "을 1대 구매하셨습니다.");
					System.out.println(product2 + "을 1대 가격은 " + product2_won + "원 입니다.");
					if (pay_select == 2) {
						my_bank -= product2_won;
					}
					product2_count++;
					point += (product2_won * 0.02);
					using_money += product2_won;
					break;
					
				case 3:
					while(true) {
						pay_select = 0;
						pay_yes_no = 0;
						
						System.out.println("--- 결제 방법 선택 ---");
						System.out.println("1)현금결제 2)카드결제 3)이전단계");
						pay_select = scan.nextInt();
						
						if (pay_select == 1) {
							System.out.println("현금결제를 선택하셨습니다.");
							
							break;
						}
						else if (pay_select == 2) {
							System.out.println("카드결제를 선택하셨습니다.");
							System.out.println("카드결제 하시겠습니까?");
							System.out.println("1)Yes / 2)No");
							pay_yes_no = scan.nextInt();
							if (pay_yes_no == 1) {
								//카드 결제 중
								System.out.println("결제 처리 중!");
								int ran = (int)(Math.random()*2);
								if(ran == 0) {
									System.out.println("결제가 정상적으로 처리 됬습니다.");
									break;
								}
								else if(ran == 1) {
									System.out.println("결제 처리중 오류가 발생했습니다.");
									continue;
								}
							}
							else if(pay_yes_no == 2) {
								continue;
							}
						}
						else if(pay_select == 3) {
							continue Loop1;
						}
					}	// 결제처리 while
					
					if(my_bank < product3_won) {
						System.out.println("잔액이 부족합니다.");
						break;
					}
					
					System.out.println(product3 + "을 1대 구매하셨습니다.");
					System.out.println(product3 + "을 1대 가격은 " + product3_won + "원 입니다.");
					if (pay_select == 2) {
						my_bank -= product3_won;
					}
					product3_count++;
					point += (product3_won * 0.02);
					using_money += product3_won;
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
					while (true) {
						System.out.printf("현재 포인트 : %dP\n", point);
						System.out.printf("포인트 전환 금액을 입력해 주세요. : ");
						int point_money = scan.nextInt();	// 포인트를 얼마 바꿀지 변수
						if(point_money <= point) {
							my_bank += point_money;	//포인트 전환
							point -= point_money;	//포인트 차감
							System.out.printf("%d원이 충전되었습니다.\n", point_money);
						}
						else {
							System.out.println("포인트 전환금액이 너무 많습니다. 다시 확인해 주세요.");
							continue;
						}
						
						break;
					} // case 7	
			} // 메뉴선택 select
			
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
			} // 총 구매 수 if
			
			
			System.out.println(" ============================= ");
			System.out.println("현재 잔액은 " + my_bank + "원 입니다.");
			System.out.println("현재 포인트 " + point + "P 입니다.");
			
		}	// 전체 while
		
		
		System.out.println(" ============================= ");
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}	//main

}	// class
