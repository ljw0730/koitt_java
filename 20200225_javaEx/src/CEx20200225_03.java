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

// �����׸��� Ŭ����
class Shape3 {
	String color = "black";
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("������ ���� : " + color);
	}
} //Shape class

// ��ǥ�� Ŭ����
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
		return "(x�� ��ǥ : " + x + ", y�� ��ǥ : " + y + ")";
	}
} // Point class

// �����׸��� Ŭ����
class Circle3 extends Shape3 { //��Ӱ���
	Point3 center; 	//���԰���
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
		System.out.println("������ �׸��ϴ�.");
		System.out.println("(���� : " + center.x + ", " + center.y + " / ������ : " + r + " / ���� : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle3 extends Shape3 {	//��Ӱ���
	Point3[] p = new Point3[3]; //���԰���
	
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
		System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.println("(��ǥ1 : " + p[0].getXY() + " / ��ǥ2 : " + p[1].getXY()
							+ " / ��ǥ3 : " + p[2].getXY() + " / ���� : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class