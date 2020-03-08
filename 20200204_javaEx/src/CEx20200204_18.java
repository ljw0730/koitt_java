

public class CEx20200204_18 {

	public static void main(String[] args) {
		
		int i= 2;
		while( i <= 9 ) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				j++;
			}
			i++;
		}
	}
}
