import java.util.Scanner;

public class CEx20200304_06 extends Object {

	public static void main(String[] args) {
		//String 메서드 - equals(), length(), charAt(), 
		//StringBuffer 메서도 - insert()
		
		//숫자이외의 문자가 들어 왔을 시 다시 입력하게 하세요.
		final int MAX_LENGTH = 13;
		
		Scanner scan = new Scanner(System.in);
				
		String id = "";
		Loop: while(true) {
			System.out.print("주민등록번호를 입력해 주세요. (-제외) (종료 : 0) : ");
			id = scan.nextLine();
			
			if(id.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(id.length() != MAX_LENGTH) {
				System.out.println("13자리를 입력하셔야 합니다. 다시 입력해 주세요.");
				continue;
			}
			
			char check = 0;
			for(int i = 0 ; i < id.length(); i++) {
				check = id.charAt(i);
				if(!(check >= '0' && check <= '9')) {
					System.out.println("입력이 잘 못되었습니다. 숫자만 입력해 주세요.");
					continue Loop;
				}
			}
			
			try {
				StringBuffer sb = new StringBuffer(id);
				sb.insert(6, "-");
				System.out.println("입력하신 주민등록번호 : " + sb);
			} catch (Exception e) {
				System.out.println("StringBuffer 에러!!");
				System.out.println(e.getMessage());
			}
		}
	}
}

