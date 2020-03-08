
public class CEx20200204_02 {
	public static void main(String[] args) {
		
		// Math.random() : 난수 발생 함수
		// 0.0 ~ 1.0 사이의 double값을 반환
		// 0.0 <= Math.random() < 1.0
		
		double ran_d = Math.random();
		System.out.println("랜덤 난수 : " + ran_d);
		
		// 1 ~ 10 사이의 난수
		int ran = (int)(Math.random() * 10) + 1;
		System.out.println("1 ~ 10 사이 난수는 : " + ran);
		
		// 1 ~ 45 사이의 난수
		int ran2 = (int)(Math.random() * 45) + 1;
		System.out.println("1 ~ 45 사이 난수는 : " + ran2);		
	}
}
