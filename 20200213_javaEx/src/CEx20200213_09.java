import java.util.Scanner;

public class CEx20200213_09 {
	public static void main(String[] args) {
		// ����ó�� ���α׷�
		// 1. �̸� �Է�
		// 2. ���� �Է�
		// 3. �հ� ���
		// 4. ��� ���
		// 5. ��� ���
		
		int stu = 0;
		int rank_count = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("�л��� ����ΰ���? : ");
		stu = scan.nextInt();
		
		String[] name = new String[stu];
		int[][] score = new int[stu][4];
		double[] avg = new double[stu];
		int[] rank = new int[stu];
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		for(int i = 0; i < name.length; i++) {
			// �̸� �Է�
			System.out.print((i+1) + "��° �л��� �̸��� �Է��ϼ��� : ");
			name[i] = scan.next();
			//�����Է�
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��ϼ��� : ");
				score[i][j] = scan.nextInt();
				
				//��ȿ�� �˻�
				if(!(score[i][j] >= 0 && score[i][j] <= 100)) {
					System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ��Է��� �ּ���.");
					j--;
					continue;
				}
				
				// �հ���
				score[i][score[i].length-1] += score[i][j];
			}
			// ��հ��
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); 
		}
		
		//��� ���
		for(int i = 0; i < score.length; i++) {
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
					rank_count++;
				}
			}
			rank[i] = rank_count;
		}
		
		
		// Ÿ��Ʋ ���
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		
				
		for(int i = 0; i < score.length; i++) {
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
