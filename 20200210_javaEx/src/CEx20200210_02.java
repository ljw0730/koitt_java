
public class CEx20200210_02 {
	public static void main(String[] args) {

		int[] score = new int[5];	// 5���� ������ ����� ��.
		
		for(int i = 0; i < 5; i++) {
			score[i] = (int)(Math.random() * 6) + 1;
			System.out.println((i+1) + "�� ������ : " + score[i]);
			
		}
		
//		int[] total;
//		total = new int[5];
//		total[0] = 1;
		
		
//		int score1= (int)(Math.random() * 6) + 1;
//		int score2= (int)(Math.random() * 6) + 1;
//		int score3= (int)(Math.random() * 6) + 1;
//		int score4= (int)(Math.random() * 6) + 1;
//		int score5= (int)(Math.random() * 6) + 1;
//		
//		System.out.println("1�� ���� �� : " + score1);
//		System.out.println("2�� ���� �� : " + score2);
//		System.out.println("3�� ���� �� : " + score3);
//		System.out.println("4�� ���� �� : " + score4);
//		System.out.println("5�� ���� �� : " + score5);
	}
}
