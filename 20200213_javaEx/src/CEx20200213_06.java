import java.util.Scanner;

public class CEx20200213_06 {
	public static void main(String[] args) {
		// 1 ~ 100 ���� ���� 1���� �������� �̽��ϴ�.
		// ���� ������, ���ڸ� ���ߴ� ����
		// �Է��� ���ڰ� ���� ���� 1������ ���� ���ڰ� Ů�ϴ�. �ٽ� �Է�
		// ������ �۽��ϴ�. �ٽ� �Է�
		// ������ ����~!
		// ������ ��) 5���Դϴ�.
		
		// �ɼ�>
		// �ڽ��� �Է��� ���ڸ� ��� ��� ���ּ���.
		// �ִ� 20������ �ϰڽ��ϴ�.
		
		int ran = 0;
		int count = 0;
		
		int num = 0;
		int[] input_num = new int[20];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ �� �ٿ� ���� ]");
		Loop1 : while(true) {
			System.out.println("������ ���� �մϴ�.");
			ran = (int)(Math.random()*100)+1;
			
			while(true) {
				if(count == 20) {
					System.out.println("!! �� ���� !!");
					System.out.println("20 ���� ���� Ƚ���� ��� ����ϼ̽��ϴ�.");
					break;
				}
				
				System.out.print("1~100�� ���ڸ� �Է��� �ּ���. (���� : 0) : ");
				num = scan.nextInt();
				
				if(num == 0) {
					break Loop1;
				}
				else if(num < 1 || num >100) {
					System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
					continue;
				}
				
				if(ran > num) {
					System.out.println("��!");
				}
				else if(ran < num) {
					System.out.println("�ٿ�!");
				}
				else if(ran == num) {
					System.out.println("!! ���� !!");
					input_num[count] = num;
					break;
				}
				
				input_num[count] = num;
				count++;
			}
			
			System.out.println("������ ���� " + ran + " �Դϴ�.");
			System.out.print("���ݱ��� �Է��� ���ڴ� : ");
			for(int i = 0; i < input_num.length; i++) {
				if(!(input_num[i] == 0)) {
					System.out.print(input_num[i] + " ");
				}
			}
			System.out.println("");
			System.out.println("====================================");
			
			count = 0;
			for(int i = 0; i < count; i++) {
				input_num[i] = 0;
			}
		}
		System.out.println("������ �����մϴ�.");

		scan.close();
	}
}
