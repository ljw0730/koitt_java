import java.util.Scanner;

public class CEx20200204_17 {
	public static void main(String[] args) {
		
		// �Է¹��� ���ڿ� ������ 4��
		// ��÷�Ǹ� �Է��ߴ� ���� �����ֱ�
		// ���������� ��÷ �Ǹ� �Է��ߴ� ���� �����ֱ�

		int input_num = 0;	// �Է��� ����
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int check = (int)(Math.random() * 10) + 1;
		int count = 1;

		Scanner scan = new Scanner(System.in);
	
		while(count <= 4) {
			System.out.println("1-10���� ���ڸ� �Է��ϼ���.");
			System.out.println("�����Ͻ÷��� x, X�� �Է����ּ���.");
			char input_ch = scan.next().charAt(0);
			
			if(input_ch == 'x' || input_ch =='X') {
				break;
			}
			
			input_num = input_ch - '0';
			
			switch (count) {
				case 1 :
					num1 = input_num;
					break;
				case 2 :
					num2 = input_num;
					break;
				case 3 :
					num3 = input_num;
					break;
				case 4 :
					num4 = input_num;
					break;
			}
			
			if(check == input_num) {
				System.out.printf("��÷�Դϴ�. ", check);
				
				switch(count) {
					case 1 :
						System.out.printf(" �Է¹�ȣ %d \n", num1);
						break;
					case 2 :
						System.out.printf(" �Է¹�ȣ %d %d \n", num1, num2);
						break;
					case 3 :
						System.out.printf(" �Է¹�ȣ %d %d %d\n", num1, num2, num3);
						break;
					case 4 :
						System.out.printf(" �Է¹�ȣ %d %d %d %d\n", num1, num2, num3, num4);
						break;
				}
				
				
				//���� ���� while���� ���� ����.
				break;
			}
			else {
				System.out.printf("��÷�Ǽ̽��ϴ�. �ٽ� �����ϼ���.\n", check);
				if (count == 4) {
					System.out.printf("��÷��ȣ %d\n�Է¹�ȣ %d %d %d %d\n", check, num1, num2, num3, num4);
				}
				count++;
			}
		}
		
		System.out.println("�ý����� ����Ǿ����ϴ�.");
		
		scan.close();
	}

}
