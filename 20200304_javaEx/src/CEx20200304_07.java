import java.util.Scanner;

public class CEx20200304_07 extends Object {

	public static void main(String[] args) {
		//String 메서드 - equals(), contains()
		
		// 이메일을 입력받아 aaa@bbb.ccc  '@', '.'이 있는지 확인
		
		String mail = "";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("이메일을 입력해 주세요. (종료 : 0) : ");
			mail = scan.nextLine();
			
			if(mail.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			boolean at = false;
			boolean dat = false;
			try {
				at = mail.contains("@");
				dat = mail.contains(".");
				
				if(at == true && dat == true) {
					System.out.println("정상적으로 입력 하셨습니다.");
				}
				else if(at == false && dat == true) {
					System.out.println("@가 없습니다. 다시 입력해 주세요.");
					continue;
				}
				else if(at == true && dat == false) {
					System.out.println(".이 없습니다. 다시 입력해 주세요.");
					continue;
				}
				else if(at == false && dat == false) {
					System.out.println("@ 와 .이 없습니다. 다시 입력해 주세요.");
					continue;
				}
				
			} catch (Exception e) {
				System.out.println("이메일 판단 오류");
				System.out.println(e.getMessage());
			}
		}
	}
}

