
public class Tv {
	String color;	// tv�� ����
	boolean power;	// tv ����
	int channel;	// ä��
	
	void pwower() {
		if(power == true) {	// �Ŀ� on�� ����
			System.out.println("������ off �մϴ�.");
		}
		else {	// �Ŀ� off�� ����
			System.out.println("������ on �մϴ�.");
		}
		
		power = !power;
	}
	
	void channelUp() {
		System.out.println("ä���� 1 ���� �մϴ�.");
		channel++;
		System.out.println("����ä�� : " + channel);
	}
	
	void channelDown() {
		System.out.println("ä���� 1 ���� �մϴ�.");
		channel--;
		System.out.println("����ä�� : " + channel);
	}
}
