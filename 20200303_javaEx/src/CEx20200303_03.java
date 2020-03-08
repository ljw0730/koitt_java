
public class CEx20200303_03 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);

		System.out.println("===============");
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			
			System.out.println(5/0);
			// 원래는 에러로 프로그램이 다운되어야 하는데
			// try-catch에 의해 다운 되지 않고 catch문으로 간다. 
			
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
