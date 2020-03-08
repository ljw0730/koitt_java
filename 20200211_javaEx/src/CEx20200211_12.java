import java.util.Scanner;

public class CEx20200211_12 {
	public static void main(String[] args) {
		
		//[5][8] 
		//2, 4, 6, 8, 10, 12, 14, 16
		//18...
		//2�� ����� ä��������.
		
		int[][] score = new int[5][8];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				score[i][j] = ((i*8)+j+1)*2;
			}
		}
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				System.out.printf("%2d ", score[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("===================================");
		
		int[][] score2 = new int[5][8];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score2.length; i++) {
			for(int j = 0; j < score2[0].length; j++) {
				System.out.print("2�� ����� �Է����ּ���. : ");
				score2[i][j] = scan.nextInt();
				if(!((score2[i][j] % 2) == 0)) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					j--;
					continue;
				}
			}
		}
		
		for(int i = 0; i < score2.length; i++) {
			for(int j = 0; j < score2[0].length; j++) {
				System.out.printf("%2d ", score2[i][j]);
			}
			System.out.println("");
		}
		
	}	//main
}	//class
