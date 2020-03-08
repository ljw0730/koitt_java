public class CEx20200204_23 {

	public static void main(String[] args) {
		// 3의 배수가 아닌것
		// sum이 200 넘는 형태
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			if (sum > 200) {
				break;
			}
			if(!(i % 3 ==0)) {
				sum += i;
			}
			i++;
		
		}
		System.out.println("i = " + (i - 1));
		System.out.println("sum = " + sum);
		
		sum = 0;
		for(i = 1; i <100; i++) {
			if(sum > 200) {
				break;
			}
			if(!(i % 3 ==0)) {
				sum += i;
			}
		}
		
		System.out.println("i = " + (i - 1));
		System.out.println("sum = " + sum);
		
	} // main
} // class
