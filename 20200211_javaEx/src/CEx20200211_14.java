import java.util.Scanner;

public class CEx20200211_14 {
	public static void main(String[] args) {
		
		//[5][5]
		// 0, 1 �������� ä���
		
		// x��ǥ 1  y��ǥ 2
		// [1][2] �ڸ��� 1�� �� �ִٸ� "��÷" �Է�
		// ���� 0�� �� ������ score_in[1,2] "��" �Է�
		//  0  1  2
		//0
		//1
		//2
		//10��

		int[][] score = new int[5][5];
		String[][] score_in = new String[5][5];
		
		int game_count = 0;	// ���� 10�� ī����
		int x_in = 0;	// x��ǥ
		int y_in = 0;	// y��ǥ
		int win = 0;	// ��÷Ƚ��
		int lose = 0;	// ��!Ƚ��
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				score[i][j] = (int)(Math.random()*2);
			}
		}
		
		
		for(int i = 0; i < score_in.length; i++) {
			for(int j = 0; j < score_in.length; j++) {
				score_in[i][j] = "?";
			}
		}
		
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println(" [ �� ǥ �� �� �� ���� ]");
			System.out.println("-------------------------");
			System.out.print("\t0\t1\t2\t3\t4\n");
			
			for(int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < score_in[0].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println("");
			}
			
			if(game_count == 10) {
				break;
			}
			System.out.println((game_count+1) + "��° �����Դϴ�.");
			
			System.out.print("x��ǥ�� �Է��� �ּ���.(����:99) : ");
			x_in = scan.nextInt();
			if(x_in == 99) {
				break;
			}
			else if (x_in < 0 || x_in > 4) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			System.out.print("y��ǥ�� �Է��� �ּ���.(����:99) : ");
			y_in = scan.nextInt();
			if(y_in == 99) {
				break;
			}
			else if (y_in < 0 || y_in > 4) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				continue;
			}
			
			if(!(score_in[x_in][y_in].equals("?"))) {
				System.out.println("�̹� ���õ� ��ǥ�Դϴ�. �ٽ� ������ �ּ���.");
				continue;
			}
			
			if(score[x_in][y_in] == 1) {
				score_in[x_in][y_in] = "��÷";
				win++;
			}
			else if(score[x_in][y_in] == 0) {
				score_in[x_in][y_in] = "��!";
				lose++;
			}
					
			game_count++;
		}
		
		System.out.println("��÷ Ƚ�� : " + win + " / ��! Ƚ�� : " + lose);
		System.out.println("������ �����մϴ�.");
		
		scan.close();
		
	}	//main
}	//class
