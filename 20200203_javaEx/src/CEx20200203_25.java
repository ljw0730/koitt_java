import java.util.Scanner;

public class CEx20200203_25 {
	public static void main(String[] args) {
		
		String id = "aaa";
		int pass = 12345;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID �� �Է��ϼ���. : ");
		String id_ch = scan.next();
		
		System.out.print("Pass �� �Է��ϼ���. : ");
		int pass_ch = scan.nextInt();

		if(id_ch.equals(id)) {
			System.out.println("id�� �ֽ��ϴ�.");
			
			if(pass_ch == pass) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			}
			else {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
			}
		}
		else {
			System.out.println("id�� ��ġ���� �ʽ��ϴ�.");
			System.out.println("�ٽ� �Է��� �ּ���..");
		}
		
		scan.close();
	}
}
