import java.util.Scanner;

public class CEx20200203_23 {

	public static void main(String[] args) {
		// �Է¹��� ���ڰ� ���, 0, ���� ���� ...
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		
		int i = scan.nextInt();
		
		if(i > 0) {
			System.out.println("��� �Դϴ�.");
		} else if (i == 0) {
			System.out.println("0 �Դϴ�.");
		} else {
			System.out.println("���� �Դϴ�.");
		}
		
		scan.close();
	}

}
