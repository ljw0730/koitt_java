
public class CEx20200220_03 {
	
	public static void main(String[] args) {
		
		Plus p = new Plus();
		p.x = 10;
		p.y = 20;
		p.z = 30;
		
		System.out.println("befor add - p.x : " + p.x);
		p.x = add(p.x, p.y, p.z);
		System.out.println("after add - p.x : " + p.x);
		
		System.out.println("==========================");
		
		p.x = 10;
		System.out.println("befor add2 - p.x : " + p.x);
		add2(p);
		System.out.println("after add2 - p.x : " + p.x);
		
	}	// main
	
	// x, y, z 값을 받아서 3개의 값을 더하여 리턴해서 p.x에 값을 넣으시오.
	static int add(int x, int y, int z) {
		int result = 0;
		result = x + y + z;
		return result;
	}
	
	// 리턴 없이 주소값을 받아서 3개의 합을 구하여 p.x에 값을 넣으시오. 
	static void add2(Plus p) {
		p.x = p.x + p.y + p.z;
	}
	
		
}	// class

class Plus{
	int x;
	int y;
	int z;
}


