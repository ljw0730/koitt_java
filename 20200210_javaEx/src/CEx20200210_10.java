import java.util.Scanner;

public class CEx20200210_10 {
	public static void main(String[] args) {
		// �ζ� �ؾ�����
		// ���� ����
		// �迭�� 45���� ���ֱ�
		// �ζǹ迭 �ڸ� ��ȯ
		// �ζ� ��ȣ ���
		// 3���� ��� ���ʽ�(ball[6]��° ��)�� �´��� ��
		// ��÷ Ȯ��
		
		int[] ball = new int[45];
		
		int[] user = new int[6];
		int[] win_num = new int[6];
		
		int temp = 0;
		int ball_index = 0;
		int success = 0;
				
		final int WON1 = 1600000000;
		final int WON2 = 50000000;
		final int WON3 = 1400000;
		final int WON4 = 50000;
		final int WON5 = 5000;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[   ��   ��   ]");
		
		while(true) {
			for(int i = 0 ; i < user.length; i++) {
				System.out.printf((i+1) + "��° ���ڸ� �Է��ϼ���.(1~45) : ");
				user[i] = scan.nextInt();
				
				if(!(user[i] >= 1 && user[i] <= 45)) {
					System.out.println("��ȣ �Է��� �߸��Ͽ����ϴ�. �ٽ� �Է��� �ּ���.");
					i--;
					continue;
				}
			}
			break;
		}
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		System.out.printf("�ζ� ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d ", ball[i]);
		}
		System.out.println("/ ���ʽ� ��ȣ : " + ball[6]);
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == ball[j]) {
					win_num[i] = user[i];
					success++;
				}
			}
		}
		
		if(success == 5) {
			for(int i = 0; i< user.length; i++) {
				if(user[i] == ball[6]) {
					success += 2;
					win_num[i] = ball[6];
				}
			}
		}
		
		
		if(success == 0) {
			System.out.println("��÷�Ǽ̽��ϴ�.");
		}
		else {
			for(int i = 0; i <win_num.length; i++) {
				if(!(win_num[i]==0)) {
					System.out.println("��÷��ȣ : " + win_num[i]);
				}
			}
			
			switch(success) {
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
					System.out.println("2�� �����̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
				case 1:
					System.out.println("1�� �����̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
			}
		}
		
		scan.close();
				
	}	// main
} //class
