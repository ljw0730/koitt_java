
public class CEx20200227_06 {

	public static void main(String[] args) {
		
		FireEngine3 fe = new FireEngine3();
		
		if(fe instanceof FireEngine3) {
			System.out.println("네. FireEngine 객체가 맞습니다.");
		}
		
		if(fe instanceof Car3) {
			System.out.println("네. Car 객체가 맞습니다.");
		}
		
		if(fe instanceof Object) {
			System.out.println("네. Object 객체가 맞습니다.");
		}
		
	}

}

class Car3 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
}

class FireEngine3 extends Car3 {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance3 extends Car3 {
	
	void siren() {
		System.out.println("사이렌이 울립니다. 삐뽀삐뽀");
	}
	
	void move() {
		System.out.println("사람을 옮깁니다.");
	}
	
}

class Truck3 extends Car3 {
	
	void stuff( ) {
		System.out.println("물건을 옮깁니다.");
	}
	
}