import java.util.Scanner;

public class CEx20200206_02 {
	public static void main(String[] args) {
		// 1. ���θ� ȭ�� ����
		// 2. ��ȣ �Է�
		// 3. ��ǰ�� ����
		//    �ܰ� ��ǰ�ݾװ� ��
		//    �ܰ��� ��ǰ �ݾ� ������.
		// 4. ���Ÿ�� ����
		// 5. �ܰ�, ���űݾ� ���
		
		int select = 0;
		
		int my_bank = 5000000;	// �ʱ�ݾ�
		int charge = 0;			// �����ݾ�
		int point = 0;			// ���� ����Ʈ
		int using_money = 0;	// ����� �ݾ�
		
		int product1_won = 1300000;	// ��ǻ�� ����
		int product2_won = 990000;	// TV ����
		int product3_won = 880000;	// ����Ʈ�� ����
		
		String product1 = "��ǻ��";
		String product2 = "TV";
		String product3 = "����Ʈ��";
		
		int product1_count = 0;
		int product2_count = 0;
		int product3_count = 0;
		String product_count_str = "";
			
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {
			System.out.println(" ============================= ");
			System.out.println(" [ ��XƮ ���θ� ] ");
			System.out.printf(" 1) %s (%d��)\n", product1, product1_won);
			System.out.printf(" 2) %s (%d��)\n", product2, product2_won);
			System.out.printf(" 3) %s (%d��)\n", product3, product3_won);
			System.out.println(" 4) ����");
			System.out.println(" 5) ���ݾ� / �ܾ� / ����Ʈ Ȯ��");
			System.out.println(" 7) ����Ʈ ��ȯ");
			System.out.println(" 0) ����");

			select = scan.nextInt();
			if(select == 0) {
				break;
			}
			
			switch (select) {
				case 1:
					if(my_bank < product1_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product1 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product1 + "�� 1�� ������ " + product1_won + "�� �Դϴ�.");
					product1_count++;
					my_bank -= product1_won;
					point += (product1_won * 0.02);
					using_money += product1_won;
					break;
	
				case 2:
					if(my_bank < product2_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product2 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product2 + "�� 1�� ������ " + product2_won + "�� �Դϴ�.");
					product2_count++;
					my_bank -= product2_won;
					point += (product2_won * 0.02);
					using_money += product2_won;
					break;
					
				case 3:
					if(my_bank < product3_won) {
						System.out.println("�ܾ��� �����մϴ�.");
						break;
					}
					
					System.out.println(product3 + "�� 1�� �����ϼ̽��ϴ�.");
					System.out.println(product3 + "�� 1�� ������ " + product3_won + "�� �Դϴ�.");
					product3_count++;
					my_bank -= product3_won;
					using_money += product3_won;
					point += (product3_won * 0.02);
					break;
					
				case 4:
					System.out.println("���� �ݾ��� ���� �Ͻðڽ��ϱ�?");
					charge = scan.nextInt();
					if(charge == 0) {
						continue Loop1;
					}
					
					my_bank += charge;
					System.out.println(charge + "���� �����ϼ̽��ϴ�.");
					break;
				case 5:
//					System.out.printf("���� �ܾ� : %d��\n", my_bank);
					System.out.printf("������� ����� �ݾ� : %d��\n", using_money);
//					System.out.printf("���� ����Ʈ : %dP\n", point);
					break;
				case 7:
					System.out.printf("���� ����Ʈ : %dP\n", point);
					System.out.println("��������Ʈ�� ������ ��ȯ�մϴ�.");
					my_bank += point;
					point = 0;
					break;
			}
			
			if(select >=1 && select <= 3) {
				product_count_str = "�� ";
				if(product1_count > 0) {
					product_count_str = product_count_str + product1 + product1_count + "�� ";
				}
				if(product2_count > 0) {
					product_count_str = product_count_str + product2 + product2_count + "�� ";
				}
				if(product3_count > 0) {
					product_count_str = product_count_str + product3 + product3_count + "�� ";
				}
				System.out.println(product_count_str + "�� �����ϼ̽��ϴ�.");
			}
			
			
			System.out.println(" ============================= ");
			System.out.println("���� �ܾ��� " + my_bank + "�� �Դϴ�.");
			System.out.println("���� ����Ʈ " + point + "P �Դϴ�.");
			
		}
		
		
		System.out.println(" ============================= ");
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
	
}
