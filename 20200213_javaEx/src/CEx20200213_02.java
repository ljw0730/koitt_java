import java.util.Scanner;

public class CEx20200213_02 {
	public static void main(String[] args) {
		// �Խ��� ���α׷�
		// ��ȣ / �̸� / ���� / �۳��� / ��ȸ��
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String name = "";
				
		while(true) {
			System.out.print("�Խ��� ��ȣ�� �Է��ϼ���. : ");
			num = scan.nextInt();
			scan.nextLine();
			
			System.out.print("�̸��� �Է��ϼ���. : ");
			name = scan.nextLine();
						
			System.out.println(num + " " + name);
		}
	}
}
