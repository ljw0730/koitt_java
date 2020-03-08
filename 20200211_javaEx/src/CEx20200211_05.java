public class CEx20200211_05 {
	public static void main(String[] args) {
		
		int[] coin = { 500, 100, 50, 10 };
		int[] money = new int[4];			// 0, 0, 0, 0
		
		// 이것은 바라보는 곳이 다르기 떄문에 
		// 해당 인덱스만 같아진다.
		money[0] = coin[0];	// money -> 500, 0, 0, 0
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(money[i]);
		}
		System.out.println("");
		
		// 인덱스를 지정해 주지 않으면 주소가 들어있는 변수이다.
		// 따라서 내용이 같아 지는게 아니라 주소가 같아진다.
		// 그러므로 같은 값을 가진다.
		money = coin;	// money -> 500, 100, 50, 10
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(money[i]);
		}
		System.out.println("");
		
		// 같은 주소로 인해 같은 곳을 바라보고 있기때문에
		// 하나만 바꿔도 다른 하나도 바뀐다.
		money[0] = 5000;	// 5000, 100, 50, 10
		for(int i = 0; i < money.length; i++ ) {
			System.out.println(coin[i]);	// 5000, 100, 50, 10
		}
		
	}	//main
}	//calss
