import java.util.Scanner;

public class CEx20200212_15 {
	public static void main(String[] args) {
		//����ó�� ���α׷�
		// (�̸�)-String, (����, ����, ����, �հ�)-int, (���)-double
		
		// �̸� �Է� �ޱ�
		// ���� �Է� �ޱ�
		// �հ� ���
		// ��� ���
		// ���
		
		String[] name = new String[3];	// �̸� �迭
		int[][] score = new int[3][4];	// ����, �հ� �迭
		double[] avg = new double[3];	// ��� �迭
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���" };
		
		Scanner scan = new Scanner(System.in);
		
		//�Է�
		for(int i = 0; i < name.length; i++) {
			//�̸� �Է�
			System.out.print((i+1) + "�� �л��� �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();
			
			//���� �Է�
			for(int j = 0; j < score[i].length-1; j++) {
				System.out.print(name[i] + " �л��� " + subject[j+1] + "������ �Է��� �ּ���. : ");
				score[i][j] = scan.nextInt();
				
				// �հ� ���
				score[i][score[i].length-1] += score[i][j];
			}
			
			//��� ���
			for(int j = 0; j < avg.length; j++) {
				avg[i] = score[i][score[i].length-1] / (score[i].length-1);
			}
			
			System.out.println("===================================");
		}
		
		//���
		//����� ���
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");
		
		for(int i = 0; i < score.length; i++) {
			//�̸� ���
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				//���� ���
				System.out.print(score[i][j] + "\t");
			}
			//��� ���
			System.out.println(avg[i]);
		}
		
		scan.close();
		
	} // main
} //class
