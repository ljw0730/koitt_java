import java.util.Scanner;

public class CEx20200217_03 {
	public static void main(String[] args) {
		// ����ó�� ���α׷�
		// �⺻ - �̸� , ���� , ����, ����, �հ�, ���, ���
		// �ɼ� - 1.�л��߰� 2.�л���� 3.���ó��. 0.����
		
		// ���� ����
		// �̸� �Է�
		// ���� �Է�
		// �հ� ���
		// ��� ���
		// ��� ���
		// Ÿ��Ʋ / �̸� / ����,�հ� / ��� / ��� ��� 
		
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		int select = 0;
		int rank_count = 1;
		int stu_count = 0;
		String search_name = "";
		int searched_num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[ ����ó�� ���α׷� ]");
			System.out.println("=====================");
			System.out.println("1. �л��߰�");
			System.out.println("2. �������");
			System.out.println("3. �л��˻�");
			System.out.println("4. �л���������");
			System.out.println("5. ���ó��");
			System.out.println("0. ����");
			System.out.println("=====================");
			System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
			select = scan.nextInt();
			
			if(select < 0 || select >5) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			if(select == 0) {
				break;
			}
			
			switch(select) {
				case 1:
					System.out.println("=== �л��߰��� ���� �ϼ̽��ϴ�. ===");
					for(int i = stu_count; i < name.length; i++) {
						System.out.print((i+1) + "��° �л��� �̸��� �Է��� �ּ���. (�����ܰ�:999): ");
						name[i] = scan.next();
						scan.nextLine();
						
						if(name[i].equals("999")) {
							name[i] = null;
							break;
						}
						
						for(int j = 0; j < score[i].length-1; j++) {
							System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��� �ּ��� (�����ܰ�:999): ");
							score[i][j] = scan.nextInt();
							scan.nextLine();
							
							if(score[i][j] == 999) {
								break;
							}
							
							if(score[i][j] < 0 || score[i][j] > 100) {
								System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
								j++;
								continue;
							}
							
							score[i][score[i].length-1] += score[i][j];
						}
						
						avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
						
						stu_count++;
					}
					break;
					
				case 2:
					System.out.println("=== ���� ����� ���� �ϼ̽��ϴ�. ===");
					
					for(int i = 0; i < subject.length; i++) {
						System.out.print(subject[i] + "\t");
					}
					System.out.println();
					
					for(int i = 0; i < score.length; i++) {
												
						if (name[i] == null) {
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
					break;
				
				case 3:
					System.out.println("=== �л� �˻��� ���� �ϼ̽��ϴ�. ===");
					System.out.print("���Ͻô� �л��� �̸��� �Է��� �ּ���. : ");
					search_name = scan.next();
					scan.nextLine();
					searched_num = 0;
					for(int i = 0; i < name.length; i++) {
						if(name[i].equals(search_name)) {
							break;
						}
						searched_num++;
					}
					
					System.out.println(name[searched_num] +" �л��� ������ ����մϴ�.");
					
					for(int i = 0; i < subject.length; i++) {
						System.out.print(subject[i] + "\t");
					}
					System.out.println();
					
					
					System.out.print(name[searched_num] + "\t");
					
					for(int j = 0; j < score[searched_num].length; j++) {
						System.out.print(score[searched_num][j] + "\t");
					}
					
					System.out.print(avg[searched_num] + "\t");
					System.out.print(rank[searched_num] + "\t");
					System.out.println();
					
					break;
					
				case 4:
					System.out.println("=== �л� ���� ������ ���� �ϼ̽��ϴ�. ===");
					System.out.print("���Ͻô� �л��� �̸��� �Է��� �ּ���. : ");
					search_name = scan.next();
					scan.nextLine();
					searched_num = 0;
					for(int i = 0; i < name.length; i++) {
						if(name[i].equals(search_name)) {
							break;
						}
						searched_num++;
					}
					
					name[searched_num] = null;
					for(int j = 0; j < score[searched_num].length; j++) {
						score[searched_num][j] = 0;
					}
					avg[searched_num] = 0.0d;
					rank[searched_num] = 0;
				
					
				case 5:
					System.out.println("=== ���ó���� ���� �ϼ̽��ϴ�. ===");
					for(int i = 0; i < score.length; i++) {
						rank_count = 1;
						for(int j = 0; j < score.length; j++) {
							if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
								rank_count++;
							}
						}
						
						rank[i] = rank_count;
					}
					System.out.println("���ó���� �Ϸ� �Ǿ����ϴ�.");
					break;
			}
			
		}
		
		
		System.out.println("���α׷��� �����մϴ�.");
		
		scan.close();
		
	}
}
