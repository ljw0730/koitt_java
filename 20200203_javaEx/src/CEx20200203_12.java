import java.util.Scanner;

public class CEx20200203_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		double num1 = scan.nextDouble();
		
		
		// Math.round(x) : 소수점 반올림
		System.out.println("소수 첫째자리 반올림 값 : " + Math.round(num1));
		
		// Math.ceil(x) : 소수점 올림
		System.out.println("ceil 무엇일까요?" + Math.ceil(num1));
		
		// Math.floor(x) : 소수점 버림
		System.out.println("floor 무엇일까요?" + Math.floor(num1));
		
		scan.close();
		
	}
	
}
