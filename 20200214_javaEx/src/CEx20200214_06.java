import java.util.Scanner;

public class CEx20200214_06 {
	public static void main(String[] args) {
		// [����ó�� ���α׷�]
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
				
		int select = 0;
		int rank_count = 1;
		int stu_num = 0;	//�л��Է¼�
		String y_or_n = "";
		String name_ch = "";
		int check_num = 0;
				
		Scanner scan = new Scanner(System.in);
		
		while_Loop: while(true) {
			System.out.println("--------------------------");
			System.out.println("    ����ó�� ���α׷�");
			System.out.println("--------------------------");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ��� ���");
			System.out.println("4. �л� ���� �˻�");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------------");
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ���. : ");
			
			select = scan.nextInt();
			scan.nextLine();
			
			if(select < 0 || select > 4) {
				System.out.println("�߸��Է� �ϼ˽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			swit_Loop: switch(select) {
				case 1:
					System.out.println("���� �Է��� �����ϼ̽��ϴ�.");
					for(int i = stu_num; i < name.length; i++) {
						System.out.print((i+1) + "�� �л��� �̸��� �Է��� �ּ���.(����ȭ�� :999) : ");
						name[i] = scan.next();
						
						if(name[i].equals("999")) {
							name[i] = null;
							break swit_Loop;
						}
						
						for(int j = 0; j < score[i].length-1; j++) {
							System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��� �ּ���.(����ȭ�� :999) : ");
							score[i][j] = scan.nextInt();
							
							if(score[i][j] == 999) {
								score[i][j] = 0;
								break swit_Loop;
							}
							if(score[i][j] < 0 || score[i][j] > 100) {
								System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
								j--;
								continue;
							}
							
							score[i][score[i].length-1] += score[i][j];
						}
						
						avg[i] = score[i][score[i].length-1] / (score[i].length-1);
						
						stu_num++;	//�Էµ� �л� ��
					}
														
					break;
					
				case 2:
					while(true) {
						System.out.println("������ ����մϴ�.");
						for(int i = 0; i < subject.length; i++) {
							System.out.print(subject[i] + "\t");
						}
						System.out.println();
						
						for(int i = 0; i < score.length; i++) {
							if(name[i] == null) {
								continue;
							}
							System.out.print(name[i] + "\t");
							for(int j = 0; j < score[i].length; j++) {
								System.out.print(score[i][j] + "\t");
							}
							System.out.print(avg[i] + "\t");
							System.out.print(rank[i] + "\t");
							System.out.println();
						}
						
						System.out.println("�ٽ� ��� �Ͻðڽ��ϱ�?(y/n)");
						y_or_n = scan.nextLine();
						if(y_or_n.equals("N") || y_or_n.equals("n")) {
							System.out.println("����ȭ������ �̵��մϴ�.");
							break;
						}
					}
					break;
					
				case 3: 
					System.out.println("����� ��� �մϴ�.");
					for(int i = 0; i < score.length; i++) {
						rank_count = 1;
						
						for(int j = 0; j < score.length; j++) {
							if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
								rank_count++;
							}
						}
						
						rank[i] = rank_count;
					}
					break;
				
				case 4:
					System.out.println("�л������˻��� �Է��ϼ̽��ϴ�.");
					System.out.println("------------------------------");
					System.out.print("���ϴ� �л��� �̸��� �Է��ϼ���. : ");
					name_ch = scan.nextLine();
					
					// �л��̸����� �л� ��ü�� �˻�
					for(int i = 0; i < name.length; i++) {
						if(name_ch.equals(name[i])) {
							check_num = i;
							break;
						}
						check_num = -1;
					}
					
					if(!(check_num == -1)) {
						System.out.println(name[check_num] + "������ ����մϴ�.");
						for(int i = 0; i < subject.length; i++) {
							System.out.print(subject[i] + "\t");
						}
						System.out.println();
						
						
						System.out.print(name[check_num] + "\t");
						for(int j = 0; j < score[0].length; j++) {
							System.out.print(score[check_num][j] + "\t");
						}
						System.out.print(avg[check_num] + "\t");
						System.out.print(rank[check_num] + "\t");
						System.out.println();
						
//						System.out.println("�ٽ� ��� �Ͻðڽ��ϱ�?(y/n)");
//						y_or_n = scan.nextLine();
//						if(y_or_n.equals("N") || y_or_n.equals("n")) {
//							System.out.println("����ȭ������ �̵��մϴ�.");
//							break;
//						}
						
						break;
					
					}
					System.out.println("���ϴ� �л��� �����ϴ�.");
					
					//�л��� �Է�
					//�̸��� �� in_name.equals(name[i])
					
					break;
				case 0:
					break while_Loop;
			}	// switch
		}	// while
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}	//main
}	//class
