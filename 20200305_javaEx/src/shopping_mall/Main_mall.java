package shopping_mall;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_mall {

	public static void main(String[] args) {
		// ȭ���
		
//		1. ȸ������
//		 - ���̵� �ߺ�üũ
//		 - ���̵� ���� 3�ڸ� �̻�
//		 - ��ü�� ArrayList ����
//		 - ���̵�, �н�����, �̸�, ��ȭ, �����ݾ�, ��������Ʈ
//
//		2. �α���
//		 - ���̵�/�н����� Ȯ��
//		 - ��ü�����ؼ� Map ����
//
//		3. �α׾ƿ�
//		 - ID�� ��� ������ �α׾ƿ�.
//		 - ��ü����
//
//		4. ��ǰ����
//		 -> ID�� �ѹ��� �����
//		 -> Map�� ID�� ������ �������, �ƴϸ� �α����Ͻÿ�.
//		 1) LCDTV, 2)LEDTV, 3)OLEDTV
//		 4) �Ϲݳ����, 5) �繮�������
//		 6) �뵹�� ��Ź��, 7) �巳��Ź�� 8) �巳������Ź��
//		  - Product ��� price, bonusPoint, name, color
//		   TV : screen, inch / hdr���(OLED���� ����)
//		   ����� : liter, door / d_cooling(�繮������ ����)
//		   ��Ź�� : size, shape / Sterilization (�巳������Ź�⿡�� ����)
//
//		5. ��ǰ���� ��Ϻ���
//		 - ��ǰ������ ����Ʈ �����ֱ�
//		
//		8. ȸ�������˻�
//		 - ȸ�� �˻� ��� : 
//		   (ȫ���� �˻��ϸ� ȫ�浿, ȫ���, �蹫ȫ �� �� ���)
//
//		9. ȸ����������
//			1) ���� ������� ����
//			1) �̸� �������� ����
//		 - ȸ����ü ������
		
		Mall_excute mall_excute = new Mall_excute();
				
		Scanner scan = new Scanner(System.in);
		int select = 0;
		
		Loop1: while(true) {
			select = mina_print(scan);
			switch (select) {
				case 1:
					System.out.println("--------------------------------");
					System.out.println("ȸ�������� �����ϼ̽��ϴ�.");
					mall_excute.join_membership(scan);
					break;
					
				case 2:
					System.out.println("--------------------------------");
					System.out.println("�α����� �����ϼ̽��ϴ�.");
					mall_excute.login(scan);
										
					break;
					
				case 3:
					System.out.println("--------------------------------");
					System.out.println("�α׾ƿ��� �����ϼ̽��ϴ�.");
					mall_excute.logout(scan);
					
					break;
					
				case 4:
					System.out.println("--------------------------------");
					System.out.println("��ǰ���Ÿ� �����ϼ̽��ϴ�.");
					mall_excute.product_buy(scan);
					
					break;
					
				case 5:
					System.out.println("--------------------------------");
					System.out.println("����ǰ�񺸱⸦ �����ϼ̽��ϴ�.");
					mall_excute.purchase_list_print();
					break;
					
				case 8:
					System.out.println("--------------------------------");
					System.out.println("ȸ���˻��� �����ϼ̽��ϴ�.");
					mall_excute.member_search(scan);
					
					break;
					
				case 9:
					System.out.println("--------------------------------");
					System.out.println("ȸ���������⸦ �����ϼ̽��ϴ�.");
					mall_excute.member_print(scan);
					break;
					
				case 0:
					System.out.println("--------------------------------");
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;

			}
		}
		
		
	}

	static int mina_print(Scanner scan) {
		int select = 0;
		System.out.println("=================================");
		System.out.println(" [ ���θ� ���α׷� ] ");
		System.out.println("   1. ȸ������");
		System.out.println("   2. �α���");
		System.out.println("   3. �α׾ƿ�");
		System.out.println("   4. ��ǰ����");
		System.out.println("   5. ���Ÿ�Ϻ���");
		System.out.println("   8. ȸ�������˻�");
		System.out.println("   9. ȸ����������");
		System.out.println("   0. ����");
		System.out.println("--------------------------------");
		System.out.print(" ���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
}