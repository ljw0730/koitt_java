import java.util.Scanner;

public class CEx20200213_09 {
	public static void main(String[] args) {
		// 성적처리 프로그램
		// 1. 이름 입력
		// 2. 성적 입력
		// 3. 합계 계산
		// 4. 평균 계산
		// 5. 등수 계산
		
		int stu = 0;
		int rank_count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("학생은 몇명인가요? : ");
		stu = scan.nextInt();
		
		String[] name = new String[stu];
		int[][] score = new int[stu][4];
		double[] avg = new double[stu];
		int[] rank = new int[stu];
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		for(int i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요 : ");
			name[i] = scan.next();
			//점수입력
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " 학생의 " + subject[j+1] + "점수를 입력하세요 : ");
				score[i][j] = scan.nextInt();
				
				//유효성 검사
				if(!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("점수를 잘못 입력하셨습니다. 다시입력해 주세요.");
					j--;
					continue;
				}
				
				// 합계계산
				score[i][score[i].length-1] += score[i][j];
			}
			// 평균계산
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
		}
		
		//등수 계산
		for(int i = 0; i < score.length; i++) {
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			rank[i] = rank_count;
		}
		
		
		// 타이틀 출력
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
				
		for(int i = 0; i < score.length; i++) {
			// 이름 출력
			System.out.print(name[i] + "\t");
			// 점수 출력
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			// 평균 출력
			System.out.print(avg[i] + "\t");
			// 등수 출력
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
		
	}
}
