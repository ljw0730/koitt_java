
public class CEx20200206_06 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f	;	//0.10, 1.0e-1
		// e = 10;
		float f2 = 1e1f;	//10.0, 1.0e1, 1.0e+1
		// e3 = e^3 = 10^3 = 1000
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		// %e : 지수형태로 출력
		// %g : 값을 간략하게 표현
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		//전체자리 14중 소수점 10만들어라
		System.out.printf("d=%14.10f%n", d);
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);	//왼쪽 정렬
		System.out.printf("[%.8s]%n", url);		//왼쪽에서 8글자만 출력
		
		
	}	//main
}	// class
	
