import java.util.Scanner;

public class CEx20200304_10 extends Object {

	public static void main(String[] args) {
		//String �޼��� - trim(), replaceAll
		
		// ��й�ȣ�� �Է�, �յ� ������� �Է��Ͻø� �ȵ˴ϴ�.
		// ��й�ȣ �Է¹޾Ƽ� ���� ������ ������ ���ְ� �Է°��� ����� ������.
		
		Scanner scan = new Scanner(System.in);
		String pw = "";
		
		while(true) {
			System.out.print("��� ��ȣ�� �Է��� �ּ���. (���� : 0) : ");
			pw = scan.nextLine();

			if(pw.equals("0")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println(pw);
			System.out.println("�յڷ� ������ �ִ°�� ������ ���ڽ��ϴ�.");
			pw = pw.trim();
			System.out.println(pw);
			System.out.println("�߰� ������ ����ϴ�.");
			pw = pw.replaceAll(" ", "");
			System.out.println(pw);
			
		}
		
	}
	
}

