import java.util.Scanner;

public class CEx20200212_12 {
	public static void main(String[] args) {
		// ����ó�� ���α׷�
		// (�̸�)-String, (����, ����, ����, �հ�)-int, (���)-double
		
		// �̸� �Է� �ޱ�
		// ���� �Է� �ޱ�
		// �հ� ���
		// ��� ���
		// ���
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		String[] subject = { " ", "����", "����", "����", "�հ�", "���" };
		double[] avg = new double[3]; 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			//�̸� �Է�
			System.out.print((i+1) + "�� �л��� �̸��� �Է��ϼ���. : ");
			name[i] = scan.next();
			
			//���� �Է�
			for(int j = 0; j < score[i].length - 1; j++) {
				System.out.print(name[i] + " �л��� " + subject[j+1] +"������ �Է��� �ּ���. : ");
				score[i][j] = scan.nextInt();
			}
			
			//�հ���
			for(int j = 0; j < score.length; j++) {
				score[i][score[i].length-1] += score[i][j];				
			}
			
			//��հ��
			for(int j = 0; j < avg.length; j++) {
				avg[i] = score[i][score[i].length-1]/(score[i].length-1);
			}
		
		}
		
		
		//���
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " \t");
		}
		System.out.println("");
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.printf("%.1f", avg[i]);
			System.out.println("");
		}

		scan.close();
	} // main
} //class
