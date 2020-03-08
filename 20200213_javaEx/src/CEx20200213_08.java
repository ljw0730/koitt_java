import java.util.Scanner;

public class CEx20200213_08 {
	public static void main(String[] args) {
		// �л�����ó�� ���α׷�
		// 1. �л������߰� 2. �л����� ���� 3. �л����� ���� 0. ����
		// 1-> ���������Է�
		
		// �̸� ���� ���� ���� �հ� ���
		// n�� �Է�
		
		Scanner scan = new Scanner(System.in);
		
		// �л� �ο��� �Է�
		int stu = 0;
		System.out.print("�л��� ����ΰ���? : ");
		stu = scan.nextInt(); 
		
		String[] name = new String[stu];	// �̸�
		int[][] score = new int[stu][4];	// ����
		double[] avg = new double[stu];	// ���
		int[] rank = new int[stu];		// ���
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		
		int rank_count = 1;	//��� ī��Ʈ
		
		//�̸�, ���� �Է�
		for(int i = 0; i < score.length; i++) {
			//�̸� �Է�
			System.out.print((i+1) + "��° �л��� �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();			
			
			//���� �Է�
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print((i+1) + " ��° �л��� " + subject[j+1] + "������ �Է��ϼ���. : ");
				score[i][j] = scan.nextInt();
				
				//��ȿ�� �˻�
				if(!(score[i][j]>=0 && score[i][j]<= 100)) {
					System.out.println("������ �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					j--;
					continue;
				}
				
				// �հ� += �߰�����
				score[i][score[i].length-1] += score[i][j]; 
			}
			// ��� ���
			avg[i] = score[i][score[i].length-1] / (score[i].length-1);			
		}
		
		
		// ��� �ű��
		for(int i = 0; i < score.length; i++) {		// 0, 1, 2
			rank_count = 1;
			for(int j = 0; j < score.length; j++) {		// 0, 1, 2
				if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
				 //score[i][2] < score[j][2]
				 //score[0][2] < score[0][2] true�̸� ==> +1
				 //score[0][2] < score[1][2] true�̸� ==> +1
				 //score[0][2] < score[2][2] true�̸� ==> +1
					rank_count++;
				}
			}
			//��� �Է�
			rank[i] = rank_count;
		}
		
		// ���� ���
		for(int i = 0; i < subject.length; i++) {
			System.out.printf(subject[i] + "\t");
		}
		System.out.println();
		
		// �̸�, ���� ���
		for(int i = 0; i < score.length; i++) {
			// �̸� ���
			System.out.print(name[i] + "\t");
			// ���� ���
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			// ��� ���
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			System.out.println();
		}
		
		scan.close();
		
	}
}
