
public class CEx20200303_05 {

	public static void main(String[] args) {
		
		Exception e = new Exception("고의로 예외 발생시켰음");
		
		System.out.println(1);
		System.out.println(2);
		try {
			throw e;
			// 강제로 예외를 발생시킴
			// try-catch문에서 사용하며
			// 그외에서 사용할 경우 프로그램이 다운된다.
		} catch (Exception e2) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(3);
		System.out.println("완료");
		
	}
}
