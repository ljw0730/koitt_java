import java.util.Scanner;

public class CEx20200203_13 {

	public static void main(String[] args) {
		// �Ǽ� �Ҽ� 5° �ڸ� ���ڸ� �Է� �޾Ƽ� 4°�ڸ����� �ݿø�
		// �Ѱ��� ����Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		
		double d = scan.nextDouble();
		
		double d2 = Math.round(d*1000)/1000.0d;
		
		System.out.println("�Ҽ��� 4°�ڸ� �ݿø� �� : " + d2);

		scan.close();
	}

}
