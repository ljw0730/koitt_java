
public class Card {

	int number;		// 1~10, J, Q, K
	String kind;	// 4���� - Ŭ�ι�, ���̾Ƹ��, ��Ʈ, �����̵�
	
	// �����ڸ� �����ε����� ���� ���� �� �־��ٸ�
	// ������ �Ҷ� �ڵ����� ������ִ� �⺻ �����ڵ� ���� ���־�� �Ѵ�.
	Card(int a, String k) {
		this.number = a;
		this.kind = k;
	}
	
	Card() {
		
	}
}
