import java.util.Scanner;

public class CEx20200304_07 extends Object {

	public static void main(String[] args) {
		//String �޼��� - equals(), contains()
		
		// �̸����� �Է¹޾� aaa@bbb.ccc  '@', '.'�� �ִ��� Ȯ��
		
		String mail = "";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̸����� �Է��� �ּ���. (���� : 0) : ");
			mail = scan.nextLine();
			
			if(mail.equals("0")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			boolean at = false;
			boolean dat = false;
			try {
				at = mail.contains("@");
				dat = mail.contains(".");
				
				if(at == true && dat == true) {
					System.out.println("���������� �Է� �ϼ̽��ϴ�.");
				}
				else if(at == false && dat == true) {
					System.out.println("@�� �����ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				else if(at == true && dat == false) {
					System.out.println(".�� �����ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				else if(at == false && dat == false) {
					System.out.println("@ �� .�� �����ϴ�. �ٽ� �Է��� �ּ���.");
					continue;
				}
				
			} catch (Exception e) {
				System.out.println("�̸��� �Ǵ� ����");
				System.out.println(e.getMessage());
			}
		}
	}
}

