import java.util.Scanner;

public class CEx20200211_04 {
	public static void main(String[] args) {
		//	/ -> 나누기  %-> 나머지
		
		// 5890원 있다. -> 500, 100, 50, 10;
		
		// 3번의 금액을 입력해서, 3번의 결과를 출력하시오.
		// 배열을 사용해서 나타날수 있도록 하세요.
		
		int[] coin = { 500, 100, 50, 10 };
		int[] money = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.printf((i+1)+"번째 금액 : ");
			money[i] = scan.nextInt();
		}
		
		System.out.println("=================");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(coin[j] + "원 : " + money[i]/coin[j] + "개");
				money[i] %= coin[j];	//money = money % coin[i];
			}
			System.out.println("=================");
		}
		
		
//		int money = 0;
//		
//		int[] coin = { 500, 100, 50, 10 };
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.printf("얼마를 교환 하시겠습니까? : ");
//		money = scan.nextInt();
//			
//		System.out.println("입력한 금액 : " + money + "원");
//		for(int i = 0; i < 4; i++) {
//			System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
//			money %= coin[i];	//money = money % coin[i];
//		}
		
////////////////////////////////////////////////////////////////////////////
		
//		int coin500 = 0;
//		int coin100 = 0;
//		int coin50 = 0;
//		int coin10 = 0;
//		
//		coin500 = money/500;
//		coin100 = (money%500)/100;
//		coin50 = ((money%500)%100)/50;
//		coin10 = (((money%500)%100)%50)/10;
		
//		coin500 = money/500;
//		money %= 500;
//		
//		coin100 = money/100;
//		money %= 100;
//		
//		coin50 = money/50;
//		money %= 50;
//		
//		coin10 = money/10;
		
//		System.out.printf("500원 : %d개\n", coin500);
//		System.out.printf("100원 : %d개\n", coin100);
//		System.out.printf(" 50원 : %d개\n", coin50);
//		System.out.printf(" 10원 : %d개\n", coin10);
		
		scan.close();
	}
}
