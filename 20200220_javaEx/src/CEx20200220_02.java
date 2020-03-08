
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
	
	// 리턴값을 만들어서, 2개의 변수 값을 합쳐 보세요.
	// s.x-> abcdef
	static String merge(String x, String y) {
		String result = "";
		result = x + y;
		return result;
	}
	
	// void / 주소값을 넘겨서 합쳐 보세요.
	static void merge2(Str s) {
		s.x = s.x + s.y;
	}
	
		
}	// class

class Str {
	String x;
	String y;
}

