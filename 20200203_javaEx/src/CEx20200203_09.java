import java.util.Scanner;

public class CEx20200203_09 {

	public static void main(String[] args) {
		// ���� 7���� �ѹ��� �޾Ƽ� 2547312
		// ù��° ���� : 2
		// �ι�° ���� : 5
		// ...
		// ������ ���ڸ� ���� ������.
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		String str = input + "";
		
		int input1 = str.charAt(0) - '0';
		int input2 = str.charAt(1) - '0';
		int input3 = str.charAt(2) - '0';
		int input4 = str.charAt(3) - '0';
		int input5 = str.charAt(4) - '0';
		int input6 = str.charAt(5) - '0';
		int input7 = str.charAt(6) - '0';
		
		int sum = input1 + input2 + input3 + input4 + input5 + input6 + input7;
		int cha = input1 - input2 - input3 - input4 - input5 - input6 - input7;
		int g1 = input1 * input2 * input3 * input4 * input5 * input6 * input7;
		int di = input1 / input2 / input3 / input4 / input5 / input6 / input7;
		
		System.out.println("������ �� : " + sum);
		System.out.println("������ �� : " + cha);
		System.out.println("������ �� : " + g1);
		System.out.println("������ ������ : " + di);
		
		scan.close();
		
	}
	
}
