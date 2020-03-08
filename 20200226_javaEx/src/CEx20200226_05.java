
public class CEx20200226_05 extends Object{ // 컴파일시 extends Object 자동생성

	// 만약 컴파일 하게되면
	
	CEx20200226_05() {	// 컴파일시 기본생성자 자동생성
		
	}
	
	public static void main(String[] args) {
		
		Point2 p = new Point2(100, 100);
		Point3D2 pp = new Point3D2(100,100,100);
		System.out.println(p.getLocation());
		System.out.println(pp.getLocation());
		
	} //main

} //CEx20200226_04 class

class Point2 extends Object{ // 컴파일시 extends Object 자동생성
	int x;
	int y;
	
	Point2() {
		this(0, 0);
	}
	
	Point2(int x, int y) {
		super();	// 컴파일시 자동생성
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x좌표 : " + x + " / y좌표 : " + y;
	}
}

class Point3D2 extends Point2 {
	int z;
	
	Point3D2() {
		
	}
	
	Point3D2(int x, int y, int z) {
		super();	// 컴파일시 자동생성
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x좌표 : " + x + " / y좌표 : " + y + " / z좌표 : " + z;
	}
}
