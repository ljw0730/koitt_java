import java.util.Scanner;

public class CEx20200203_04 {
	public static void main(String[] args) {
		
		// �ֻܼ����� �Է¹޴� ��ü
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ���.");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int eng = scan.nextInt();
		
		double avg = (kor + eng)/2;
		System.out.println("��� : " + avg);
		
		scan.close();
		
	}
}
