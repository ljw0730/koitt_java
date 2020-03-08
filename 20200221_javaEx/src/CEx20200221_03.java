
public class CEx20200221_03 {

	public static void main(String[] args) {
		// Card class 와 연결되어 있음
		
		// for문 kind - 클로버, 하트, 다이아몬드, 스페이드
		// number - 1~13까지 총 52개 만들어 보세요.
		
		String[] str = { "클로버", "하트", "다이아몬드", "스페이드" }; 
		
		Card[] c = new Card[52];
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].kind = str[i];
				c[(i*13)+j].number = (j+1);
			}
		}
		
		System.out.println("기본생성자 이용");
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].kind + c[i].number);
		}
		
		System.out.println("==============");
		System.out.println("==============");
		
		
		Card[] c2 = new Card[52];
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < 13; j++) {
				c2[(i*13)+j] = new Card(str[i], j+1);
			}
		}
		
		System.out.println("매개변수가 있는 생성자 이용");
		for(int i = 0; i < c.length; i++) {
			System.out.println(c2[i].kind + c2[i].number);
		}
		
	}	// main
	
} // class
