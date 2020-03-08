import java.util.Scanner;

public class CEx20200213_06 {
	public static void main(String[] args) {
		// 1 ~ 100 까지 숫자 1개를 랜덤으로 뽑습니다.
		// 무한 돌려서, 숫자를 맞추는 게임
		// 입력한 숫자가 랜덤 숫자 1개보다 높은 숫자가 큽니다. 다시 입력
		// 작으면 작습니다. 다시 입력
		// 맞으면 빙고~!
		// 정답은 예) 5번입니다.
		
		// 옵션>
		// 자신이 입력한 숫자를 모두 출력 해주세요.
		// 최대 20번까지 하겠습니다.
		
		int ran = 0;
		int count = 0;
		
		int num = 0;
		int[] input_num = new int[20];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 업 다운 게임 ]");
		Loop1 : while(true) {
			System.out.println("게임을 시작 합니다.");
			ran = (int)(Math.random()*100)+1;
			
			while(true) {
				if(count == 20) {
					System.out.println("!! 땡 실패 !!");
					System.out.println("20 번의 도전 횟수를 모두 사용하셨습니다.");
					break;
				}
				
				System.out.print("1~100의 숫자를 입력해 주세요. (종료 : 0) : ");
				num = scan.nextInt();
				
				if(num == 0) {
					break Loop1;
				}
				else if(num < 1 || num >100) {
					System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
				}
				
				if(ran > num) {
					System.out.println("업!");
				}
				else if(ran < num) {
					System.out.println("다운!");
				}
				else if(ran == num) {
					System.out.println("!! 빙고 !!");
					input_num[count] = num;
					break;
				}
				
				input_num[count] = num;
				count++;
			}
			
			System.out.println("임의의 수는 " + ran + " 입니다.");
			System.out.print("지금까지 입력한 숫자는 : ");
			for(int i = 0; i < input_num.length; i++) {
				if(!(input_num[i] == 0)) {
					System.out.print(input_num[i] + " ");
				}
			}
			System.out.println("");
			System.out.println("====================================");
			
			count = 0;
			for(int i = 0; i < count; i++) {
				input_num[i] = 0;
			}
		}
		System.out.println("게임을 종료합니다.");

		scan.close();
	}
}
