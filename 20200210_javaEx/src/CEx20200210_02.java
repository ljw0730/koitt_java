
public class CEx20200210_02 {
	public static void main(String[] args) {

		int[] score = new int[5];	// 5°³ÀÇ º¯¼ö°¡ ¸¸µé¾î Áü.
		
		for(int i = 0; i < 5; i++) {
			score[i] = (int)(Math.random() * 6) + 1;
			System.out.println((i+1) + "¹ø ·£´ý¼ö : " + score[i]);
			
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
//		System.out.println("1¹ø ·£´ý ¼ö : " + score1);
//		System.out.println("2¹ø ·£´ý ¼ö : " + score2);
//		System.out.println("3¹ø ·£´ý ¼ö : " + score3);
//		System.out.println("4¹ø ·£´ý ¼ö : " + score4);
//		System.out.println("5¹ø ·£´ý ¼ö : " + score5);
	}
}
