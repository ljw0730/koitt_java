public class CEx20200204_22 {

	public static void main(String[] args) {
		// Ȧ���� ���ؼ� 200�� �ѵ鶧 i, sum
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			if (sum > 200) {
				break;
			}
			sum += i;
			i += 2;
		
		}
		System.out.println("i = " + (i - 2));
		System.out.println("sum = " + sum);
		
		sum = 0;
		for(i = 1; i <100; i+=2) {
			if(sum > 200) {
				break;
			}
			sum += i;
		}
		
		System.out.println("i = " + (i - 2));
		System.out.println("sum = " + sum);
		
	} // main
} // class
