
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
			// ������ ������ ���α׷��� �ٿ�Ǿ�� �ϴµ�
			// try-catch�� ���� �ٿ� ���� �ʰ� catch������ ����. 
			
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}

}
