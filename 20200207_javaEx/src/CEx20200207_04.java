import java.util.Scanner;

public class CEx20200207_04 {
	public static void main(String[] args) {
		// �ֹι�ȣ �Է�
		// 880101-1101111
		// 020101-3101111
		// �¾ ���� Ȯ���ؼ�
		// 12, 1, 2 �� -> �ܿ￡ �¾� ������.
		// 3, 4, 5 �� -> ���� �¾� ������.
		// 6, 7, 8 �� -> ������ �¾� ������.
		// 9, 10, 11 �� -> ������ �¾� ������.
		// 1��° switch�� 2���� if��
		
		
		String id_Card_Num = "";
		String month_str = "";
		int month = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("[ �ֹι�ȣ ź�� ���� Ȯ�� ]");
		System.out.print("�ֹι�ȣ�� �Է��� �ּ��� : ");
		id_Card_Num = scan.next();
		month_str = id_Card_Num.substring(2, 4);
		month = Integer.parseInt(month_str);
		
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println(month + "��");
				System.out.println("�ܿ￡ �¾����.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month + "��");
				System.out.println("���� �¾����.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "��");
				System.out.println("������ �¾����.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "��");
				System.out.println("������ �¾����.");
				break;
		}
		
		System.out.println("==================================");
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "��");
			System.out.println("�ܿ￡ �¾����.");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.println(month + "��");
			System.out.println("���� �¾����.");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.println(month + "��");
			System.out.println("������ �¾����.");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.println(month + "��");
			System.out.println("������ �¾����.");
		}
		
		scan.close();
		
	}	//main
}	//class
