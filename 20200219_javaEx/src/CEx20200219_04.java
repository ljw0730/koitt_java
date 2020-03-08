import java.util.Scanner;

public class CEx20200219_04 {
	
	public static void main(String[] args) {
		// Area class와 연결되어있음
		
		// 사각형 넓이 구하는 프로그램
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		
		Area a1 = new Area();
		
		System.out.println("사각형 넓이 구하는 프로그램");
		System.out.println("1. 정사각형 / 2. 직사각형 / 3. 마름모");
		System.out.print("원하는 번호를 입력하세요. : ");
				
		switch(scan.nextInt()) {
			case 1:
				System.out.print("가로 길이를 입력해 주세요 : ");
				a1.horiz = scan.nextInt();
				result = a1.square();
				System.out.println("정사각형 넓이 : " + result);
				break;
				
			case 2:
				System.out.print("가로 길이를 입력해 주세요 : ");
				a1.horiz = scan.nextInt();
				System.out.print("세로 길이를 입력해 주세요 : ");
				a1.vert = scan.nextInt();
				result = a1.rectangle();
				System.out.println("직사각형 넓이 : " + result);
				break;
			case 3:
				System.out.print("대각선 길이를 입력해 주세요 : ");
				a1.horiz = scan.nextInt();
				System.out.print("다른 대각선 길이를 입력해 주세요 : ");
				a1.vert = scan.nextInt();
				result = a1.rhombus();
				System.out.println("마름모 넓이 : " + result);
				break;				
		}
		
	}	// main
	
}	//class

