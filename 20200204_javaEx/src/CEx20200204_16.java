import java.util.Scanner;

public class CEx20200204_16 {

	public static void main(String[] args) {
		
		int input_num = 0;	// �Է��� ����
		int check = (int)(Math.random() * 10) + 1;

		Scanner scan = new Scanner(System.in);
	
		while(true) {
			System.out.println("1-10���� ���ڸ� �Է��ϼ���.");
			System.out.println("�����Ͻ÷��� x, X�� �Է����ּ���.");
			char input_ch = scan.next().charAt(0);
			
			if(input_ch == 'x' || input_ch =='X') {
				break;
			}
			
			input_num = input_ch - '0';
			
			if(check == input_num) {
				System.out.printf("��÷�Դϴ�. ��÷��ȣ %d", check);
				System.out.printf("\n�Է¹�ȣ %d\n", input_num);
				
				//���� ���� while���� ���� ����.
				break;
			}
			else {
				System.out.printf("��÷�Ǽ̽��ϴ�. �ٽ� �����ϼ���.\n", check);
			}
		}
		
		System.out.println("�ý����� ����Ǿ����ϴ�.");
		
		scan.close();
		
	}

}
