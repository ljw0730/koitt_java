import java.util.Scanner;

public class CEx20200207_05 {
	public static void main(String[] args) {
		//���� ���� �� ����
		
		
		String id = "aaa";
		String pw = "123";		
		
		int login_count = 0;
		
		int user = 0;
		int com = 0;
		
		int game_count = 0;
		int gaming_count = 0;
		int win_count = 0;
		int defeat_count = 0;
		String win_defeat = "";
		
		Scanner scan = new Scanner(System.in);
		
		Loop2:
		while(true) {
			if(login_count == 3) {
				System.out.println("���̵� 3�� Ʋ���̽��ϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			System.out.println("�α��� ���ּ���.");
			System.out.printf("���̵� : ");
			String id_check = scan.next();
			if(!(id.equals(id_check))) {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
				login_count++;
				continue;
			}
			
			login_count = 0;
			
			while(true) {
				if(login_count == 3) {
					System.out.println("��й�ȣ�� 3�� Ʋ���̽��ϴ�.");
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
				System.out.printf("�н����� : ");
				String pw_check = scan.next();
				if(!(pw.equals(pw_check))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					login_count++;
				}
				else {
					break Loop2;
				}
			}
			
		}
		
		
		Loop1:
		while (true) {	//��ü �ݺ� while
			System.out.println("============================");
			System.out.println(" [ ���� ���� ��    ���� ]");
			
			System.out.println("���� �Ͻǰǰ���?? (���� : 0) : ");
			game_count = scan.nextInt();
			if(game_count == 0) {
				break;
			}
			System.out.println(game_count + "���� ���������� ������ �����մϴ�.");
			
			while(game_count > gaming_count) {
				System.out.println("============================");
				System.out.println("������������ ���� �մϴ�.");
				System.out.println((gaming_count+1) + "��° ��");
				System.out.print("����(1) ����(2) ��(3) // ����(0) : ");
				user = scan.nextInt();
				
				if(user == 0) {
					break Loop1;
				}
				else if(user < 1 || user > 3) {
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
				
				com = (int)(Math.random() * 3) + 1;
				
				switch(user) {
					case 1:
						switch(com) {
							case 1:
								System.out.println("user : ���� / com : ����");
								System.out.println("�����ϴ�. �ٽ� ������������ �մϴ�.");
								continue;
								
							case 2:
								System.out.println("user : ���� / com : ����");
								System.out.println("�����ϴ�. �Ф�");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
							case 3:
								System.out.println("user : ���� / com : ��");
								System.out.println("�̰���ϴ�. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
						}
						break;
						
					case 2:
						switch(com) {
							case 1:
								System.out.println("user : ���� / com : ����");
								System.out.println("�̰���ϴ�. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
								
							case 2:
								System.out.println("user : ���� / com : ����");
								System.out.println("�����ϴ�. �ٽ� ������������ �մϴ�.");
								continue;
								
							case 3:	
								System.out.println("user : ���� / com : ��");
								System.out.println("�����ϴ�. �Ф�");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
						}
						break;
						
					case 3:
						switch(com) {
							case 1:
								System.out.println("user : �� / com : ����");
								System.out.println("�����ϴ�. �Ф�");
								defeat_count++;
								gaming_count++;
								win_defeat += "2";
								break;
								
							case 2:
								System.out.println("user : �� / com : ����");
								System.out.println("�̰���ϴ�. ^^");
								win_count++;
								gaming_count++;
								win_defeat += "1";
								break;
								
							case 3:
								System.out.println("user : �� / com : ��");
								System.out.println("�����ϴ�. �ٽ� ������������ �մϴ�.");
								continue;
						}	
						break;
				}
				
				
			}
		
			System.out.println("============================");
			for(int i = 0; i < game_count; i ++) {
				if(win_defeat.charAt(i) == '1') {
					System.out.println((i+1)  + " ��° �� : �¸�");
				}
				else if(win_defeat.charAt(i) == '2') {
					System.out.println((i+1) + " ��° �� : �й�");
				}
			}
			
			System.out.println("���� - �¸�: " + win_count + "ȸ �й�: " + defeat_count + "ȸ");
			int winning_rate = (win_count * 100) / game_count;
			System.out.println("�·��� " + winning_rate + "% �Դϴ�.");
			
			//���� �ʱ�ȭ
			game_count = 0;
			gaming_count = 0;	
			win_count = 0;		
			defeat_count = 0;	
			win_defeat = "";
					
			
		} //��ü �ݺ� while
 		
		
		System.out.println("������ �����մϴ�.");
		
		scan.close();
		
		
	} // main
} //class
