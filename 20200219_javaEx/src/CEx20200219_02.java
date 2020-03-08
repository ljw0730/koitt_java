import java.util.Scanner;

public class CEx20200219_02 {
	
	public static void main(String[] args) {
		// 1. 최대/최소값 구하기 (3개의 숫자를 넣어서, 1최대값, 2최소값)
		// 2. 절대값 구하기(1개의 숫자를 넣어서 절대값을 구하는 것)
		// 3. 제곱값 구하기 (첫번째 숫자 5, 제곱수 2를 넣으면 5*5 = 25
		// 1, 2원하는 번호를 선택하세요.
		
		
		Scanner scan = new Scanner(System.in);
		
//		int select_num = 0;
//		int input0 = 0, input1 =0, input2 = 0;
		int[] s_num = new int[3];
		int max = 0;
		int min = 0;
		
		
		Loop_while: while(true) {
			// 화면 출력 메소드
			print();
			
			switch (scan.nextInt()) {
				case 1:
					//최대값 구하기 메소드
					System.out.println("=== 최대값 구하기 ===");
					max(s_num);
					break;
	
				case 2: 
					//최소값 구하기 메소드
					System.out.println("=== 최대소 구하기 ===");
					min(s_num);
					break;
					
				case 3: 
					System.out.println("=== 절대값 구하기 ===");
					abs(s_num);
					//math.abs(1);
					break;
					
				case 4: 
					System.out.println("=== 제곱값 구하기 ===");
					pow(s_num);
					//math.pow(5,2);
					break;
					
				case 0:
					break Loop_while;
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}	// main
	
	// 화면출력 메소드
	static void print() {
		System.out.println("===============================");
		System.out.println("  [ 최대/최소/절대/제곱 값 ]");
		System.out.println("-------------------------------");
		System.out.println(" 1. 최대값 구하기");
		System.out.println(" 2. 최소값 구하기");
		System.out.println(" 3. 절대값 구하기");
		System.out.println(" 4. 제곱값 구하기");
		System.out.println(" 0. 종료");
		System.out.println("===============================");
		System.out.print("원하는 번호를 입력하세요 : ");
	}
	
	// 입력 받는 메소드
	static int[] for_int(int[] s_num, int count) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < count; i++) {
			System.out.print("숫자를 입력하세요.(이전화면 :99) : ");
			s_num[i] = scan.nextInt();
			if( s_num[i] == 99 ) { //이전화면 이동
				s_num[0] = 99;
				return s_num;
			}
		}	//for
		
		return s_num;
	}
	
	// 최대값 메소드
	static void max(int[] s_num) {
		int max = 0;
		
		while(true) {	// 최소값 무한반복
			s_num = for_int(s_num, 3); 	//입력 3개 메소드
										// 배열 주소값 넘김
			if(s_num[0] == 99) {
				break;
			}
						
			//Math.max(Math.max(1, 2), 3);
			max = Math.max(Math.max(s_num[0], s_num[1]), s_num[2]);
			System.out.println("최대값 : " + max);
			
		}	//while
	}	//max메소드
	
	// 최소값 메소드
	static void min(int[] s_num) {
		int min = 0;
		
		while(true) {	// 최소값 무한반복
			s_num = for_int(s_num, 3); 	//입력 3개 메소드
			if( s_num[0] == 99 ) { //이전화면 이동
				System.out.println("이전화면으로 이동합니다.");
				break ;	//while종료
			}
			
			//Math.min(Math.max(1, 2), 3);
			min = Math.min(Math.min(s_num[0], s_num[1]), s_num[2]);
			System.out.println("최소값 : " + min);
			
		}	//while
	}	//min 메소드
	
	// 절대값 메소드
	static void abs(int[] s_num) {
		int abs = 0;
		
		while(true) {	// 최소값 무한반복
			s_num = for_int(s_num, 1); 	//입력 1개 메소드
			if( s_num[0] == 99 ) { //이전화면 이동
				System.out.println("이전화면으로 이동합니다.");
				break;	//while종료
			}
			
			//Math.abs(1);
			abs = Math.abs(s_num[0]);
			System.out.println("절대값 : " + abs);
		}	//while
	}	// abs 메소드
	
	static void pow(int[] s_num) {
		double pow = 0;
		
		while(true) {	// 최소값 무한반복
			s_num = for_int(s_num, 2); 	//입력 23개 메소드
			if( s_num[0] == 99 ) { //이전화면 이동
				System.out.println("이전화면으로 이동합니다.");
				break ;	//while종료
			}
			
			//Math.pow(5, 2);
			pow = Math.pow(s_num[0], s_num[1]);
			System.out.println("제곱값 : " + pow);
		}	//while
	}	// pow 메소드
	
	
}	//class

