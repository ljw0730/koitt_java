import java.util.Scanner;

public class CEx20200211_11 {
	public static void main(String[] args) {
		
		// 시간표 출력
		//  월     화     수     목     금
		//1 국어   수학   국어   영어   국사
		//2 과학1  영어   수학   과학2  세계사
		//3 수학   과학1  국사   윤리   체육
		//4 음악   미술   체육   국어   영어
		
		String[][] subject = new String[4][5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < subject.length; i++) {
			for(int j = 0; j < subject[0].length; j++) {
				System.out.printf((i*5)+j+1 + "과목을 입력해 주세요. : ");
				subject[i][j] = scan.next();
			}
		}
		
				
		System.out.println("\t\t[   시   간   표   ]");
		System.out.printf("\t월\t화\t수\t목\t금\n");
		
		for(int i = 0; i < subject.length; i++) {
			for(int j = 0; j < subject[0].length; j++) {
				if(j == 0) {
					System.out.printf("%d", (i+1));					
				}
				System.out.printf("\t%s", subject[i][j]);
			}
			System.out.println("");
		}
		
		scan.close();
	}	//main
}	//class
