
public class CEx20200204_08 {
	public static void main(String[] args) {
		// ������
		int i = 0;
		int j = 0;
		
		for (i = 2; i <= 9; i++) {
			System.out.println("<" + i + "��>");
			for (j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j +" = " + i*j);
				System.out.printf("%d * %d = %d / ", i, j, i*j);
			}
			System.out.println("\n===========================");
		}
	}
}
