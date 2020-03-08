
public class CEx20200217_04 {

	public static void main(String[] args) {
	// Tv Class와 연결되어 있음	
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv2 tt1 = new Tv2();
				
		t1.channel = 10;
		t1.channelUp();
		t1.channelDown();
		
		System.out.println(t2.channel);
		
		t2 = t1;
		
		System.out.println(t2.channel);
		
	}

}
