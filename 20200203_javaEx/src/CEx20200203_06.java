import java.util.Scanner;

public class CEx20200203_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ϴ� ù ��° ���ڸ� �Է��ϼ���.");
		int input1 = scan.nextInt();
		System.out.println("���ϴ� �� ���� ���ڸ� �Է��ϼ���.");
		int input2 = scan.nextInt();
		
		int sum = input1 + input2;
		int minus = input1 - input2;
		double g1 = input1 * input2;
		double di = input1 / input2;
		
		System.out.println("�μ��� �� : " + sum);
		System.out.println("�μ��� �� : " + minus);
		System.out.println("�μ��� �� : " + g1);
		System.out.println("�μ��� ������ : " + di);
		
		scan.close();
		
	}
}
