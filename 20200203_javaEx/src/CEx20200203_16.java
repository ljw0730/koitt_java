import java.util.Scanner;

public class CEx20200203_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int x = scan.nextInt();
		
		String str = (x >= 60 ? "�հ�" : "���հ�");
		System.out.println("����� " + str + "�Դϴ�.");
		
		scan.close();

	}

}
