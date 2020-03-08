
public class CEx20200131_3 {
	public static void main(String[] args) {

		byte b = 127;
		//byte bb = 128; //에러
		//b = b + 1; //바이트 안에 인트를 넣으려 하므로 에러
		b = (byte)(b+1);
		System.out.println(b);
		
	}
}
