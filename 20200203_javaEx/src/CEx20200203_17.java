import java.util.Scanner;

public class CEx20200203_17 {
	public static void main(String[] args) {
		// 4자리 수를 입력받아 가장 앞에 있는 숫자가
		// 코드 : 1 -> VIP / 2 -> Gold / 3-> silver
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("코드를 입력하세요 : ");
		int code = scan.nextInt();
		
		String str = code + "";
		char ch1 = str.charAt(0);
		
		String str2 = (ch1 == '1' ? "VIP" : (ch1=='2' ? "Glod" : "Silver"));

		System.out.println("당신의 등급은 " + str2 + "입니다.");
		
		scan.close();
		
	}
}
