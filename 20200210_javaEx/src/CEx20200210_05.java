import java.util.Scanner;

public class CEx20200210_05 {
	public static void main(String[] args) {

		// ���������� ������ ����� ������.
		
		int select = 0;	//ù��° ���ú���
		int count = 10;
		int user = 0;	//user�� �� ���������� ����
		int com = 0;	//com �� �� ���������� ����
		int win = 0;	// �¸� Ƚ�� ����
		int draw = 0;	// ���º� Ƚ�� ����
		int lose = 0;	// �й� Ƚ�� ����
		
		String[] confirm = new String[10];	//����Ȯ��
		
		Scanner scan = new Scanner(System.in);
		
		while(true ) {
			System.out.println("-----------------------------------");
			System.out.println("[���������� ����/����Ȯ�� ���α׷�]");
			System.out.println("-----------------------------------");
			System.out.println(" 1) ���������� ����   2) ����Ȯ��");
			System.out.println("��ȣ�� ������ �ּ���.(���� : 0)");
			
			select = scan.nextInt();
			if(select == 0) {
				break;
			}
			
			switch(select) {
				case 1:
					System.out.println("���������� START");
					
					break;
					
				case 2:
					System.out.println("����Ȯ�� START");
					break;
			}
		}
		
	}	// main
} //class
