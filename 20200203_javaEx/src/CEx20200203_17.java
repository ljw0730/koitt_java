import java.util.Scanner;

public class CEx20200203_17 {
	public static void main(String[] args) {
		// 4�ڸ� ���� �Է¹޾� ���� �տ� �ִ� ���ڰ�
		// �ڵ� : 1 -> VIP / 2 -> Gold / 3-> silver
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ڵ带 �Է��ϼ��� : ");
		int code = scan.nextInt();
		
		String str = code + "";
		char ch1 = str.charAt(0);
		
		String str2 = (ch1 == '1' ? "VIP" : (ch1=='2' ? "Glod" : "Silver"));

		System.out.println("����� ����� " + str2 + "�Դϴ�.");
		
		scan.close();
		
	}
}
