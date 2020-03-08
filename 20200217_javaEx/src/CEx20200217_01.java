import java.util.Scanner;

public class CEx20200217_01 {
	public static void main(String[] args) {
		// 성적처리 프로그램
		// 기본 - 이름 , 국어 , 영어, 수학, 합계, 평균, 등수
		// 옵션 - 1.학생추가 2.학생출력 3.등수처리. 0.종료
		
		// 변수 선언
		// 이름 입력
		// 점수 입력
		// 합계 계산
		// 평균 계산
		// 등수 계산
		// 타이틀 / 이름 / 점수,합계 / 평균 / 등수 출력 
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		int[] rank = new int[3];
		
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		
		int rank_count = 1;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력해 주세요. : ");
			name[i] = scan.next();
			
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " 학생의 " + subject[j+1] + "점수를 입력해 주세요 : ");
				score[i][j] = scan.nextInt();
				
				if(score[i][j] < 0 || score[i][j] > 100) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
					j++;
					continue;
				}
				
				score[i][score[i].length-1] += score[i][j];
			}
			
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
		}
		
		for(int i = 0; i < score.length; i++) {
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			
			rank[i] = rank_count;
		}
		
		
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
	}

}
