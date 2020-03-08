import java.util.Scanner;

public class CEx20200213_02 {
	public static void main(String[] args) {
		// 게시판 프로그램
		// 번호 / 이름 / 제목 / 글내용 / 조회수
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String name = "";
				
		while(true) {
			System.out.print("게시판 번호를 입력하세요. : ");
			num = scan.nextInt();
			scan.nextLine();
			
			System.out.print("이름을 입력하세요. : ");
			name = scan.nextLine();
						
			System.out.println(num + " " + name);
		}
	}
}
