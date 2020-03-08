import java.util.Scanner;

public class CEx20200219_08 {
	
	public static void main(String[] args) {
		// Lotto class와 연결되어 있음
		
		Lotto[] l = new Lotto[45];
		
//		for(int i = 0; i < l.length; i++) {
//			l[i] = new Lotto();
//			l[i].number = i+1;
//		}
		
		//==> 생성자를 만들어 주면 2줄을 1줄로 줄일 수 있다.
		for (int i = 0; i < l.length; i++) {
			l[i] = new Lotto(i+1);
		}
		 
	}	// main
	
}	//class

