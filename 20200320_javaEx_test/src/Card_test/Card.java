package Card_test;

public class Card {
	static final int KIND_MAX = 4;
	static final int NUMber_MAX=13;
	
	static final int SPADE		= 1;
	static final int DIAMOND	= 2;
	static final int HEART		= 3;
	static final int CLOVER		= 4;
	
	
	int kind;
	int number;
	
	Card() {
		
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = { "", "SPADE", "DIAMOND", "HEART", "CLOVER" };
		String numbers = "0123456789XJQK";
		
		return "" + kinds[this.kind] + " " + numbers.charAt(this.number);
	}
	
}
