import java.util.Scanner;

public class CEx20200207_01 {
	public static void main(String[] args) {
		// 숫자를 입력해서
		// 0인지, 아닌지 판단하는 프로그램을 만들어 보세요.		
		
		int num = 0;
		
		
		// 객체 생성
		// 화면이 입력된 값을 얻기위한 객체
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 입력한 숫자는 0인가 아닌가 ]");
		System.out.printf("숫자를 입력해 주세요. : ");
		num = scan.nextInt();
		
		// 1 > x , x == 1, x == 0, 0 < x
		if(num == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		else if (num > 0){
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
			System.out.println("입력하신 숫자는 0 보다 큽니다.");
			System.out.println("입력하신 숫자는 " + num + " 입니다.");
		}
		else if(num < 0) {
			System.out.println("입력하신 숫자는 0 이 아닙니다.");
			System.out.println("입력하신 숫자는 0 보다 작습니다.");
			System.out.println("입력하신 숫자는 " + num + " 입니다.");
		}
		
		scan.close();
		
	}
}
