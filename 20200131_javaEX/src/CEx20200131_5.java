
public class CEx20200131_5 {
	public static void main(String[] args) {
		int a = 1000000; //1,000,000
		int b = 2000000; //2,000,000
		long c = (long)a*b;
		
		System.out.println(c);
		//해결 방법
		// 1. int a,b를 long으로 변환시키다.
		// 2 (long)a*b 로 강제형변형한다.
		// long * int -> long * long -> long
		
		
		int a2 = 10;
		int b2 = 3;
		double c2 = (double)a2/b2;
		
		System.out.println(c2);
		// 형변환을 안한상태 실행 시키면 3.0이 나온다.
		// 정확한 3.33333.. 값을 얻기 위해서는
		// 1. int a2,b2를 long으로 변환시키다.
		// 2 (double)a2*b2 로 강제형변형한다.
		
		byte a3 = 10;
		byte b3 = 20;
		byte c3 = (byte)(a3 + b3); 
		
		System.out.println(c3);
		//더하기를 하게 되면 int로 변환이 되므로 byte형변환을 해야한다.
	}
}
