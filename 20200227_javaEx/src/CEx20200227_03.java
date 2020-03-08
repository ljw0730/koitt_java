
public class CEx20200227_03 {

	public static void main(String[] args) {
		// Tv, CaptionTv class와 연결되어 있음
		// 다형성
		
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();
				
		t.power();
		t.channel = 7;
		t.channelUp();		//8
		t.channelUp();		//9
		t.channelDown();	//8
		System.out.println("Tv 객체 채널 : " + t.channel);

		c.power();
		c.channel = 11;
		c.channelDown();	//10
		c.channelDown();	//9
		c.caption();
		c.text = "겨울왕국2 영화자막이 추가 되었습니다.";
		c.caption();
		System.out.println("CaptionTv 객체 채널 : " + c.channel);
		
		// 다형성
		Tv t2 = new CaptionTv();	// 조상타입의 참조변수로 자손타입의 객체를 넣을 수는 있지만
		//CaptionTv c2 = new Tv();	//에러 - 자손타입의 참조변수로 조상타입의 객체를 넣을 수는 없다.
		
		t2.power();
		t2.channel = 7;
		// t2.text // 에러 - Tv에 text에 대한 공간은 있지만 접근이 불가능 하다.
		// Tv 클래스의 변수와 메소드는 사용이 가능하지만
		// CaptionTv의 변수와 메소드는 사용 할 수 없다.
		
		CaptionTv c2 = new CaptionTv();
		t2 = c2;
		//c2 = t2; 에러
		c2 = (CaptionTv)t2; //사용하려면 형변환을 해주면된다.
							//기능이 많은 자식타입으로 가기 때문에 형변환을 해주어야 한다.
		
	}

}
