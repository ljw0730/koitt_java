import java.util.Scanner;

public class CEx20200204_03 {
	public static void main(String[] args) {
		// O, X
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ��ȣ�� �Է��ϼ���.(1, 2) : ");
		
		int ox_true = scan.nextInt();
		
		// 1 ~ 2 �����߻�
		int ox = (int)(Math.random() * 2) + 1;
		
		if(ox_true == ox) {
			System.out.printf("�����Դϴ�. �������� %d", ox);
		}
		else {
			System.out.printf("�����Դϴ�. �������� %d", ox);
		}
		
		scan.close();
	}
}
