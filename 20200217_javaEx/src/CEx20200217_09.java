import java.util.Scanner;

public class CEx20200217_09 {
	public static void main(String[] args) {
		// �� - int, �� - int , �� - float(�Ҽ��� ù°�ڸ�)
		// 10���� time�� �޽��ϴ�.
		// �迭�� �����ؼ� ��������.
		// �˶� �ð� ���� ���α׷�
		
		Time[] time = new Time[3];
//		String[] subject = { "��", "��", "��" };
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�˶��� ������ �ּ���.");
		for(int i = 0; i < time.length; i++ ) {
			time[i] = new Time();
			
			System.out.print((i+1) + "��° '��' �� �Է��� �ּ���. : ");
			time[i].hour = scan.nextInt();
			
			System.out.print((i+1) + "��° '��' �� �Է��� �ּ���. : ");
			time[i].minute = scan.nextInt();
			
			System.out.print((i+1) + "��° '��' �� �Է��� �ּ���. : ");
			time[i].second = scan.nextFloat();
			scan.nextLine();
			
			time[i].print();
		}
		
	}
}


