
public class CEx20200225_09 {

	public static void main(String[] args) {
		
		Deck2 d = new Deck2();
//		Card2 c1 = d.Pick(10);
//		System.out.println(c1);
		print_7(d);
		
		System.out.println("=============");
		
		d.shuffle();
//		Card2 c2 = d.Pick(10);
//		System.out.println(c2);
		print_7(d);
		
	}// main
	
	static void print_7(Deck2 d) {
		for(int i = 0; i < 7; i++) {
			Card2 c = d.Pick(i);
			System.out.println(c);
		}
	}
	
}// class

class Deck2 {
	final int CARD_NUM = 52;
	Card2[] cardArr = new Card2[CARD_NUM];
	
	Deck2() {
		for(int i = 0; i < Card.KIND_MAX; i++) {
			for(int j = 0; j < Card2.NUMBER_MAX; j++) {
				cardArr[(i*13)+j] = new Card2(i+1, j+1);
			}
		}
	}
	
	// Ä«µå ·£´ý »Ì±â
	Card2 Pick() {
		int num = (int)(Math.random()*CARD_NUM);
		return Pick(num); 
	}
	
	// Ä«µå ÁöÁ¤ »Ì±â
	Card2 Pick(int num) {
		return cardArr[num];
	}
	
	//Ä«µå ¼¯±â
	void shuffle() {
		for(int i = 0; i < 200; i++) {
			int num = (int)(Math.random()*CARD_NUM);

			Card2 temp = cardArr[0];
			cardArr[0] = cardArr[num];
			cardArr[num] = temp;
		}

	}
	
}

class Card2 {
	static final int KIND_MAX = 4;
	static final int NUMBER_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card2() {
		this(SPADE, 1);
	}
	
	Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND" , "SPADE" };
		String numbers = "0123456789XJQK";
		
		return "" + kinds[this.kind] + " " + numbers.charAt(this.number);
	}
}
