import java.util.Vector;

public class CEx20200302_01 {

	public static void main(String[] args) {
		// 구매자 - 현재보유금액, 보너스, 구매목록, 구매, 환불, 출력

		Buyer user = new Buyer();	// 구매자 1명 생성
		
		user.buy(new Tv());
		user.buy(new Com());
		user.buy(new Audio());
		
		user.summary();
		
	}

}

class Buyer {
	int money = 10000;
	int bonus = 0;
//	Product[] cart = new Product[10];
	Vector<Product> cart = new Vector<Product>();
	// < > -> 제너릭 : 벡터에 들어갈 수 있는 타입을 한정해준다.
	// 즉, Product 데이터만 받는다.
	int i = 0;
	String listPrint = "";
	
	// 구매 메소드
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다. 충전해 주세요.");
			return;
		}
		
		money -= p.price;
		bonus += p.bonus;
//		cart[i++] = p;
		cart.add(p);	// 0, 1, 2, 3, ... 방 순서대로 들어감
		System.out.println(p.name + "을(를) 구매를 하였습니다.");
	}
	
	// 출력 메소드
	void summary() {
		// 구매목록, 총 구매 금액
		int sum = 0;
		
//		if(cart[0] == null) {
		if(cart.isEmpty()) {	// cart.isEmpty : 비어 있는가?
			return;
		}
		// 출력
//		for(int j = 0; j < cart.length; j++) {
		for(int j = 0; j < cart.size(); j++) {	//cart.size 개 들어가 있는 만큼 for문

			Product p = (Product)cart.get(j);
			// vector에 값이 들어가게되면 object로 자동 형변환이 되어 들어가기 때문에
			// 값을 다시 얻으려면 원래형으로 형변화를 해주어야 한다.
			
//			listPrint += cart[j].name + ", ";
//			sum += cart[j].price;
			listPrint += p.name + ", ";
			sum += p.price;
		}
		System.out.println("구매 물품 : " + listPrint);
		System.out.println("구매 총 금액 : " + sum);
	}
}

class Product {
	String name;
	int price;
	int bonus;
	
	Product() {
		
	}
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.bonus = (int)(price*0.1);
	}
	
	Product(int price) {
		this.price = price;
		this.bonus = (int)(price*0.1);
	}
}

class Tv extends Product{
	
	Tv() {
		super("TV", 1000);
//		name = "TV";
//		price = 1000;
	}
}

class Com extends Product {
	
	Com() {
		super("Com", 900);
	}
}

class Audio extends Product {
	
	Audio() {
		super("Audio", 500);
	}
}