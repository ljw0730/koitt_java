import java.util.Scanner;

public class CEx20200207_06 {
	public static void main(String[] args) {
		// 로그인 기능
		// 로그인이 5번이상 실패시 프로그램 종료
		// 1에서 입력한 값까지 숫자를 더하는 프로그램

		String id = "aaa";
		String pw = "123";
		String input_id = "";
		String input_pw = "";
		
		int count = 0;
		int fail_count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" [ 로  그  인 ] ");
		System.out.print("로그인 시도 횟수를 정해 주세요. : ");
//		System.out.print("실패 횟수를 정해 주세요. : ");
		count = scan.nextInt();
		
		
		Loop: for(int i = 0; i < count; i++) {
			
			if(fail_count == 5) {
				System.out.println("로그인을 5회 실패하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("아이디 : ");
			input_id = scan.next();
			
			if(!(input_id.equals(id))) {
				System.out.println("일치하는 아이디가 없습니다.");
				fail_count++;
			}
			else {
				while(true) {
					if(fail_count == 5) {
						System.out.println("로그인을 5회 실패하셨습니다.");
						System.out.println("프로그램을 종료합니다.");
						break Loop;
					}
					
					System.out.printf("패스워드 : ");
					input_pw = scan.next();
					
					if(!(input_pw.equals(pw))) {
						System.out.println("패스워드가 일치하지 않습니다.");
						fail_count++;
					}
					else {
						System.out.println("로그인이 되었습니다.");
						
						break Loop;
					}
				} //while
			}// id else
		} //for
		
		
		
		
		
	} // main
} //class
