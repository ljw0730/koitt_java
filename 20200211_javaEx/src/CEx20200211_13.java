import java.util.Scanner;

public class CEx20200211_13 {
	public static void main(String[] args) {
		
		//[3][3]
		// 0, 1 �������� ä���
		
		// x��ǥ 1  y��ǥ 2
		// [1][2] �ڸ��� 1�� �� �ִٸ� "��÷" �Է�
		// ���� 0�� �� ������ score_in[1,2] "��" �Է�
		//  0  1  2
		//0
		//1
		//2
		
		int[][] score = new int[3][3];				// 0,1 ����
		String[][] score_in = new String[3][3]; 	// �Է��ؼ� �����ϴ� �迭
		
		int in_x = 0;
		int in_y = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[0].length; j++) {
				score[i][j] = (int)(Math.random()*2);
			}
		}

		while(true) {
			System.out.println("-------------------------");
			System.out.println(" [ �� ǥ �� �� �� ���� ]");
			System.out.println("-------------------------");
			System.out.print("\t0\t1\t2\n");
			
			for(int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for(int j = 0; j < score_in[0].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println("");
			}
			
			System.out.print("x��ǥ�� �Է��ϼ���(����:99) : ");
			in_x = scan.nextInt();
			if(in_x == 99) {
				break;
			}
			System.out.print("y��ǥ�� �Է��ϼ���(����:99) : ");
			in_y = scan.nextInt();
			if(in_y == 99) {
				break;
			}
			
			if(score[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "��÷"; 
			}
			else {
				score_in[in_x][in_y] = "��!";
			}
			
		}
		
		System.out.println("������ �����մϴ�.");
		
	}	//main
}	//class
