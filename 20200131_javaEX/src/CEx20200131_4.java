
public class CEx20200131_4 {
	public static void main(String[] args) {

		float f = 1.6f;
		int i = (int)f; //큰쪽에서 작은쪽으로 들어 갈때는 형변환을 해주어야 한다.
		
		System.out.println(i);
		
		
		int ch = 65;
		char c = (char)ch;
		System.out.println(c);
		
		char d = 'a';
		int ch2 = d;
		System.out.println(ch2);
		
		int i2 = 300;
		byte b2 = (byte)i2;	//강제형변화 생략불가
								//오버플로어
		System.out.println(b2);
		
	}
}
