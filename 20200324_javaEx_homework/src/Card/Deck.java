package Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	final int CARD_NUM = 52;
	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	Deck() {
		for(int i = 0; i < Card.KIND_NUM; i++) {
			for(int j = 0; j < Card.NUMBER_NUM; j++) {
				Card c = new Card(i+1, j+1);
				deck.add(c);
			}
		}
	}
	
	public void deck_print() {
		for(int i = 0; i < CARD_NUM; i++) {
			Card c = (Card)deck.get(i);
			System.out.println(c);
		}
	}
	
	public void shuffle() {
		long seed = System.nanoTime();
		Collections.shuffle(deck, new Random(seed));
	}
}
