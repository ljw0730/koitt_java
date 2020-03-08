
public class Tv2 {
	// volume 변수를 만들고
	// 메인메소드에서 변수에 10을 저장해 보세요.
	// volume Up, Down을 만들어 보세요.
	
	int volume = 0;
	
	void volume_up() {
		System.out.println("볼륨을 증가시킵니다.");
		volume++;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void volume_down() {
		System.out.println("볼륨을 감소시킵니다.");
		volume--;
		System.out.println("현재 볼륨 : " + volume);
	}
}
