import java.util.Scanner;

public class CEx20200206_04 {
	public static void main(String[] args) {
		// [����ö ��ݰ�� ���α׷�]
		// 1ȣ�� (���� ~ �ܴ��)
		// �⺻��� 1250��
		// 5������ ���� 100�� �߰� 
		// 1 ~ 5 - 0��
		// 6 ~ 10 - 100�� �߰�
		// 11 ~ 15 - 200�� �߰�
		// 16 ~ 20 - 300�� �߰�
		
		// 1.��������д��� - 2.���� - 3.�ŵ��� - 4.������ - 5.�Ǳ�
		// 6.��� - 7.�뷮�� - 8.��� - 9.���� - 10.���￪
		// 11.��û - 12.���� - 13.����3�� - 14.����5�� - 15.���빮
		// 16.������ - 17.�ż��� - 18.���⵿ - 19.û���� - 20.ȸ��
		
		// ����Ͻ� ���� �Է��ϼ���. (���� : 0) :1
		// �����Ͻ� ���� �Է��ϼ���. (���� : 0) :5
		// 5-1+1 = 5����
		
		// ���밪 ���ϱ� : math.abs(5-1)
		
		// ��߿� : ��������д�����
		// ������ : �ű濪
		
		// �ѱ����� 2�� 30��
		
		int start_station = 0;			// ��߿� ��ȣ
		int end_station = 0;			// ������ ��ȣ
		int gab = 0;					// ��߿��� ������ ������ �� ��
		int absolute = 0;				// gab�� ���밪
		int charge = 0;					// �����ϴ� ���
		final int basic_charge = 1250;	// �⺻���
		
		int section_won = 100;			// ���������� �߰� ���
				
		int min = 0;					// �ɸ��� �ð����� ��
		int sec = 0;					// �ɸ��� �ð����� ��
		final int min_basic = 2;		// �� ������ �ɸ��� �ð�
		final int sec_basic = 30;		// 2�� 30��
		
		String yn = "";					// �ٽ� �����ϱ� ����
		
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while (true) {
			System.out.println("============================");
			System.out.println(" [ ����ö ��ݰ�� ���α׷� ] ");
			System.out.println("1.��������д��� - 2.���� - 3.�ŵ��� - 4.������ - 5.�ű�");
			System.out.println("6.��� - 7.�뷮�� - 8.��� - 9.���� - 10.���￪");
			System.out.println("11.��û - 12.���� - 13.����3�� - 14.����5�� - 15.���빮");
			System.out.println("16.������ - 17.�ż��� - 18.���⵿ - 19.û���� - 20.ȸ��");
			System.out.printf("����Ͻ� ���� �Է��ϼ���.(���� : 0) : ");
			start_station = scan.nextInt();
			
			if(start_station == 0) {
				break;
			}
			
			System.out.println("============================");
			System.out.println("1.��������д��� - 2.���� - 3.�ŵ��� - 4.������ - 5.�ű�");
			System.out.println("6.��� - 7.�뷮�� - 8.��� - 9.���� - 10.���￪");
			System.out.println("11.��û - 12.���� - 13.����3�� - 14.����5�� - 15.���빮");
			System.out.println("16.������ - 17.�ż��� - 18.���⵿ - 19.û���� - 20.ȸ��");
			System.out.printf("�����Ͻ� ���� �Է��ϼ���.(���� : 0) : ");
			end_station = scan.nextInt();
			
			if(end_station == 0) {
				break;
			}
			
			if(end_station >= start_station) {
				gab = end_station - start_station + 1;
			}
			else {
				gab = end_station - start_station - 1;
			}
 			absolute = Math.abs(gab);
 			
 			min = min_basic * (absolute - 1);
 			sec	= sec_basic * (absolute - 1);
 			int divided_value = sec/60;
 			int remaining_values = sec%60;
 			min += divided_value;
 			sec = remaining_values;
					
			switch(absolute) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					charge = basic_charge + 0 * section_won;
					
					break;
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					charge = basic_charge + 1 * section_won;
					break;
					
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
					charge = basic_charge + 2 * section_won;
					break;
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
					charge = basic_charge + 3 * section_won;
					break;	
				
			}
			System.out.println("============================");
			System.out.println("��߿� : " + start_station);
			System.out.println("������ : " + end_station);
			System.out.println("����� " + charge + "�� �Դϴ�.");
			System.out.println("�ҿ�ð��� " + min + "�� " + sec + "�� �Դϴ�." );
			
			while(true) {
				System.out.println("�ٽ� ����ö ��� ����� �Ͻðڽ��ϱ�?(Y/N)");
				yn = scan.next();
				
				//equalsIgnoreCase : ��ҹ��� ������� ��
				if(yn.equalsIgnoreCase("y")) {
					continue Loop1;
				}
				else if(yn.equalsIgnoreCase("n")) {
					break Loop1;
				}
				else {
					System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				}
			}
			
			
			
		}
		System.out.println("============================");
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
		
		
	}	//main
}	// class
	