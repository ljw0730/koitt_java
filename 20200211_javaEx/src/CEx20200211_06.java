public class CEx20200211_06 {
	public static void main(String[] args) {
		
		int[] total = new int[5];
		total[0] = 100;
		total[1] = 90;
		total[2] = 80;
		total[3] = 70;
		total[4] = 60;
		
		int[] total1 = { 100, 90, 80, 70, 60 };
		
		System.out.println("[ 1차원 배열 ]");
		for(int i = 0; i < total.length; i++) {
			System.out.print(total[i] + " ");
		}
		System.out.println();
		
		// 2차원 배열
		// 세로5개 / 가로3개
		int[][] score = new int[5][3];
		
		score[0][0] = 100;	score[0][1] = 100;	score[0][2] = 100;
		score[1][0] = 90;	score[1][1] = 90;	score[1][2] = 90;
		score[2][0] = 80;	score[2][1] = 80;	score[2][2] = 80;
		score[3][0] = 70;	score[3][1] = 70; 	score[3][2] = 70;
		score[4][0] = 60;	score[4][1] = 60;	score[4][2] = 60;
		
		int[][] score1 = { 
							{ 100, 100, 100 },
							{ 90, 90, 90 },
							{ 80, 80, 80 },
							{ 70, 70, 70 },
							{ 60, 60, 60 }
						 };
		
		System.out.println("[ 2차원 배열 ]");
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length; j++) {
				System.out.print(score1[i][j] + " ");
			}
			System.out.printf("\n");
		}
		
		
		
	}	//main
}	//calss
