import java.util.Scanner;

public class CEx20200212_07 {
	public static void main(String[] args) {
		// �л����� ������ �Է��ϴ� �迭
		// �̸��� �Է��ϴ� �迭 3��, ������ �Է��ϴ� �迭 [3][3]
		// ��������, ��������, ��������
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		
		String subject = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			// �̸� �Է�
			System.out.print((i+1) + "��° �л��� �̸��� �Է����ּ���. : ");
			name[i] = scan.next();
			
			// ���� �Է�
			for(int j = 0; j < score[0].length-1; j++) {
				if(j == 0) {
					subject = "����";
				}
				else if(j == 1) {
					subject = "����";
				}
				else if(j == 2) {
					subject = "����";
				}
				
				System.out.print(name[i] + "�л��� " + subject + "������ �Է����ּ���. : ");
				score[i][j] = scan.nextInt();
			}
			
			// �հ��Է�
			for(int j = 0;  j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
			
			System.out.println("=============================================");
		}
		
		//���
		System.out.println("\t����\t����\t����\t�հ�");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scan.close();
		
	} // main
} //class
