import java.util.Scanner;

public class CEx20200211_04 {
	public static void main(String[] args) {
		//	/ -> ������  %-> ������
		
		// 5890�� �ִ�. -> 500, 100, 50, 10;
		
		// 3���� �ݾ��� �Է��ؼ�, 3���� ����� ����Ͻÿ�.
		// �迭�� ����ؼ� ��Ÿ���� �ֵ��� �ϼ���.
		
		int[] coin = { 500, 100, 50, 10 };
		int[] money = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.printf((i+1)+"��° �ݾ� : ");
			money[i] = scan.nextInt();
		}
		
		System.out.println("=================");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(coin[j] + "�� : " + money[i]/coin[j] + "��");
				money[i] %= coin[j];	//money = money % coin[i];
			}
			System.out.println("=================");
		}
		
		
//		int money = 0;
//		
//		int[] coin = { 500, 100, 50, 10 };
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.printf("�󸶸� ��ȯ �Ͻðڽ��ϱ�? : ");
//		money = scan.nextInt();
//			
//		System.out.println("�Է��� �ݾ� : " + money + "��");
//		for(int i = 0; i < 4; i++) {
//			System.out.println(coin[i] + "�� : " + money/coin[i] + "��");
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
		
//		System.out.printf("500�� : %d��\n", coin500);
//		System.out.printf("100�� : %d��\n", coin100);
//		System.out.printf(" 50�� : %d��\n", coin50);
//		System.out.printf(" 10�� : %d��\n", coin10);
		
		scan.close();
	}
}
