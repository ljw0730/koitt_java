package Card;

public class Card {

	static final int KIND_NUM = 4;
	static final int NUMBER_NUM = 13;
	
	static final int SPADE = 1;
	static final int DIAMONT = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
		
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kinds[] = { " ", "SPADE", "DIAMOND" ,"HEART" , "CLOVER" };
		String numbers = "0123456789XJQK";
		
		return kinds[this.kind] + " " + numbers.charAt(number);
	}
}
