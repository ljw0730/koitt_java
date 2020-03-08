
public class CEx20200206_08 {
	public static void main(String[] args) {
		// 오버플로어
		
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		byte bMin = -128;
		byte bMax = 127;
		int iMin = -2147483648;
		int iMax = 2147483647;
		
		System.out.println("sMin = " + sMin);
		System.out.println("sMin - 1 = " + (short)(sMin-1));
		System.out.println("sMax = " + sMax);
		System.out.println("sMax + 1 = " + (short)(sMax+1));
		
		System.out.println("cMin = " + (int)cMin);
		System.out.println("cMin - 1 = " + (int)--cMin);
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax + 1 = " + (int)++cMax);
		
		System.out.println("bMin = " + bMin);
		System.out.println("bMin - 1 = " + (byte)(bMin-1));
		System.out.println("bMax = " + bMax);
		System.out.println("bMax + 1 = " + (byte)(bMax+1));
		
		System.out.println("iMin = " + iMin);
		System.out.println("iMin - 1 = " + (iMin-1));
		System.out.println("iMax = " + iMax);
		System.out.println("iMax + 1 = " + (iMax+1));
		
	}	//main
}	// class
	
