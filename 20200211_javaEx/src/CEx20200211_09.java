import java.util.Scanner;

public class CEx20200211_09 {
	public static void main(String[] args) {
		
		// [3][3]
		// 국어 영어 수학
		// 100  78   99
		// 87   85   100
		// 75   100  88
	
		int[][] score = new int[3][3];
		String subject = "";		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				if(j == 0) {
					subject = "국어";
				}
				else if (j == 1) {
					subject = "영어";
				}
				else if (j ==2) {
					subject = "수학";
				}
				System.out.printf((i+1) + "번 학생 " + subject + "점수를 입력해 주세요 : ");
				score[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\t[ 점 수 판 ]");
		System.out.println("\t국어 \t영어 \t수학");
		for(int i = 0; i < score.length; i++) {
			System.out.printf((i+1) + "학생 : ");
			for(int j = 0; j < score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("\n");
		}		
		
		scan.close();
	}	//main
}	//class
