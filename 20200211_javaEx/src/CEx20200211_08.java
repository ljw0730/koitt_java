public class CEx20200211_08 {
	public static void main(String[] args) {
		
		// [7][9] for��
		
		int[][] score = new int[7][9];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j <score[0].length; j++) {
				score[i][j] = (i*9)+j+1;
			}
		}
		
		System.out.println("[ 2���� �迭 ]");
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("\n");
		}
		
		
	}	//main
}	//class
