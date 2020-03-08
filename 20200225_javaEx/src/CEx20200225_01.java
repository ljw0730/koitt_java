public class CEx20200225_01 {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.draw();
		
		//원점 150, 30 / 반지름 200;
		Point cricle_center = new Point(150, 30);
		Circle c2 = new Circle(cricle_center, 200);
		c2.draw();
		
		//원점 0, 0 / 반지름 50;
		Circle c3 = new Circle();
		c3.r = 50;
		c3.draw();
		
		//원점 300, 300 / 반지름 70;
		Point circle_center2 = new Point(300, 300);
		Circle c4 = new Circle(circle_center2, 70);
		c4.draw();
		
		// Point 배열 (100, 100 / 200, 200 / 300, 300 )	// r = 50, 60, 70
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
		
		// Point 배열 (100, 100 / 200, 200 / 300, 300 ) // r = 50, 60, 70
		// 강사님 ver.
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

// 도형그리기 클래스
class Shape {
	String color = "black";
	
	void draw() {
		System.out.println("도형을 그립니다.");
		System.out.println("도형의 색상 : " + color);
	}
} //Shape class

// 좌표점 클래스
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
		return "(x의 좌표 : " + x + ", y의 좌표 : " + y + ")";
	}
} // Point class

// 원형그리기 클래스
class Circle extends Shape { //상속관계
	Point center; 	//포함관계
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
		System.out.println("원형을 그립니다.");
		System.out.println("(원점 : " + center.x + ", " + center.y + " / 반지름 : " + r + " / 색상 : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle extends Shape {	//상속관계
	Point[] p = new Point[3]; //포함관계
	
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
		System.out.println("삼각형을 그립니다.");
		System.out.println("(좌표1 : " + p[0].getXY() + " / 좌표2 : " + p[1].getXY()
							+ " / 좌표3 : " + p[2].getXY() + " / 색상 : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class