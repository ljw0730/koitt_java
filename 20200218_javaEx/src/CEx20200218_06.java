import java.util.Scanner;

public class CEx20200218_06 {

	public static void main(String[] args) {
		//  Lotto_num , Lotto_user_num class �� �����
		
		// �ζǴ�÷��ȣ ��÷��ȣ 6��, ���ʽ� ��ȣ(����) 
		// ���� �Է��� ��ȣ class	�Է¹�ȣ 6��, ��ġ����, ���, �ݾ� 
		// �Է� > ȸ���Է� > ��ȣ6�ڸ� �Է�
		// ȸ�� �˻��ؼ� -> � ��ġ�ϴ���? ��� �������? �ݾ��� ������?
		// 1�� 10��-6��, 2�� 1��-5�����ʽ�1��, 3�� 1õ��-5��, 4�� 1�ʸ�-4��, 5�� 1��-3��
		// �ɼ� : �ݾ� - 1�ǿ� 1õ�� / �ʱ��ڱ� 1����
		
		// �ζǹ�ȣ �迭 ����
		// �ζǹ�ȣ 1~45 �Է�
		// �ζǹ�ȣ �������� ����
		// �Է��ϴ� ��ȣ ��ü 10�� ����
		// �Է� 10�� ����
		// ���
		
		
		// �ζǹ�ȣ �迭 ����
		int[] lotto = new int[45];
		int same = 0;
		
		
		//�Է��ϴ� ��ȣ ��ü 10�� ����
		Lotto_user[] user = new Lotto_user[10];
		
		Scanner scan = new Scanner(System.in);
		
		// �ζǹ�ȣ 1~45 �Է�
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		
		// �ζǹ�ȣ �������� ����
		shuffle(lotto);
		
		//��ȣ�Է� 
		for(int i = 0; i < user.length; i++) {
			//�Է��ϴ� ��ȣ ��ü 10�� ����
			user[i] = new Lotto_user();
			for(int j = 0; j < 6; j++) {
				System.out.println((i+1) + "��° " + (j+1) + "�� �ζǹ�ȣ�� �Է��� �ּ���.");
				user[i].lotto_num[j] = scan.nextInt();
				
				// �ζǹ�ȣ�� �Է¹�ȣ�� ��ġ��
				if(lotto[i] == user[i].lotto_num[j]) {
					same++;
				}
			}
			
			user[i].same_num = same;
			
			switch(same) {
				case 0:
					user[i].rank = 7;
					user[i].reward = 0;
					break;
				case 1:
					user[i].rank = 6;
					user[i].reward = 0;
					break;
				case 2:
					user[i].rank = 5;
					user[i].reward = 0;
					break;
				case 3:
					user[i].rank = 4;
					user[i].reward = 10000;
					break;
				case 4:
					user[i].rank = 3;
					user[i].reward = 10000000;
					break;
				case 5:
					user[i].rank = 2;
					user[i].reward = 100000000;
					break;
				case 6:
					user[i].rank = 1;
					user[i].reward = 1000000000;
					break;
				
			} //switch
		} //for
		
		System.out.println("�ζǹ�ȣ : ");
		for(int i = 0; i < 6; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println(" ���ʽ� ��ȣ : " + lotto[6]);
		
		System.out.println("�Է¹�ȣ 10��");
		for(int i = 0; i < user[i].lotto_num.length; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("�Է¹�ȣ : " + user[i].lotto_num[j] + " ");
			}
			System.out.print("��ġ���� : " + user[i].same_num + " ");
			System.out.print("��� : " + user[i].rank + " ");
			System.out.print("��� : " + user[i].reward + " ");
			System.out.println();
		}
		
		
		
		
		
//		int[] ball = new int[45];
//		int[] lotto = new int [7];
//		
//		int game_count = 3;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		// �ζǹ�ȣ �̱�
//		lotto_num(ball, lotto);
//		
//		Lotto_user[] user = new Lotto_user[3];
//		
//		// user �Է�
//		//user_input(user, scan);
//		
//		//
//		
//		
////		for(int i = 0; i < game_count; i++) {
////			for(int j = 0; j < user.user[i].length; j++) {
////				System.out.print((i+1) + "�� ���� - " + (j+1) + "��° ��ȣ�� �Է��� �ּ���. : ");
////				user.user[i][j] = scan.nextInt();
////			}
////			System.out.println();
////			System.out.println("=======================================");
////		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.print("�ζ� ��ȣ : ");
//		for(int i = 0; i < lotto.length-1; i++) {
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.print(" / ���ʽ� : " + lotto[6]);
		
		
		
	}	//main
	
	// ���� �޼ҵ�
	static void shuffle(int[] lotto) {
		
		int temp = 0;
		int num = 0;
		
		for(int i = 0; i < 200; i++) {
			num = (int)(Math.random()*45);
			
			temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
	}
	
	
	
	
	
	
//	static void lotto_num(int[] ball, int[] lotto) {
//		int temp = 0;
//		int ball_index = 0;
//		
//		for(int i = 0; i < ball.length; i++) {
//			ball[i] = i+1;
//		}
//		
//		for(int i = 0; i < 200; i++) {
//			ball_index = (int)(Math.random()*45);
//			
//			temp = ball[0];
//			ball[0] = ball[ball_index];
//			ball[ball_index] = temp;
//		}
//		
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = ball[i];
//		}
//	}
//	
//	static void user_input(Lotto_user_num user, Scanner scan) {
//		
//	}
	
}	// class

