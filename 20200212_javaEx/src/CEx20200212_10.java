import java.util.Scanner;

public class CEx20200212_10 {
	public static void main(String[] args) {
		// ��ð�� 1����� 2����� �� ���
		// 200�� ����
		// 3��
		// 200�� �̻��̸� �ٽ� �Է�
		// ��� �Ҽ��� ù°�ڸ� ���� �Է�
		
		String[] name = new String[3];
		double[][] score = new double[3][4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			// �̸� �Է�
			System.out.print((i+1) + "��° ������ �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();
			
			// ���� �Է�
			for(int j = 0; j < score[i].length-2; j++) {
				System.out.print((j+1) + "�� ��� ������ �Է��� �ּ���. : ");
				score[i][j] = scan.nextDouble();
				
				if(score[i][j] > 200) {
					System.out.println("������ �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					j--;
					continue;
				}
			}
			
			//�հ� ���
			for(int j = 0; j < score[i].length-2; j++) {
				score[i][score[i].length-2] += score[i][j];
			}
			
			//��� ���
			score[i][score[i].length-1] = score[i][score[i].length-2]/(score[i].length-2);
					
		}
		
		
		//���
		System.out.println("[ �� �� �� �� ]");
		System.out.println("\t1�����\t2�����\t�հ�\t���");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%.1f\t", score[i][j]);
			}
			System.out.println("");
		}
		
		
		scan.close();
	} // main
} //class
