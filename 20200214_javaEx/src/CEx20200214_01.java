import java.util.Scanner;

public class CEx20200214_01 {
	public static void main(String[] args) {
		// ����ó�� ���α׷�
		
		// ���� ����
		// �̸� �Է�
		// ���� �Է�
		// �հ� ���
		// ��� ���
		// ��� ���
		// Ÿ��Ʋ, �̸�, ����/�հ�, ���, ��� ���
		
		Scanner scan = new Scanner(System.in);
		
		int stu = 0;
		System.out.print("�л��� ��� �Դϱ�? : ");
		stu = scan.nextInt();
		
		String[] name = new String[stu];
		int[][] score = new int[stu][4];
		double[] avg = new double[stu];
		int[] rank = new int[stu];
		
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		int rank_count = 1;
		
		System.out.println("[ ����ó�� ���α׷� ]");
		
		for(int i = 0; i < name.length; i++) {
			// �̸� �Է�			
			System.out.print((i+1) + "��° �л��� �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();
			
			// ���� �Է�
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��� �ּ���. : ");
				score[i][j] = scan.nextInt();

				// �հ� ���
				score[i][score[i].length-1] += score[i][j];
			}
			
			// ��� ���
			avg[i] = score[i][score[i].length-1] / (score[i].length - 1);
		}
		
		// ��� ���
		
		for(int i = 0; i < score.length; i++) {
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			rank[i] = rank_count;
		}
		
		
		System.out.println("============================================================");
		
		// Ÿ��Ʋ ���
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < name.length; i++) {
			// �̸� ���
			System.out.print(name[i] + "\t");
			// ���� ���
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			// ��� ���
			System.out.print(avg[i] + "\t");
			// ��� ���
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
	}
}
