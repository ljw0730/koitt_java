import java.util.Scanner;

public class CEx20200206_09 {
	public static void main(String[] args) {
		// ���������� ����
		// ��ǻ���� �������� ���������� ���� ����
		// ����1 / ����2 / ��3
		// 10�� ���� (�ð��Ǹ� �Է� ���� Ƚ���� ����)
		// �̱� -> �¸� / ���º� -> ���º� / �� -> �й� ���
		// ��� �¸� �ߴ��� ���
		
		int my_hand = 0;		//���� ���� ����������
		int com_hand = 0;		// ��ǻ�Ͱ� ���� ����������
		
		String yn = "";				// ������ �� �Ұ�����?
		
		int game_count = 0;		// �����Ұ���?
		int gaming_count = 0;	// �������°����
		int win_count = 0;		// �̱� Ƚ��
		int tie_count = 0;		// ���º� Ƚ��	// ���º� ����
		int defeat_count = 0;	//�� Ƚ��
		String win_defeat = "";	// 1 : �¸� 2 : �й�
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) {
			System.out.println("[ ����! ����! ��!!! ���� ]");
			System.out.printf("��� �Ͻǰ��� ���� �ּ���.(���� : 0) : ");
			game_count = scan.nextInt();
			if(game_count == 0 ) {
				break;
			}
			System.out.println(game_count + "���� ���������� ������ �����մϴ�.");
			
			while(gaming_count < game_count) {
				System.out.println("====================================");
				System.out.println("������������ ���� �մϴ�.");
				System.out.println((gaming_count+1) + "��° ��");
				System.out.printf("����! ����! ��!!! (���� : 0) : ");
				my_hand = scan.nextInt();
				if(my_hand == 0) {
					break Loop1;
				}
				else if((my_hand < 1 || my_hand >3)) {
					System.out.println("������������ �ƴ��ݾƿ�. �ٽó�����.");
					continue;
				}
				
				com_hand = (int)(Math.random()*3)+1;
				
				System.out.println(com_hand);
				
				switch (my_hand) {
					case 1:
						switch(com_hand) {
							case 1:
								System.out.println("���� ����! ��뵵 ����!");
								System.out.println("�����ϴ�. �ٽ��ҰԿ�.");
								continue;
							case 2:
								System.out.println("���� ����! ���� ����!");
								System.out.println("�����ϴ�.");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
							case 3:
								System.out.println("���� ����! ���� ��!");
								System.out.println("�̰���ϴ�.");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
						}
						break;
						
					case 2:
						switch(com_hand) {
						case 1:
							System.out.println("���� ����! ���� ����!");
							System.out.println("�̰���ϴ�.");
							win_count++;
							gaming_count++;
							win_defeat += "1";
							break;
						case 2:
							System.out.println("���� ����! ��뵵 ����!");
							System.out.println("�����ϴ�. �ٽ��ҰԿ�.");
							continue;
						case 3:
							System.out.println("���� ����! ���� ��!");
							System.out.println("�����ϴ�.");
							defeat_count++;
							gaming_count++;
							win_defeat += "2";
							break;
							
						}
						break;
						
					case 3:
						switch(com_hand) {
						case 1:
							System.out.println("���� ��! ���� ����!");
							System.out.println("�����ϴ�.");
							defeat_count++;
							gaming_count++;
							win_defeat += "2";
							break;
						case 2:
							System.out.println("���� ��! ���� ����!");
							System.out.println("�̰���ϴ�.");
							win_count++;
							gaming_count++;
							win_defeat += "1";
							break;
						case 3:
							System.out.println("���� ��! ��뵵 ��!");
							System.out.println("�����ϴ�. �ٽ��ҰԿ�.");
							continue;
						}
						break;
				}
							
			}
			
			
			System.out.println("====================================");
			for(int i = 0; i < gaming_count; i++) {
				if(win_defeat.charAt(i) == '1') {
					System.out.println((i+1) + "���� �� : �¸�");
				}
				else if (win_defeat.charAt(i) == '2') {
					System.out.println((i+1) + "���� �� : �й�");
				}
				
			}
			
			System.out.println("���� - �¸�: " + win_count + " �й�: " + defeat_count);
			int winning_rate = (win_count * 100) / game_count;
			System.out.println("�·��� " + winning_rate + "% �Դϴ�.");
			
			
			while(true) {
				System.out.println("�ٽ� ������������ �Ͻðڽ��ϱ�?(Y/N)");
				yn = scan.next();
				
				//equalsIgnoreCase : ��ҹ��� ������� ��
				if(yn.equalsIgnoreCase("y")) {
					
					//���� �ʱ�ȭ
					game_count = 0;
					gaming_count = 0;	
					win_count = 0;		
					tie_count = 0;		
					defeat_count = 0;	
					win_defeat = "";
					yn = "";
					
					continue Loop1;
				}
				else if(yn.equalsIgnoreCase("n")) {
					break Loop1;
				}
				else {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				}
			}
		}
		
		System.out.printf("���������� ������ �����մϴ�.");
		
		scan.close();
		
	}	//main
}	// class
	
