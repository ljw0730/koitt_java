import java.util.Scanner;

public class CEx20200203_29 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���. : ");
		
		int i = scan.nextInt();
				
		System.out.print("�ι�° ���� �Է��ϼ���. : ");
		int j = scan.nextInt();
		
		System.out.print("��ȣ�� �Է��ϼ���. : ");
		String str = scan.next();
		char ch = str.charAt(0);
			
		int result = 0;
		
		switch (ch) {
			case '+' :
				result = i + j;
				System.out.println("�μ��� �� : " + result);
				break;
			case '-' :
				result = i + j;
				System.out.println("�μ��� �� : " + result);
				break;
			case '*' :
				result = i * j;
				System.out.println("�μ��� �� : " + result);
				break;
			case '/' :
				result = i / j;
				System.out.println("�μ��� ���� : " + result);
				break;

		}
		
		scan.close();
		
	}
}
