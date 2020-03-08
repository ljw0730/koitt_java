import java.util.Scanner;

public class CEx20200203_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("핸드폰 번호를 입력하세요. : ");
		
		int check = scan.nextInt();
		if(check == 1) {
			System.out.println("SK텔레콤 입니다.");
		} else if (check == 6) {
			System.out.println("KTF 입니다.");
		} else if (check == 9) {
			System.out.println("LGu+ 입니다.");
		} else {
			System.out.println("잘못된 번호 입니다.");
		}
		
		scan.close();

	}	//main

}	// class
