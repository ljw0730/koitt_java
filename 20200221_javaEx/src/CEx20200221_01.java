
public class CEx20200221_01 {

	public static void main(String[] args) {
		// 오버로딩
		// 메소드 이름은 같아도 매개변수가 다르면
		// 다른 메소드 이다.
		
		int a = 0;
		char b = 'a';
		String c = "abc";
		long d = 1000000000L;
		float e = 1.5f;
		double f = 3.141592d;
		
		// 입력되는 매개변수가 다 다르므로 전부 다른 메소드이다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println();
		
		print();
		print(a);
		print(b);
		print(c);
		print(d);
		
		
	}	// main
	
	static void add() {	}
	
	// 매개변수가 다르면 다른 메소드이다.
	static void add(int a) { }
	
	// 매개변수의 개수가 달라도 다른 메소드이다.
	static void add(int a, int b) { }
	
	static void add(char a) { }

	/////////////////////////////////////////
	static void print() {
		System.out.println("null");
	}
	
	static void print(int a) {
		System.out.println("int");
	}
	
	static void print(char a) {
		System.out.println("char");
	}
	
	static void print(String a) {
		System.out.println("String");
	}
	
	static void print(long a) {
		System.out.println("long");
	}
	
}	// class

