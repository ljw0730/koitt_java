import java.util.Scanner;

public class CEx20200203_27 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int input = scan.nextInt();
		
		if(input<-1 || input>3 && input<5) {
			System.out.println("ture");
		}
		else {
			System.out.println("flase");
		}
		
		scan.close();
		
	}
}
