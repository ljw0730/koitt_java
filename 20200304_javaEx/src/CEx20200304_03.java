
public class CEx20200304_03 extends Object {

	public static void main(String[] args) {
		// Object class의 toString()메서드
		
		Card c1 = new Card("HEART", 3);
		Card c2 = new Card("SPADE", 7);
		
		System.out.println(c1);
		System.out.println(c2);
		// toString을 오버라이딩 하지 않으면 주소가 출력된다.
		
		// toString을 사용하지 않고 값을들 보고 싶다면 아래와 같이 하면된다.
		System.out.println("c1카드 : " + c1.kind + ", " + c1.number);
		System.out.println("c2카드 : " + c2.kind + ", " + c2.number);
		
		// toString을 오버라이딩 해주면 참조변수를 이용하여 출력이 가능하다.
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