
public class CEx20200203_10 {

	public static void main(String[] args) {
		
		System.out.println(10.0 / 3);
		
		// printf
		// ���� : %d / �Ǽ� : %f / ���� : %c / ���ڿ� : %s
		// ���๮�� : %n (�ٹٲ�)
		System.out.printf("�ڸ��� ��ġ : %.2f %n", 10.0/3);
		// %.2f�� �ϸ� ���ڿ� ���� �Ҽ��� 2° �ڸ����� ���´�.
		System.out.printf("�ڸ��� ��ġ : %5.2f %n", 10.0/3);
		// %5.2f�� �ϸ� �ռ��ڿ� ���� �Ҽ����� �����Ͽ� 5�ڸ����� ���´�.
		// �޼��ڿ� ���� �Ҽ��� 2° �ڸ� ���� ���´�.
		// ex) 10.00
		
		int a = 5;
		int b = 10;
		
		System.out.printf("ù��° ���� : %d, �ι�° ���� : %d", a, b);
	}
	
}
