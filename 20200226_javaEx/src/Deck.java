
public class Deck {
	static final int CARD_NUM = 52;
	Card[] cardArr = new Card[52];
	
	Deck() {
		for(int i = 0; i < Card.KIND_MAX; i++) {
			for(int j = 0; j < Card.NUMBER_MAX; j++) {
				cardArr[(i*13)+j] = new Card(i+1, j+1);
			}
		}
	}
	
	Card pick() {
		int temp = 0;
		temp = (int)(Math.random()*CARD_NUM);
		return cardArr[temp];
	}
	
	Card pick(int num) {
		return cardArr[num];
	}
	
	void shuffle() {
		for(int i = 0; i < 200; i++) {
			int num = (int)(Math.random()*CARD_NUM);
			Card temp = cardArr[0];
			cardArr[0] = cardArr[num];
			cardArr[num] = temp;
		}
	}
	
}
