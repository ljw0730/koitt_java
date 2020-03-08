import java.util.Scanner;

public class CEx20200212_07 {
	public static void main(String[] args) {
		// 학생들의 점수를 입력하는 배열
		// 이름을 입력하는 배열 3개, 점수를 입력하는 배열 [3][3]
		// 국어점수, 영어점수, 수학점수
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		
		String subject = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			// 이름 입력
			System.out.print((i+1) + "번째 학생의 이름을 입력해주세요. : ");
			name[i] = scan.next();
			
			// 점수 입력
			for(int j = 0; j < score[0].length-1; j++) {
				if(j == 0) {
					subject = "국어";
				}
				else if(j == 1) {
					subject = "영어";
				}
				else if(j == 2) {
					subject = "수학";
				}
				
				System.out.print(name[i] + "학생의 " + subject + "점수를 입력해주세요. : ");
				score[i][j] = scan.nextInt();
			}
			
			// 합계입력
			for(int j = 0;  j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
			
			System.out.println("=============================================");
		}
		
		//출력
		System.out.println("\t국어\t영어\t수학\t합계");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scan.close();
		
	} // main
} //class
