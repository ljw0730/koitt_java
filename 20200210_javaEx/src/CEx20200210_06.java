import java.util.Scanner;

public class CEx20200210_06 {
	public static void main(String[] args) {
		// 로또
		// 한개의 수만 입력받아
		// 로또 6개의 숫자에 맞는 부분이 있으면 당첨
		
		
		//45개의 정수값을 저장하기 위한 배열 생성.
		int[] ball = new int[45];
		
		int[] user = new int[6];		// 로또 입력번호
		int[] win_num = new int[6];	// 로또 당첨된 번호
		int temp = 0;
		int ball_index = 0;
		int success = 0;
		
		final int WON1 = 1600000000;
		final int WON2 = 50000000;
		final int WON3 = 1400000;
		final int WON4 = 50000;
		final int WON5 = 5000;
		
		

		Scanner scan = new Scanner(System.in);
		
		while(true) {	// 무한 반복
			for (int i = 0; i < user.length; i++) {	// n번의 로또번호 입력 받음
				System.out.printf((i+1) + "번째 숫자를 입력하세요.(1~45) : ");
				user[i] = scan.nextInt();
				
				if(!(user[i] >= 1 && user[i] <= 45)) {
					System.out.println("번호를 잘못 입렸하셨습니다. 다시 입력해주세요.");
					i--;
					continue;
				}
			}
			break;
		}
		
		
		//배열의 각 요소에 1~45의 값을 저장한다.
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;
		}
						
		// 로또번호 자리 교환
		for(int i = 0; i < 200; i++) {
			//0~ 44까지 배열 index 번호 생성
			ball_index = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[ball_index];
			ball[ball_index] = temp;
		}
		
		//로또 번호 출력
		System.out.printf("로또 번호는 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println(" 보너스 : " + ball[6]);
		System.out.printf("\n");
		
		for(int i = 0; i < user.length; i++) { //user[i]  0,1 을 순차적으로 진행
			for(int j = 0; j < 6; j++) {
				if(ball[j] == user[i]) {
					success++;
					win_num[i] = user[i];
				}
			}
		}
		
		// 3등일 경우 보너스(ball[6]번째 값)가 맞는지 비교
		if(success == 5) {
			for(int i = 0; i < user.length; i++) {
				if(user[i] == ball[6]) {
					success += 2;
					win_num[i] = ball[6];
				}
			}	
		}
		
		
		// 당첨되었는지 확인
		if(success == 0) {
			System.out.println("낙첨 되셨습니다. 3개이상 맞으셔야 합니다.");
		}
		else {
			System.out.println("당첨 되었습니다.");			
			for(int i = 0; i < win_num.length; i++) {
				if(!(win_num[i] == 0)) {
					System.out.println("당첨번호 : " + user[i]);
				}
			}	//for
			
			switch (success) {
				case 7:
					System.out.println("축하드립니다. 2 등에 당첨되셨습니다.");
					System.out.println("당첨 금액은 " + WON2 + "원 입니다.");
					break;
				case 6:
					System.out.println("축하드립니다. 1 등에 당첨되셨습니다.");
					System.out.println("당첨 금액은 " + WON1 + "원 입니다.");
					break;
				case 5:
					System.out.println("축하드립니다. 3 등에 당첨되셨습니다.");
					System.out.println("당첨 금액은 " + WON3 + "원 입니다.");
					break;
				case 4: 
					System.out.println("축하드립니다. 4 등에 당첨되셨습니다.");
					System.out.println("당첨 금액은 " + WON4 + "원 입니다.");
					break;
				case 3:
					System.out.println("축하드립니다. 5 등에 당첨되셨습니다.");
					System.out.println("당첨 금액은 " + WON5 + "원 입니다.");
					break;
				case 2:
					System.out.println("2개 당첨되었습니다.");
					System.out.println("당첨 금액은 없습니다.");
					break;
				case 1:
					System.out.println("1개 당첨되었습니다.");
					System.out.println("당첨 금액은 없습니다.");
					break;
			}
			
		} //else
		
		scan.close();
		
	}	// main
} //class
