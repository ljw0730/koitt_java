public class CEx20200225_01 {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.draw();
		
		//���� 150, 30 / ������ 200;
		Point cricle_center = new Point(150, 30);
		Circle c2 = new Circle(cricle_center, 200);
		c2.draw();
		
		//���� 0, 0 / ������ 50;
		Circle c3 = new Circle();
		c3.r = 50;
		c3.draw();
		
		//���� 300, 300 / ������ 70;
		Point circle_center2 = new Point(300, 300);
		Circle c4 = new Circle(circle_center2, 70);
		c4.draw();
		
		// Point �迭 (100, 100 / 200, 200 / 300, 300 )	// r = 50, 60, 70
		Point[] circle_center_arr = new Point[3];
		Circle[] c = new Circle[3];
		
		int basic_center_x = 100;
		int basic_center_y = 100;
		int basic_r = 50;
		for(int i = 0; i < c.length; i++) {
			circle_center_arr[i] = new Point(basic_center_x, basic_center_y);
			c[i] = new Circle(circle_center_arr[i], basic_r);
			c[i].draw();
			
			basic_center_x += 100;
			basic_center_y += 100;
			basic_r += 10;
		}
		
		// Point �迭 (100, 100 / 200, 200 / 300, 300 ) // r = 50, 60, 70
		// ����� ver.
		Point[] pp = new Point[] { new Point(100, 100), new Point(200, 200),
								   new Point(300, 300) };
		int[] rr = { 50, 60, 70 };
		Circle[] cc = new Circle[3];
		for(int i = 0; i < c.length; i++) {
			cc[i] = new Circle(pp[i], rr[i]);
			cc[i].draw();
		}
	} // main
} // CEx20200225_01 Class

// �����׸��� Ŭ����
class Shape {
	String color = "black";
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("������ ���� : " + color);
	}
} //Shape class

// ��ǥ�� Ŭ����
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
	
	String getXY() {
		return "(x�� ��ǥ : " + x + ", y�� ��ǥ : " + y + ")";
	}
} // Point class

// �����׸��� Ŭ����
class Circle extends Shape { //��Ӱ���
	Point center; 	//���԰���
	int r;
	
	Circle() {
		center = new Point(0, 0);
		r = 100;
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("(���� : " + center.x + ", " + center.y + " / ������ : " + r + " / ���� : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle extends Shape {	//��Ӱ���
	Point[] p = new Point[3]; //���԰���
	
	Triangle() {
		this(new Point(0, 0), new Point(100, 0), new Point(0, 100));
//		p[0] = new Point(0, 0);
//		p[1] = new Point(100, 0);
//		p[2] = new Point(0, 100);
	}
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3) {
		p = new Point[] {p1, p2, p3};
 	}
	
	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.println("(��ǥ1 : " + p[0].getXY() + " / ��ǥ2 : " + p[1].getXY()
							+ " / ��ǥ3 : " + p[2].getXY() + " / ���� : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class