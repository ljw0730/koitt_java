import java.util.Scanner;

public class CEx20200219_07 {
	
	public static void main(String[] args) {
		//Card class�� ����Ǿ� ����
		
		//Card 52���� �迭�� ����
		// 1~13���� ���ڸ� ���� �ְ�
		// ������ Ŭ�ι�, ���̾Ƹ��, ��Ʈ, �����̵�
		// ��������.

		Card[] c = new Card[52];
		String[] kind = { "Ŭ�ι�", "���̾Ƹ��", "��Ʈ", "�����̵�" };
		
		for(int i = 0; i < kind.length; i++) {
			for(int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card(j+1,kind[i]);
			}
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i].number + " " + c[i].kind);
		}
		
		
	}	// main
	
}	//class

