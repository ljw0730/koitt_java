import java.util.Scanner;

public class CEx20200225_04 {

	public static void main(String[] args) {
		// 1. Shape
		// 2. Point
		// 3. Circle
		// 4. Triangle
		// 5. main -> Circle/�⺻������/50, 100, r100
		// 5. main -> Triangle/�⺻������/(30,30 / 70,70 / 100,20)
		
		Point4 p1 = new Point4(50, 100);
		Circle4 c1 = new Circle4(p1, 100);
		c1.draw();
		
		Point4[] p = new Point4[] { new Point4(30, 30), new Point4(70, 70), new Point4(100, 20) };
		Triangle4 t1 = new Triangle4(p);
		t1.draw();
		
		
	} // main

} // CEx20200225_04 Class

// �����׸��� Ŭ����
class Shape4 {
	String color = "black";
	
	void draw() {
		System.out.println(" / (���� : " + color + ")");
	}
	
} //Shape class

// ��ǥ�� Ŭ����
class Point4 {
	int x;
	int y;
	
	Point4() {
		this(0, 0);
	}
	
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(X��ǥ : " + this.x + " / Y��ǥ : " + this.y + ")";
	}
} // Point class

// �����׸��� Ŭ����
class Circle4 extends Shape4 { //��Ӱ���
	Point4 center;
	int r;
	
	Circle4() {
		this(new Point4(0,0), 100);
	}
	
	Circle4(Point4 center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.print(center.getXY() + " / (������ : " + this.r + ")");
		super.draw();
		System.out.println("=============================================================");
	}
} // Circle Class

class Triangle4 extends Shape4 {	//��Ӱ���
	Point4[] p = new Point4[3];
	
	Triangle4() {
		this(new Point4(0,0), new Point4(0,100), new Point4(100,0));
	}
	
	Triangle4(Point4[] p) {
		this.p = p;
	}
	
	Triangle4(Point4 p1, Point4 p2, Point4 p3) {
		 p = new Point4[] { p1, p2, p3 };
	}
	
	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.print("(1����ǥ : " + p[0].getXY() + ", 2����ǥ : " + p[1].getXY()
							+ ", 3����ǥ : " + p[2].getXY() + ")");
		super.draw();
		System.out.println("=============================================================");
	}
} // Triangle class