import java.util.Scanner;

public class CEx20200203_23 {

	public static void main(String[] args) {
		// 입력받은 숫자가 양수, 0, 음수 인지 ...
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		
		int i = scan.nextInt();
		
		if(i > 0) {
			System.out.println("양수 입니다.");
		} else if (i == 0) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
		
		scan.close();
	}

}
