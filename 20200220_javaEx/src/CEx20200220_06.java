import java.util.Arrays;
import java.util.Scanner;

public class CEx20200220_06 {
	
	public static void main(String[] args) {
		// 
		// 로또 1~45까지에서 6개의 값을
		// lotto2 배열에 넣어보세요.
		
		int[] lotto1 = new int[45];
		int[] lotto2 = new int[7];
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < lotto1.length; i++) {
			lotto1[i] = i+1;
		}
		
		shuffle(lotto1, lotto2);
		
		
		
		Loop1 : while(true) {
			System.out.println("[   로   또   ]");
			System.out.println("1. 로또출력하기");
			System.out.println("2. 다시 섞기");
			System.out.println("3. 로또번호의 합");
			System.out.println("4. 로또번호 정렬");
			System.out.println("0. 종료");
			System.out.print("원하는 번호를 입력하세요. :");
			num = scan.nextInt();
			switch (num) {
				case 1:
					System.out.println("로또번호와 보너스를 출력합니다.");
					printArr(lotto2);
					System.out.println("===========================================");
					break;
					
				case 2:
					System.out.println("로또를 다시 섞습니다.");
					shuffle(lotto1, lotto2);
					System.out.println("로또 섞기가 완료 되었습니다.");
					System.out.println("===========================================");
					break;
					
				case 3:
					System.out.println("로또번호의 값들을 합합니다.");
					int sum = 0;
					sum = sumArr(lotto2);
					System.out.println("로또번호의 합 : " + sum);
					System.out.println("===========================================");
					break;
					
				case 4:
					System.out.println("로또번호를 정렬합니다.");
					sortArr(lotto2);
					System.out.println("정렬이 끝났습니다.");
					System.out.println("===========================================");
					break;

				case 0:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;

			}	// switch
			
			
			
		}	//while
		
		scan.close();
		
	}	// main
	
	static void printArr(int[] lotto2) {
		System.out.print("로또 번호 : ");
		for (int i = 0; i < lotto2.length-1; i++) {
			System.out.print(lotto2[i] + " ");
		}
		System.out.print("/ 보너스 번호 : " + lotto2[6]);
		System.out.println();
		
	}
	
	static void shuffle(int[] lotto1, int[] lotto2) {
		int temp = 0;
		int ball_index = 0;
		for(int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45);
			
			temp = lotto1[0];
			lotto1[0] = lotto1[ball_index];
			lotto1[ball_index] = temp;
		}
		
		for(int i = 0; i < lotto2.length; i++) {
			lotto2[i] = lotto1[i];
		}
	}
	
	static int sumArr(int[] lotto2) {
		int result = 0;
		for(int i = 0; i < lotto2.length-1; i++) {
			result += lotto2[i];
		}
		return result;
	}
		
	static void sortArr(int[] lotto2) {
		int temp = 0;
		boolean change = false;
		for (int i = 0; i < lotto2.length-2; i++) {
			// -i해주는 이유는 한줄 비교를 완료하면 가장 큰수는 이미 맨뒤로가 있음
			// 그래서 다음줄 비교할때 마지막비교는 안해도 된다.
			// 이런식으로 다음줄 비교때 맨뒤앞 맨뒤앞앞 ... 비교를 안해줘도 되기때문에
			// -i를 해줘서 효율을 높인다. 궅이 안해줘도 되지만 효율적으로 볼 때 해주는게 좋다.
			for(int j = 0; j < lotto2.length-2-i; j++) {
				if(lotto2[j] > lotto2[j+1]) {
					temp = lotto2[j];
					lotto2[j] = lotto2[j+1];
					lotto2[j+1] = temp;
					change = true;
				}
			}
			if(change == false) {
				break;
			}
		}
		// 간단하게 하려면 아래처럼 하면됨.
//		Arrays.sort(lotto2);
	}
}	// class


