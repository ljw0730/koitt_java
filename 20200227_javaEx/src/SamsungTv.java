
public class SamsungTv extends Product {

	static int count ;
	
	int product_n = 1000;
	int tv_inch = 55;
	
	{
		count++;
		product_n = count;
	}
	
	SamsungTv() {
		name = "�ＺTV";
		price = 1000;
	}
	
}
