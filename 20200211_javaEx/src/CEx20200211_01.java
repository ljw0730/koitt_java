import java.util.Scanner;

public class CEx20200211_01 {
	public static void main(String[] args) {
		// 1. ���� ����
		// 2. user ��ȣ �ޱ�
		// 3. ball�� 1~45�ֱ�
		// 4. ball ����
		// 5. �ζ� ��ȣ ���
		// 6. ��÷ Ȯ��
		// 7. 3���� ��� ���ʽ� �´��� Ȯ��
		// 8. ��÷ ���
		
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
		
		System.out.println("[   ��   ��   ]");
		
		for(int i = 0; i < user.length; i++) {
			System.out.printf("%d��° ��ȣ�� �Է��� �ּ���. : ", (i+1));
						
			user[i] = scan.nextInt();
			
			if(!(user[i] >= 1 && user[i] <=45)) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				i--;
				continue;
			}
		}
		
		
		for(int i = 0; i < 45; i++) {
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
		System.out.printf("/ ���ʽ� %d\n", ball[6]);
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == ball[j]) {
					win_num[i] = user[i];
					success++;
				}
			}
		}
		
		if(success == 5) {
			for(int i = 0; i < 6; i ++) {
				if(user[i] == ball[6]) {
					win_num[i] = user[i];
					success += 2;
				}
			}
		}
		
		if(success == 0) {
			System.out.println("��÷�Ǽ̽��ϴ�.");
		}
		else {
			System.out.printf("��÷��ȣ : " );
			for(int i = 0; i < win_num.length; i++) {
				if(!(win_num[i] == 0)) {
					System.out.printf("%d ", win_num[i]);
				}
			}
			System.out.printf("\n");
			
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
					System.out.println("2���� ���߼̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
				case 1:
					System.out.println("1���� ���߼̽��ϴ�.");
					System.out.println("��÷�ݾ��� �����ϴ�.");
					break;
			}
		}
		
		scan.close();
	}
}
