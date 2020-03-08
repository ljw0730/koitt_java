
public class CEx20200204_10 {
	public static void main(String[] args) {
		// 구구단
		int i = 0;
		int j = 0;
		
		for (i = 1; i <= 9; i+=2) {
			if(i==1) {
				for (int k = 2; k <= 9; k++) {
					System.out.printf("< %d 단 >     ", k);
				}
				System.out.println("");
			}
			for (j = 2; j <= 5; j++) {
				System.out.printf("%d*%d=%2d  /   ", j, i, j*i);
			}
			System.out.println("");
		}

	}
}
