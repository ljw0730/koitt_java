import java.util.Scanner;

public class CEx20200217_01 {
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
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		int[] rank = new int[3];
		
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		int rank_count = 1;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			System.out.print((i+1) + "��° �л��� �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();
			
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��� �ּ��� : ");
				score[i][j] = scan.nextInt();
				
				if(score[i][j] < 0 || score[i][j] > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					j++;
					continue;
				}
				
				score[i][score[i].length-1] += score[i][j];
			}
			
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
		}
		
		for(int i = 0; i < score.length; i++) {
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			
			rank[i] = rank_count;
		}
		
		
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
	}

}
