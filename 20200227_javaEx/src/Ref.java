
public class Ref extends Product {

	static int count1 ;
	
	int product_n = 2000;
	
	{
		count1++;
		product_n = count1;
	}
	
	Ref() {
		name = "≥√¿Â∞Ì";
		price = 1500;
	}
	
}
