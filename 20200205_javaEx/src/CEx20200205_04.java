import java.util.Scanner;

public class CEx20200205_04 {

	public static void main(String[] args) {
	
		// �Է��� �޾� �ش��ϴ� �����ܸ� ���
	
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��ϼ���. : ");
		int input = scan.nextInt();
	
		
		for(int i = 2; i <= 9; i++) {
			if (i != input) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}

		scan.close();
	}

}
