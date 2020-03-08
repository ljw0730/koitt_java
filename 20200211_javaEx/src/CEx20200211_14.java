import java.util.Scanner;

public class CEx20200211_14 {
	public static void main(String[] args) {
		
		//[5][5]
		// 0, 1 랜덤으로 채우기
		
		// x좌표 1  y좌표 2
		// [1][2] 자리에 1이 들어가 있다면 "당첨" 입력
		// 만약 0이 들어가 있으면 score_in[1,2] "꽝" 입력
		//  0  1  2
		//0
		//1
		//2
		//10판

		int[][] score = new int[5][5];
		String[][] score_in = new String[5][5];
		
		int game_count = 0;	// 게임 10번 카운터
		int x_in = 0;	// x좌표
		int y_in = 0;	// y좌표
		int win = 0;	// 당첨횟수
		int lose = 0;	// 꽝!횟수
		
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
			System.out.println(" [ 좌 표 맞 추 기 게임 ]");
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
			System.out.println((game_count+1) + "번째 게임입니다.");
			
			System.out.print("x좌표를 입력해 주세요.(종료:99) : ");
			x_in = scan.nextInt();
			if(x_in == 99) {
				break;
			}
			else if (x_in < 0 || x_in > 4) {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			System.out.print("y좌표를 입력해 주세요.(종료:99) : ");
			y_in = scan.nextInt();
			if(y_in == 99) {
				break;
			}
			else if (y_in < 0 || y_in > 4) {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				continue;
			}
			
			if(!(score_in[x_in][y_in].equals("?"))) {
				System.out.println("이미 선택된 좌표입니다. 다시 선택해 주세요.");
				continue;
			}
			
			if(score[x_in][y_in] == 1) {
				score_in[x_in][y_in] = "당첨";
				win++;
			}
			else if(score[x_in][y_in] == 0) {
				score_in[x_in][y_in] = "꽝!";
				lose++;
			}
					
			game_count++;
		}
		
		System.out.println("당첨 횟수 : " + win + " / 꽝! 횟수 : " + lose);
		System.out.println("게임을 종료합니다.");
		
		scan.close();
		
	}	//main
}	//class
