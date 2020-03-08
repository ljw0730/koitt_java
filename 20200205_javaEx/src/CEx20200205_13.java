import java.util.Scanner;

public class CEx20200205_13 {

	public static void main(String[] args) {
		// 1) 반올림
		// 2) 올림
		// 3) 버림
		// 4) 반올림 자리수 선택
		
		// 원하는 번호를 입력하세요.
		
		// 1번 선택 시 
		// 소수점 계산할 실수를 입력하세요.
		// 3.1454 -> 3, 4.523 -> 5
		
		// 4번 선택시
		// 실수를 입력하세요. -> 3.1452
		// 반올림 할 자리수 입력 2
		// 둘째자리에서 반올림 원함 3.1
		
		int select1 = 0;		// 번호선택변수
		double num1 = 0.0d;		// 실수를 받는 변수
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) { // 전체 반복
			System.out.println("[소수점 자리수 처리 프로그램]");
			System.out.println("  1) 반올림");
			System.out.println("  2) 올림");
			System.out.println("  3) 버림");
			System.out.println("  4) 1~3째자리 반올림");
	
			System.out.println("원하는 번호를 입력하세요.(종료 : 99)");
			select1 = scan.nextInt();
			
			if(select1 == 99) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			if(!(select1 >= 1 && select1 <=4)) {
				System.out.println("1~4번 사이의 번호를 입력하세요.");
				System.out.println("-------------------------------");
				continue;
			}
			
			switch (select1) {	// 각각의 프로그램 반복
				case 1 :
					while(true) {
						System.out.println("실수를 입력해주세요. (상위이동 : 0 / 종료 : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("실수 반올림 값 : " + Math.round(num1));
						
					}
				case 2 :
					while(true) {
						System.out.println("실수를 입력해주세요. (상위이동 : 0 / 종료 : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("실수 올림 값 : " + Math.ceil(num1));
						
					}
				case 3 :
					while(true) {
						System.out.println("실수를 입력해주세요. (상위이동 : 0 / 종료 : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("실수 버림 값 : " + Math.floor(num1));
						
					}
					
				case 4 :
					while(true) {
						System.out.println("실수를 입력해주세요. (상위이동 : 0 / 종료 : 99)");
						num1 = scan.nextDouble();
						
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.println("소수 몇째자리에서 반올림 할건가요?");
						select1 = scan.nextInt();
						if(!(select1 >= 1 && select1 <=3)) {
							System.out.println("소수점 3째자리까지만 반올림 할 수 있습니다.");
							continue;
						}
						
						
						switch (select1) {
							case 1 :
								System.out.println("소수 첫째자리 반올림 값 : " + Math.round(num1));
								break;
							case 2 :
								System.out.println("소수 둘재자리 반올림 값 : " + Math.round(num1*10)/10.0f);
								break;
							case 3 :
								System.out.println("소수 둘재자리 반올림 값 : " + Math.round(num1*100)/100.0f);
								break;
						}
						
					}
			} 
			
		} // 전체반복 while
		
		System.out.println("프로그램을 종료합니다.");
		
	}	// main

} // class
