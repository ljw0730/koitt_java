package Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	final int CARD_NUM = 52;
	
	ArrayList<Card> card = new ArrayList<Card>();
	
	Deck() {
		for(int i = 0; i < Card.KIND_NUM; i++) {
			for(int j = 0; j < Card.NUMBER_NUM; j++) {
				Card cc = new Card(i+1, j+1);
				card.add(cc);
			}
		}
	}
	
	void print_card() {
		for(int i = 0; i < card.size(); i++) {
			Card cc = (Card)card.get(i);
			System.out.println(cc);
		}
	}
	
	void shuffle_card() {
		long seed = System.nanoTime();
		Collections.shuffle(card, new Random(seed));
	}
}
