import java.util.Scanner;

public class CEx20200203_03 {
	public static void main(String[] args) {
		
		// Scanner : �Է��� �޴� Ŭ���� 
		// System.in : �ܼ�ȭ�鿡�� ���� 1�� ����
		// Ŭ������ ��ü������ �ؾ� ����� �� �ִ�.
		Scanner scan = new Scanner(System.in);
		
		// nextInt() : ȭ������ ������ �Է� �޴´�.
		// nextFloat() : ȭ������ �Ǽ��� �Է� �޴´�.
		
//		int aaa = scan.nextInt();
//		float kor = scan.nextFloat();
		
		System.out.println("���������� �Է����ּ���. : ");
		// nextLine() : ȭ�鿡�� String�� �Է� ������ ����Ѵ�.
		String kor = scan.nextLine();
		
		System.out.println("���������� �Է����ּ���. : ");
		String eng = scan.nextLine();
		
		//Integer.parseInt() : String�� int�� ��ȯ
		int kor1 = Integer.parseInt(kor);
		int eng1 = Integer.parseInt(eng);
		
		
//		System.out.println("aaa : " + aaa);
//		System.out.println("���� ���� : " + kor);
//		System.out.println("���� ���� : " + eng);
		
		System.out.println("����, �������� �� : " + (kor1 + eng1));
		
		scan.close();
	}
}
