import java.util.Scanner;

public class CEx20200203_14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int x = scan.nextInt();
		
		System.out.println("x�� ���밪��? : " + (x>=10 ? x: -x));
		
		scan.close();
		
	}
}
