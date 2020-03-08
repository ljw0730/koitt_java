import java.util.Scanner;

public class CEx20200212_13 {
	public static void main(String[] args) {
		// 강사님 ver.
		
		// 성적처리 프로그램
		// (이름)-String, (국어, 영어, 수학, 합계)-int, (평균)-double
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		// [0,0][0,1][0,2]-점수 [0.3]- 합계
		// [1,0][1,1][1,2]-점수 [1,3]- 합계
		// [2,0][2,1][2,2]-점수 [2,3]- 합계
		
		double[] avg = new double[3];
		
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균" };
		
		Scanner scan = new Scanner(System.in);
		
		// 입력 폼
		for(int i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.println((i+1) + "번 학생의 이름을 입력해 주세요.");
			name[i] = scan.next();
		
			// 점수 입력
			for(int j = 0; j < score[i].length-1 ; j++) {
				System.out.println(subject[j+1] + "점수를 입력해 주세요.");
				score[i][j] = scan.nextInt();
			
				// 합계 계산
				score[i][score[i].length-1] += score[i][j];
				// score[i][score[i].length-1] = score[i][score[i].length-1] + score[i][j];
			}
			
			// 평균 계산
			avg[i] = score[i][score[i].length -1] / (score[i].length-1);
		}
		
		// 출력
		for(int i = 0; i< subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");
		for(int i = 0; i < score.length; i++) {		// int[3][4] 에서 3
			// 이름 출력
			System.out.print(name[i] + "\t");
			// 점수, 합계 출력
			for(int j = 0; j < score[i].length; j++) {	// int[3][4] 에서 4
				System.out.print(score[i][j] + "\t");
			}
			// 평균 출력
			System.out.println(avg[i]);
		}
		
		scan.close();
		
	} // main
} //class
