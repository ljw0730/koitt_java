public class CEx20200206_05 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;	// long hex = 0xffffffffffffffff
		
		// 0�� �پ� ������ 8����
		// 0x�� �پ� ������ 16����
		// 0b�� �پ� ������ 2����
		int octNum = 010;		// 8���� 10, 10�����δ� 8
		int hexNum = 0x10;		//16���� 10, 10�����δ� 16
		int binNum = 0b10;		// 2���� 10, 10�����δ� 2
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		
		System.out.printf("finger = [%5d]%n", finger);
		System.out.printf("finger = [%-5d]%n", finger);
		// 5������ ����� ���� ������ 0���� ä����
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);		// '#'�� ���λ�(16���� 0x, 8���� 0)
		
		System.out.printf("octNum = %#o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);
		
		//Integer.toBinaryString(20) : 10������ 2������ ǥ���Ҷ�
		System.out.printf("20�� 2�����κ�ȯ = %s %n", Integer.toBinaryString(20));
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}	//main
}	// class
	
