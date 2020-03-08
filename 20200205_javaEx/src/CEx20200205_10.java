import java.util.Scanner;

public class CEx20200205_10 {

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
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("[두수의 사칙연산 프로그램]");
		
		while (true) {
			System.out.println("1)더하기 2)빼기 3)곱하기 4)나누기 5)구구단 출력");
			System.out.printf("원하는 숫자를 입력하세요 : ");
			select = scan.nextInt();
			
			if(select == 0) {
				 System.out.println("프로그램을 종료합니다. ( _ _ )");
				 break;
			}
			if(select <= 0 || select >=9) {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				System.out.println();
				continue;
			}
			
			if(select == 1) {
				System.out.println("1)더하기를 선택하셨습니다.");
				while(true) {
					System.out.println("더하고 싶은 두수를 입력하세요.(상위로 이동 : 0)");
					System.out.printf("첫 번째 숫자 : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두 번째 숫자 : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두수의 합은 : %d + %d = %d\n", num1, num2, (num1+num2));
					
				}
			}
			else if (select == 2) {
				System.out.println("2)빼기를 선택하셨습니다.");
				while(true) {
					System.out.println("빼고 싶은 두수를 입력하세요.(상위로 이동 : 0)");
					System.out.printf("첫 번째 숫자 : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두 번째 숫자 : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두수의 차는 : %d + %d = %d\n", num1, num2, (num1-num2));
					
				}
			}
			else if (select == 3) {
				System.out.println("3)곱하기를 선택하셨습니다.");
				while(true) {
					System.out.println("곱하고 싶은 두수를 입력하세요.(상위로 이동 : 0)");
					System.out.printf("첫 번째 숫자 : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두 번째 숫자 : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두수의 곱은 : %d + %d = %d\n", num1, num2, (num1*num2));
					
				}
			}
			else if (select == 4) {
				System.out.println("4)나누기를 선택하셨습니다.");
				while(true) {
					System.out.println("나누고 싶은 두수를 입력하세요.(상위로 이동 : 0)");
					System.out.printf("첫 번째 숫자 : ");
					num1 = scan.nextInt();
					if (num1 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두 번째 숫자 : ");
					num2 = scan.nextInt();
					if (num2 == 0) {
						System.out.println("상위로 이동합니다.");
						break;
					}
					System.out.printf("두수의 나누기는 : %d + %d = %d\n", num1, num2, (num1/num2));
					
				}
			}
			else if(select == 5) {
				System.out.println("5)구구단 출력을 선택하셨습니다.");
				System.out.println("출력하고 싶은 단 숫자를 입력하세요.(상위로 이동 : 0)");
				System.out.printf("단 수 : ");
				num1 = scan.nextInt();
				if(num1 == 0 ) {
					System.out.println("상위로 이동합니다.");
					break;
				}
				System.out.printf("<  %d 단  >\n", num1);
				for(int i = num1; i <= num1; i++) {
					for(int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i*j);
					}
				}
			}
			
		}
		
		scan.close();
		
	}	// main

} // class
