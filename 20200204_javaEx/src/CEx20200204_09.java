
public class CEx20200204_09 {
	public static void main(String[] args) {
		// ������
		int i = 0;
		int j = 0;
		
		for (i = 1; i <= 9; i++) {
			if(i==1) {
				for (int k = 2; k <= 9; k++) {
					System.out.printf("< %d �� >     ", k);
				}
				System.out.println("");
			}
			for (j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%2d  /   ", j, i, j*i);
			}
			System.out.println("");
		}
	}
}
