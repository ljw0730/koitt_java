
public class CEx20200225_07 {

	public static void main(String[] args) {
		Data d = new Data();
		System.out.println(d);
		Data2 d2 = new Data2();
		System.out.println(d2);
	}

}

class Data {
	int x;
	int y;
	
	Data() {
		x = 10;
		y = 20;
	}
	
	public String toString() {
		
		return "x의 값 : " + x + " y의 값 : " + y;
	}
}

class Data2 {
	int x;
	int y;
	
	Data2() {
		x = 10;
		y = 20;
	}
}
