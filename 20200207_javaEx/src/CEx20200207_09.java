import java.util.Scanner;

public class CEx20200207_09 {

	public static void main(String[] args) {
		// ���Ǳ� ���α׷�
		// ��Ŀ�� (Ŀ�� 10)
		// ���Ŀ�� (Ŀ�� 7 ���� 5)
		// ī��� (Ŀ�� 5 ���� 5)
		// ��ũĿ�� (Ŀ�� 4 ���� 3 ���� 2)
		// ���� ���Ǳ⿡�� Ŀ�� 100, ���� 50, ���� 70 �������
		// 9) ������ ��� (�α���, ���� �ܿ��� ǥ��)
		// �������� ���Ǳ� �ܿ����� ������
		// "���� ��ᰡ ������ �����Դϴ�. �����ڿ��� �������ּ���."

		
		// ���Ǳ� ���α׷�
		// <2020.02.07 ���α׷� ������Ʈ>

		
		String id = "aaa";				// ������ ���̵�
		String pa = "123";				// ������ �н�����
		String check_id = "";			// �Է¹޴� ���̵�
		String check_pw = "";			// �Է¹޴� �н�����
		
		
		int coffee_amount = 100;		// ���� Ŀ�� ���
		int sugar_amount = 50;			// ���� ���� ���
		int milk_amount = 70;			// ���� ���� ���
		
		int total_sale = 0;				//�Ǹŷ�
		int total_price = 0;			//�� �Ǹ� �ݾ�
		
		int order_num = 0;				// Ŀ�Ǽ��� ����
		int input_price = 0;			// ���Աݾ�

		final int BLACK_PRICE = 100;	// ��Ŀ�� ����
		final int SUGAR_PRICE = 300;	// ���Ŀ�� ����
		final int LATTE_PRICE = 200;	// ī��� ����
		final int MILK_PRICE = 100;	// ��ũĿ�� ����
		
		boolean black_check = false;	//��Ŀ�� ǰ��?
		boolean sugar_check = false;	//���Ŀ�� ǰ��?
		boolean latte_check = false;	//ī����� ǰ��?
		boolean milk_check = false;	//��ũĿ�� ǰ��?

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------");
			System.out.println("      Ŀ�� ���Ǳ�      ");
			System.out.println("-----------------------");
			if (black_check == false) {
				System.out.println("1) ��Ŀ�� -100��");
			}
			System.out.println("2) ���Ŀ�� -300��");
			System.out.println("3) ī��� -200��");
			System.out.println("4) ��ũĿ�� -100��");
			System.out.println("9) ������ ���");
			System.out.println("0) �ý��� ����");
			System.out.println("-----------------------");

			System.out.printf("���ð� ���� Ŀ�ǹ�ȣ�� �Է��ϼ���. : ");
			order_num = scan.nextInt();

			
			// ��Ŀ�� (Ŀ�� 10)
			// ���Ŀ�� (Ŀ�� 7 ���� 5)
			// ī��� (Ŀ�� 5 ���� 5)
			// ��ũĿ�� (Ŀ�� 4 ���� 3 ���� 2)
			switch (order_num) {
			case 1:
				if(coffee_amount < 10) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� ������ �ּ���.");
					black_check = true; // false -> true / true -> false
					continue;
				}
				coffee_amount -= 10;	// Ŀ����� 10����
				total_sale++;			// ���Ǹŷ� 1�� ����
				total_price =+ 100;		// ���Ǹűݾ� 100�� ����
				input_price -= 100;		// ���Աݾ׿��� 100����
				System.out.println("��Ŀ�� 1���� ���Խ��ϴ�. �����ο� ����~ �� Ŀ��");
				System.out.println("coffee_amount" + coffee_amount);
				System.out.println("total_sale" + total_sale);
				System.out.println("total_price" + total_price);
				System.out.println("input_price" + input_price);
				break;
			case 2:
				if(coffee_amount < 7 || sugar_amount < 5) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� ������ �ּ���.");
					sugar_check = true;
					continue;
				}
				coffee_amount -= 7;
				sugar_amount -= 5;
				total_sale++;			// ���Ǹŷ� 1�� ����
				total_price =+ 300;		// ���Ǹűݾ� 100�� ����
				input_price -= 300;		// ���Աݾ׿��� 100����
				System.out.println("���Ŀ�� 1���� ���Խ��ϴ�. �����ο� ����~ �� Ŀ��");
				System.out.println("coffee_amount" + coffee_amount);
				System.out.println("total_sale" + total_sale);
				System.out.println("total_price" + total_price);
				System.out.println("input_price" + input_price);
				

				break;
			case 3:

				break;
			case 4:

				break;
			case 9:
				System.out.println("������ ���̵� �Է��ϼ���.");
				System.out.printf("���̵� : ");
				if(!(id.equals(check_id))) {
					System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
				
				System.out.println("coffee_amount �� : " + coffee_amount);
				System.out.println("sugar_amount �� : " + sugar_amount);
				System.out.println("milk_amount �� : " + milk_amount);
				System.out.println("total_sale �� : " + total_sale);
				System.out.println("total_price �ݾ� : " + total_price);
				break;

			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break;

			default:
				System.out.println("�ý��� ����");
				break;
			}

		}


	} // main

} // class
