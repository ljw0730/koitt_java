import java.util.Scanner;

public class CEx20200214_05 {
	public static void main(String[] args) {
		// ����ܾ� ���߱�
				// ����� ver.
				
				// ���� - �ѱ� ����
				// ����, �ѱ� ������ �Է� - �̸� �Է�
				// ���� ��� �� �ѱ� �Է� ����
				// �ѱ��� �´��� Ȯ��
				// ��� ���
				// �ٽ� ���� ���
				
				String[][] words = new String[10][2];
				String in_str = "";
				int s_num = 0; 	// ���ù�ȣ
				int count = 0;	// Ƚ��
				int words_num = 0; // ������ȣ
				int ex_num = 0;
				
				String eng = ""; // �����Էº���
				
				Scanner scan = new Scanner(System.in);
				
				while(true) {
					System.out.println("--------------------------");
					System.out.println("      ���� ���α׷�");
					System.out.println("--------------------------");
					System.out.println("1. ���� �Է�");
					System.out.println("2. ���� Ǯ��");
					System.out.println("0. ���α׷� ����");
					System.out.println("--------------------------");
					System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. : ");
					
					s_num = scan.nextInt();
					scan.nextLine();
					
					
					s_loop:
						switch(s_num) {
						case 1:
							System.out.println("�����Է��� �����ϼ̽��ϴ�.");
							
							for(int i = 0; i < words.length; i++) {
								System.out.println("----------------------------");
								System.out.println("��� �Է��ϼ���.(����ȭ�� : 99) >>");
								eng = scan.next();
								if(eng.equals("99")) {
									break s_loop;
								}							
								words[i][0] = eng;
								System.out.println("�ѱ��� �Է��ϼ���.(����ȭ�� : 99) >>");
								words[i][1] = scan.next();
								
								words_num++;
								
							}
							
							if(words_num == 10) {
								System.out.println("10���� ��� �ԷµǾ����ϴ�. �� �̻� �Է��� �� �����ϴ�.");
								break;
							}
							
							
						case 2:
							for(int i = ex_num; i < words_num; i++) {
								System.out.println(words[i][0] + " �� ���� �����ϱ��? (����ȭ�� : 99)");
								in_str = scan.nextLine();
								
								if(in_str.equals("99")) {
									System.out.println("����ȭ������ �̵��մϴ�.");
									break;
								}
								
								// ���� ��
								if(words[i][1].equals(in_str)) {
									System.out.println("�����Դϴ�. �������� ����!");
									ex_num++;	//����Ǯ�� 1�߰� 2��° ���� Ǯ��
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
									ex_num++;	//����Ǯ�� 1�߰� 2��° ���� Ǯ��
								}
								
								System.out.println("=====================================");
							}
							break;
						}
					
				}	// while
				
	}	//main
}	//class
