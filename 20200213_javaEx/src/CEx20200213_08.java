import java.util.Scanner;

public class CEx20200213_08 {
	public static void main(String[] args) {
		// 학생성적처리 프로그램
		// 1. 학생점수추가 2. 학생점수 수정 3. 학생점수 삭제 0. 종료
		// 1-> 국어점수입력
		
		// 이름 국어 영어 수학 합계 평균
		// n명 입력
		
		Scanner scan = new Scanner(System.in);
		
		// 학생 인원수 입력
		int stu = 0;
		System.out.print("학생은 몇명인가요? : ");
		stu = scan.nextInt(); 
		
		String[] name = new String[stu];	// 이름
		int[][] score = new int[stu][4];	// 점수
		double[] avg = new double[stu];	// 평균
		int[] rank = new int[stu];		// 등수
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		int rank_count = 1;	//등수 카운트
		
		//이름, 점수 입력
		for(int i = 0; i < score.length; i++) {
			//이름 입력
			System.out.print((i+1) + "번째 학생의 이름을 입력해 주세요. : ");
			name[i] = scan.next();			
			
			//점수 입력
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print((i+1) + " 번째 학생의 " + subject[j+1] + "점수를 입력하세요. : ");
				score[i][j] = scan.nextInt();
				
				//유효성 검사
				if(!(score[i][j]>=0 && score[i][j]<= 100)) {
					System.out.println("점수를 잘못 입력 하셨습니다. 다시 입력해 주세요.");
					j--;
					continue;
				}
				
				// 합계 += 추가점수
				score[i][score[i].length-1] += score[i][j]; 
			}
			// 평균 계산
			avg[i] = score[i][score[i].length-1] / (score[i].length-1);			
		}
		
		
		// 등수 매기기
		for(int i = 0; i < score.length; i++) {		// 0, 1, 2
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {		// 0, 1, 2
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
				 //score[i][2] < score[j][2]
				 //score[0][2] < score[0][2] true이면 ==> +1
				 //score[0][2] < score[1][2] true이면 ==> +1
				 //score[0][2] < score[2][2] true이면 ==> +1
					rank_count++;
				}
			}
			//등수 입력
			rank[i] = rank_count;
		}
		
		// 제목 출력
		for(int i = 0; i < subject.length; i++) {
			System.out.printf(subject[i] + "\t");
		}
		System.out.println();
		
		// 이름, 점수 출력
		for(int i = 0; i < score.length; i++) {
			// 이름 출력
			System.out.print(name[i] + "\t");
			// 점수 출력
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			// 평균 출력
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
		scan.close();
		
	}
}
