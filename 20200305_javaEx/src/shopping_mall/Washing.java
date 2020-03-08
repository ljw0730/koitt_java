package shopping_mall;

public class Washing extends Product{
	int size;
	int shape;
	boolean Sterilization;
	
	Washing() {	}
	Washing(int size, int shape, boolean Sterilization) {
		this.size = size;
		this.shape = shape;
		this.Sterilization = Sterilization;
	}
}

class BasicWashing extends Washing {
	final int BASICWASHING_PIRCE = 800;
	
	BasicWashing() {
		super(20, 1, false);
		price = BASICWASHING_PIRCE;
		point = (int)(BASICWASHING_PIRCE*0.1);
		name = "통돌이세탁기";
		color = "Gray";
	}
}

