
public class CEx20200221_03 {

	public static void main(String[] args) {
		// Card class �� ����Ǿ� ����
		
		// for�� kind - Ŭ�ι�, ��Ʈ, ���̾Ƹ��, �����̵�
		// number - 1~13���� �� 52�� ����� ������.
		
		String[] str = { "Ŭ�ι�", "��Ʈ", "���̾Ƹ��", "�����̵�" }; 
		
		Card[] c = new Card[52];
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].kind = str[i];
				c[(i*13)+j].number = (j+1);
			}
		}
		
		System.out.println("�⺻������ �̿�");
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].kind + c[i].number);
		}
		
		System.out.println("==============");
		System.out.println("==============");
		
		
		Card[] c2 = new Card[52];
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < 13; j++) {
				c2[(i*13)+j] = new Card(str[i], j+1);
			}
		}
		
		System.out.println("�Ű������� �ִ� ������ �̿�");
		for(int i = 0; i < c.length; i++) {
			System.out.println(c2[i].kind + c2[i].number);
		}
		
	}	// main
	
} // class
