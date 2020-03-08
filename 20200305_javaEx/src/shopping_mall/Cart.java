package shopping_mall;

public class Cart {
	
	static int cart_count = 1000;
	
	int buy_number;
	String id;
	String product_name;
	int price;
	int point;
	String buy_time;
	
	{
		cart_count++;
		buy_number = cart_count;
	}
	
	Cart () { }
	Cart(String id,	String product_name, int price, int point) {
		this.id = id;
		this.product_name = product_name;
		this.price = price;
		this.point = point;
	}
}
