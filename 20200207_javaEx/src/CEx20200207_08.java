import java.util.Scanner;

public class CEx20200207_08 {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		// ��Ŀ�� (Ŀ�� 10)
		// ���Ŀ�� (Ŀ�� 7 ���� 5)
		// ī���	(Ŀ�� 5 ���� 5)
		// ��ũĿ�� (Ŀ�� 4 ���� 3 ���� 2)
		// ���� ���Ǳ⿡�� Ŀ�� 100, ���� 50, ���� 70 �������
		// 9) ������ ��� (�α���, ���� �ܿ��� ǥ��)
		// �������� ���Ǳ� �ܿ����� ������
		// "���� ��ᰡ ������ �����Դϴ�. �����ڿ��� �������ּ���."
		
		final int COFFEE1 = 100;
		final int COFFEE2 = 300;
		final int COFFEE3 = 200;
		final int COFFEE4 = 100;
		
		int input_money = 0;
				
		String id = "aaa";
		String pw = "123";
		String input_id = "";
		String input_pw = "";
		int login_count = 0;
		
		int ja_coffee = 100;
		int ja_sugar = 50;
		int ja_milk = 70;
		
		int charge = 0;
		
		int select = 0;
		int sell_count = 0;
		int sell_won = 0;
		
		String coffee1 = "��Ŀ��";
		String coffee2 = "���Ŀ��";
		String coffee3 = "ī���";
		String coffee4 = "��ũĿ��";
				
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" [ Ŀ �� �� �� �� ]");
		
		Loop1:
		while(true) {
			System.out.printf("���� �־��ּ���. : ");
			input_money += scan.nextInt();
			
			if(input_money >= COFFEE1) {
				System.out.println("1) " + coffee1);
			}
			
			if(input_money >= COFFEE2) {
				System.out.println("2) " + coffee2);	
			}
			
			if(input_money >= COFFEE3) {
				System.out.println("3) " + coffee3);
			}
			
			if(input_money >= COFFEE4) {
				System.out.println("4) " + coffee4);
			}
			
			System.out.println("9) ������ ���");
			System.out.println("0) �Ǹ�����");
			
			select = scan.nextInt();
			
			if(select == 0) {
				break;
			}
			
			switch (select) {
				case 1 :
					if(ja_coffee < 10) {
						System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
						break;
					}
					ja_coffee -= 10;
					sell_count++;
					sell_won += COFFEE1;
					input_money -= COFFEE1;
					System.out.println("��Ŀ�ǰ� ���Խ��ϴ�.");
					System.out.println("���� �ܾ��� " + input_money + "�� �Դϴ�.");
					break;
				case 2 :
					if(ja_coffee < 7 || ja_sugar < 5) {
						System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
						break;
					}
					ja_coffee -= 7;
					ja_sugar -= 5;
					sell_count++;
					sell_won += COFFEE2;
					input_money -= COFFEE2;
					System.out.println("���Ŀ�ǰ� ���Խ��ϴ�.");	
					System.out.println("���� �ܾ��� " + input_money + "�� �Դϴ�.");
					break;
				case 3 :
					if(ja_coffee < 5 || ja_milk < 5) {
						System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
						break;
					}
					ja_coffee -= 5;
					ja_milk -= 5;
					sell_count++;
					sell_won += COFFEE3;
					input_money -= COFFEE3;
					System.out.println("ī��󶼰� ���Խ��ϴ�.");
					System.out.println("���� �ܾ��� " + input_money + "�� �Դϴ�.");
					break;
				case 4 :
					if(ja_coffee < 4 || ja_sugar < 2 || ja_milk < 3) {
						System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
						break;
					}
					ja_coffee -= 4;
					ja_sugar -= 2;
					ja_milk -= 3;
					sell_count++;
					sell_won += COFFEE4;
					input_money -= COFFEE4;
					System.out.println("��ũĿ�ǰ� ���Խ��ϴ�.");
					System.out.println("���� �ܾ��� " + input_money + "�� �Դϴ�.");
					break;
					
				case 9 :
					System.out.println("������ ����Դϴ�. �α����� ���ּ���.");
					Loop2:
					while (true) {
						if(login_count >= 5) {
							System.out.println("�α��� �õ��� 5�� ���� �ϼ̽��ϴ�.");
							break Loop1;
						}
						
						System.out.printf("���̵� : ");
						input_id = scan.next();
						if(!(input_id.equals(id))) {
							login_count++;
							System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �α��� ���� Ƚ�� : " + login_count);
							continue;
						}
						
						while(true) {
							if(login_count >= 5) {
								System.out.println("�α��� �õ��� 5�� ���� �ϼ̽��ϴ�.");
								break Loop1;
							}
							
							System.out.printf("�н����� : ");
							input_pw = scan.next();
							if(!(input_pw.equals(pw))) {
								login_count++;
								System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�. �α��� ���� Ƚ�� : " + login_count);
								continue;
							}
							else {
								break  Loop2;
							}
						}// �н����� while
				
					} //������ �α��� while
					
					admin: while(true) {
						System.out.println("===============");
						System.out.println("  ������ ���  ");
						System.out.println("===============");
						
						System.out.println("1) ���/�Ǹŷ�");
						System.out.println("2) ��Ẹ��");
						System.out.println("9) �����ܰ�");
						System.out.println("0) �Ǹ�����");
						select = scan.nextInt();
						
						switch (select) {
							case 1:
								System.out.println("---------------");
								System.out.println("[ ��ü ��� ]");
								System.out.println("---------------");
								System.out.println("Ŀ�� " + ja_coffee + "g ���� " + ja_sugar + "g ���� " + ja_milk +"g");
												
								System.out.println("���Ǹż� : " + sell_count + "��");
								System.out.println("* ���Ǹűݾ� : " + sell_won + "��");
								break;
							case 2:
								System.out.println("---------------");
								System.out.println("[  ��� ����  ]");
								System.out.println("---------------");
								
								System.out.printf("Ŀ�Ǹ� �󸶳� �����Ͻðڽ��ϱ�? : ");
								charge = scan.nextInt();
								ja_coffee += charge;
								System.out.println("���� Ŀ�Ƿ� : " + ja_coffee + "g");
								System.out.printf("������ �󸶳� �����Ͻðڽ��ϱ�? : ");
								charge = scan.nextInt();
								ja_sugar += charge;
								System.out.println("���� ������ : " + ja_sugar + "g");
								System.out.printf("������ �󸶳� �����Ͻðڽ��ϱ�? : ");
								charge = scan.nextInt();
								ja_milk += charge;
								System.out.println("���� ������ : " + ja_milk + "g");
								
								break;
							case 9 :
								continue Loop1;
							case 0 :
								break Loop1;
	
						} //������ ��� switch
					} // ������ ��� while
			} //switch
			
		}	//Loop1 while
		
		System.out.println("�ǸŸ� �����մϴ�.");
		
		scan.close();
	}	//main

}	//class
