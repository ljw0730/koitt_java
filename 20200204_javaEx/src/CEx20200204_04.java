import java.util.Scanner;

public class CEx20200204_04 {
	public static void main(String[] args) {
		// 1~45 ������ 3���� ���ڸ� �Է� �޾Ƽ�
		// 1~45 ���� �� ���Ͽ� ���߱�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1 ~ 45 ������ 3���� ���ڸ� �Է��ϼ���(1/3) : ");
		int i = scan.nextInt();
		System.out.print("1 ~ 45 ������ 3���� ���ڸ� �Է��ϼ���(2/3) : ");
		int i2 = scan.nextInt();
		System.out.print("1 ~ 45 ������ 3���� ���ڸ� �Է��ϼ���(3/3) : ");
		int i3 = scan.nextInt();
		
		int ran = (int)(Math.random() * 45) + 1;
				
		if((i == ran) || (i2 == ran) || (i3 == ran) ) {
			System.out.println("��÷�Դϴ�. ��÷��ȣ�� " + ran + "�̾����ϴ�.");
		}
		else {
			System.out.println("��÷�Դϴ�. ��÷��ȣ�� "+ ran + "�̾����ϴ�.");
		}
		System.out.printf("�Է��Ͻ� ���ڴ� %d %d %d �Դϴ�.", i, i2, i3);
		
		scan.close();
	}
}
