
public class CEx20200227_05 {

	public static void main(String[] args) {
		
		Car2 c = new Car2();
		Car2 c2 = null;
		
		FireEngine2 f = null;
		FireEngine2 f2 = new FireEngine2();
		
		c.drive();
		c2 = f2;
		
//		f = (FireEngine2)c;	//코드 자체는 에러가 안나지만 실행시 에러
		// c이미 객체를 선언했기 때문에... 이를 풀어 얘기하면
		// FireEngine2 f = new Car2();
		// 자손의 참조변수로 조상의 객체를 선언하는 것은 안된다.
		// 조상에서 자손으로 갈때 조상이 new로 선언이 되어있다면 안되고
		// null로 선언이 되었다면 가능하다.
		
		f = (FireEngine2)c2;
		// 초기에 null로 선언된 Car2 객체에 FireEngine2 의 주소를 넘겨주었기 때문에
		// f에 다시 c2의 주소를 넘겨주면 결국에는 f2의 주소를 념겨 주는 것이므로 사용이 가능하다.
		f.water();
		
		c = f2; // c는 f2의 주소를 넣어주기 때문에 new Car2()를 보는것이 아니라 new FireEngine2() 를 바라본다. 
		
	}

}

class Car2 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("엑셀을 밟으면 출발~~");
	}
	
	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
}

class FireEngine2 extends Car2 {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}