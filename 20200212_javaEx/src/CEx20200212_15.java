import java.util.Scanner;

public class CEx20200212_15 {
	public static void main(String[] args) {
		//성적처리 프로그램
		// (이름)-String, (국어, 영어, 수학, 합계)-int, (평균)-double
		
		// 이름 입력 받기
		// 점수 입력 받기
		// 합계 계산
		// 평균 계산
		// 출력
		
		String[] name = new String[3];	// 이름 배열
		int[][] score = new int[3][4];	// 점수, 합계 배열
		double[] avg = new double[3];	// 평균 배열
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균" };
		
		Scanner scan = new Scanner(System.in);
		
		//입력
		for(int i = 0; i < name.length; i++) {
			//이름 입력
			System.out.print((i+1) + "번 학생의 이름을 입력해 주세요. : ");
			name[i] = scan.next();
			
			//점수 입력
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " 학생의 " + subject[j+1] + "점수를 입력해 주세요. : ");
				score[i][j] = scan.nextInt();
				
				// 합계 계산
				score[i][score[i].length-1] += score[i][j];
			}
			
			//평균 계산
			for(int j = 0; j < avg.length; j++) {
				avg[i] = score[i][score[i].length-1] / (score[i].length-1);
			}
			
			System.out.println("===================================");
		}
		
		//출력
		//제목란 출력
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");
		
		for(int i = 0; i < score.length; i++) {
			//이름 출력
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				//점수 출력
				System.out.print(score[i][j] + "\t");
			}
			//평균 출력
			System.out.println(avg[i]);
		}
		
		scan.close();
		
	} // main
} //class
