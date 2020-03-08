
public class CEx20200226_04 {
	
	public static void main(String[] args) {
		
		Point p = new Point(100, 100);
		System.out.println(p.getLocation());
		
	} //main

} //CEx20200226_04 class

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "xÁÂÇ¥ : " + x + " / yÁÂÇ¥ : " + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D() {
		
	}
	
	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "xÁÂÇ¥ : " + x + " / yÁÂÇ¥ : " + y + " / zÁÂÇ¥ : " + y;
	}
}
