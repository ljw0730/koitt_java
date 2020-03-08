import java.util.Scanner;

public class CEx20200225_02 {

	public static void main(String[] args) {
		
		// scan-> 좌표 60, 50 -> 반지름 100
		// 2개를 더 넣으세요.
		Scanner scan = new Scanner(System.in);
		
		Circle2[] ccc = new Circle2[3];
		Point2[] ppp = new Point2[3];
		int[]num = new int[3];
		String[] print = { "X 좌표 ", "Y 좌표 ", "반지름 " };
		
		for(int i = 0; i < ccc.length; i++) {
			for(int j = 0; j < num.length; j++) {
				System.out.println(print[j] + "값을 입력하세요. : ");
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

// 도형그리기 클래스
class Shape2 {
	String color = "black";
	
	void draw() {
		System.out.println("도형을 그립니다.");
		System.out.println("도형의 색상 : " + color);
	}
} //Shape class

// 좌표점 클래스
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
		return "(x의 좌표 : " + x + ", y의 좌표 : " + y + ")";
	}
} // Point class

// 원형그리기 클래스
class Circle2 extends Shape2 { //상속관계
	Point2 center; 	//포함관계
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
		System.out.println("원형을 그립니다.");
		System.out.println("(원점 : " + center.x + ", " + center.y + " / 반지름 : " + r + " / 색상 : " + color+ ")");
		System.out.println("=========================================================");
	}
} // Circle Class

class Triangle2 extends Shape2 {	//상속관계
	Point2[] p = new Point2[3]; //포함관계
	
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
		System.out.println("삼각형을 그립니다.");
		System.out.println("(좌표1 : " + p[0].getXY() + " / 좌표2 : " + p[1].getXY()
							+ " / 좌표3 : " + p[2].getXY() + " / 색상 : " + color + ")");
		System.out.println("=========================================================");
	}
} // Triangle class