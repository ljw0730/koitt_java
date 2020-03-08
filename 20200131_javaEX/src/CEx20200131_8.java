
public class CEx20200131_8 {
	public static void main(String[] args) {

		// 소수점 3자리만들기 (3자리 이후 날려버리기)
		float pi = 3.141592f;
		float shortpi = (int)(pi * 1000)/1000f;
		System.out.println(shortpi);
		// pi * 1000 = 3141.592 => int로 강제변환 하기 때문에
		// 소수점 이하는 없어짐 3141
		// 3141 / 1000f 를 해서 3.141f가 되어 뒤에 592가 없어진다.
		
		// 소수점 2자리
		int a = 10;
		int b = 3;
		float f = (float)a/b;
		System.out.println(f);
		float ff = (int)(f *100)/100f;
		// 소수점 2자리로 만들고 싶다면 * 100)/100f
		// 소수점 4자리로 만들고 싶다면 * 10000)/10000f
		// 쉽게 생각해서 0의 수만큼 소수점 자리수 만들어짐
			
		System.out.println(ff);

	}
}
