import java.util.Scanner;

public class CEx20200219_04 {
	
	public static void main(String[] args) {
		// Area class�� ����Ǿ�����
		
		// �簢�� ���� ���ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		
		Area a1 = new Area();
		
		System.out.println("�簢�� ���� ���ϴ� ���α׷�");
		System.out.println("1. ���簢�� / 2. ���簢�� / 3. ������");
		System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. : ");
				
		switch(scan.nextInt()) {
			case 1:
				System.out.print("���� ���̸� �Է��� �ּ��� : ");
				a1.horiz = scan.nextInt();
				result = a1.square();
				System.out.println("���簢�� ���� : " + result);
				break;
				
			case 2:
				System.out.print("���� ���̸� �Է��� �ּ��� : ");
				a1.horiz = scan.nextInt();
				System.out.print("���� ���̸� �Է��� �ּ��� : ");
				a1.vert = scan.nextInt();
				result = a1.rectangle();
				System.out.println("���簢�� ���� : " + result);
				break;
			case 3:
				System.out.print("�밢�� ���̸� �Է��� �ּ��� : ");
				a1.horiz = scan.nextInt();
				System.out.print("�ٸ� �밢�� ���̸� �Է��� �ּ��� : ");
				a1.vert = scan.nextInt();
				result = a1.rhombus();
				System.out.println("������ ���� : " + result);
				break;				
		}
		
	}	// main
	
}	//class

