import java.util.Scanner;

public class CEx20200206_01 {
	public static void main(String[] args) {
		// [ 쇼핑몰 ] 
		// 자신의 계좌 1개 만듦
		// 쇼핑몰에서 1개의 상품을 구매
		// 자신의 계좌에서 상품가격을 빼주는 프로그램
		
		int my_bank = 5000000;	// 내 계좌 초기 자금 500만원
		int p_num = 0;	// 구매상품 번호
	
		
		Scanner scan = new Scanner(System.in);
		
		String product1 = "컴퓨터";
		String product2 = "TV";
		String product3 = "스마트폰";
		
		int product1_won = 1300000;	// 1)번 상품가격
		int product2_won = 990000;	// 2)번 상품가격
		int product3_won = 880000;	// 3)번 상품가격

		String list1 = "";	// 구매 목록
		int point = 0;		// 포인트
		
		Loop1 : 		
		while(true) {
			System.out.println("=============================");
			System.out.println("[ 하X마트 쇼핑몰 ]");
			System.out.printf("  1) 컴퓨터 - %d원\n", product1_won);
			System.out.printf("  2) TV - %d원\n", product2_won);
			System.out.printf("  3) 스마트폰 - %d원\n", product3_won);
			System.out.printf("  4) 금액 충전");
			System.out.printf("구매하고 싶은 상품을 선택하세요.(종료 : 0) : ");
			
			p_num = scan.nextInt();
			if (p_num == 0) {
				break Loop1;
			}
			
			switch (p_num) {
			case 1:
				if(my_bank < product1_won) {
					System.out.println("잔액이 부족 합니다.");
					System.out.println("현재 잔액 : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product1_won;
				point += (product1_won * 0.1);
				System.out.println(product1 + " 1대를 구매 했습니다.");
				System.out.println(product1+ " 1대의 가격은 " + product1_won + "원 입니다.");
			
				list1 += "컴퓨터 1대 ";
				break;
			
			case 2:
				if(my_bank < product2_won) {
					System.out.println("잔액이 부족 합니다.");
					System.out.println("현재 잔액 : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product2_won;
				point += (product2_won * 0.1);
				System.out.println(product2 + " 1대를 구매 했습니다.");
				System.out.println(product2 + " 1대의 가격은 " + product2_won + "원 입니다.");
				
				list1 += "TV 1대 ";
				break;
			
			case 3:
				if(my_bank < product3_won) {
					System.out.println("잔액이 부족 합니다.");
					System.out.println("현재 잔액 : " + my_bank);
					System.out.println("=============================");
					continue Loop1;
				}
				
				my_bank -= product3_won;
				point += (product3_won * 0.1);
				System.out.println(product3 + " 1대를 구매 했습니다.");
				System.out.println(product3 + " 1대의 가격은 " + product3_won + "원 입니다.");
				
				list1 += "스마트폰 1대 ";
				break;

			case 4:
				System.out.println("충전할 금액을 입력하세요.");
				int carge = scan.nextInt();
				my_bank += carge;
				System.out.printf("%d원이 충전되었습니다.\n", carge);
			default:
				break;
			}
						
			System.out.println("=============================");
			System.out.println("남은 잔액은 " + my_bank + "원 입니다.");
			System.out.println("=============================");
			System.out.println("적립된 포인트는 " + point + "P 입니다.");
			System.out.println("=============================");
			System.out.println("현재 구매목록 : " + list1);
			System.out.println("=============================");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}
	
}
