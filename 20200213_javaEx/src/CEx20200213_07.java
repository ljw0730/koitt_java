import java.util.Scanner;

public class CEx20200213_07 {
	public static void main(String[] args) {
		// 강사님 ver.
		
		// 1 ~ 100 까지 숫자 1개를 랜덤으로 뽑습니다.
		// 무한 돌려서, 숫자를 맞추는 게임
		// 입력한 숫자가 랜덤 숫자 1개보다 높은 숫자가 큽니다. 다시 입력
		// 작으면 작습니다. 다시 입력
		// 맞으면 빙고~!
		// 정답은 예) 5번입니다.
		
		// 옵션>
		// 자신이 입력한 숫자를 모두 출력 해주세요.
		// 최대 20번까지 하겠습니다.
		
		int random = (int)(Math.random()*100)+1;	// 1~100 까지의 1개 숫자
		int[] input = new int[20];	// 입력하는 숫자
		int count = 0;
		 
		
		Scanner scan = new Scanner(System.in);
		
		while(count < 20) {
			System.out.print("숫자 한개를 입력하세요 : ");
			input[count] = scan.nextInt();
			
			if(random > input[count]) {
				System.out.println("숫자가 작습니다." + input[count] + "보다 큰 수를 입력하세요.");
			}
			else if(random == input[count]) {
				System.out.println("빙고");
				break;
			}
			else{
				System.out.println("숫자가 큽니다." + input[count] + "보다 작은 수를 입력하세요.");
			}
			count++;
			
			// 마지막 20번째는 -1을 해주고 반복문을 빠져 나옴
			if(count==20) {
				count--;
				break;
			}
		}
		
		System.out.print("횟수        : ");
		for(int i = 0; i <= count; i++) {
			System.out.printf("%2d ", (i+1));
		}
		System.out.println();
		
		System.out.print("입력한 숫자 : ");
		for(int i = 0; i <= count; i++) {
			System.out.printf("%2d ", input[i]);
		}
		System.out.println();
		
		if(input[count] == random) {
			System.out.println((count+1) + " 번째 " + random + "을(를) 맞췄습니다.");
		}
		else {
			System.out.println("20번째에서도 맞추지 못했습니다.");
			System.out.println("정답은 " + random + " 입니다.");
		}
		

		scan.close();
	}
}
