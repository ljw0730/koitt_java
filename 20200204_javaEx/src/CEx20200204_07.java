
public class CEx20200204_07 {
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 2의 배수의 합
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 1; i <=100; i++) {
			if((i % 2) == 0) {
				sum += i;
			}
		}
		
		// 다른 방법으로 2씩 증가시킨다.
		// 초기값 주의
		for(int i = 0; i <=100; i+=2) {
				sum2 += i;
		}
		
		System.out.println("1~100사이의 2의 배수들의 합은 : "
				+ sum + " 입니다.");
		System.out.println("두번째 방법의 합은 : "
				+ sum2 + " 입니다.");
		
	}
}
