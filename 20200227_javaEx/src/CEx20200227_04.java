
public class CEx20200227_04 {

	public static void main(String[] args) {
		
		Car c = new Car();
		FireEngine f = new FireEngine();
		
		Car c2 = new FireEngine();	// 다형성
//		FireEngine f2 = new Car();	// 에러
		FireEngine f2 = new FireEngine();
		c = f2;
		f2 = (FireEngine)c;
		
		FireEngine f3 = null;
		f3 = (FireEngine)c;		//int a = 0;	long b = 1L
								//b = a;	a = (int)b;
		f3.water();
		
		System.out.println("깡통차");
		c.drive();
		c.stop();
//		c.water();	//c는 water()가 없음.
		
		System.out.println("소방차");
		f.drive();
		f.stop();
		f.water();
		
	}

}

class Car {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
}

class FireEngine extends Car {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}