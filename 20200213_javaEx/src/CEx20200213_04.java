
public class CEx20200213_04 {
	public static void main(String[] args) {
		// 배열의 복사
		int[] num = { 1, 2, 3, 4, 5 };
		int[] num2 = new int [10];
		
		for(int i = 0; i < num.length; i++) {
			num2[i] = num[i];
		}
		
		// num 배열 출력
		System.out.print("num  배열값 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			
		}
		System.out.println();
		
		// num2 배열 출력
		System.out.print("num2 배열값 : ");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
			
		}
		System.out.println();
		}
}
