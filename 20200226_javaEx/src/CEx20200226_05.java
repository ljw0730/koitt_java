
public class CEx20200226_05 extends Object{ // �����Ͻ� extends Object �ڵ�����

	// ���� ������ �ϰԵǸ�
	
	CEx20200226_05() {	// �����Ͻ� �⺻������ �ڵ�����
		
	}
	
	public static void main(String[] args) {
		
		Point2 p = new Point2(100, 100);
		Point3D2 pp = new Point3D2(100,100,100);
		System.out.println(p.getLocation());
		System.out.println(pp.getLocation());
		
	} //main

} //CEx20200226_04 class

class Point2 extends Object{ // �����Ͻ� extends Object �ڵ�����
	int x;
	int y;
	
	Point2() {
		this(0, 0);
	}
	
	Point2(int x, int y) {
		super();	// �����Ͻ� �ڵ�����
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x��ǥ : " + x + " / y��ǥ : " + y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	Point3D2() {
		
	}
	
	Point3D2(int x, int y, int z) {
		super();	// �����Ͻ� �ڵ�����
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x��ǥ : " + x + " / y��ǥ : " + y + " / z��ǥ : " + z;
	}
}
