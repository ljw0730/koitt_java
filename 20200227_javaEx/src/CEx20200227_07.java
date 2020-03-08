
public class CEx20200227_07 {

	public static void main(String[] args) {
		// 앰블런스 객체 1개 생성
		// 카객체에 넣고
		// 드라이브메소드 실행
		// 형변환 해서
		// 앰블런스 1개 객체를 추가해어 넣어서
		// 사이렌을 실행해 보세요.
		
		Ambulance4 a1 = new Ambulance4();
		Car4 c1 = null;
		
		c1 = a1;
		c1.drive();
		
		Ambulance4 a2 = null;
		
		a2 = (Ambulance4)c1;
		a2.siren();
		
	}

}

class Car4 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
}

class FireEngine4 extends Car4 {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance4 extends Car4 {
	
	void siren() {
		System.out.println("사이렌이 울립니다. 삐뽀삐뽀");
	}
	
	void move() {
		System.out.println("사람을 옮깁니다.");
	}
	
}

class Truck4 extends Car4 {
	
	void stuff( ) {
		System.out.println("물건을 옮깁니다.");
	}
	
}