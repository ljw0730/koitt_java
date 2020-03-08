import java.util.Scanner;

public class CEx20200203_18 {
	public static void main(String[] args) {	
		// 입력받은 숫자가 2의 배수인가?
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int input = scan.nextInt();
		
		int i = input % 2;
		
		String str = (i == 0 ? "2의 배수 입니다." : "2의 배수가 아닙니다.");
		
		System.out.printf("%s", str);
		
		
		scan.close();
		
	}
}
