
public class Product {
	
	static int count;
	int serialNo;
	String color;		// white, black, red
	int tvInch;			// 40,50,72
	String standard;	// lcd, led, oled
	
	// 생성자에 공통적으로 초기화하는 소스들을 간결하게 하기 위해 초기화 블록을 사용
	// 초기화 블록을 사용하면 모든 생성자에 공통으로 들어가게 된다.
	// 초기화 블록
	{
		count++;
		serialNo = count;
	}
	
	Product() {
		
	}
	
	Product(String color, int tvInch, String stnadard) {
		this.color = color;
		this.tvInch = tvInch;
		this.standard = stnadard;
	}
	
	Product(String color) {
		
	}
	
}
