import java.util.Scanner;

public class CEx20200303_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int kor = 0;
		int eng = 0;
		System.out.print("�̸��� �Է��� �ּ��� : ");
		name = scan.nextLine();
		System.out.print("���������� �Է��� �ּ��� : ");
		kor = scan.nextInt();
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			// ��𿡼� ������ ������ �˷��ִ� �޼ҵ�
			e.printStackTrace();
		}
		
		System.out.print("���������� �Է��� �ּ��� : ");
		eng = scan.nextInt();
		scan.nextLine();
		
	}
}
