import java.util.Scanner;

public class CEx20200211_09 {
	public static void main(String[] args) {
		
		// [3][3]
		// ���� ���� ����
		// 100  78   99
		// 87   85   100
		// 75   100  88
	
		int[][] score = new int[3][3];
		String subject = "";		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				if(j == 0) {
					subject = "����";
				}
				else if (j == 1) {
					subject = "����";
				}
				else if (j ==2) {
					subject = "����";
				}
				System.out.printf((i+1) + "�� �л� " + subject + "������ �Է��� �ּ��� : ");
				score[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\t[ �� �� �� ]");
		System.out.println("\t���� \t���� \t����");
		for(int i = 0; i < score.length; i++) {
			System.out.printf((i+1) + "�л� : ");
			for(int j = 0; j < score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("\n");
		}		
		
		scan.close();
	}	//main
}	//class
