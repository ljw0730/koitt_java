import java.util.Scanner;

public class CEx20200227_08 {

	public static void main(String[] args) {
		// 변신 카 프로그램
		// 1) 소방차 생성 -- 클래스로 정의 		// 물이 발사 출력
		// 2) 앰블런스 생성 -- 클래스로 정의	// 사이렌 출력
		// 3) 트럭 생성 -- 클래스로 정의		// 물건이동 출력
		// ----------------
		// 4) 기본차로 변신 -- 메소드로 정의	// 기본차 입니다. 출력
		// 5) 원래 생성된 차로 변신 -- 메소드로 정의
		
		Scanner scan = new Scanner(System.in);
		
		FireEngine5 f = null;
		Ambulance5 a = null;
		Truck5 t = null;
		Car5 c1 = null;
		Car5 c2 = null;
		Car5 c3 = null;
		
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("소방차 생성!!");
					f = fireEngine_creation(f);
					f.water();
					
					break;
					
				case 2:
					System.out.println("앰블런스 생성!!");
					a = ambulance_creation(a);
					a.siren();
					
					break;
					
				case 3:
					System.out.println("트럭 생성!!");
					t = truck_creation(t);
					t.stuff();
					
					break;
					
				case 4:
					System.out.println("기본차로 변신!!");
					
					if(f != null) {
						c1 = basic_transformation(f, c1);
						c1.basic_car("소방차");
						
					}
					if(a != null) {
						c2 = basic_transformation(a, c2);
						c2.basic_car("앰블런스");
					}
					if(t != null) {
						c3 = basic_transformation(t, c3);
						c3.basic_car("트럭");
					}
					
					break;
					
				case 5:
					System.out.println("원래 형태의 차로 변신!!");
					
					if(c1 != null) {
						System.out.println("기본차 -> 소방차");
						f = (FireEngine5)c1;
						f.water();
					}
					if(c2 != null) {
						System.out.println("기본차 -> 앰블란스");
						a = (Ambulance5)c2;
						a.siren();
					}
					if(c3 != null) {
						System.out.println("기본차 -> 트럭");
						t = (Truck5)c3;
						t.stuff();
					}
					
					break;
					
				case 6:
					System.out.println("프로그램을 종료합니다.");
					break Loop1;
			}
		}
	}
	
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==========================");
		System.out.println("[    변신 카 프로그램    ]");
		System.out.println(" 1) 소방차 생성 ");
		System.out.println(" 2) 앰블런스 생성 ");
		System.out.println(" 3) 트럭 생성 ");
		System.out.println("--------------------------");
		System.out.println(" 4) 기본차 변신 ");
		System.out.println(" 5) 원래 형태의 차로 변신 ");
		System.out.println(" 6) 종료 ");
		System.out.println("--------------------------");
		System.out.print("원하는 번호를 입력해 주세요 : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static FireEngine5 fireEngine_creation(FireEngine5 ff) {
		ff = new FireEngine5();
		return ff;
	}
	
	static Ambulance5 ambulance_creation(Ambulance5 aa) {
		aa = new Ambulance5();
		return aa;
	}
	
	static Truck5 truck_creation(Truck5 tt) {
		tt = new Truck5();
		return tt;
	}

	static Car5 basic_transformation(Object o, Car5 c) {
		if (o instanceof FireEngine5) {
			System.out.println("소방차 -> 기본차");
			c = (Car5)o;
			return c;
		}else if(o instanceof Ambulance5) {
			System.out.println("앰블런스 -> 기본차");
			c = (Car5)o;
			return c;
		}else if(o instanceof Truck5) {
			System.out.println("트럭 -> 기본차");
			c = (Car5)o;
			return c;
		}
		return c;
	}
		
}

class Car5 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
	void basic_car(String s) {
		System.out.println(s + "(이)가 기본차로 변신되었습니다.");
	}
	
}

class FireEngine5 extends Car5 {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance5 extends Car5 {
	
	void siren() {
		System.out.println("사이렌이 울립니다. 삐뽀삐뽀");
	}
	
	void move() {
		System.out.println("사람을 옮깁니다.");
	}
	
}

class Truck5 extends Car5 {
	
	void stuff( ) {
		System.out.println("물건을 옮깁니다.");
	}
	
}