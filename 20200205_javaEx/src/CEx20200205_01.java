
// 클래스는 대문자 시작한다.
// 클래스 앞에는 class 가 붙는다.
// 클래식 뒤에는 () 이 붙지 않는다.
public class CEx20200205_01 {
	
	// 메소드(함수)는 소문자로 시작한다.
	// 메소드(함수)는 뒤에 () 가 붙는다.
	public static void main(String[] args) {
				
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if (j == 5) {
					break;
				}
				
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println("--------------------------");
		}
		

	}

	
}
