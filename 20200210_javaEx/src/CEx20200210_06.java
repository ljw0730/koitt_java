import java.util.Scanner;

public class CEx20200210_06 {
	public static void main(String[] args) {
		// �ζ�
		// �Ѱ��� ���� �Է¹޾�
		// �ζ� 6���� ���ڿ� �´� �κ��� ������ ��÷
		
		
		//45���� �������� �����ϱ� ���� �迭 ����.
		int[] ball = new int[45];
		
		int[] user = new int[6];		// �ζ� �Է¹�ȣ
		int[] win_num = new int[6];	// �ζ� ��÷�� ��ȣ
		int temp = 0;
		int ball_index = 0;
		int success = 0;
		
		final int WON1 = 1600000000;
		final int WON2 = 50000000;
		final int WON3 = 1400000;
		final int WON4 = 50000;
		final int WON5 = 5000;
		
		

		Scanner scan = new Scanner(System.in);
		
		while(true) {	// ���� �ݺ�
			for (int i = 0; i < user.length; i++) {	// n���� �ζǹ�ȣ �Է� ����
				System.out.printf((i+1) + "��° ���ڸ� �Է��ϼ���.(1~45) : ");
				user[i] = scan.nextInt();
				
				if(!(user[i] >= 1 && user[i] <= 45)) {
					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					i--;
					continue;
				}
			}
			break;
		}
		
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;
		}
						
		// �ζǹ�ȣ �ڸ� ��ȯ
		for(int i = 0; i < 200; i++) {
			//0~ 44���� �迭 index ��ȣ ����
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		//�ζ� ��ȣ ���
		System.out.printf("�ζ� ��ȣ�� : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println(" ���ʽ� : " + ball[6]);
		System.out.printf("\n");
		
		for(int i = 0; i < user.length; i++) { //user[i]  0,1 �� ���������� ����
			for(int j = 0; j < 6; j++) {
				if(ball[j] == user[i]) {
					success++;
					win_num[i] = user[i];
				}
			}
		}
		
		// 3���� ��� ���ʽ�(ball[6]��° ��)�� �´��� ��
		if(success == 5) {
			for(int i = 0; i < user.length; i++) {
				if(user[i] == ball[6]) {
					success += 2;
					win_num[i] = ball[6];
				}
			}	
		}
		
		
		// ��÷�Ǿ����� Ȯ��
		if(success == 0) {
			System.out.println("��÷ �Ǽ̽��ϴ�. 3���̻� �����ž� �մϴ�.");
		}
		else {
			System.out.println("��÷ �Ǿ����ϴ�.");			
			for(int i = 0; i < win_num.length; i++) {
				if(!(win_num[i] == 0)) {
					System.out.println("��÷��ȣ : " + user[i]);
				}
			}	//for
			
			switch (success) {
				case 7:
					System.out.println("���ϵ帳�ϴ�. 2 � ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷ �ݾ��� " + WON2 + "�� �Դϴ�.");
					break;
				case 6:
					System.out.println("���ϵ帳�ϴ�. 1 � ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷ �ݾ��� " + WON1 + "�� �Դϴ�.");
					break;
				case 5:
					System.out.println("���ϵ帳�ϴ�. 3 � ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷ �ݾ��� " + WON3 + "�� �Դϴ�.");
					break;
				case 4: 
					System.out.println("���ϵ帳�ϴ�. 4 � ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷ �ݾ��� " + WON4 + "�� �Դϴ�.");
					break;
				case 3:
					System.out.println("���ϵ帳�ϴ�. 5 � ��÷�Ǽ̽��ϴ�.");
					System.out.println("��÷ �ݾ��� " + WON5 + "�� �Դϴ�.");
					break;
				case 2:
					System.out.println("2�� ��÷�Ǿ����ϴ�.");
					System.out.println("��÷ �ݾ��� �����ϴ�.");
					break;
				case 1:
					System.out.println("1�� ��÷�Ǿ����ϴ�.");
					System.out.println("��÷ �ݾ��� �����ϴ�.");
					break;
			}
			
		} //else
		
		scan.close();
		
	}	// main
} //class
