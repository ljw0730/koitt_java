import java.util.Scanner;

public class CEx20200205_08 {

	public static void main(String[] args) {
	
		// ���� 2���� �Է¹޾�
		// �Է¹��� 2���� �ܸ� ���� ������ ���
		// ����� ver.
	
		Scanner scan = new Scanner(System.in);
		int dan = 0;
		int dan2 = 0;
	
		while(true) {
			System.out.println("����ϰ� ���� ���� 2���� ���� �Է��ϼ���.(���� : 0)");
			System.out.println("ù��° ���� : ");
			dan = scan.nextInt();
			
			System.out.println("�ι�° ���� : ");
			dan2 = scan.nextInt();
			
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(!(dan >= 1 && dan <= 9)) {
				System.out.print("1���� 9������ ���ڸ� �Է��ϼ���. : ");
				continue; // 1~9���� ���� �ƴϸ� �ٽ� while����
			}
			
			for(int i = 2; i <= 9; i ++) {
				for (int j = 1; j <=9; j ++) {
					if(i == dan || i == dan2) {
						continue;
					}
					
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println("--------------------------");
			}
			
			break;
		}
		
		scan.close();
	}	// main

} // class
