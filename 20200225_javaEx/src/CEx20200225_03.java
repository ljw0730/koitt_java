import java.util.Scanner;

public class CEx20200225_03 {

	public static void main(String[] args) {
		
		Triangle3 t1 = new Triangle3();
		t1.draw();
		
		// 20,20 / 40,100 / 30,10
		Point3[] p = new Point3[] { new Point3(20, 20), new Point3(40, 100), new Point3(30, 10) };
		Triangle3 t2 = new Triangle3(p);
		t2.draw();
		
	} // main

} // CEx20200225_03 Class

// 도형그리기 클래스
class Shape3 {
	String color = "black";
	
	void draw() {
		System.out.println("도형을 그립니다.");
		System.out.println("도형의 색상 : " + color);
	}
} //Shape class

// 좌표점 클래스
class Point3 {
	int x;
	int y;
	
	Point3() {
		this(0, 0);
	}
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(x의 좌표 : " + x + ", y의 좌표 : " + y + ")";
	}
} // Point class

// 원형그리기 클래스
class Circle3 extends Shape3 { //상속관계
	Point3 center; 	//포함관계
	int r;
	
	Circle3() {
		center = new Point3(0, 0);
		r = 100;
	}
	
	Circle3(Point3 center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("원형을 그립니다.");
		System.out.println("(원점 : " + center.x + ", " + center.y + " / 반지름 : " + r + " / 색상 : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle3 extends Shape3 {	//상속관계
	Point3[] p = new Point3[3]; //포함관계
	
	Triangle3() {
		this(new Point3(0, 0), new Point3(100, 0), new Point3(0, 100));
//		p[0] = new Point(0, 0);
//		p[1] = new Point(100, 0);
//		p[2] = new Point(0, 100);
	}
	
	Triangle3(Point3[] p) {
		this.p = p;
	}
	
	Triangle3(Point3 p1, Point3 p2, Point3 p3) {
		p = new Point3[] {p1, p2, p3};
 	}
	
	void draw() {
		System.out.println("삼각형을 그립니다.");
		System.out.println("(좌표1 : " + p[0].getXY() + " / 좌표2 : " + p[1].getXY()
							+ " / 좌표3 : " + p[2].getXY() + " / 색상 : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class