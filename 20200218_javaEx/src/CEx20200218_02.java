
public class CEx20200218_02 {

	public static void main(String[] args) {
		// Card class�� ����Ǿ� ����
		
		System.out.println("ī���� ���̴� : " + Card.width);	// Ŭ���� ���� ���
		System.out.println("ī���� ���̴� : " + Card.height);	// Ŭ������.������
		System.out.println("===================================");
		
		Card c1 = new Card();
		c1.kind = "Heart";	// �ν��Ͻ� ���� ���
		c1.number = 7;		// �ν��Ͻ���.������
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 5;
		
		System.out.println("c1 ī�� : " + c1.kind + " / " + c1.number);
		System.out.println("c1 ī�� ũ�� : " + c1.width + " / " + c1.height);
		System.out.println("===================================");
		System.out.println("c2 ī�� : " + c2.kind + " / " + c2.number);
		System.out.println("c1 ī�� ũ�� : " + c2.width + " / " + c2.height);
		
		System.out.println("-----------------------------------");
		// Ŭ���� ���� �� ����
		// ��� ��ü�� �������� ����ϴ� Ŭ���� ���� �̹Ƿ�
		// c1�� �����ص� c2�Ӹ� �ƴ϶� ��� ��ü�� ������ ��ģ��.
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1 ī�� : " + c1.kind + " / " + c1.number);
		System.out.println("c1 ī�� ũ�� : " + c1.width + " / " + c1.height);
		System.out.println("===================================");
		System.out.println("c2 ī�� : " + c2.kind + " / " + c2.number);
		System.out.println("c1 ī�� ũ�� : " + c2.width + " / " + c2.height);
		

	}	// main

}	// class
