import java.util.Scanner;

public class CEx20200207_02 {
	public static void main(String[] args) {
		// 주민번호 입력
		// 880101-11011111
		// 성별 확인
		
		String id_Card_Num = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 주민번호 성별 확인 ]");
		System.out.print("주민번호를 입력해 주세요 : ");
		id_Card_Num = scan.next();
		
		if(id_Card_Num.charAt(7) == '1' || id_Card_Num.charAt(7) == '3') {
			System.out.println("당신의 성별은 남성 입니다.");
		}
		else if(id_Card_Num.charAt(7) == '2' || id_Card_Num.charAt(7) == '4') {
			System.out.println("당신의 성별은 여성 입니다.");
		}
		else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}
		
		scan.close();
	}
}
