import java.util.Scanner;

public class CEx20200205_07 {

	public static void main(String[] args) {
	
		// �Է��� �޾� �Է¹��� ���� ���� ���� �����ܸ� ���
		// 1~9 ���̸� �Է� �ޱ�
		// ����� ver.
	
		Scanner scan = new Scanner(System.in);
		int dan = 0;
	
		
		
		while(true) {
			System.out.println("����ϰ� ���� ���� �Է��ϼ���.(���� : 0)");
		
			dan = scan.nextInt();
			
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(!(dan >= 1 && dan <= 9)) {
				System.out.print("1���� 9������ ���ڸ� �Է��ϼ���. : ");
				continue; // 1~9���� ���� �ƴϸ� �ٽ� while����
			}
			
			for(int i = dan; i <= 9; i ++) {
				for (int j = 1; j <=9; j ++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println("--------------------------");
			}
			
			break;
		}
		
		scan.close();
	}	// main

} // class
