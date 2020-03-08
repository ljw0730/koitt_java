public class CEx20200204_21 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum >100) {
				break;
			}
			
			i++;
			sum += i;
		}// end of while
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
		
		sum = 0;
		for(i = 0; i < 100; i++) {
			if(sum > 100) {
				break;
			}
			sum += i;
		}
		
		System.out.println("i = " + (i - 1));
		System.out.println("sum = " + sum);
		
	} // main
} // class
