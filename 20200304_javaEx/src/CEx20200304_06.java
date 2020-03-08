import java.util.Scanner;

public class CEx20200304_06 extends Object {

	public static void main(String[] args) {
		//String �޼��� - equals(), length(), charAt(), 
		//StringBuffer �޼��� - insert()
		
		//�����̿��� ���ڰ� ��� ���� �� �ٽ� �Է��ϰ� �ϼ���.
		final int MAX_LENGTH = 13;
		
		Scanner scan = new Scanner(System.in);
				
		String id = "";
		Loop: while(true) {
			System.out.print("�ֹε�Ϲ�ȣ�� �Է��� �ּ���. (-����) (���� : 0) : ");
			id = scan.nextLine();
			
			if(id.equals("0")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(id.length() != MAX_LENGTH) {
				System.out.println("13�ڸ��� �Է��ϼž� �մϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			char check = 0;
			for(int i = 0 ; i < id.length(); i++) {
				check = id.charAt(i);
				if(!(check >= '0' && check <= '9')) {
					System.out.println("�Է��� �� ���Ǿ����ϴ�. ���ڸ� �Է��� �ּ���.");
					continue Loop;
				}
			}
			
			try {
				StringBuffer sb = new StringBuffer(id);
				sb.insert(6, "-");
				System.out.println("�Է��Ͻ� �ֹε�Ϲ�ȣ : " + sb);
			} catch (Exception e) {
				System.out.println("StringBuffer ����!!");
				System.out.println(e.getMessage());
			}
		}
	}
}

