import java.util.Scanner;

public class CEx20200205_12 {

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
		
		
		Scanner scan = new Scanner(System.in);
		int sel = 0;	// 선택 변수
		double num_d = 0.0d;	// 입력 받은 소수점 변수
		int value = 0;
		double value_d = 0.0d;
		int i = 0;
				
		System.out.println("[소수점 계산 프로그램]");
				
		while (true) {
			System.out.println("1)반올림 2)올림 3)버림 4)1~5번째자리 반올림 (종료 : 99)");
			sel = scan.nextInt();
			
			if(sel == 99) {
				break;
			}
			
			System.out.printf("계산할 소수를 입력해 주세요.(xx.xxx)");
			num_d = scan.nextDouble();
			
			if(sel == 1) {
				value = (int)(Math.round(num_d));
				System.out.println("반올림된 값은 " + value + " 입니다.");
			}
			if(sel == 2) {
				value = (int)(Math.ceil(num_d));
				System.out.println("올림된 값은 " + value + " 입니다.");
			}
			if(sel == 3) {
				value = (int)(Math.floor(num_d));
				System.out.println("버림된 값은 " + value + " 입니다.");
			}
			if(sel == 4) {
				System.out.println("소수 몇째자리에서 반올림 할건가요?");
				sel = scan.nextInt();
				switch (sel) {
					case 1:
						i = 1;
						break;
					case 2:
						i = 10;
						break;
					case 3:
						i = 100;
						break;
					case 4:
						i = 1000;
						break;
					case 5:
						i = 10000;
						break;
				}
				
				value_d = (int)Math.round(num_d*i)/(double)i;
				System.out.println(sel + "번째자리 반올림 값은 " + value_d + " 입니다.");
				 
			}
			
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
	}	// main

} // class
