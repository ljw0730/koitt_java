import java.util.Scanner;

public class CEx20200212_13 {
	public static void main(String[] args) {
		// ����� ver.
		
		// ����ó�� ���α׷�
		// (�̸�)-String, (����, ����, ����, �հ�)-int, (���)-double
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		// [0,0][0,1][0,2]-���� [0.3]- �հ�
		// [1,0][1,1][1,2]-���� [1,3]- �հ�
		// [2,0][2,1][2,2]-���� [2,3]- �հ�
		
		double[] avg = new double[3];
		
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���" };
		
		Scanner scan = new Scanner(System.in);
		
		// �Է� ��
		for(int i = 0; i < name.length; i++) {
			// �̸� �Է�
			System.out.println((i+1) + "�� �л��� �̸��� �Է��� �ּ���.");
			name[i] = scan.next();
		
			// ���� �Է�
			for(int j = 0; j < score[i].length-1 ; j++) {
				System.out.println(subject[j+1] + "������ �Է��� �ּ���.");
				score[i][j] = scan.nextInt();
			
				// �հ� ���
				score[i][score[i].length-1] += score[i][j];
				// score[i][score[i].length-1] = score[i][score[i].length-1] + score[i][j];
			}
			
			// ��� ���
			avg[i] = score[i][score[i].length -1] / (score[i].length-1);
		}
		
		// ���
		for(int i = 0; i< subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");
		for(int i = 0; i < score.length; i++) {		// int[3][4] ���� 3
			// �̸� ���
			System.out.print(name[i] + "\t");
			// ����, �հ� ���
			for(int j = 0; j < score[i].length; j++) {	// int[3][4] ���� 4
				System.out.print(score[i][j] + "\t");
			}
			// ��� ���
			System.out.println(avg[i]);
		}
		
		scan.close();
		
	} // main
} //class
