import java.util.Scanner;

public class CEx20200203_11 {
	
	public static void main(String[] args) {
		// 3���� ���ڸ� �Է� �޾Ƽ� printf �� ����Ͽ�
		// 5+4+2 = 11
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("ù��° ���� : ");
		int input1 = scan.nextInt();
				
		System.out.printf("�ι�° ���� : ");
		int input2 = scan.nextInt();
				
		System.out.printf("����° ���� : ");
		int input3 = scan.nextInt();
				
		System.out.printf("������ ���� : %d + %d + %d = %d%n",
				          input1, input2, input3
				          , input1 + input2 + input3);
		
		System.out.printf("������ ���� : %d - %d - %d = %d%n",
						  input1, input2, input3
						  , input1 - input2 - input3);
		
		double d = input1 / input2 / input3;
		
		System.out.printf("������ �������� : %.2f", d);
		
		scan.close();
		
		
	}
}
