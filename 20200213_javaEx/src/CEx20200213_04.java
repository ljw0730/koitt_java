
public class CEx20200213_04 {
	public static void main(String[] args) {
		// �迭�� ����
		int[] num = { 1, 2, 3, 4, 5 };
		int[] num2 = new int [10];
		
		for(int i = 0; i < num.length; i++) {
			num2[i] = num[i];
		}
		
		// num �迭 ���
		System.out.print("num  �迭�� : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			
		}
		System.out.println();
		
		// num2 �迭 ���
		System.out.print("num2 �迭�� : ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
			
		}
		System.out.println();
		}
}
