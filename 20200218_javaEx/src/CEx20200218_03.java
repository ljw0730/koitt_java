
public class CEx20200218_03 {

	public static void main(String[] args) {
		// Data class와 연결되어 있음
		
		Data d = new Data();
		d.x = 10;

		System.out.println("1번째 d.x : " + d.x);
		
		// 클래스명.변수명
		Data.y = 50;
		Data.ch();
		
		// 같은 클래스 내에서 변수, 메소드 사용할 경우
		// 클래스 명을 입력하지 않아도 된다.
		change(d.x);
		System.out.println("2번째 d.x : " + d.x);
		
		d.x = change2(d.x);
		System.out.println("3번째 d.x : " + d.x);

		change3(d);
		System.out.println("4번째 d.x : " + d.x);
		
		
	}	// main

	static void change(int x) {
		x = 20;	//int x = d.x
	}

	// 메소드를 이용한 인스턴스 값 변경
	// 첫번재 방법 - return이용
	static int change2(int x) {
		x = 20;	//int x = d.x
		return x;
	}
	
	// 두번째 방법 - 객체주소이용
	static void change3(Data d) {
		d.x = 30;	
	}
	
	
}	// class

