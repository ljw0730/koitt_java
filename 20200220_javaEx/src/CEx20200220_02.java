
public class CEx20200220_02 {
	
	public static void main(String[] args) {

		Str s = new Str();
		s.x = "abc";
		s.y = "def";
		
		System.out.println("before s.x : " + s.x);
		s.x = merge(s.x, s.y);
		System.out.println("merge s.x : " + s.x);
		
		System.out.println("=====================");
		
		s.x = "abc";
		System.out.println("before s.x : " + s.x);
		merge2(s);
		System.out.println("merge2 s.x : " + s.x);
		
		
	}	// main
	
	// ���ϰ��� ����, 2���� ���� ���� ���� ������.
	// s.x-> abcdef
	static String merge(String x, String y) {
		String result = "";
		result = x + y;
		return result;
	}
	
	// void / �ּҰ��� �Ѱܼ� ���� ������.
	static void merge2(Str s) {
		s.x = s.x + s.y;
	}
	
		
}	// class

class Str {
	String x;
	String y;
}

