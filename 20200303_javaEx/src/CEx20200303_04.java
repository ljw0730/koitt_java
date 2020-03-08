import java.util.Scanner;

public class CEx20200303_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int kor = 0;
		int eng = 0;
		System.out.print("이름을 입력해 주세요 : ");
		name = scan.nextLine();
		System.out.print("국어점수를 입력해 주세요 : ");
		kor = scan.nextInt();
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			// 어디에서 에러가 났는지 알려주는 메소드
			e.printStackTrace();
		}
		
		System.out.print("영어점수를 입력해 주세요 : ");
		eng = scan.nextInt();
		scan.nextLine();
		
	}
}
