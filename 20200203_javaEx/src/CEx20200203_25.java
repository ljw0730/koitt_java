import java.util.Scanner;

public class CEx20200203_25 {
	public static void main(String[] args) {
		
		String id = "aaa";
		int pass = 12345;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ID 를 입력하세요. : ");
		String id_ch = scan.next();
		
		System.out.print("Pass 를 입력하세요. : ");
		int pass_ch = scan.nextInt();

		if(id_ch.equals(id)) {
			System.out.println("id가 있습니다.");
			
			if(pass_ch == pass) {
				System.out.println("로그인 되었습니다.");
			}
			else {
				System.out.println("패스워드가 일치하지 않습니다.");
			}
		}
		else {
			System.out.println("id가 일치하지 않습니다.");
			System.out.println("다시 입력해 주세요..");
		}
		
		scan.close();
	}
}
