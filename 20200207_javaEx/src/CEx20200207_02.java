import java.util.Scanner;

public class CEx20200207_02 {
	public static void main(String[] args) {
		// �ֹι�ȣ �Է�
		// 880101-11011111
		// ���� Ȯ��
		
		String id_Card_Num = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ �ֹι�ȣ ���� Ȯ�� ]");
		System.out.print("�ֹι�ȣ�� �Է��� �ּ��� : ");
		id_Card_Num = scan.next();
		
		if(id_Card_Num.charAt(7) == '1' || id_Card_Num.charAt(7) == '3') {
			System.out.println("����� ������ ���� �Դϴ�.");
		}
		else if(id_Card_Num.charAt(7) == '2' || id_Card_Num.charAt(7) == '4') {
			System.out.println("����� ������ ���� �Դϴ�.");
		}
		else {
			System.out.println("�ֹι�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		
		scan.close();
	}
}
