import java.util.Scanner;

public class CEx20200211_15 {
	public static void main(String[] args) {
		// 1. �Ҽ��� ���� 2���� �Է��� �޴µ�
		// 2. ��Ģ����
		// 3. �Ҽ����� 2°�ڸ� ���� ��Ÿ�� �� �ֵ��� �غ�����.
		double num1 = 0.0d;
		double num2 = 0.0d;
		
		double temp = 0.0d;
		
		double sum = 0.0d;
		double cha = 0.0d;
		double gob = 0.0d;
		double nan = 0.0d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[�Ҽ��� ���� ��Ģ����]");
		System.out.print("ù��° �Ҽ��� ���ڸ� �Է��ϼ���. : ");
		num1 = scan.nextDouble();
		System.out.print("�ι�° �Ҽ��� ���ڸ� �Է��ϼ���. : ");
		num2 = scan.nextDouble();
		
		temp = num1 + num2;
		sum = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 - num2;
		cha = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 * num2;
		gob = Math.round(temp*100)/100.0d;
		temp = 0.0d;
		
		temp = num1 / num2;
		nan = Math.round(temp*100)/100.0d;
		temp = 0.0d;
				
		System.out.println("�� �Ҽ��� ������ �� : " + sum);
		System.out.println("�� �Ҽ��� ������ �� : " + cha);
		System.out.println("�� �Ҽ��� ������ �� : " + gob);
		System.out.println("�� �Ҽ��� ������ ������ : " + nan);
		
		

		
		
		
	}	//main
}	//class
