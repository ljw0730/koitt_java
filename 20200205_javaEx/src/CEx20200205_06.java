import java.util.Scanner;

public class CEx20200205_06 {

	public static void main(String[] args) {
	
		// �Է��� �޾� �ش��ϴ� �ܸ� ��� ���� �ʱ�
	
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ��� �Է��ϼ���.(1~9 / 0:����) : ");
		int dan = scan.nextInt();
	
		for(int i = dan; i <= dan; i ++) {
			for (int j = 1; j <=9; j ++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}
		
		scan.close();
	}

}
