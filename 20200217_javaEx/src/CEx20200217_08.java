import java.util.Scanner;

public class CEx20200217_08 {
	public static void main(String[] args) {
		// �� - int, �� - int , �� - float(�Ҽ��� ù°�ڸ�)
		// 10���� time�� �޽��ϴ�.
		// �迭�� �����ؼ� ��������.
		// �˶� �ð� ���� ���α׷�
		
		int[] hour = new int[10];
		int[] minute = new int[10];
		float[] second = new float[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < hour.length; i++) {
			System.out.println("[ �˶��ð� ���� ���α׷� ]");
			System.out.print("�ð��� �Է��ϼ���. : ");
			hour[i] = scan.nextInt();
			System.out.print("���� �Է��ϼ��� : ");
			minute[i] = scan.nextInt();
			System.out.print("���� �Է��ϼ��� : ");
			second[i] = scan.nextFloat();
			
			System.out.println("�˶����� : " + hour[i] + "�� " + minute[i] + "�� " + second[i] + "��");
			
		}
		
	}
}


