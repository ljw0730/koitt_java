import java.util.Scanner;

public class CEx20200203_24 {

	public static void main(String[] args) {
		//ID -> c  /  pass->12345
		
		char id = 'c';
		int pass = 12345;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID �� �Է��ϼ���. : ");
		String uid = scan.next();
		char ch_uid = uid.charAt(0);
		
	
		// ���� -> ������ ��, ��ü -> ������ �ּ� �� ���´�.
		// �⺻ 8���� �������� == ���� �� ����
		// �������� String�� str.equals(str2)�� ���Ѵ�.
	
		
		if(ch_uid != id) {
			System.out.println("�������� �ʴ� ID �Դϴ�.");
			
			scan.close();
			return;
		} else {
			System.out.print("��й�ȣ�� �Է��ϼ���. : ");
			int upass = scan.nextInt();
			if (upass != pass) {
				 System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("ȯ���մϴ�.");
			}
		}
	
		scan.close();
	}

}