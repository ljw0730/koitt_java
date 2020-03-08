import java.util.Scanner;

public class CEx20200203_13 {

	public static void main(String[] args) {
		// 실수 소수 5째 자리 숫자를 입력 받아서 4째자리에서 반올림
		// 한값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		
		double d = scan.nextDouble();
		
		double d2 = Math.round(d*1000)/1000.0d;
		
		System.out.println("소수점 4째자리 반올림 값 : " + d2);

		scan.close();
	}

}
