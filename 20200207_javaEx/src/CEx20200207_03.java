import java.util.Scanner;

public class CEx20200207_03 {
	public static void main(String[] args) {
		// �ֹι�ȣ �Է�
		// 880101-1101111
		// 020101-3101111
		// ���� Ȯ��
		
		// ���̰�� ���
		// string �޼ҵ� -> substring, charAyt, Integer.patseInt
		
		String id_Card_Num = "";
		String str = "";
		int age = 0;
		final int NOW_YEAR = 2020;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ �ֹι�ȣ ���� Ȯ�� ]");
		System.out.print("�ֹι�ȣ�� �Է��� �ּ��� : ");
		id_Card_Num = scan.next();
		
		str = id_Card_Num.substring(0, 2);
		if(id_Card_Num.charAt(7) == '1' || id_Card_Num.charAt(7) == '2') {
			str = "19" + str;	
		}
		else if(id_Card_Num.charAt(7) == '3' || id_Card_Num.charAt(7) == '4') {
			str = "20" + str;
		}
		else {
			System.out.println("�ֹι�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		age = NOW_YEAR - Integer.parseInt(str) + 1;
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		
		scan.close();
	}
}
