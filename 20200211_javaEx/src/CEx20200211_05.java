public class CEx20200211_05 {
	public static void main(String[] args) {
		
		int[] coin = { 500, 100, 50, 10 };
		int[] money = new int[4];			// 0, 0, 0, 0
		
		// �̰��� �ٶ󺸴� ���� �ٸ��� ������ 
		// �ش� �ε����� ��������.
		money[0] = coin[0];	// money -> 500, 0, 0, 0
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(money[i]);
		}
		System.out.println("");
		
		// �ε����� ������ ���� ������ �ּҰ� ����ִ� �����̴�.
		// ���� ������ ���� ���°� �ƴ϶� �ּҰ� ��������.
		// �׷��Ƿ� ���� ���� ������.
		money = coin;	// money -> 500, 100, 50, 10
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(money[i]);
		}
		System.out.println("");
		
		// ���� �ּҷ� ���� ���� ���� �ٶ󺸰� �ֱ⶧����
		// �ϳ��� �ٲ㵵 �ٸ� �ϳ��� �ٲ��.
		money[0] = 5000;	// 5000, 100, 50, 10
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(coin[i]);	// 5000, 100, 50, 10
		}
		
	}	//main
}	//calss
