
public class CEx20200220_04 {
	
	public static void main(String[] args) {
		// 
		
		Arith a = new Arith();
		a.x = 50;
		a.y = 10;
		a.z = 2;
		
		a.result = add(a.x, a.y, a.z); 
		System.out.println("add - result : " + a.result);
		
		reset(a);
		add2(a);
		System.out.println("add2 - result : " + a.result);
		
		System.out.println("===================");
		
		reset(a);
		a.result = sub(a.x, a.y, a.z); 
		System.out.println("sub - result : " + a.result);
		
		reset(a);
		sub2(a);
		System.out.println("sub2 - result : " + a.result);
		
		System.out.println("===================");
		
		reset(a);
		a.result = mul(a.x, a.y, a.z); 
		System.out.println("mul - result : " + a.result);
		
		reset(a);
		mul2(a);
		System.out.println("mul2 - result : " + a.result);
		
		System.out.println("===================");
		
		reset(a);
		a.result = div(a.x, a.y, a.z); 
		System.out.println("div - result : " + a.result);
		
		reset(a);
		div2(a);
		System.out.println("div2 - result : " + a.result);
		
		///////////////////////////////////////////////////////
		// add, sub, mul, div 변수로 값을 받아 출력을 하세요.
		
		System.out.println("==========================================");
		
		Arith[] aa = new Arith[4];
		int add = 0;
		int sub = 0;
		int mul = 0;
		int div = 0;
		
		rule(aa);
		
		add = aa[0].result;
		sub = aa[1].result;
		mul = aa[2].result;
		div = aa[3].result;
		
		System.out.println("add - result : " + aa[0].result);
		System.out.println("sub - result : " + aa[1].result);
		System.out.println("mul - result : " + aa[2].result);
		System.out.println("div - result : " + aa[3].result);
		
		
		
		
	}	// main
	
	// x, y, z를 받아서 더하기/빼기/곱하기/나누기를 해서 4개의 값을 리턴 받아서 출력하세요.
	static Arith[] rule(Arith[] aa) {
		for(int i = 0; i < aa.length; i++) {
			aa[i] = new Arith(50, 10, 2);
		}
		
		add2(aa[0]);
		sub2(aa[1]);
		mul2(aa[2]);
		div2(aa[3]);
		
		return aa;
	}
	
	static void reset(Arith a) {
		a.x = 50;
		a.y = 10;
		a.z = 2;
		a.result = 0;
	}
	
	// add -> x,y,z 더해서 값을 리턴 받아서 result에 넣어라.
	static int add(int x, int y, int z) {
		int result = 0;
		result = x + y + z;
		return result;
	}
	
	// add2 -> 리턴없이 주소값을 넘겨서 result에 값을 넣어라.
	static void add2(Arith a) {
		a.result = a.x + a.y + a.z;
	}
	
	static int sub(int x, int y, int z) {
		int result =0;
		result = x - y - z;
		return result;
	}
	
	static void sub2(Arith a) {
		a.result = a.x - a.y - a.z;
	}
	
	static int mul(int x, int y, int z) {
		int result = 0;
		result = x * y * z;
		return result;
	}
	
	static void mul2(Arith a) {
		a.result = a.x * a.y * a.z;
	}
	
	static int div(int x, int y, int z) {
		int result = 0;
		result = x / y / z;
		return result;
	}
	
	static void div2(Arith a) {
		a.result = a.x / a.y / a.z;
	}
		
}	// class


class Arith {
	int x;
	int y;
	int z;
	int result;
	
	Arith() {
		
	}
	
	Arith(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}