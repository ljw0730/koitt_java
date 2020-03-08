
public class CEx20200304_03 extends Object {

	public static void main(String[] args) {
		// Object class�� toString()�޼���
		
		Card c1 = new Card("HEART", 3);
		Card c2 = new Card("SPADE", 7);
		
		System.out.println(c1);
		System.out.println(c2);
		// toString�� �������̵� ���� ������ �ּҰ� ��µȴ�.
		
		// toString�� ������� �ʰ� ������ ���� �ʹٸ� �Ʒ��� ���� �ϸ�ȴ�.
		System.out.println("c1ī�� : " + c1.kind + ", " + c1.number);
		System.out.println("c2ī�� : " + c2.kind + ", " + c2.number);
		
		// toString�� �������̵� ���ָ� ���������� �̿��Ͽ� ����� �����ϴ�.
		System.out.println(c1);
		System.out.println(c2);
	}

}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1); 
	}
	
	Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
	
}