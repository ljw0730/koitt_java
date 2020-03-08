import java.util.Scanner;

public class CEx20200225_02 {

	public static void main(String[] args) {
		
		// scan-> ��ǥ 60, 50 -> ������ 100
		// 2���� �� ��������.
		Scanner scan = new Scanner(System.in);
		
		Circle2[] ccc = new Circle2[3];
		Point2[] ppp = new Point2[3];
		int[]num = new int[3];
		String[] print = { "X ��ǥ ", "Y ��ǥ ", "������ " };
		
		for(int i = 0; i < ccc.length; i++) {
			for(int j = 0; j < num.length; j++) {
				System.out.println(print[j] + "���� �Է��ϼ���. : ");
				num[j] = scan.nextInt();
			}
			
			ppp[i] = new Point2(num[0], num[1]);
			ccc[i] = new Circle2(ppp[i], num[2]);
		}
		for(int i = 0; i <num.length; i++) {
			ccc[i].draw();
		}
		
		scan.close();
		
		
	} // main

} // CEx20200225_02 Class

// �����׸��� Ŭ����
class Shape2 {
	String color = "black";
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("������ ���� : " + color);
	}
} //Shape class

// ��ǥ�� Ŭ����
class Point2 {
	int x;
	int y;
	
	Point2() {
		this(0, 0);
	}
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(x�� ��ǥ : " + x + ", y�� ��ǥ : " + y + ")";
	}
} // Point class

// �����׸��� Ŭ����
class Circle2 extends Shape2 { //��Ӱ���
	Point2 center; 	//���԰���
	int r;
	
	Circle2() {
		center = new Point2(0, 0);
		r = 100;
	}
	
	Circle2(Point2 center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("(���� : " + center.x + ", " + center.y + " / ������ : " + r + " / ���� : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle2 extends Shape2 {	//��Ӱ���
	Point2[] p = new Point2[3]; //���԰���
	
	Triangle2() {
		this(new Point2(0, 0), new Point2(100, 0), new Point2(0, 100));
//		p[0] = new Point(0, 0);
//		p[1] = new Point(100, 0);
//		p[2] = new Point(0, 100);
	}
	
	Triangle2(Point2[] p) {
		this.p = p;
	}
	
	Triangle2(Point2 p1, Point2 p2, Point2 p3) {
		p = new Point2[] {p1, p2, p3};
 	}
	
	void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.println("(��ǥ1 : " + p[0].getXY() + " / ��ǥ2 : " + p[1].getXY()
							+ " / ��ǥ3 : " + p[2].getXY() + " / ���� : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class