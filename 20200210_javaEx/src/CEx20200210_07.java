import java.util.Scanner;

public class CEx20200210_07 {
	public static void main(String[] args) {
		// 1 ~ 10 ī��
		// �迭�� 1 ~ 10���� ���� ī�带 �����.
		// ��ǻ���� �迭 1 ~ 10���� ����ī�带 �����.
		// ��ǻ�� �������� ����
		//
		// �ڽ��� ���ϴ� �迭�� ���� ī�带 �����ؼ�
		// �ڽ��� ������ �¸�
		// ������ ���º� / ������ �й�
		// �·��� ���غ�����.
		
		int[] userCard = new int[10];	// ���� ī�� �迭
		int[] comCard = new int[10];	// ��ǻ�� ī�� �迭
				
		int temp = 0;		//���� ���� �ӽ� ����
		int ran_index = 0;	//��ǻ�� ī�� �迭 ���� ���� ���� �ε���
		
		int set_myCard = 0;		// ���� �� ī���� �Է��� �޴� ����
			
		int game_count = 0;		// ���� ����°�ΰ�
		int win_count = 0;		// �̱� Ƚ��
		int draw_count = 0;		// ���º� Ƚ��
		int lose_count = 0;		// �� Ƚ��

		int [] win_lose = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < userCard.length; i++) {
			userCard[i] = (i+1);
			comCard[i] = (i+1);
		}
		
		// ��ǻ�� ī�� ����
		for(int i = 0; i < 200; i++) {
			//0 ~ 9���� �迭 index ��ȣ ����
			ran_index = (int)(Math.random()*10);
			
			temp = comCard[0];
			comCard[0] = comCard[ran_index];
			comCard[ran_index] = temp;
		}
		System.out.println("===============================");
		System.out.println("=========== ī �� �� �� ===========");
		System.out.println("===============================");
		
		
		while (game_count < 10) {
			System.out.println((game_count + 1) + "��° ������ �����մϴ�.");
			System.out.printf("�� ī�带 �����ϼ���.(1~10)(���� - 99) : ");
			set_myCard = scan.nextInt() - 1;
			if(set_myCard == 99) {
				break;
			}
			else if (set_myCard < -1 || set_myCard >10) {
				System.out.println("�Է��� �ߵǾ����ϴ�. �ٽ� ������ �ּ���.");
				continue;
			}
			
			if (userCard[set_myCard] == 0) {
				System.out.println("�̹� �ѹ� �� ī���Դϴ�. �ٽ� ������ �ּ���.");
				System.out.printf("���� �� �ִ� ī��� ");
				for(int i = 0; i < userCard.length; i ++) {
					if (!(userCard[i] == 0)) {
						System.out.printf("%d, ", userCard[i]);
					}
				}
				System.out.printf(" �Դϴ�.\n");
				continue;
			}
			
			if(userCard[set_myCard] > comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("�¸�");
				win_count++;
				win_lose[game_count] = 1;
				System.out.println("========================================== ");
			}
			else if(userCard[set_myCard] == comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("���º�");
				draw_count++;
				win_lose[game_count] = 0;
				System.out.println("========================================== ");
			}
			else if(userCard[set_myCard] < comCard[game_count]) {
				System.out.println("user : " + userCard[set_myCard] + " / com : " + comCard[game_count]);
				System.out.println("�й�");
				lose_count++;
				win_lose[game_count] = -1;
				System.out.println("========================================== ");
			}
			
			userCard[set_myCard] = 0;
			game_count++;
		}
		
		for(int i = 0; i < win_lose.length; i++) {
			if(win_lose[i] == 1) {
				System.out.println((i+1) + "��° �º� : �¸�");
			}
			else if(win_lose[i] == 0) {
				System.out.println((i+1) + "��° �º� : ���º�");
			}
			else if(win_lose[i] == -1) {
				System.out.println((i+1) + "��° �º� : �й�");
			}
		}
		System.out.printf("�¸� : %dȸ / ���º� : %dȸ / �й� : %dȸ\n", win_count, draw_count, lose_count);		
		System.out.printf("�·� : %.1f%%\n", ((float)(win_count*100)/game_count));
			
		System.out.println("������ �����մϴ�.");
		
		scan.close();
		
	}	// main
} //class
