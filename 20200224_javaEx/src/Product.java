
public class Product {
	
	static int count;
	int serialNo;
	String color;		// white, black, red
	int tvInch;			// 40,50,72
	String standard;	// lcd, led, oled
	
	// �����ڿ� ���������� �ʱ�ȭ�ϴ� �ҽ����� �����ϰ� �ϱ� ���� �ʱ�ȭ ����� ���
	// �ʱ�ȭ ����� ����ϸ� ��� �����ڿ� �������� ���� �ȴ�.
	// �ʱ�ȭ ���
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
