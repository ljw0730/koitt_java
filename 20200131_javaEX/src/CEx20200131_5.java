
public class CEx20200131_5 {
	public static void main(String[] args) {
		int a = 1000000; //1,000,000
		int b = 2000000; //2,000,000
		long c = (long)a*b;
		
		System.out.println(c);
		//�ذ� ���
		// 1. int a,b�� long���� ��ȯ��Ű��.
		// 2 (long)a*b �� �����������Ѵ�.
		// long * int -> long * long -> long
		
		
		int a2 = 10;
		int b2 = 3;
		double c2 = (double)a2/b2;
		
		System.out.println(c2);
		// ����ȯ�� ���ѻ��� ���� ��Ű�� 3.0�� ���´�.
		// ��Ȯ�� 3.33333.. ���� ��� ���ؼ���
		// 1. int a2,b2�� long���� ��ȯ��Ű��.
		// 2 (double)a2*b2 �� �����������Ѵ�.
		
		byte a3 = 10;
		byte b3 = 20;
		byte c3 = (byte)(a3 + b3); 
		
		System.out.println(c3);
		//���ϱ⸦ �ϰ� �Ǹ� int�� ��ȯ�� �ǹǷ� byte����ȯ�� �ؾ��Ѵ�.
	}
}
