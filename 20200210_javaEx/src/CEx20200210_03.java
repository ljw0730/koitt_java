
public class CEx20200210_03 {
	public static void main(String[] args) {

		// 1~100 ������ �迭�� �����ϰ� 
		// ������ 0�� ������ sum
		// 1��������� sum ... 100������� sum��
		// �ٸ��迭��ҿ� ������ ������.
		
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
			System.out.println(score[i] + "��������� �� : " + sum[i]);
			
		}
		
//		// 100���� ���ڸ� 1~100���� �ؼ� ������ �迭�� ���� �غ�����.
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
