import java.util.Scanner;

public class CEx20200212_08 {
	public static void main(String[] args) {
		// �л� 3��, ����, ����, ����, ����, �հ�
		
		String[] name = new String[3];
		int[][] score = new int[3][5];
		
		String subject = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < name.length; i++) {
			//�̸� �Է�
			System.out.print((i+1)+ "�� �л��� �̸��� �Է��� �ּ���. : ");
			name[i] = scan.next();
			
			//���� �Է�
			for(int j = 0; j < score[i].length-1; j++) {
				if(j == 0) {
					subject = "����";
				}
				else if(j == 1) {
					subject = "����";
				}
				else if(j == 2) {
					subject = "����";
				}
				else if(j == 3) {
					subject = "����";
				}
				
				System.out.print(name[i] + " �л��� " + subject + "������ �Է��� �ּ���. : ");
				score[i][j] = scan.nextInt();
			}
			
			//�հ� ���
			for(int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
			
//			//��� ���
//			for(int j = 0; j < score[i].length-1 j++) {
//				
//			}
			
			System.out.println("=============================================");
		}
		
		//���
		System.out.println("\t����\t����\t����\t����\t�հ�");
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i] + " : ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scan.close();
				
	} // main
} //class
