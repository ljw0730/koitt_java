import java.util.Scanner;

public class CEx20200211_13 {
	public static void main(String[] args) {
		
		//[3][3]
		// 0, 1 랜덤으로 채우기
		
		// x좌표 1  y좌표 2
		// [1][2] 자리에 1이 들어가 있다면 "당첨" 입력
		// 만약 0이 들어가 있으면 score_in[1,2] "꽝" 입력
		//  0  1  2
		//0
		//1
		//2
		
		int[][] score = new int[3][3];				// 0,1 랜덤
		String[][] score_in = new String[3][3]; 	// 입력해서 저장하는 배열
		
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
			System.out.println(" [ 좌 표 맞 추 기 게임 ]");
			System.out.println("-------------------------");
			System.out.print("\t0\t1\t2\n");
			
			for(int i = 0; i < score_in.length; i++) {
				System.out.print(i + "\t");
				for(int j = 0; j < score_in[0].length; j++) {
					System.out.print(score_in[i][j] + "\t");
				}
				System.out.println("");
			}
			
			System.out.print("x좌표를 입력하세요(종료:99) : ");
			in_x = scan.nextInt();
			if(in_x == 99) {
				break;
			}
			System.out.print("y좌표를 입력하세요(종료:99) : ");
			in_y = scan.nextInt();
			if(in_y == 99) {
				break;
			}
			
			if(score[in_x][in_y] == 1) {
				score_in[in_x][in_y] = "당첨"; 
			}
			else {
				score_in[in_x][in_y] = "꽝!";
			}
			
		}
		
		System.out.println("게임을 종료합니다.");
		
	}	//main
}	//class
