
public class CEx20200131_9 {
	public static void main(String[] args) {
		
		//소수첫째 자리수에서 반올림 하기
		//Math.round()
		float pi = 3.141592f;
		float shortPi = Math.round(pi * 1000)/1000f;
					// => Math.round(3.141592 * 1000)/1000f
				    // => Math.round(3141.593)/1000f
					// => 3142/1000f
					// => 3.142
		System.out.println(shortPi);
		
		float c = 7.2399981f;
		float cc = Math.round(c * 100)/100f;
		System.out.println(cc);
		
	}
}
