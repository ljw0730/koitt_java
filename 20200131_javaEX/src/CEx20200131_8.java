
public class CEx20200131_8 {
	public static void main(String[] args) {

		// �Ҽ��� 3�ڸ������ (3�ڸ� ���� ����������)
		float pi = 3.141592f;
		float shortpi = (int)(pi * 1000)/1000f;
		System.out.println(shortpi);
		// pi * 1000 = 3141.592 => int�� ������ȯ �ϱ� ������
		// �Ҽ��� ���ϴ� ������ 3141
		// 3141 / 1000f �� �ؼ� 3.141f�� �Ǿ� �ڿ� 592�� ��������.
		
		// �Ҽ��� 2�ڸ�
		int a = 10;
		int b = 3;
		float f = (float)a/b;
		System.out.println(f);
		float ff = (int)(f *100)/100f;
		// �Ҽ��� 2�ڸ��� ����� �ʹٸ� * 100)/100f
		// �Ҽ��� 4�ڸ��� ����� �ʹٸ� * 10000)/10000f
		// ���� �����ؼ� 0�� ����ŭ �Ҽ��� �ڸ��� �������
			
		System.out.println(ff);

	}
}
