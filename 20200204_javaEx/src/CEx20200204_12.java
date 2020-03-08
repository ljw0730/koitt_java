
public class CEx20200204_12 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j ++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j --) {
				System.out.printf("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j ++) {
				if(j<i) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
				
			}
			System.out.println("");
		}	
		System.out.println("");
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 10; j >= i; j --) {
				if(j > i) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
			}
			System.out.println("");
		}
			
	}
}
