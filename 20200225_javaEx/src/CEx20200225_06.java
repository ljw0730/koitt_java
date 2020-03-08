
public class CEx20200225_06 {

	public static void main(String[] args) {
		CaptionTv c1 = new CaptionTv();
		c1.channel = 0;
		c1.channelDown();
		System.out.println("���� ä�� : " + c1.channel);
		c1.channel = 100;
		c1.channelUp();
		System.out.println("���� ä�� : " + c1.channel);
		c1.channel = 7;
		c1.channelUp();		//8
		c1.channelUp();		//9
		c1.channelDown();	//8
		System.out.println("���� ä�� : " + c1.channel);
		c1.caption = true;
		c1.displayCap("Hello JAVA");
	}

}

class Tv {
	boolean power; // ���� - on-true, off-false
	int channel;
	int volume;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
		
		// 100���� �Ѿ�� �ٽ�0������ ���ư�����
		if(channel > 100) {
			channel = 0;
		}
		
	}
	
	void channelDown() {
		--channel;

		// -1 �̸� 100���� ���ư�����
		if(channel < 0) {
			channel = 100;
		}
	}
}

class CaptionTv extends Tv {
	
	boolean caption;
	
	void displayCap(String text) {
		if(caption == true) {
			System.out.println("caption On");
			System.out.println(text);
		}
	}
}
