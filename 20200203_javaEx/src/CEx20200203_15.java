import java.util.Scanner;

public class CEx20200203_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int x = scan.nextInt();
		
		System.out.println("x�� " + 
						   (x>=1 ? "����Դϴ�." : (x == 0 ? "0 �Դϴ�." : "�����Դϴ�.")));
		
		scan.close();
	}
}
