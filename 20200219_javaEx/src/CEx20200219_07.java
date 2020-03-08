import java.util.Scanner;

public class CEx20200219_07 {
	
	public static void main(String[] args) {
		//Card class와 연결되어 있음
		
		//Card 52장의 배열을 만들어서
		// 1~13까지 숫자를 집어 넣고
		// 종류는 클로버, 다이아몬드, 하트, 스페이드
		// 만들어보세요.

		Card[] c = new Card[52];
		String[] kind = { "클로버", "다이아몬드", "하트", "스페이드" };
		
		for(int i = 0; i < kind.length; i++) {
			for(int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card(j+1,kind[i]);
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].number + " " + c[i].kind);
		}
		
		
	}	// main
	
}	//class

