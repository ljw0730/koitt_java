import java.util.Scanner;

public class CEx20200207_06 {
	public static void main(String[] args) {
		// �α��� ���
		// �α����� 5���̻� ���н� ���α׷� ����
		// 1���� �Է��� ������ ���ڸ� ���ϴ� ���α׷�

		String id = "aaa";
		String pw = "123";
		String input_id = "";
		String input_pw = "";
		
		int count = 0;
		int fail_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" [ ��  ��  �� ] ");
		System.out.print("�α��� �õ� Ƚ���� ���� �ּ���. : ");
//		System.out.print("���� Ƚ���� ���� �ּ���. : ");
		count = scan.nextInt();
		
		
		Loop: for(int i = 0; i < count; i++) {
			
			if(fail_count == 5) {
				System.out.println("�α����� 5ȸ �����ϼ̽��ϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("���̵� : ");
			input_id = scan.next();
			
			if(!(input_id.equals(id))) {
				System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
				fail_count++;
			}
			else {
				while(true) {
					if(fail_count == 5) {
						System.out.println("�α����� 5ȸ �����ϼ̽��ϴ�.");
						System.out.println("���α׷��� �����մϴ�.");
						break Loop;
					}
					
					System.out.printf("�н����� : ");
					input_pw = scan.next();
					
					if(!(input_pw.equals(pw))) {
						System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
						fail_count++;
					}
					else {
						System.out.println("�α����� �Ǿ����ϴ�.");
						
						break Loop;
					}
				} //while
			}// id else
		} //for
		
		
		
		
		
	} // main
} //class
