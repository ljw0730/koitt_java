import java.util.Scanner;

public class CEx20200203_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double num1 = scan.nextDouble();
		
		
		// Math.round(x) : �Ҽ��� �ݿø�
		System.out.println("�Ҽ� ù°�ڸ� �ݿø� �� : " + Math.round(num1));
		
		// Math.ceil(x) : �Ҽ��� �ø�
		System.out.println("ceil �����ϱ��?" + Math.ceil(num1));
		
		// Math.floor(x) : �Ҽ��� ����
		System.out.println("floor �����ϱ��?" + Math.floor(num1));
		
		scan.close();
		
	}
	
}
