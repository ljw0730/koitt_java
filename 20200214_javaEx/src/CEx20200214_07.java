import java.util.Scanner;

public class CEx20200214_07 {
	public static void main(String[] args) {
		// �Ҽ��� 4°�ڸ����� �ݿø�
		
		double num = 0.0d;
		double num2 = 0.0d;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�Ҽ��� ���ڸ� �Է��� �ּ��� : ");
		num = scan.nextDouble();
		
		num2 = Math.round(num * 1000) / 1000.0d;
			// Math.round(3.141592 * 1000) / 1000.0d
			// Math.round(3141.592) / 1000.0d
			// 3142 / 1000.0d
		    // 3.142
		
		System.out.println("�Ҽ��� 4°�ڸ����� �ݿø� �� ���� : " + num2);
		
	}	//main
}	//class
