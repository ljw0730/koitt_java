
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
	
	// x, y, z ���� �޾Ƽ� 3���� ���� ���Ͽ� �����ؼ� p.x�� ���� �����ÿ�.
	static int add(int x, int y, int z) {
		int result = 0;
		result = x + y + z;
		return result;
	}
	
	// ���� ���� �ּҰ��� �޾Ƽ� 3���� ���� ���Ͽ� p.x�� ���� �����ÿ�. 
	static void add2(Plus p) {
		p.x = p.x + p.y + p.z;
	}
	
		
}	// class

class Plus{
	int x;
	int y;
	int z;
}


