import java.util.Scanner;

public class CEx20200203_14 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int x = scan.nextInt();
		
		System.out.println("x의 절대값은? : " + (x>=10 ? x: -x));
		
		scan.close();
		
	}
}
