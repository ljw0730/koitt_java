import java.util.Scanner;

public class CEx20200211_01 {
	public static void main(String[] args) {
		// 1. 변수 선언
		// 2. user 번호 받기
		// 3. ball에 1~45넣기
		// 4. ball 섞기
		// 5. 로또 번호 출력
		// 6. 당첨 확인
		// 7. 3등일 경우 보너스 맞는지 확인
		// 8. 당첨 결과
		
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
		
		System.out.println("[   로   또   ]");
		
		for(int i = 0; i < user.length; i++) {
			System.out.printf("%d번째 번호를 입력해 주세요. : ", (i+1));
						
			user[i] = scan.nextInt();
			
			if(!(user[i] >= 1 && user[i] <=45)) {
				System.out.println("잘못입력하셨습니다. 다시 입력해 주세요.");
				i--;
				continue;
			}
		}
		
		
		for(int i = 0; i < 45; i++) {
			ball[i] = i+1;
		}
		
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		System.out.printf("로또 번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d ", ball[i]);
		}
		System.out.printf("/ 보너스 %d\n", ball[6]);
		
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 6; j++) {
				if(user[i] == ball[j]) {
					win_num[i] = user[i];
					success++;
				}
			}
		}
		
		if(success == 5) {
			for(int i = 0; i < 6; i ++) {
				if(user[i] == ball[6]) {
					win_num[i] = user[i];
					success += 2;
				}
			}
		}
		
		if(success == 0) {
			System.out.println("낙첨되셨습니다.");
		}
		else {
			System.out.printf("당첨번호 : " );
			for(int i = 0; i < win_num.length; i++) {
				if(!(win_num[i] == 0)) {
					System.out.printf("%d ", win_num[i]);
				}
			}
			System.out.printf("\n");
			
			switch(success) {
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
					System.out.println("2개를 맞추셨습니다.");
					System.out.println("당첨금액은 없습니다.");
					break;
				case 1:
					System.out.println("1개를 맞추셨습니다.");
					System.out.println("당첨금액은 없습니다.");
					break;
			}
		}
		
		scan.close();
	}
}
