import java.util.Scanner;

public class CEx20200203_05 {
	public static void main(String[] args) {
		
		// 콘솔상으로 입력받는 객체
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		
		int sum = kor + eng + math;
		System.out.println("합계 : " + sum);

		double avg = (kor + eng + math)/3;
		System.out.println("평균 : " + avg);
		
		scan.close();
				
	}
}
