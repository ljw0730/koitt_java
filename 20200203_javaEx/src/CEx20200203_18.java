import java.util.Scanner;

public class CEx20200203_18 {
	public static void main(String[] args) {	
		// �Է¹��� ���ڰ� 2�� ����ΰ�?
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		int input = scan.nextInt();
		
		int i = input % 2;
		
		String str = (i == 0 ? "2�� ��� �Դϴ�." : "2�� ����� �ƴմϴ�.");
		
		System.out.printf("%s", str);
		
		
		scan.close();
		
	}
}
