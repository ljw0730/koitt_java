
public class CEx20200303_05 {

	public static void main(String[] args) {
		
		Exception e = new Exception("���Ƿ� ���� �߻�������");
		
		System.out.println(1);
		System.out.println(2);
		try {
			throw e;
			// ������ ���ܸ� �߻���Ŵ
			// try-catch������ ����ϸ�
			// �׿ܿ��� ����� ��� ���α׷��� �ٿ�ȴ�.
		} catch (Exception e2) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(3);
		System.out.println("�Ϸ�");
		
	}
}
