import java.util.Scanner;

public class CEx20200207_04 {
	public static void main(String[] args) {
		// 주민번호 입력
		// 880101-1101111
		// 020101-3101111
		// 태어난 월을 확인해서
		// 12, 1, 2 월 -> 겨울에 태어 났군요.
		// 3, 4, 5 월 -> 봄에 태어 났군요.
		// 6, 7, 8 월 -> 여름에 태어 났군요.
		// 9, 10, 11 월 -> 가을에 태어 났군요.
		// 1번째 switch문 2번재 if문
		
		
		String id_Card_Num = "";
		String month_str = "";
		int month = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("[ 주민번호 탄생 계절 확인 ]");
		System.out.print("주민번호를 입력해 주세요 : ");
		id_Card_Num = scan.next();
		month_str = id_Card_Num.substring(2, 4);
		month = Integer.parseInt(month_str);
		
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println(month + "월");
				System.out.println("겨울에 태어났군요.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month + "월");
				System.out.println("봄에 태어났군요.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "월");
				System.out.println("여름에 태어났군요.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "월");
				System.out.println("가을에 태어났군요.");
				break;
		}
		
		System.out.println("==================================");
		
		if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월");
			System.out.println("겨울에 태어났군요.");
		}
		else if (month == 3 || month == 4 || month == 5) {
			System.out.println(month + "월");
			System.out.println("봄에 태어났군요.");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.println(month + "월");
			System.out.println("여름에 태어났군요.");
		}
		else if (month == 9 || month == 10 || month == 11) {
			System.out.println(month + "월");
			System.out.println("가을에 태어났군요.");
		}
		
		scan.close();
		
	}	//main
}	//class
