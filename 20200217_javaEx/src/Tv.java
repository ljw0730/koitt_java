
public class Tv {
	String color;	// tv의 색상
	boolean power;	// tv 전원
	int channel;	// 채널
	
	void pwower() {
		if(power == true) {	// 파워 on인 상태
			System.out.println("전원을 off 합니다.");
		}
		else {	// 파워 off인 상태
			System.out.println("전원을 on 합니다.");
		}
		
		power = !power;
	}
	
	void channelUp() {
		System.out.println("채널을 1 증가 합니다.");
		channel++;
		System.out.println("현재채널 : " + channel);
	}
	
	void channelDown() {
		System.out.println("채널을 1 감소 합니다.");
		channel--;
		System.out.println("현재채널 : " + channel);
	}
}
