import java.util.Scanner;

public class CEx20200207_09 {

	public static void main(String[] args) {
		// 자판기 프로그램
		// 블랙커피 (커피 10)
		// 흑당커피 (커피 7 설탕 5)
		// 카페라떼 (커피 5 우유 5)
		// 밀크커피 (커피 4 우유 3 설탕 2)
		// 현재 자판기에는 커피 100, 설탕 50, 우유 70 들어있음
		// 9) 관리자 모드 (로그인, 현재 잔여량 표시)
		// 눌렀을때 자판기 잔여량이 없으면
		// "현재 재료가 부족한 상태입니다. 관리자에게 연락해주세요."

		
		// 자판기 프로그램
		// <2020.02.07 프로그램 업데이트>

		
		String id = "aaa";				// 관리자 아이디
		String pa = "123";				// 관리자 패스워드
		String check_id = "";			// 입력받는 아이디
		String check_pw = "";			// 입력받는 패스워드
		
		
		int coffee_amount = 100;		// 현재 커피 재고량
		int sugar_amount = 50;			// 현재 설탕 재고량
		int milk_amount = 70;			// 현재 우유 재고량
		
		int total_sale = 0;				//판매량
		int total_price = 0;			//총 판매 금액
		
		int order_num = 0;				// 커피선택 변수
		int input_price = 0;			// 투입금액

		final int BLACK_PRICE = 100;	// 블랙커피 가격
		final int SUGAR_PRICE = 300;	// 흑당커피 가격
		final int LATTE_PRICE = 200;	// 카페라떼 가격
		final int MILK_PRICE = 100;	// 밀크커피 가격
		
		boolean black_check = false;	//블랙커피 품절?
		boolean sugar_check = false;	//흑당커피 품절?
		boolean latte_check = false;	//카페라테 품절?
		boolean milk_check = false;	//밀크커피 품절?

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------");
			System.out.println("      커피 자판기      ");
			System.out.println("-----------------------");
			if (black_check == false) {
				System.out.println("1) 블랙커피 -100원");
			}
			System.out.println("2) 흑당커피 -300원");
			System.out.println("3) 카페라떼 -200원");
			System.out.println("4) 밀크커피 -100원");
			System.out.println("9) 관리자 모드");
			System.out.println("0) 시스템 종료");
			System.out.println("-----------------------");

			System.out.printf("마시고 싶은 커피번호를 입력하세요. : ");
			order_num = scan.nextInt();

			
			// 블랙커피 (커피 10)
			// 흑당커피 (커피 7 설탕 5)
			// 카페라떼 (커피 5 우유 5)
			// 밀크커피 (커피 4 우유 3 설탕 2)
			switch (order_num) {
			case 1:
				if(coffee_amount < 10) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해 주세요.");
					black_check = true; // false -> true / true -> false
					continue;
				}
				coffee_amount -= 10;	// 커피재고량 10감소
				total_sale++;			// 총판매량 1개 증가
				total_price =+ 100;		// 총판매금액 100원 증가
				input_price -= 100;		// 투입금액에서 100감소
				System.out.println("블랙커피 1잔이 나왔습니다. 여유로운 한잔~ 의 커피");
				System.out.println("coffee_amount" + coffee_amount);
				System.out.println("total_sale" + total_sale);
				System.out.println("total_price" + total_price);
				System.out.println("input_price" + input_price);
				break;
			case 2:
				if(coffee_amount < 7 || sugar_amount < 5) {
					System.out.println("재료가 부족합니다. 관리자에게 연락해 주세요.");
					sugar_check = true;
					continue;
				}
				coffee_amount -= 7;
				sugar_amount -= 5;
				total_sale++;			// 총판매량 1개 증가
				total_price =+ 300;		// 총판매금액 100원 증가
				input_price -= 300;		// 투입금액에서 100감소
				System.out.println("흑당커피 1잔이 나왔습니다. 여유로운 한잔~ 의 커피");
				System.out.println("coffee_amount" + coffee_amount);
				System.out.println("total_sale" + total_sale);
				System.out.println("total_price" + total_price);
				System.out.println("input_price" + input_price);
				

				break;
			case 3:

				break;
			case 4:

				break;
			case 9:
				System.out.println("관리자 아이디를 입력하세요.");
				System.out.printf("아이디 : ");
				if(!(id.equals(check_id))) {
					System.out.println("아이디가 일치하지 않습니다. 다시 입력하세요.");
					continue;
				}
				
				System.out.println("coffee_amount 량 : " + coffee_amount);
				System.out.println("sugar_amount 량 : " + sugar_amount);
				System.out.println("milk_amount 량 : " + milk_amount);
				System.out.println("total_sale 량 : " + total_sale);
				System.out.println("total_price 금액 : " + total_price);
				break;

			case 0:
				System.out.println("시스템을 종료합니다.");
				break;

			default:
				System.out.println("시스템 오류");
				break;
			}

		}


	} // main

} // class
