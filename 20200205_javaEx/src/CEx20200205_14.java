import java.util.Scanner;

public class CEx20200205_14 {

	public static void main(String[] args) {
		// [넓이 계산]
		// 1) 사각형 계산
		// 2) 삼각형 계산
		// 3) 원 넓이 (파이 = 3.14)
		
		int select = 0;
		double num1 = 0;
		double num2 = 0;
		double result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Loop1:
		while(true) {
			System.out.println("[ 넓이 계산 ]");
			System.out.println("1) 사각형 넓이  2) 삼각형 넓이  3) 원 넓이 (종료 : 99)");
			
			select = scan.nextInt();
			if(select == 99) {
				break;
			}
			if(!(select >= 1 && select <=3)) {
				System.out.println("잘못된 숫자를 입력 하셨습니다.");
				continue;
			}
			
			
			switch(select) {
				case 1:
					while(true) {
						System.out.println("가로, 세로 길이를 입력하세요.(이전단계 : 0, 종료 : 99)");						
						System.out.printf("가로 길이 : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.printf("세로 길이 : ");
						num2 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						result = num1 * num2;
						System.out.println("사각형의 넓이는 " + result + " 입니다.");
					}
				case 2:
					while(true) {
						System.out.println("아랫변, 높이 길이를 입력하세요.(이전단계 : 0, 종료 : 99)");						
						System.out.printf("아랫변 길이 : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						System.out.printf("아랫변 길이 : ");
						num2 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
						
						result = (num1 * num2) * 0.5;
						System.out.println("각형의 넓이는 " + result + " 입니다.");
					}
				case 3:
					while(true) {
						System.out.println("반지름 길이를 입력하세요.(이전단계 : 0, 종료 : 99)");						
						System.out.printf("반지름 길이 : ");
						num1 = scan.nextDouble();
						if((int)num1 == 0) {
							continue Loop1;
						}
						if((int)num1 == 99) {
							break Loop1;
						}
												
						result = (num1 * num1) * 3.141592;
						System.out.println("각형의 넓이는 " + result + " 입니다.");
					}
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
	}	// main

} // class
