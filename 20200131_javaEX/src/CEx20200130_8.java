
public class CEx20200130_8 {
	public static void main(String[] args) {
		
		char c1 = 'a';
		//char c2 = c1 + 1;	//����
		//=>
		char c2 = (char)(c1 + 1);	//����
		System.out.println(c2);
		c2 = ++c1;	//����
		System.out.println(c2);
		
		int i = 'B' - 'A';
		System.out.println(i);
		
		int i2 = '2' - '0';
		System.out.println(i2);
		
		char a3 = '2';
		char b3 = '0';
		System.out.println("���� 2 ���ϱ� ���� 0 = "+a3+b3);
		//��� 20 �� ����2����0 �̴�.
		char c3 = '7';
		System.out.println("���� 2 ���ϱ� ���� 0 ���ϱ� ����7 = "+a3+b3+c3);
		int d3 = c3-b3;
		System.out.println("������ d ��� : "+d3);
		// ������ ����(char)�� ������ ����(int)�� ����� �ʹٸ�
		// -'0'(���� ������ ����0) �� �Ѵ�.
		
	}
}
