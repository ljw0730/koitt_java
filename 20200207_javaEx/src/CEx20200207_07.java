import java.util.Scanner;

public class CEx20200207_07 {
	public static void main(String[] args) {
		// �α��� ���
		// �α����� 5���̻� ���н� ���α׷� ����
		// 1���� �Է��� ������ ���ڸ� ���ϴ� ���α׷�

		String id = "aaa";
		String pw = "1234";
		String id_check = "";
		String pw_check = "";
		int login_check = 1;	//���� Ƚ��
		int count = 0;	// ���ϰ� ���� ��
		int sum = 0;	// �հ�
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("ID�� �Է��� �ּ���. : ");
			
			
			//next() : ������ ���������� ���̶��⳪
			//         ����Ű�� ������ �ű������ ������
			//nextLine() : ������ ������ ������
			id_check = scan.next();
			
			if(login_check >= 5) {
				System.out.println("id, pw�� 5�� �̻� Ʋ�Ƚ��ϴ�.");
				break;
			}
			if(!(id.equals(id_check))) {
				System.out.println("id�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���." + login_check + "ȸ ����");
				login_check++;
				continue;
			}
			
			System.out.print("PW�� �Է��� �ּ���. : ");
			pw_check = scan.next();
			
			if(!(pw.equals(pw_check))) {
				System.out.println("pw�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���." + login_check + "ȸ ����");
				login_check++;
				continue;
			}
			
			System.out.println("���ϴ� ���ڸ� �Է��ϼ���.");
			count = scan.nextInt();			
			
			// 1~count ���� ���ϴ� �ݺ���
			for(int i = 1; i <= count; i++ ) {
				sum += i;	// sum = sum + count;
			}
			System.out.printf("1���� %d������ ���� : %d\n", count, sum);
			
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
		
		scan.close();
		
	} // main
} //class
