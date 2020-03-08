
public class CEx20200225_08 {

	public static void main(String[] args) {
		
		Deck d = new Deck();	// 52���� ī�� �����
		Card c = d.pick(10);	// cardArr[10]
//		System.out.println(c);
		
		for(int i = 0; i < d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
		
		System.out.println("===============");
		
		d.shuffle();
		Card c2 = d.pick(10);
//		System.out.println(c2);
		
		for(int i = 0; i < d.CARD_NUM; i++) {
			System.out.println(d.pick(i));
		}
	}

}

class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];
	
	//������ - �ʱ�ȭ
	Deck() {	//kind, number
		for(int i = 0; i < Card.KIND_MAX; i++) {
			for(int j = 0; j < Card.NUM_MAX; j++) {
				cardArr[(i*13)+j] = new Card(i+1, j+1);
			}
		}
	}
	
	// Card �̱�
	Card pick(int index) {
		return cardArr[index];	//10 -> CLOVER, J
	}
	
	// ���� �̱�
	Card pick() {
		int index = 0;
		index = (int)(Math.random()*CARD_NUM);	// 0~51�� �迭�� ����
		
//		return pick(index);
		return cardArr[index];
	}
	
	// ī�� ����
	void shuffle() {
		for(int i = 0; i < 2000; i++) {
			int num = (int)(Math.random()*CARD_NUM);
			
			Card temp = cardArr[num];
			cardArr[num] = cardArr[0];
			cardArr[0] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX	= 4; // ī�� ���� ����
	static final int NUM_MAX	= 13; // ���̺� ī�� ��
	
	static final int SPADE		= 4;
	static final int DIAMOND	= 3;
	static final int HEART		= 2;
	static final int CLOVER		= 1;
	
	int kind; // 1: clover / 2: heart / 3: diamond / 4: spade
	int number; // 1~9 X(10) J(11) Q(12) k(13)
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	

	// ī�� ��ü ����
	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		
		return ""+kinds[this.kind] + " " + numbers.charAt(this.number);
	}
}
