import java.util.Scanner;

public class CEx20200219_08 {
	
	public static void main(String[] args) {
		// Lotto class�� ����Ǿ� ����
		
		Lotto[] l = new Lotto[45];
		
//		for(int i = 0; i < l.length; i++) {
//			l[i] = new Lotto();
//			l[i].number = i+1;
//		}
		
		//==> �����ڸ� ����� �ָ� 2���� 1�ٷ� ���� �� �ִ�.
		for (int i = 0; i < l.length; i++) {
			l[i] = new Lotto(i+1);
		}
		 
	}	// main
	
}	//class

