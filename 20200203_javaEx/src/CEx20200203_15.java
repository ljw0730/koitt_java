import java.util.Scanner;

public class CEx20200203_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. : ");
		int x = scan.nextInt();
		
		System.out.println("x는 " + 
						   (x>=1 ? "양수입니다." : (x == 0 ? "0 입니다." : "음수입니다.")));
		
		scan.close();
	}
}
