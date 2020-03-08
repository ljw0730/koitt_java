import java.util.Vector;

public class CEx20200302_01 {

	public static void main(String[] args) {
		// ������ - ���纸���ݾ�, ���ʽ�, ���Ÿ��, ����, ȯ��, ���

		Buyer user = new Buyer();	// ������ 1�� ����
		
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
	// < > -> ���ʸ� : ���Ϳ� �� �� �ִ� Ÿ���� �������ش�.
	// ��, Product �����͸� �޴´�.
	int i = 0;
	String listPrint = "";
	
	// ���� �޼ҵ�
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�. ������ �ּ���.");
			return;
		}
		
		money -= p.price;
		bonus += p.bonus;
//		cart[i++] = p;
		cart.add(p);	// 0, 1, 2, 3, ... �� ������� ��
		System.out.println(p.name + "��(��) ���Ÿ� �Ͽ����ϴ�.");
	}
	
	// ��� �޼ҵ�
	void summary() {
		// ���Ÿ��, �� ���� �ݾ�
		int sum = 0;
		
//		if(cart[0] == null) {
		if(cart.isEmpty()) {	// cart.isEmpty : ��� �ִ°�?
			return;
		}
		// ���
//		for(int j = 0; j < cart.length; j++) {
		for(int j = 0; j < cart.size(); j++) {	//cart.size �� �� �ִ� ��ŭ for��

			Product p = (Product)cart.get(j);
			// vector�� ���� ���ԵǸ� object�� �ڵ� ����ȯ�� �Ǿ� ���� ������
			// ���� �ٽ� �������� ���������� ����ȭ�� ���־�� �Ѵ�.
			
//			listPrint += cart[j].name + ", ";
//			sum += cart[j].price;
			listPrint += p.name + ", ";
			sum += p.price;
		}
		System.out.println("���� ��ǰ : " + listPrint);
		System.out.println("���� �� �ݾ� : " + sum);
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