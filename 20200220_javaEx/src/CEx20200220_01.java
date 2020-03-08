
public class CEx20200220_01 {
	
	public static void main(String[] args) {
		
		Data d = new Data();	// 객체선언
		d.x = 10;
		d.y = 100;
		
		change(d.x);
		System.out.println("main1 d.x : " + d.x);
		
		System.out.println("===============");
		
		change2(d);
		System.out.println("main2 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.x = change3(d.x);
		System.out.println("main3 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.y = 100;
		change4(d);
		System.out.println("main4 d.x : " + d.x);
		
		System.out.println("===============");
		
		d.x = 10;
		d.y = 100;
		d.y = change5(d.x, d.y);
		System.out.println("main5 d.y : " + d.y);
		
		System.out.println("===============");
		
		d.y = 100;
		change6(d);
		System.out.println("main6 d.y : " + d.y);
		
	}	// main
	
	// 매개변수에 의해 x만 1000으로 바뀌고 d에는 영향을 주지 않는다.
	static void change(int x) {
		x = 1000;
		System.out.println("change : " + x);
	}
	
	// 매개변수에 주소를 저장 하기 때문에 main의 d에 영향을 준다.
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("change2 : " + d.x);
	}
	
	// 리턴을 이용하여 d.x의 값을 변경한다.
	static int change3(int x) {
		x = 1000;
		System.out.println("change3 : " + x);
		return x;
	}
	
	// 매개변수에 주소를 저장 하기 때문에 main의 d에 영향을 준다.
	static void change4(Data d) {
		d.x = d.x + d.y;
		System.out.println("change4 : " + d.x);
	}
	
	// 리턴을 이용하여 d.y의 값을 변경한다.
	static int change5(int a, int b) {
		int result = 0;
		result = a-b;
		System.out.println("change5 : " + result);
		return result;
		
	}
	
	// main d의 주소값을 이용하여 d.y의 값을 변경한다.
	static void change6(Data d) {
		d.y = 2000;
		System.out.println("change6 : " + d.y);
	}
	
}	// class


class Data {
	int x;
	int y;	
}