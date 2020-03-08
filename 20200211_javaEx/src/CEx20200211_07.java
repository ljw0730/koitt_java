public class CEx20200211_07 {
	public static void main(String[] args) {
		
		// 2차원 배열 [3][3]를 만들고 1 ~ 25 까지 순차적으로 넣어라.
		
		int[][] score = new int[3][3];
		
		score[0][0] = 1;	score[0][1] = 2;	score[0][2] = 3;
		score[1][0] = 4;	score[1][1] = 5;	score[1][2] = 6;
		score[2][0] = 7;	score[2][1] = 8;	score[2][2]	= 9;
		
		System.out.println("[ 2차원 배열 - 1 ]");
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.printf("\n");
		}
		System.out.println("");
		
		////////////////////////////////////////////////////////////
		
		int[][] score2 = {
							{ 1, 2, 3 },
							{ 4, 5 ,6 },
							{ 7, 8, 9 }
						  };
		
		System.out.println("[ 2차원 배열 - 2 ]");
		for(int i = 0; i < score2.length; i++) {
			for(int j = 0; j < score2[i].length; j++) {
				System.out.print(score2[i][j] + " ");
			}
			System.out.printf("\n");
		}
		System.out.println("");
		
		////////////////////////////////////////////////////////////
		
		
		int[][] score3 = new int[3][3];
		int value = 1;
		
		for(int i = 0; i < score3.length; i++) {
			for(int j = 0; j < score3[0].length; j++) {
				score3[i][j] = value;
				value++;
			}
		}
		
		System.out.println("[ 2차원 배열 - 3]");
		for(int i = 0; i < score3.length; i++) {
			for(int j = 0; j < score3[i].length; j++) {
				System.out.print(score3[i][j] + " ");
			}
			System.out.printf("\n");
		}
		System.out.println("");
		
		////////////////////////////////////////////////////////////
		
		int[][] score4 = new int[3][3];
			
		for(int i = 0; i < score4.length; i++) {
			for(int j = 0; j < score4[0].length; j++) {
				score4[i][j] = (i*3)+j+1;
				
			}
		}
		
		System.out.println("[ 2차원 배열 - 4]");
		for(int i = 0; i < score4.length; i++) {
			for(int j = 0; j < score4[i].length; j++) {
				System.out.print(score4[i][j] + " ");
			}
			System.out.printf("\n");
		}

	}	//main
}	//class
