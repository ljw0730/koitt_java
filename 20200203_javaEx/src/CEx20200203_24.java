import java.util.Scanner;

public class CEx20200203_24 {

	public static void main(String[] args) {
		//ID -> c  /  pass->12345
		
		char id = 'c';
		int pass = 12345;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID 를 입력하세요. : ");
		String uid = scan.next();
		char ch_uid = uid.charAt(0);
		
	
		// 변수 -> 데이터 값, 객체 -> 데이터 주소 를 갖는다.
		// 기본 8가지 변수형은 == 으로 비교 가능
		// 참조형인 String은 str.equals(str2)로 비교한다.
	
		
		if(ch_uid != id) {
			System.out.println("존재하지 않는 ID 입니다.");
			
			scan.close();
			return;
		} else {
			System.out.print("비밀번호를 입력하세요. : ");
			int upass = scan.nextInt();
			if (upass != pass) {
				 System.out.println("비밀번호가 일치하지 않습니다.");
			}
			else {
				System.out.println("환영합니다.");
			}
		}
	
		scan.close();
	}

}