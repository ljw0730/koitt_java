import java.util.Scanner;

public class CEx20200227_10 {

	public static void main(String[] args) {
		// SamsungTv, Ref(냉장고), Condi(에어컨), Product class와 연결되어 있음.
		
		SamsungTv[] sam = new SamsungTv[10];
		Ref[] ref = new Ref[10];
		Condi[] con = new Condi[10];
		User user = new User();
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 : while(true) {
			System.out.println("--------------------------------");
			System.out.println("1) 삼성TV 구매");
			System.out.println("2) 냉장고 구매");
			System.out.println("3) 에어컨 구매");
			System.out.println("4) 현재 가지고 있는 금액 확인");
			System.out.println("0) 종료");
			System.out.print("원하는 번호를 입력해 주세요 : ");
			int num = scan.nextInt();
			
			switch (num) {
				case 1:
					user.buy(new SamsungTv());
					// sam[tv_count] = new SamsungTv();
					break;

				case 2 : 
					user.buy(new Ref());
					break;
					
				case 3: 
					user.buy(new Condi());
					break;
					
				case 4:
					user.money_now();
					break;
					
				case 0 : 
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
		}
	}
}

class User {
	int money = 10000;
	String name = "홍길동";
	int tv_count = 0;
	int ref_count = 0;
	int con_count = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다. 구매를 취소합니다.");
			return;
		}
		
		System.out.println(p.name + " 한대를 구매했습니다.");
		money -= p.price;
		
		if(p instanceof SamsungTv) {
			tv_count++;
		}
		else if(p instanceof Ref) {
			ref_count++;
		}
		else if(p instanceof Condi) {
			con_count++;
		}
		System.out.print("구매 현황 - ");
		System.out.print("삼성TV : " + tv_count + "대 ");
		System.out.print(" / 냉장고 : " + ref_count + "대 ");
		System.out.print(" / 에어컨 : " + con_count + "대");
		System.out.println();
	}
	
	void money_now() {
		System.out.println("현재 유저가 가지고 있는 금액 : " + money);
	}
}