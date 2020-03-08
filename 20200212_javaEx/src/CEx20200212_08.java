import java.util.Scanner;

public class CEx20200212_08 {
	public static void main(String[] args) {
		// 학생 3명, 국어, 영어, 수학, 과학, 합계
		
		String[] name = new String[3];
		int[][] score = new int[3][5];
		
		String subject = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			//이름 입력
			System.out.print((i+1)+ "번 학생의 이름을 입력해 주세요. : ");
			name[i] = scan.next();
			
			//점수 입력
			for(int j = 0; j < score[i].length-1; j++) {
				if(j == 0) {
					subject = "국어";
				}
				else if(j == 1) {
					subject = "영어";
				}
				else if(j == 2) {
					subject = "수학";
				}
				else if(j == 3) {
					subject = "과학";
				}
				
				System.out.print(name[i] + " 학생의 " + subject + "점수를 입력해 주세요. : ");
				score[i][j] = scan.nextInt();
			}
			
			//합계 계산
			for(int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
			
//			//평균 계산
//			for(int j = 0; j < score[i].length-1 j++) {
//				
//			}
			
			System.out.println("=============================================");
		}
		
		//출력
		System.out.println("\t국어\t영어\t수학\t과학\t합계");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scan.close();
				
	} // main
} //class
