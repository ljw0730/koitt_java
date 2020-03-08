import java.util.Scanner;

public class CEx20200213_01 {
	public static void main(String[] args) {
		// �ζ�
		
		// ���� �Է�
		// 1~45 �Է�
		// ����
		// user �Է�
		// �ζǹ�ȣ ���
		// ��÷ Ȯ��
		// 3��?
		// ��÷��ȣ ���
		// ��÷ ���
		
		int[] ball = new int[45];
		int[] user = new int[6];
		int[] win_num = new int[6];
		
		int temp = 0;
		int ball_index = 0;
		int success = 0;
		
		final int WON1 = 1000000000;
		final int WON2 = 100000000;
		final int WON3 = 1000000;
		final int WON4 = 100000;
		final int WON5 = 5000;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;			
		}
		
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		for(int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"��° ��ȣ�� �Է��� �ּ��� : ");
			user[i] = scan.nextInt();
			
			if(user[i] < 1 || user[i] > 45) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				i--;
				continue;
			}
		}
		
		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == ball[j]) {
					success++;
					win_num[i] = user[i];
				}
			}
		}
		
		if(success == 5) {
			for (int i = 0; i < 6; i++) {
				if(user[i] == ball[6]) {
					success += 2;
					win_num[i] = user[i];
				}
			}
		}
	
		if(success == 0) {
			System.out.println("��÷�ϼ̽��ϴ�.");
		}
		else {
			System.out.print("��÷ ��ȣ : ");
			for(int i = 0; i < 6; i++) {
				if(!(win_num[i] == 0))
				System.out.print(win_num[i] + " ");
			}
			System.out.println("");
			
			switch (success) {
				case 6:
					System.out.println("���ϵ帳�ϴ�. 1� ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷�ݾ��� " + WON1 + "�� �Դϴ�.");
					break;
				case 7:
					System.out.println("���ϵ帳�ϴ�. 2� ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷�ݾ��� " + WON2 + "�� �Դϴ�.");
					break;
				case 5:
					System.out.println("���ϵ帳�ϴ�. 3� ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷�ݾ��� " + WON3 + "�� �Դϴ�.");
					break;
				case 4:
					System.out.println("���ϵ帳�ϴ�. 4� ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷�ݾ��� " + WON4 + "�� �Դϴ�.");
					break;
				case 3:
					System.out.println("���ϵ帳�ϴ�. 5� ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷�ݾ��� " + WON5 + "�� �Դϴ�.");
					break;
				case 2:
					System.out.println("�ƽ����ϴ�. 2�� ���߼̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
				case 1:
					System.out.println("�ƽ����ϴ�. 1�� ���߼̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
			}
		}
	
	
	
	
	
	
	}
}
