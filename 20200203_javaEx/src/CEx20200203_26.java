import java.util.Scanner;

public class CEx20200203_26 {
	public static void main(String[] args) {
		//������ �Է¹޾� 20���̻� �̸�
		//�̺�Ʈ�� ��÷�Ǽ̽��ϴ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��������� �Է��ϼ���. : ");
		
		String str = scan.nextLine();
		
		//substring(index1, index2) : index1 �ڸ����� index2 �ڸ� ������ ����
		String str1 = str.substring(0, 4);
		String str2 = str.substring(4, 6);
		String str3 = str.substring(6, 8);
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		int year = Integer.parseInt(str1);
		
		if (2020 - year + 1 >= 20) {
			if(str2.equals("02")) {
				System.out.println("�װ��ǿ� ��÷ �Ǽ̽��ϴ�.");
			}
			else {
				System.out.println("02�� ������ ���� �̺�Ʈ �Դϴ�.");
			}
		}
		else {
			System.out.println("20�� �̻� �̺�Ʈ�� ���� �� �� �ֽ��ϴ�.");
		}
		
		scan.close();
	}
}
