
public class Card {

	int number;		// 1~10, J, Q, K
	String kind;	// 4가지 - 클로버, 다이아몬드, 하트, 스페이드
	
	// 생성자를 오버로딩으로 따로 정의 해 주었다면
	// 컴파일 할때 자동으로 만들어주는 기본 생성자도 정의 해주어야 한다.
	Card(int a, String k) {
		this.number = a;
		this.kind = k;
	}
	
	Card() {
		
	}
}
