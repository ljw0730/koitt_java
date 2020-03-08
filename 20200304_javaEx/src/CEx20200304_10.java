import java.util.Scanner;

public class CEx20200304_10 extends Object {

	public static void main(String[] args) {
		//String 메서드 - trim(), replaceAll
		
		// 비밀번호를 입력, 앞뒤 빈공백을 입력하시면 안됩니다.
		// 비밀번호 입력받아서 공백 받으면 공백을 없애고 입력값을 출력해 보세요.
		
		Scanner scan = new Scanner(System.in);
		String pw = "";
		
		while(true) {
			System.out.print("비밀 번호를 입력해 주세요. (종료 : 0) : ");
			pw = scan.nextLine();

			if(pw.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(pw);
			System.out.println("앞뒤로 공백이 있는경우 공백을 빼겠습니다.");
			pw = pw.trim();
			System.out.println(pw);
			System.out.println("중간 공백을 지웁니다.");
			pw = pw.replaceAll(" ", "");
			System.out.println(pw);
			
		}
		
	}
	
}

