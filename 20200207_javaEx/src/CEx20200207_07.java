import java.util.Scanner;

public class CEx20200207_07 {
	public static void main(String[] args) {
		// 로그인 기능
		// 로그인이 5번이상 실패시 프로그램 종료
		// 1에서 입력한 값까지 숫자를 더하는 프로그램

		String id = "aaa";
		String pw = "1234";
		String id_check = "";
		String pw_check = "";
		int login_check = 1;	//오류 횟수
		int count = 0;	// 더하고 싶은 수
		int sum = 0;	// 합계
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("ID를 입력해 주세요. : ");
			
			
			//next() : 한줄을 가져오지만 사이띄우기나
			//         엔터키가 있으면 거기까지만 가져옴
			//nextLine() : 무조건 한줄을 가져옴
			id_check = scan.next();
			
			if(login_check >= 5) {
				System.out.println("id, pw가 5번 이상 틀렸습니다.");
				break;
			}
			if(!(id.equals(id_check))) {
				System.out.println("id가 일치하지 않습니다. 다시 입력하세요." + login_check + "회 오류");
				login_check++;
				continue;
			}
			
			System.out.print("PW를 입력해 주세요. : ");
			pw_check = scan.next();
			
			if(!(pw.equals(pw_check))) {
				System.out.println("pw가 일치하지 않습니다. 다시 입력하세요." + login_check + "회 오류");
				login_check++;
				continue;
			}
			
			System.out.println("원하는 숫자를 입력하세요.");
			count = scan.nextInt();			
			
			// 1~count 까지 더하는 반복문
			for(int i = 1; i <= count; i++ ) {
				sum += i;	// sum = sum + count;
			}
			System.out.printf("1에서 %d까지의 총합 : %d\n", count, sum);
			
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		scan.close();
		
	} // main
} //class
