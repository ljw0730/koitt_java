
public class CEx20200131_6 {
	public static void main(String[] args) {
		
		int i = 5;
		int j = 0;
		
		j = ++i;	// i에 1을 증가시킨후에 j에 대입한다.
		System.out.println("i의 값은 : " + i);
		System.out.println("j의 값은 : " + j);
		
		int i2 = 5;
		int j2 = 0;
		
		j2 = i2++;	// i2를 j2에 먼저 대입을 한 후에 1증가 시킨다.
		System.out.println("i2의 값은 : " + i2);
		System.out.println("j2의 값은 : " + j2);
		
	}
}
