import java.util.Scanner;

public class CEx20200203_05 {
	public static void main(String[] args) {
		
		// �ֻܼ����� �Է¹޴� ��ü
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������� �Է��ϼ���.");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int eng = scan.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int math = scan.nextInt();
		
		
		int sum = kor + eng + math;
		System.out.println("�հ� : " + sum);

		double avg = (kor + eng + math)/3;
		System.out.println("��� : " + avg);
		
		scan.close();
				
	}
}
