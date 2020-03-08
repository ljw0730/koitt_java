import java.util.Scanner;

public class CEx20200210_04 {
	public static void main(String[] args) {

		// ���������� ������ ����� ������.
		
		int select = 0;
		int user = 0;
		int com = 0;
		
		int game_count = 0;
		int win_count = 0;
		int lose_count = 0;	// 1: �¸� / -1: �й�
		
		int[] win_lose_check = new int[10];
		
		
		Scanner scan = new Scanner(System.in);
				
		Loop1: while(true) {
			System.out.println("=====================================");
			System.out.println("[ ���� ���� �� ���� ]");
			System.out.println("���ӽ���[1] / ����Ȯ��[2] / ����[0]");
			select = scan.nextInt();
			
			if (select == 0) {
				break;
			}
			else if (select == 1) {
				while (game_count < 10) {
					System.out.println("=====================================");
					
					System.out.println((game_count + 1) + "��° ��!!");
					System.out.println("����! ����! ��!");
					System.out.printf("����[1] / ����[2] / ��[3] / ����[0] : ");
					user = scan.nextInt();
					
					if(user == 0) {
						break Loop1;
					}
					else if (user < 1 && user > 3) {
						System.out.println("�߸��Է��ϼ̽��ϴ�.");
						continue;
					}
					
					com = (int)(Math.random() * 3) + 1;
					
					switch (user) {
						case 1:
							switch (com) {
								case 1:
									System.out.println("user : ���� / com : ����");
									System.out.println("�����ϴ�.");
									System.out.println("������������ �ٽ��մϴ�.");
									continue;
								case 2:
									System.out.println("user : ���� / com : ����");
									System.out.println("�����ϴ�.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
								case 3:
									System.out.println("user : ���� / com : ��");
									System.out.println("�̰���ϴ�.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
							}
												
							break;
						case 2:
							switch (com) {
								case 1:
									System.out.println("user : ���� / com : ����");
									System.out.println("�̰���ϴ�.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
								case 2:
									System.out.println("user : ���� / com : ����");
									System.out.println("�����ϴ�.");
									System.out.println("������������ �ٽ��մϴ�.");
									continue;
								case 3:
									System.out.println("user : ���� / com : ��");
									System.out.println("�����ϴ�.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
							}
							
							break;
						case 3:
							switch(com) {
								case 1:
									System.out.println("user : �� / com : ����");
									System.out.println("�����ϴ�.");
									lose_count++;
									win_lose_check[game_count] = -1;
									game_count++;
									break;
								case 2:
									System.out.println("user : �� / com : ����");
									System.out.println("�̰���ϴ�.");
									win_count++;
									win_lose_check[game_count] = 1;
									game_count++;
									break;
								case 3:
									System.out.println("user : �� / com : ��");
									System.out.println("�����ϴ�.");
									System.out.println("������������ �ٽ��մϴ�.");
									continue;
							}
							
							break;
					}	//user switch
				}	//���������� while
				
				System.out.printf("�·� : %.1f %%\n", ((float)(win_count * 100) / game_count));
				
			}	// ���ӽ��� if
			else if (select == 2) {
				if(win_lose_check[0] == 0) {
					System.out.println("���� ���������� ������ ������ �ּ���.");
					continue Loop1;
				}
				
				for (int i = 0; i < 10; i++) {
					if(win_lose_check[i] == 1) {
						System.out.println((i+1) + "��° �º� : �¸�");
					}
					else if(win_lose_check[i] == -1) {
						System.out.println((i+1) + "��° �º� : �й�");
					}
				}
			}
		
		
		}	// ��ü while
		System.out.println("������ �����մϴ�.");
		
	}	// main
} //class
