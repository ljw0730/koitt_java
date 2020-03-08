package shopping_mall;

public class Ref extends Product {
	int liter;
	int door;
	boolean d_cooling;
	
	Ref() { };
	Ref(int liter, int door, boolean d_cooling) {
		this.liter = liter;
		this.door = door;
		this.d_cooling = d_cooling;
	}

}

class BasicRef extends Ref {
	
	final int BASICREF_PRICE = 900;
	
	BasicRef() {
		super(200, 1, false);
		price = BASICREF_PRICE;
		point = (int)(BASICREF_PRICE*0.1);
		name = "일반형냉장고";
		color = "Silver";
	}
}