
public class CEx20200204_02 {
	public static void main(String[] args) {
		
		// Math.random() : ���� �߻� �Լ�
		// 0.0 ~ 1.0 ������ double���� ��ȯ
		// 0.0 <= Math.random() < 1.0
		
		double ran_d = Math.random();
		System.out.println("���� ���� : " + ran_d);
		
		// 1 ~ 10 ������ ����
		int ran = (int)(Math.random() * 10) + 1;
		System.out.println("1 ~ 10 ���� ������ : " + ran);
		
		// 1 ~ 45 ������ ����
		int ran2 = (int)(Math.random() * 45) + 1;
		System.out.println("1 ~ 45 ���� ������ : " + ran2);		
	}
}
