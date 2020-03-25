package Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
		
	final int PRINT_COUNT = 5;
	ArrayList<Card> card = new ArrayList<Card>();
	
	Deck() {
		for(int i = 0; i < Card.KIND_NUM; i++) {
			for(int j = 0; j < Card.NUMBER_NUM; j++) {
				Card cc = new Card(i+1, j+1);
				card.add(cc);
			}
		}
	}
	
	public void print_card() {
		for(int i = 0; i < PRINT_COUNT; i++) {
			Card cc = (Card)card.get(i);
			System.out.println(cc);
		}
	}
	
	public void shuffle() {
		long seed = System.nanoTime();
		Collections.shuffle(card, new Random(seed));
	}
}
