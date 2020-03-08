public class CEx20200211_10 {
	public static void main(String[] args) {
		
		// 시간표 출력
		//  월     화     수     목     금
		//1 국어   수학   국어   영어   국사
		//2 과학1  영어   수학   과학2  세계사
		//3 수학   과학1  국사   윤리   체육
		//4 음악   미술   체육   국어   영어
		
		String[][] subject = {
								{ "국어", "수학", "국어", "영어", "국사" },
								{ "과학1", "영어", "수학", "과학2", "세계사" },
								{ "수학", "과학1", "국사", "윤리", "체육" },
								{ "음악", "미술", "체육", "국어", "영어" }
							 };
				
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
	}	//main
}	//class
