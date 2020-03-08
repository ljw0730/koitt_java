import java.util.Scanner;

public class CEx20200212_10 {
	public static void main(String[] args) {
		// 양궁경기 1차경기 2차경기 합 평균
		// 200점 만점
		// 3명
		// 200점 이상이면 다시 입력
		// 평균 소수점 첫째자리 까지 입력
		
		String[] name = new String[3];
		double[][] score = new double[3][4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.print((i+1) + "번째 선수의 이름을 입력해 주세요. : ");
			name[i] = scan.next();
			
			// 점수 입력
			for(int j = 0; j < score[i].length-2; j++) {
				System.out.print((j+1) + "차 경기 점수를 입력해 주세요. : ");
				score[i][j] = scan.nextDouble();
				
				if(score[i][j] > 200) {
					System.out.println("점수를 잘못 입력하셨습니다. 다시 입력해 주세요.");
					j--;
					continue;
				}
			}
			
			//합계 계산
			for(int j = 0; j < score[i].length-2; j++) {
				score[i][score[i].length-2] += score[i][j];
			}
			
			//평균 계산
			score[i][score[i].length-1] = score[i][score[i].length-2]/(score[i].length-2);
					
		}
		
		
		//출력
		System.out.println("[ 양 궁 경 기 ]");
		System.out.println("\t1차경기\t2차경기\t합계\t평균");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f\t", score[i][j]);
			}
			System.out.println("");
		}
		
		
		scan.close();
	} // main
} //class
