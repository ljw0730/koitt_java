import java.util.Scanner;

public class CEx20200207_01 {
	public static void main(String[] args) {
		// ���ڸ� �Է��ؼ�
		// 0����, �ƴ��� �Ǵ��ϴ� ���α׷��� ����� ������.		
		
		int num = 0;
		
		
		// ��ü ����
		// ȭ���� �Էµ� ���� ������� ��ü
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ �Է��� ���ڴ� 0�ΰ� �ƴѰ� ]");
		System.out.printf("���ڸ� �Է��� �ּ���. : ");
		num = scan.nextInt();
		
		// 1 > x , x == 1, x == 0, 0 < x
		if(num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
		}
		else if (num > 0){
			System.out.println("�Է��Ͻ� ���ڴ� 0 �� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� 0 ���� Ů�ϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� " + num + " �Դϴ�.");
		}
		else if(num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� 0 ���� �۽��ϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� " + num + " �Դϴ�.");
		}
		
		scan.close();
		
	}
}
