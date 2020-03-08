
public class CEx20200203_10 {

	public static void main(String[] args) {
		
		System.out.println(10.0 / 3);
		
		// printf
		// 정수 : %d / 실수 : %f / 문자 : %c / 문자열 : %s
		// 개행문자 : %n (줄바꿈)
		System.out.printf("자리수 배치 : %.2f %n", 10.0/3);
		// %.2f를 하면 숫자에 의해 소수점 2째 자리까지 나온다.
		System.out.printf("자리수 배치 : %5.2f %n", 10.0/3);
		// %5.2f를 하면 앞숫자에 의해 소수점을 포함하여 5자리까지 나온다.
		// 뒷숫자에 의해 소수점 2째 자리 까지 나온다.
		// ex) 10.00
		
		int a = 5;
		int b = 10;
		
		System.out.printf("첫번째 변수 : %d, 두번째 변수 : %d", a, b);
	}
	
}
