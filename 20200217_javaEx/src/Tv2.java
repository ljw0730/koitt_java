
public class Tv2 {
	// volume ������ �����
	// ���θ޼ҵ忡�� ������ 10�� ������ ������.
	// volume Up, Down�� ����� ������.
	
	int volume = 0;
	
	void volume_up() {
		System.out.println("������ ������ŵ�ϴ�.");
		volume++;
		System.out.println("���� ���� : " + volume);
	}
	
	void volume_down() {
		System.out.println("������ ���ҽ�ŵ�ϴ�.");
		volume--;
		System.out.println("���� ���� : " + volume);
	}
}
