package Card_test;

public class DeckTest {

	public static void main(String[] args) {
		// card() - 클래스 1개
		// Decg() - 클래스 52개 카드 생성
		// 1~52개의 숫자, 모양 입력
		// 섞기
		// DeckTest() 호출해서 카드를 랜덤으로
		// 5장을 뽑아서 출력하시오.
		
		Deck card_deck = new Deck();
		card_deck.shuffle();
		card_deck.card_print();
		
	}

}
