import java.util.Scanner;

public class CEx20200207_03 {
	public static void main(String[] args) {
		// 주민번호 입력
		// 880101-1101111
		// 020101-3101111
		// 나이 확인
		
		// 나이계산 방법
		// string 메소드 -> substring, charAyt, Integer.patseInt
		
		String id_Card_Num = "";
		String str = "";
		int age = 0;
		final int NOW_YEAR = 2020;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 주민번호 나이 확인 ]");
		System.out.print("주민번호를 입력해 주세요 : ");
		id_Card_Num = scan.next();
		
		str = id_Card_Num.substring(0, 2);
		if(id_Card_Num.charAt(7) == '1' || id_Card_Num.charAt(7) == '2') {
			str = "19" + str;	
		}
		else if(id_Card_Num.charAt(7) == '3' || id_Card_Num.charAt(7) == '4') {
			str = "20" + str;
		}
		else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}
		age = NOW_YEAR - Integer.parseInt(str) + 1;
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		scan.close();
	}
}
