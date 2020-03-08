public class CEx20200206_05 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;	// long hex = 0xffffffffffffffff
		
		// 0이 붙어 있으면 8진수
		// 0x가 붙어 있으면 16진수
		// 0b가 붙어 있으면 2진수
		int octNum = 010;		// 8진수 10, 10진수로는 8
		int hexNum = 0x10;		//16진수 10, 10진수로는 16
		int binNum = 0b10;		// 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		
		System.out.printf("finger = [%5d]%n", finger);
		System.out.printf("finger = [%-5d]%n", finger);
		// 5공간을 만들고 앞의 공간을 0으로 채워라
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);		// '#'은 접두사(16진수 0x, 8진수 0)
		
		System.out.printf("octNum = %#o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
		
		//Integer.toBinaryString(20) : 10진수를 2진수로 표현할때
		System.out.printf("20을 2진수로변환 = %s %n", Integer.toBinaryString(20));
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}	//main
}	// class
	
