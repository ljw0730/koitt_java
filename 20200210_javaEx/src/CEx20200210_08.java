import java.util.Scanner;

public class CEx20200210_08 {
	public static void main(String[] args) {
		// ����� ver.
		
		// 1 ~ 10 ī��
		// �迭�� 1 ~ 10���� ���� ī�带 �����.
		// ��ǻ���� �迭 1 ~ 10���� ����ī�带 �����.
		// ��ǻ�� �������� ����
		//
		// �ڽ��� ���ϴ� �迭�� ���� ī�带 �����ؼ�
		// �ڽ��� ������ �¸�
		// ������ ���º� / ������ �й�
		// �·��� ���غ�����.
		
		// user_card ������ ���������� ����Ʈ �غ�����.
		// �ߺ����� ī�带 ���� �ߺ��Դϴ�. �ٽ� �����ϼ���.

		int[] user_card = new int[10];	// ���� ī�� 10��
		int[] com_card = new int[10];	// ��ǻ�� ī�� 10��
		
		int com_index = 0;	// ��ī�� �迭 ���� ����
		int temp = 0;		//�迭 ������ ���� ����
		
		int user_select_card = 0; // ������ ������ ī��
		int win = 0;	// �¸�Ƚ��
		int draw = 0;	// ���º� Ƚ��
		int lose = 0;	// �й� Ƚ��
		
		// ���� 1~10 �Է�
		for(int i = 0; i < 10; i++) {
			user_card[i] = (i+1);	// user ī�� 1~10���� ���� �Է�
			com_card[i] = (i+1);	// com ī�� 1~10���� ���� �Է�
			
		}
		
		
		//��ǻ�� ī�� ����
		for(int i = 0; i < 200; i ++) {
			com_index = (int)(Math.random()*10); // com_card �迭��ȣ 0~9���� ����
			
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		
		Scanner scan = new Scanner(System.in);
		
		// user_card ��ȣ �Է� �޾� com_card ��
		for(int i = 0; i < 10; i++) {
			System.out.println("1)1 2)2 3)3 4)4 5)5 6)6 7)7 8)8 9)9 10)10");
			System.out.println("ī�� 1~10 �� ī�� 1���� �̾��ּ���.");
			user_select_card = scan.nextInt();
			
			if(user_card[user_select_card - 1]  -  com_card[i] > 0 ) {
				System.out.println((i+1) + "��° : �¸�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				win++;
				
				for(int j = 0; j < 10; j++) {
					System.out.printf(user_card[i] + " ");
				}
				System.out.println("");
			}
			else if(user_card[user_select_card - 1] == com_card[i]) {
				System.out.println((i+1) + "��° : ���º�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				draw++;
				
				for(int j = 0; j < 10; j++) {
					System.out.printf(user_card[i] + " ");
				}
				System.out.println("");
			}
			else {
				System.out.println((i+1) + "��° : �й�");
				System.out.println("user_card : " + user_card[user_select_card - 1] + " | com_card : " + com_card[i]);
				user_card[user_select_card] = 0;
				lose++;
			}	//if
		}	//for
		
		System.out.printf("�·� : %.1f%%\n", (float)win/10*100);
		
		scan.close();
		
	}	// main
} //class
