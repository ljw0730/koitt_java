
public class CEx20200218_02 {

	public static void main(String[] args) {
		// Card class와 연결되어 있음
		
		System.out.println("카드의 넓이는 : " + Card.width);	// 클래스 변수 사용
		System.out.println("카드의 높이는 : " + Card.height);	// 클래스명.변수명
		System.out.println("===================================");
		
		Card c1 = new Card();
		c1.kind = "Heart";	// 인스턴스 변수 사용
		c1.number = 7;		// 인스턴스명.변수명
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 5;
		
		System.out.println("c1 카드 : " + c1.kind + " / " + c1.number);
		System.out.println("c1 카드 크기 : " + c1.width + " / " + c1.height);
		System.out.println("===================================");
		System.out.println("c2 카드 : " + c2.kind + " / " + c2.number);
		System.out.println("c1 카드 크기 : " + c2.width + " / " + c2.height);
		
		System.out.println("-----------------------------------");
		// 클래스 변수 값 변경
		// 모든 객체가 공통으로 사용하는 클래스 변수 이므로
		// c1만 수정해도 c2뿐만 아니라 모든 객체에 영향을 미친다.
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1 카드 : " + c1.kind + " / " + c1.number);
		System.out.println("c1 카드 크기 : " + c1.width + " / " + c1.height);
		System.out.println("===================================");
		System.out.println("c2 카드 : " + c2.kind + " / " + c2.number);
		System.out.println("c1 카드 크기 : " + c2.width + " / " + c2.height);
		

	}	// main

}	// class
