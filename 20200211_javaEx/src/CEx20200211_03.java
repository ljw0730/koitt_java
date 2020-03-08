
public class CEx20200211_03 {
	public static void main(String[] args) {
		// 구구단을 출력하는데...
		
		// 구구단 세로 찍기
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i*j + " ");
//			}
//			System.out.println("==============");
//		}
		
		// 구구단 가로 찍기
//		for(int i = 1; i <= 9; i++) {
//			System.out.print("["+i+"단]\t");
//		}
//		System.out.println("");
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.printf(j + "*" + i + "=" + i*j + "\t");
//			}
//			System.out.println("");
//		}
		
		
//		// 2 4 6 8단 만나오고
//		// 3의배수만 곱해진다.
		for(int i = 2; i <= 9; i++) {
			if(!(i%2 ==0)) {
				continue;
			}
			System.out.print("["+i+"단]\t");
		}
		System.out.println("");
		for(int i = 2; i <= 9; i++) {
			if(!(i%3 ==0)) {
				continue;
			}
			for(int j = 2; j <= 9; j++) {
				if(!(j%2 ==0)) {
					continue;
				}
				System.out.printf(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println("");
		}
	}
}
