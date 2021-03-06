import java.util.Scanner;

public class CEx20200205_18 {

	public static void main(String[] args) {
		// for문을 사용해서 합계
		// 5의 배수만 제외해서 숫자의 합을 구하는 프로그램
		// 입력 2개를 받아서 (ex 2와 40 -> 5의 배수는 재외하고
		// 합계를 구하시오.
		// 총 몇번 더하기를 했는지 함께 출력을 해보세요.
		
		int check = 0;
				
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int count = 0;
		
		String jumin;	// 주민번호
		int age = 0;	// 나이
		
		
		Scanner scan = new Scanner(System.in);
		
		Loop1 :
		while(true) {
			System.out.println("[ 종합선물 프로그램 ]");
			System.out.println(" 1) 두수를 더하는 프로그램");
			System.out.println(" 2) 주민번호 나이 계산 프로그램");
			System.out.println(" 3) 주민번호 남여확인 프로그램");
			System.out.println("원하는 번호를 입력하세요.(종료 : 99)");
			
			check = scan.nextInt();
			
			if(check == 99) {
				break;
			}
			else if(!(check >= 1 && check <=3)) {
				System.out.println("번호를 잘못 입력하였습니다. 1~3까지 입력해 주세요.");
				continue;
			}
			
			switch (check) {
				case 1:
					// 두수를 더하는 프로그램
					while(true) {
						sum = 0;
						count = 0;
						
						System.out.println("A에서 B까지의 합계(5의 배수제외)");
						System.out.println("두개의 수를 입력 하세요.(상위이동: 0 / 종료 : 99)");
						System.out.printf("첫 번째 수 : ");
						num1 = scan.nextInt();
						
						if(num1 == 99) {
							break Loop1 ;
						}
						else if (num1 == 0) {
							continue Loop1;
						}
									
						System.out.printf("두 번째 수 : ");
						num2 = scan.nextInt();
						if(num1 == 99) {
							break Loop1;
						}
							
						if(num2 < num1) {
							int temp = 0;
							temp = num1;
							num1 = num2;
							num2 = temp;
						}
						
						for(int i = num1; i <= num2; i++) {
							if(i % 5 == 0) {
								continue;
							}
							sum += i;
							count++;
						}
						
						System.out.println("총 " + count + "번의 합이 있었으며,");
						System.out.println(num1 + "에서 " + num2 + "까지의 5의배수를 제외한 합은 " + sum + "입니다.");
						System.out.println("------------------------------------------");
					}
				case 2:
					// 주민번호 나이 계산 프로그램
					// 880101-1011198
					while(true) {
						System.out.println("주민번호를 입력하세요.(상위이동 : 0 / 종료 : 99)");
						jumin = scan.next();
						
						if(jumin.equals("99")) {
							break Loop1;
						}
						else if(jumin.equals("0")) {
							continue Loop1;
						}
						
						//주민번호 계산
						//charAt(0)
						//str.substring(0, 2) - 0번 부터 2번째 앞까지 짤라오고 싶다.
						if(jumin.charAt(7) == '1' || jumin.charAt(7) == '2') {
							String ju_check = "19" + jumin.substring(0, 2);
							age = 2019 - Integer.parseInt(ju_check) + 2;
							System.out.println("당신의 나이는 " + age + " 세 입니다.");
						}
						else if (jumin.charAt(7) == '3' || jumin.charAt(7) == '3'){
							String ju_check = "20" + jumin.substring(0, 2);
							age = 2019 - Integer.parseInt(ju_check) + 2;
							System.out.println("당신의 나이는 " + age + " 세 입니다.");
						}
						else {
							//주민번호 error
							System.out.println("주민번호를 잘못 입력하였습니다. 다시 입력해 주세요.");
							continue;
						}
					}
				case 3:
					// 주민번호 남여확인 프로그램
					// 880101-1011198
					while(true) {
						System.out.println("주민번호를 입력하세요.(상위이동 : 0 / 종료 : 99)");
						jumin = scan.next();
						
						if (jumin.equals("99")) {
							break Loop1;
						}
						else if (jumin.equals("0")) {
							continue Loop1;
						}
						
						if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
							System.out.println("남성 입니다.");
						}
						else if (jumin.charAt(7) == '2' || jumin.charAt(7) == '4') {
							System.out.println("여성 입니다.");
						}
						else {
							System.out.println("주민번호를 잘못 입력하였습니다. 다시 입력해 주세요.");
							continue;
						}
						
					}
			}
			
		}
		
	
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
		
	}	// main

} // class
