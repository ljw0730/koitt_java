
public class CEx20200221_04 {

	public static void main(String[] args) {
		// Card class 와 연결되어 있음
		
		// for문 kind - 클로버, 하트, 다이아몬드, 스페이드
		// number - 1~13까지 총 52개 만들어 보세요.
		
		String[] kind = new String[] { "클로버", "하트", "다이아몬드", "스페이드" }; 
		
		Card[] c = new Card[52];
		Card[] c2 = new Card[52];
		
		for(int i = 0; i < kind.length; i++) {
			for(int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].kind = kind[i];
				if((j+1) == 11) {
					c[(i*13)+j].number2 = "J";
				}
				else if((j+1) == 12) {
					c[(i*13)+j].number2 = "Q";
				}
				else if((j+1) == 13) {
					c[(i*13)+j].number2 = "K";
				}
				else {	
					c[(i*13)+j].number2 = ((j+1)+"");
				}
				System.out.println(c[(i*13)+j].kind + " / " + c[(i*13)+j].number2);
			}
		}
		
		System.out.println("==============");
		System.out.println("==============");
		
		for(int i = 0; i < kind.length; i++) {
			for(int j = 0; j < 13; j++) {
				String number_str ="";
				if((j+1) == 11) {
					number_str = "J";
				}
				else if((j+1) == 12) {
					number_str = "Q";
				}
				else if((j+1) == 13) {
					number_str = "K";
				}
				else {
					number_str = ((j+1)+"");
				}
				c2[(i*13)+j] = new Card(kind[i], number_str);
				System.out.println(c[(i*13)+j].kind + " / " + c[(i*13)+j].number2);
			}
		}
	}	// main
	
} // class
