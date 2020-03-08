import java.util.Scanner;

public class CEx20200212_11 {
	public static void main(String[] args) {
		// 강사님 ver.
		
		// 양궁경기 1차경기 2차경기 합 평균
		// 200점 만점 
		// 3명(최미선, 기보배, 장혜진)
		// 200점 이상이면 다시 입력
		// 평균 소수점 첫째자리 까지 입력
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] subject = { " ", "1차경기", "2차경기", "합계", "최종점수", "평균" };		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			//이름 입력
			System.out.println("이름을 입려하세요.>>");
			name[i] = scan.next();
			
			//점수 입력
			for(int j = 0; j < score[i].length-2; j++) {
				System.out.println("점수를 입력해 주세요.>>");
				score[i][j] = scan.nextInt();
				
				// 합계입력 score[i][3]
				score[i][score[i].length-2] += score[i][j];
				
			}
			//최종점수 입력
			if(score[i][0] > score[i][1]) {
				score[i][score[i].length-1] = score[i][0];
			}
			else {
				score[i][score[i].length-1] = score[i][1];
			}
			
			//평균입력 합계/2개점수
			avg[i] = score[i][score[i].length-2] / 2.0;
		}
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");

		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			//평균출력
			System.out.print(avg[i]);
			System.out.println("");
		}
		
		
		
		scan.close();
	} // main
} //class
