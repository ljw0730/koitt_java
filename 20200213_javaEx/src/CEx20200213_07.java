import java.util.Scanner;

public class CEx20200213_07 {
	public static void main(String[] args) {
		// ����� ver.
		
		// 1 ~ 100 ���� ���� 1���� �������� �̽��ϴ�.
		// ���� ������, ���ڸ� ���ߴ� ����
		// �Է��� ���ڰ� ���� ���� 1������ ���� ���ڰ� Ů�ϴ�. �ٽ� �Է�
		// ������ �۽��ϴ�. �ٽ� �Է�
		// ������ ����~!
		// ������ ��) 5���Դϴ�.
		
		// �ɼ�>
		// �ڽ��� �Է��� ���ڸ� ��� ��� ���ּ���.
		// �ִ� 20������ �ϰڽ��ϴ�.
		
		int random = (int)(Math.random()*100)+1;	// 1~100 ������ 1�� ����
		int[] input = new int[20];	// �Է��ϴ� ����
		int count = 0;
		 
		
		Scanner scan = new Scanner(System.in);
		
		while(count < 20) {
			System.out.print("���� �Ѱ��� �Է��ϼ��� : ");
			input[count] = scan.nextInt();
			
			if(random > input[count]) {
				System.out.println("���ڰ� �۽��ϴ�." + input[count] + "���� ū ���� �Է��ϼ���.");
			}
			else if(random == input[count]) {
				System.out.println("����");
				break;
			}
			else{
				System.out.println("���ڰ� Ů�ϴ�." + input[count] + "���� ���� ���� �Է��ϼ���.");
			}
			count++;
			
			// ������ 20��°�� -1�� ���ְ� �ݺ����� ���� ����
			if(count==20) {
				count--;
				break;
			}
		}
		
		System.out.print("Ƚ��        : ");
		for(int i = 0; i <= count; i++) {
			System.out.printf("%2d ", (i+1));
		}
		System.out.println();
		
		System.out.print("�Է��� ���� : ");
		for(int i = 0; i <= count; i++) {
			System.out.printf("%2d ", input[i]);
		}
		System.out.println();
		
		if(input[count] == random) {
			System.out.println((count+1) + " ��° " + random + "��(��) ������ϴ�.");
		}
		else {
			System.out.println("20��°������ ������ ���߽��ϴ�.");
			System.out.println("������ " + random + " �Դϴ�.");
		}
		

		scan.close();
	}
}
