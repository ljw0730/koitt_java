import java.util.Scanner;

public class CEx20200213_01 {
	public static void main(String[] args) {
		// 로또
		
		// 변수 입력
		// 1~45 입력
		// 섞기
		// user 입력
		// 로또번호 출력
		// 당첨 확인
		// 3등?
		// 당첨번호 출력
		// 당첨 결과
		
		int[] ball = new int[45];
		int[] user = new int[6];
		int[] win_num = new int[6];
		
		int temp = 0;
		int ball_index = 0;
		int success = 0;
		
		final int WON1 = 1000000000;
		final int WON2 = 100000000;
		final int WON3 = 1000000;
		final int WON4 = 100000;
		final int WON5 = 5000;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;			
		}
		
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		for(int i = 0; i < user.length; i++) {
			System.out.print((i+1)+"번째 번호를 입력해 주세요 : ");
			user[i] = scan.nextInt();
			
			if(user[i] < 1 || user[i] > 45) {
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
				i--;
				continue;
			}
		}
		
		System.out.print("로또 번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == ball[j]) {
					success++;
					win_num[i] = user[i];
				}
			}
		}
		
		if(success == 5) {
			for (int i = 0; i < 6; i++) {
				if(user[i] == ball[6]) {
					success += 2;
					win_num[i] = user[i];
				}
			}
		}
	
		if(success == 0) {
			System.out.println("낙첨하셨습니다.");
		}
		else {
			System.out.print("당첨 번호 : ");
			for(int i = 0; i < 6; i++) {
				if(!(win_num[i] == 0))
				System.out.print(win_num[i] + " ");
			}
			System.out.println("");
			
			switch (success) {
				case 6:
					System.out.println("축하드립니다. 1등에 당첨되셨습니다.");
					System.out.println("당첨금액은 " + WON1 + "원 입니다.");
					break;
				case 7:
					System.out.println("축하드립니다. 2등에 당첨되셨습니다.");
					System.out.println("당첨금액은 " + WON2 + "원 입니다.");
					break;
				case 5:
					System.out.println("축하드립니다. 3등에 당첨되셨습니다.");
					System.out.println("당첨금액은 " + WON3 + "원 입니다.");
					break;
				case 4:
					System.out.println("축하드립니다. 4등에 당첨되셨습니다.");
					System.out.println("당첨금액은 " + WON4 + "원 입니다.");
					break;
				case 3:
					System.out.println("축하드립니다. 5등에 당첨되셨습니다.");
					System.out.println("당첨금액은 " + WON5 + "원 입니다.");
					break;
				case 2:
					System.out.println("아쉽습니다. 2개 맞추셨습니다.");
					System.out.println("당첨금액은 없습니다.");
					break;
				case 1:
					System.out.println("아쉽습니다. 1개 맞추셨습니다.");
					System.out.println("당첨금액은 없습니다.");
					break;
			}
		}
	
	
	
	
	
	
	}
}
