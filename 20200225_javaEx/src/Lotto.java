
public class Lotto {
	// ball 45개의 배열을 선언 -> 1~45까지 바로 생성 될 수 있도록 설계
	int[] ball = new int[45];
	
	Lotto() {
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
	}
}
