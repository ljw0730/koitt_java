import java.util.Scanner;

public class CEx20200304_05 extends Object {

	public static void main(String[] args) {
		//String �޼��� - charAt(), equals(), equalsIgnoreCase()
		
		//1) �ֹι�ȣ�� �޾Ƽ� �̻���� �������� �������� Ȯ���Ͻÿ�.
		//2) ��ǻ���а� c0001 / �����а� e0002 / �����а� k0003 �а���ȣ�� �Է¹޾� ������������ Ȯ���Ͻÿ�.
		//3) �����װ�
		
		System.out.println("1)");
		String[] id = { "881010-1111111", "850101-2222222"
						,"030730-3333333", "060324-4444444"
		};
		
		for(int i = 0; i < id.length; i++) {
			char c = id[i].charAt(8);
			if(c == '1' || c =='3') {
				System.out.println(id[i] + " : �����Դϴ�.");
			}
			else if(c == '2' || c == '4') {
				System.out.println(id[i] + " : �����Դϴ�.");
			}
		}
		
		System.out.println("========================================================");
		System.out.println("2)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�а� ��ȣ�� �Է��� �ּ���. (���� : 0 ) : ");
			String major = scan.nextLine();
			if(major.equals("0")) {
				System.out.println("�а� Ȯ���� �����մϴ�.");
				break;
			}
			if(major.equals("c0001")) {
				System.out.println("��ǻ�� �а� �Դϴ�.");
			} else if(major.equals("e0002")) {
				System.out.println("���� �а� �Դϴ�.");
			} else if(major.equals("k0003")) {
				System.out.println("���� �а� �Դϴ�.");
			}
		}
		
		System.out.println("========================================================");
		System.out.println("3)");
		while(true) {
			System.out.print("�װ��縦 �Է��� �ּ���. (KE,ke / OZ,oz / AF,af) (���� : 0) : ");
			String air = scan.nextLine();
			if(air.equals("0")) {
				System.out.println("�װ��� Ȯ���� �����մϴ�.");
				break;
			}
			
			if(air.equalsIgnoreCase("ke")) {
				System.out.println("�����װ� �װ��� �Դϴ�.");
			}
			else if(air.equalsIgnoreCase("oz")) {
				System.out.println("�ƽþƳ� �װ��� �Դϴ�.");
			}
			else if(air.equalsIgnoreCase("AF")) {
				System.out.println("AF �װ��� �Դϴ�.");
			}
		}
		
		
	}
	
}

