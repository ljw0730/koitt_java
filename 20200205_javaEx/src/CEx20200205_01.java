
// Ŭ������ �빮�� �����Ѵ�.
// Ŭ���� �տ��� class �� �ٴ´�.
// Ŭ���� �ڿ��� () �� ���� �ʴ´�.
public class CEx20200205_01 {
	
	// �޼ҵ�(�Լ�)�� �ҹ��ڷ� �����Ѵ�.
	// �޼ҵ�(�Լ�)�� �ڿ� () �� �ٴ´�.
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
