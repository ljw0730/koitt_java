
public class CEx20200205_02 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if (j == 5 || j == 7) {
					continue;
				}
				
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}

	}

}

