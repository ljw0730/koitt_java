import java.util.Scanner;

public class Homework_buy {

	public static void main(String[] args) {
		// 1) 컴퓨터 구매, 2) TV구매, 3) 냉장고 구매, 4) 세탁기 구매, 5) 에어컨 구매
		// 6) 구매물품, 구매금액 출력
		// 7) 보유금액, 보너스포인트 출력
		// 8) 보유금액 충전
		// 9) 구매물품 대수 검색
		// 10) 물품취소
		// 0) 종료
		
		User user = new User();
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("----------------------------------");
					System.out.println("물품 구매를 선택 하셨습니다.");
					select = pro_buy_print(scan);
					switch (select) {
						case 1:
							user.buy(new Com());			
							break;
						case 2:
							user.buy(new Tv());
							break;
						case 3:
							user.buy(new Ref());
							break;
						case 4:
							user.buy(new Wash());
							break;
						case 5:
							user.buy(new Air());
							break;
						case 0:
							System.out.println("이전화면으로 이동합니다.");
							break;
					}
							
					break;

				case 2:
					System.out.println("----------------------------------");
					System.out.println("구매물품, 총 구매금액 출력을 선택 하셨습니다.");
					user.summary();
					
					break;

				case 3:
					System.out.println("----------------------------------");
					System.out.println("보유금액, 보너스포인트 출력을 선택 하셨습니다.");
					user.retention();
					
					break;

				case 4:
					System.out.println("----------------------------------");
					System.out.println("보유금액 충전을 선택 하셨습니다.");
					user.money_charging(scan);
					
					break;

				case 5:
					System.out.println("----------------------------------");
					System.out.println("구매취소를 선택 하셨습니다.");
					user.cancle(scan);
					
					break;

				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
		}
		

	}
	
	// 메인 화면 출력
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==================================");
		System.out.println(" [   가전제품 구매 프로그램   ] ");
		System.out.println(" 1. 물품 구매");
		System.out.println(" 2. 구매물품, 구매금액 출력");
		System.out.println(" 3. 보유금액, 보너스포인트 출력");
		System.out.println(" 4. 보유금액 충전");
		System.out.println(" 5. 구매 취소");
		System.out.println(" 0. 종료");
		System.out.println("----------------------------------");
		System.out.print(" 원하는 번호를 입력해 주세요. : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	// 1) 물품구매 시 출력
	static int pro_buy_print(Scanner scan) {
		int select = 0;
		System.out.println("1. 컴퓨터");
		System.out.println("2. TV");
		System.out.println("3. 냉장고");
		System.out.println("4. 세탁기");
		System.out.println("5. 에어컨");
		System.out.println("0. 이전화면");
		System.out.println("----------------------------------");
		System.out.print(" 원하는 번호를 입력해 주세요. : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	
}

// 구매자 클래스
class User {
	final int BUY_LIMIT = 20;
	int money = 10000;
	int bonus_point;
	
	Product[] item = new Product[BUY_LIMIT];
	
	int pro_count = 0;
	int price_sum = 0;
	
	// 물품 구매
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("보유금액이 부족합니다.");
			System.out.println("금액을 충전해 주세요.");
			return;
		}
		
		if(pro_count ==  BUY_LIMIT) {
			System.out.println("구매한도를 넘으셨습니다.");
			return;
		}
		
//		if(item[pro_count] == null) {
			money -= p.price;
			bonus_point += p.bonus_point;
			item[pro_count] = p;
			pro_count++;
			System.out.println(p.name + " 1대를 구매 하셨습니다.");
			
//		}
	}

	// 총 구매 수, 구매 품목, 총 구매 금액 출력
	void summary() {
		if(pro_count == 0) {
			System.out.println("구매 품목이 없습니다.");
			return;
		}
		
		System.out.println("총 구매 수 : " + pro_count);
		
		int com_count = 0;
		int tv_count = 0;
		int ref_count = 0;
		int wash_count = 0;
		int air_count = 0;
		
		System.out.print("구매 품목 : ");
		for(int i = 0; i < pro_count; i++) {
			System.out.print(item[i].name + ", ");
			
			if(item[i].name == "컴퓨터") {
				com_count++;
			}
			else if(item[i].name == "TV") {
				tv_count++;
			}
			else if(item[i].name == "냉장고") {
				ref_count++;
			}
			else if(item[i].name == "세탁기") {
				wash_count++;
			}
			else if(item[i].name == "에어컨") {
				air_count++;
			}
			
			price_sum += item[i].price;
		}
		System.out.println();
		System.out.print("구매 품목 : ");
		System.out.println("컴퓨터 : " + com_count + "대 / " + "TV : " + tv_count + "대 / "
							+ "냉장고 : " + ref_count + "대 / " + "세탁기 : " + wash_count + "대 / "
							+ "에어컨 : " + air_count + "대");
		System.out.println("총 구매 금액 : " + price_sum);
	}
	
	//	보유금액, 보너스포인트 출력
	void retention() {
		System.out.println("보유금액 : " + money);
		System.out.println("보너스포인트 : " + bonus_point);
	}
	
	// 보유금액 충전
	void money_charging(Scanner scan) {
		System.out.println("현재 보유 금액 : " + money);
		int charging = 0;
		System.out.print("충전하실 금액을 입력해 주세요. : ");
		charging = scan.nextInt();
		money += charging;
		System.out.println("충전이 완료 되었습니다.");
		System.out.println("현재 보유 금액 : " + money);
	}
	
	// 구매 취소
	void cancle(Scanner scan) {
		if(pro_count == 0) {
			System.out.println("구매 품목이 없습니다.");
			return;
		}
		
		int select = 0;
		Product[] temp_item = new Product[BUY_LIMIT];
		
		for(int i = 0; i < pro_count; i++) {
			System.out.print((i+1) + ". " + item[i].name + ", ");
		}
		System.out.println();
		
		System.out.print("구매 취소할 번호를 입력해 주세요.(이전화면 : 0) : ");
		select = scan.nextInt();
		scan.nextLine();
		
		if(select == 0) {
			System.out.println("이전화면으로 이동합니다.");
			return;
		}
		
		money += item[select-1].price;
		bonus_point -= item[select-1].bonus_point;		
		
		System.arraycopy(item, 0, temp_item, 0, select-1);
		System.arraycopy(item, select, temp_item, select-1, item.length-select);
		
		for(int i = 0; i < item.length; i++) {
			item[i] = null;
		}
		
		System.arraycopy(temp_item, 0, item, 0, temp_item.length);
		pro_count--;
		
		for(int i = 0; i < pro_count; i++) {
			System.out.print((i+1) + ". " + item[i].name + ", ");
		}
		System.out.println();
		
	}
}

// 제품(조상) 클래스
class Product {
	
	String name;
	int price;
	int bonus_point;
	
	Product() {
		
	}
	
	Product(String name, int price, int bonus_point) {
		this.name = name;
		this.price = price;
		this.bonus_point = bonus_point;
	}
}

// 컴퓨터 제품 클래스
class Com extends Product {
	static final int COM_PRICE = 1000;
	
	Com() {
		super("컴퓨터", COM_PRICE, (int)(COM_PRICE*0.1));
	}
	
}

// TV 제품 클래스
class Tv extends Product {
	static final int TV_PRICE = 1100;
	
	Tv() {
		super("TV", TV_PRICE, (int)(TV_PRICE*0.1));
	}
}

// 냉장고 제품 클래스
class Ref extends Product {
	static final int REF_PRICE = 1200;
	
	Ref() {
		super("냉장고", REF_PRICE, (int)(REF_PRICE*0.1));
	}
}

// 세탁기 제품 클래스
class Wash extends Product {
	static final int WASH_PRICE = 600;
	
	Wash() {
		super("세탁기", WASH_PRICE, (int)(WASH_PRICE*0.1));
	}
}

// 에어컨 제품 클래스
class Air extends Product {
	static final int AIR_PRICE = 800;
	
	Air() {
		super("에어컨", AIR_PRICE, (int)(AIR_PRICE*0.1));
	}
}