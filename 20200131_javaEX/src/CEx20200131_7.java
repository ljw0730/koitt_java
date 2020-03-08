
public class CEx20200131_7 {
	public static void main(String[] args) {

		int c = 1000000 * 1000000 / 1000000;
		int d = 1000000 / 1000000 * 1000000;
		
		System.out.println(c);
		System.out.println(d);
		
		// c의 경우 우선순위에 의해 * 가 먼저 계산되면서
		// 오버플로우가 발생된 상태로 / 를 한다.
		
	}
}
