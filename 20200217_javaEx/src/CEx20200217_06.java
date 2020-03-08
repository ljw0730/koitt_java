
public class CEx20200217_06 {
	public static void main(String[] args) {
		// Tv2 Class와 연결되어 있음
		
		Tv2 t2 = new Tv2();
		
		t2.volume = 10;
		System.out.println("현재 볼륨 : " + t2.volume);
		System.out.println("====================");
		
		t2.volume_up();
		t2.volume_up();
		t2.volume_up();
		t2.volume_up();
		
		t2.volume_down();
		
	}
}
