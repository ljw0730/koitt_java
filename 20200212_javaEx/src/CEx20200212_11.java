import java.util.Scanner;

public class CEx20200212_11 {
	public static void main(String[] args) {
		// ����� ver.
		
		// ��ð�� 1����� 2����� �� ���
		// 200�� ���� 
		// 3��(�ֹ̼�, �⺸��, ������)
		// 200�� �̻��̸� �ٽ� �Է�
		// ��� �Ҽ��� ù°�ڸ� ���� �Է�
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] subject = { " ", "1�����", "2�����", "�հ�", "��������", "���" };		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			//�̸� �Է�
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[i] = scan.next();
			
			//���� �Է�
			for(int j = 0; j < score[i].length-2; j++) {
				System.out.println("������ �Է��� �ּ���.>>");
				score[i][j] = scan.nextInt();
				
				// �հ��Է� score[i][3]
				score[i][score[i].length-2] += score[i][j];
				
			}
			//�������� �Է�
			if(score[i][0] > score[i][1]) {
				score[i][score[i].length-1] = score[i][0];
			}
			else {
				score[i][score[i].length-1] = score[i][1];
			}
			
			//����Է� �հ�/2������
			avg[i] = score[i][score[i].length-2] / 2.0;
		}
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("");

		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			//������
			System.out.print(avg[i]);
			System.out.println("");
		}
		
		
		
		scan.close();
	} // main
} //class
