
public class CEx20200204_07 {
	public static void main(String[] args) {
		
		// 1 ~ 100 ������ 2�� ����� ��
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 1; i <=100; i++) {
			if((i % 2) == 0) {
				sum += i;
			}
		}
		
		// �ٸ� ������� 2�� ������Ų��.
		// �ʱⰪ ����
		for(int i = 0; i <=100; i+=2) {
				sum2 += i;
		}
		
		System.out.println("1~100������ 2�� ������� ���� : "
				+ sum + " �Դϴ�.");
		System.out.println("�ι�° ����� ���� : "
				+ sum2 + " �Դϴ�.");
		
	}
}
