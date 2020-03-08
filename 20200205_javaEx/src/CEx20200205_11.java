import java.util.Scanner;

public class CEx20200205_11 {

	public static void main(String[] args) {
	
		// [두수의 사칙연산 프로그램]
		// 1) 더하기
		// 2) 빼기
		// 3) 곱하기
		// 4) 나누기
		// 5) 구구단 출력
		// 원하는 숫자를 입력하세요.(종료 : 0)
		// 1을 선택하게되면 두수를 입력하세요.(상위로 이동 : 0)
		// ex) 1,2 두수를 더한 값 : 3
		// 강사님 ver.
		
		Scanner scan = new Scanner(System.in);
		int select1 = 0; // 처음 선택 변수
		int num1 = 0;
		int num2 = 0;
		
		Loop1: 		
		while(true) { // 전체 시스템
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("---------------------");
			System.out.println("1) 구구단 출력");
			System.out.println("2) 빼기");
			System.out.println("3) 곱하기");
			System.out.println("4) 나누기");
			System.out.println("원하는 번호를 입력하세요.(종료:99)");
			
			select1 = scan.nextInt();
			
			if(select1 == 99) { // 0일때 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!(select1>= 1 && select1 <=9)) { // 1~9까지 숫자만 입력가능
				System.out.println("1~9까지의 숫자를 입력하세요.");
				continue;
			}
			
			switch (select1) {	// 사칙연산 선택
				case 1:
					Loop2 :
					while(true) {
//						System.out.println("더하고 싶은 두수를 입력하세요.(상위이동: 0, 시스템 종료:99)");
						System.out.println("1) 원하는 구구단만 출력");
						System.out.println("2) 원하는 단부터 출력");
						System.out.println("원하는 구구단 출력수 를 입력하세요.(상위이동: 0, 시스템 종료:99)");
						num1 = scan.nextInt();
						
						if(num1 == 0) {
							continue Loop1;
						}
						else if(num1 == 99) {
							break Loop1;
						}
						
						switch (num1 ) {
							case 1 :
								while (true) {
									System.out.println("원하는 단 숫자 입력하세요.(상위이동 : 0, 종료 : 99)");
									num2 = scan.nextInt();
									
									if(num2 == 0 ) {
										continue Loop2;
									}
									if(num2 == 99) {
										break Loop1;
									}
									
									for(int i = num2; i <= num2; i++) {
										for (int j = 1; j <= 9; j++) {
											System.out.println(i + " * " + j + " = " + (i*j));
										}
									}
									System.out.println("------------------------");
								}
								
							case 2 :
								for(int i = num1; i <= 9; i++) {
									for (int j = 1; j <= 9; j++) {
										System.out.println(i + " * " + j + " = " + (i*j));
									}
								}
								break;
						}
						
												
						
//						if(num1 == 0) {
//							continue Loop1;
//						}
//						else if(num1 == 99) {
//							break Loop1;
//						}
//						System.out.println("1개 더 입력하세요");
//						num2 = scan.nextInt();
//						
//						System.out.println("두수의 합 : " + (num1+num2));
					} // 더하기 while
				case 2:
					while(true) {
						System.out.println("빼고 싶은 두수를 입력하세요.(상위이동: 0, 시스템 종료:99)");
						num1 = scan.nextInt();
						if(num1 == 0) {
							continue Loop1;
						}
						else if(num1 == 99) {
							break Loop1;
						}
						System.out.println("1개 더 입력하세요");
						num2 = scan.nextInt();
						
						System.out.println("두수의 차 : " + (num1-num2));
					} // 빼기 while
	
				default:
				break;
			}
			
			
			
		} // 전제 시스템 while
		
		System.out.println("시스템을 종료합니다.");
		
	}	// main

} // class
