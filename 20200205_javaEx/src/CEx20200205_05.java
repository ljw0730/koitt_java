import java.util.Scanner;

public class CEx20200205_05 {

	public static void main(String[] args) {
	
		// �Է��� �޾� �Է¹��� ���� ���� ���� �����ܸ� ���
		// 1~9 ���̸� �Է� �ޱ�
	
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��ϼ���.(1~9 / 0:����) : ");
		int input = scan.nextInt();
	
		Loo1: while(true) {
			if(input == 0) {
				break;
			}
			else if(input <= 1 || input >= 9) {
				System.out.print("�ܼ��� �ٽ� �Է��ϼ��� (1~9 / 0:����) : ");
				input = scan.nextInt();
				if(input == 0) {
					break;
				}
			}
			else {
				for (int i = 2; i <= 9; i++) {
					if (i < input) {
						continue;
					}
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
					System.out.println("--------------------------");
					
					if(i == 9) {
						break Loo1;
					}
				}
			}
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
	}

}
