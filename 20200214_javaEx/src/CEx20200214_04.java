import java.util.Scanner;

public class CEx20200214_04 {
	public static void main(String[] args) {
		// ����ܾ� ���߱�
		
		// ���� - �ѱ� ����
		// ����, �ѱ� ������ �Է� - �̸� �Է�
		// ���� ��� �� �ѱ� �Է� ����
		// �ѱ��� �´��� Ȯ��
		// ��� ���
		// �ٽ� ���� ���
		String in_str = "";
		int select = 0; // ��ȣ ����
		int count = 0;	// Ƚ��
		int words_count = 10; // ���� ����
		int input_count = 0; // ���� �Է� Ƚ��
						
		String[][] words = new String[words_count][2];
		String input_eng = "";
		String input_kor = "";
		
		Scanner scan = new Scanner(System.in);
		
		Loop1: while(true) {
			System.out.println("--------------------------");
			System.out.println(" [���� �ܾ� ���߱� ����]");
			System.out.println("--------------------------");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� Ǯ��");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------------");
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. : ");
			
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 0 || select > 2) {
				System.out.println("�Է��� �߸� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			swit: switch(select) {
				case 1:
					System.out.println("1. ���� �Է��� �����ϼ̽��ϴ�.");
					
					while(input_count < words_count) {
						System.out.print((input_count+1) + "��° ������ ���� �ܾ �Է��ϼ���.(����ȭ�� : 0) :");
						words[input_count][0] = scan.nextLine();
						
						if(words[input_count][0].equals("0")) {
							break swit;
						}
						
						System.out.print((input_count+1) + "��° ������ �ѱ� ���� �Է��ϼ���.(����ȭ�� : 0) :");
						words[input_count][1] = scan.nextLine();
					
						if(words[input_count][1].equals("0")) {
							break swit;
						}
						System.out.println("=====================================");
						
						input_count++;
					}
					
					break;
			
				case 2: 
					System.out.println("2. ���� Ǯ�̸� �����ϼ̽��ϴ�.");
					
					for(int i = 0; i < input_count; i++) {
						
						if(words[0][0] == null) {
							System.out.println("������ �����ϴ�. ���� �Է� ���� ���ּ���.");
							break swit;
						}
						
						
						System.out.println(words[i][0] + " �� ���� �����ϱ��?");
						in_str = scan.nextLine();
						
						if(in_str.equals("0")) {
							break swit;
						}
												
						// ���� ��
						if(words[i][1].equals(in_str)) {
							System.out.println("�����Դϴ�. �������� ����!");
						}
						else {
							if(count < 2) {
								System.out.println((count+1) + "��° �����Դϴ�. �ٽ� ����!");
								count++;	// Ƚ���߰�
								i--;		// ���繮�� �ٽ� ����
								continue;
							}
							
							System.out.println((count+1) + "��° �����Դϴ�. ������ " + words[i][1]);
							count = 0;	//�ʱ�ȭ
						}
						
						System.out.println("=====================================");
					}
					break;
				case 0:
					break Loop1;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}	//main
}	//class
