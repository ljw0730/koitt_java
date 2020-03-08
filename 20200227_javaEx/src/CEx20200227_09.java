import java.util.Scanner;

public class CEx20200227_09 {

	public static void main(String[] args) {
		// 변신 카 프로그램
		// 1) 소방차 생성 -- 클래스로 정의 		// 물이 발사 출력
		// 2) 앰블런스 생성 -- 클래스로 정의	// 사이렌 출력
		// 3) 트럭 생성 -- 클래스로 정의		// 물건이동 출력
		// ----------------
		// 4) 기본차로 변신 -- 메소드로 정의	// 기본차 입니다. 출력
		// 5) 원래 생성된 차로 변신 -- 메소드로 정의
		// 6) 종료
		// ver 강사님
		
		Scanner scan = new Scanner(System.in);
		
		FireEngine6 fire = new FireEngine6();
		Ambulance6 amb = new Ambulance6();;
		Truck6 tru = new Truck6();
		Car6 car = null;
		
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("소방차 생성!!");
					fire.water();
					car = fire;
										
					break;
					
				case 2:
					System.out.println("앰블런스 생성!!");
					amb.siren();
					car = amb;
					
					break;
					
				case 3:
					System.out.println("트럭 생성!!");
					tru.stuff();
					car = tru;
					
					break;
					
				case 4:
					System.out.println("기본차로 변신!!");
					car = fire;
					car.drive();
					
					break;
					
				case 5:
					System.out.println("원래 형태의 차로 변신!!");
					if(car instanceof FireEngine6) {
						System.out.println("소방차로 다시 변신");
						fire = (FireEngine6)car;
						fire.water();
					}
					if(car instanceof Ambulance6) {
						System.out.println("앰블런스로 다시 변신");
						amb = (Ambulance6)car;
						amb.siren();
					}
					if(car instanceof Truck6) {
						System.out.println("트럭으로 다시 변신");
						tru = (Truck6)car;
						tru.stuff();
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
	
	
}

class Car6 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
	void basic_car() {
		System.out.println("기본차로 변신되었습니다.");
	}
	
}

class FireEngine6 extends Car6 {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance6 extends Car6 {
	
	void siren() {
		System.out.println("사이렌이 울립니다. 삐뽀삐뽀");
	}
	
	void move() {
		System.out.println("사람을 옮깁니다.");
	}
	
}

class Truck6 extends Car6 {
	
	void stuff( ) {
		System.out.println("물건을 옮깁니다.");
	}
	
}