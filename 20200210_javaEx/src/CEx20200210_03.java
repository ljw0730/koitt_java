
public class CEx20200210_03 {
	public static void main(String[] args) {

		// 1~100 각각의 배열에 저장하고 
		// 각각의 0방 까지의 sum
		// 1번방까지의 sum ... 100방까지의 sum을
		// 다른배열장소에 저장해 보세요.
		
		int[] score = new int[100];
		int[] sum = new int[100];
		
		for(int i = 0; i < 100; i++) {
			score[i] = (i+1);
//			sum[i] += score[i];
			if(i==0) {
				sum[i] = 0 + score[i];
			}
			else {
				// 1 = 0 + 1
				// 3 = 1 + 2
				// 6 = 3 + 3
				//10 = 6 + 4
				// ...
				sum[i] = sum[i-1] + score[i];
				
			}
			System.out.println(score[i] + "번방까지의 합 : " + sum[i]);
			
		}
		
//		// 100개의 숫자를 1~100까지 해서 각각의 배열에 저장 해보세요.
//		int[] score = new int[100];
//		
//		for (int i = 0; i < 100; i ++) {
//			score[i] = (i+1);
//			System.out.println(score[i]);
//		}
		
		
//		int[] score1 = new int[5];
//		score1[0] = 100;
//		score1[1] = 90;
//		score1[2] = 80;
//		score1[3] = 70;
//		score1[4] = 60;
//		
//		int score2 = { 100, 90, 80, 70, 60 };
//		
//		int[] score3;
//		score3 = new int[] { 100, 90, 80, 70, 60 };
		
	}
}
