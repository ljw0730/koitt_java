import java.util.Scanner;

public class CEx20200203_03 {
	public static void main(String[] args) {
		
		// Scanner : 입력을 받는 클래스 
		// System.in : 콘솔화면에서 값을 1개 받음
		// 클래스는 객체선언을 해야 사용할 수 있다.
		Scanner scan = new Scanner(System.in);
		
		// nextInt() : 화면으로 정수를 입력 받는다.
		// nextFloat() : 화면으로 실수를 입력 받는다.
		
//		int aaa = scan.nextInt();
//		float kor = scan.nextFloat();
		
		System.out.println("국어점수를 입력해주세요. : ");
		// nextLine() : 화면에서 String을 입력 받을때 사용한다.
		String kor = scan.nextLine();
		
		System.out.println("영어점수를 입력해주세요. : ");
		String eng = scan.nextLine();
		
		//Integer.parseInt() : String을 int로 변환
		int kor1 = Integer.parseInt(kor);
		int eng1 = Integer.parseInt(eng);
		
		
//		System.out.println("aaa : " + aaa);
//		System.out.println("국어 점수 : " + kor);
//		System.out.println("영어 점수 : " + eng);
		
		System.out.println("국어, 영어점수 합 : " + (kor1 + eng1));
		
		scan.close();
	}
}
