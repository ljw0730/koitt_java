import java.util.Scanner;

public class CEx20200219_05 {
	
	public static void main(String[] args) {
		// ���丮�� ���ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
		long result = 0;
		System.out.print("���ϴ� ���ڸ� �Է��� �ּ��� : ");
		
		result = factorial(scan.nextInt());
		System.out.println("��� �� : " + result);
		
	}	// main
	
	static long factorial(int n) {
		long result = 0L;
		if(n == 1) {
			result = 1;
		}
		else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
}	//class

