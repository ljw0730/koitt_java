import java.util.Scanner;

public class CEx20200219_06 {
	
	public static void main(String[] args) {
		//Card class와 연결되어 있음

		// Card(int a, String k) 생성자를 호출한다.
		Card c1 = new Card(10, "클로버");
		System.out.println(c1.number + " " + c1.kind);
		
		// 만약 오버로딩된 생성자를 정의했다면
		// 기본 생성자는 자동으로 생성되지 않는다.
		// 그래서 기본 생성자를 정의 하지 않으면
		// 오류가 나타난다.
		Card c2 = new Card();
		
//		Card c1 = new Card();
//		c1.number = 10;
//		c1.kind = "클로버";
//		
//		System.out.println(c1.number + " " + c1.kind);
		
	}	// main
	
}	//class

