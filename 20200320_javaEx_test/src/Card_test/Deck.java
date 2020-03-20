package Card_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	final int CARD_NUM = 52;
	final int PRINT_COUNT = 5;
	
	ArrayList<Card> card = new ArrayList<Card>();
	
	Deck() {
		for(int i = 0; i < Card.KIND_MAX; i++) {
			for(int j = 0; j < Card.NUMber_MAX; j++) {
				Card c = new Card(i+1, j+1);
				card.add(c);
			}
		}
	}
	
	public void card_print() {
		for(int i = 0; i < PRINT_COUNT; i ++) {
			Card c = (Card)card.get(i);
			System.out.println(c);
		}
	}
	
	public void shuffle() {
		// int rand_num = (int)(Math.random()*9999);
		// List 섞기
		// new Random(seed) 괄호에 같은 숫자로 들어가면 섞인 결과가 같음
		// 매순간 변하는 시스템 시간을 이용
		// 아니면 맨위 처럼 Math.random 을 통해 난수로 이용
		long seed = System.nanoTime();
		Collections.shuffle(card, new Random(seed));
	}
}
