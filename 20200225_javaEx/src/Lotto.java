
public class Lotto {
	// ball 45���� �迭�� ���� -> 1~45���� �ٷ� ���� �� �� �ֵ��� ����
	int[] ball = new int[45];
	
	Lotto() {
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
	}
}
