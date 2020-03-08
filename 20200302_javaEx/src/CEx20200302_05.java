
public class CEx20200302_05 {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		m1.move(10, 10);
		
		Unit[] group = new Unit[10];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();

		for(int i = 0; i < group.length; i++) {
			if(group[i] == null) {
				break;
			}
			group[i].move(1000, 1000);
		}
		
	}

}

abstract class Unit {
	int x, y;
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("���� ��ġ���� ����");
	}
	
	void get_time(int total, int sec) {
		int total_time = (int)total * sec;
		int hour = total_time/3600;
		int remainder = total_time%3600;
		int minute = remainder/60;
		int second = remainder%60;
	
		System.out.println("�ɸ��� �ð� : " + hour + "�� " + minute + "�� " + second + "��");
	}

}

class Marine extends Unit {
	
	void move(int x, int y) {
		int total = x+y;
		
		System.out.println("Marine - " + x + ", " + y + " : ������ �̵�. 1m�� 4�ʼҿ�");
		// 1m �̵� - 4��;
		get_time(total, 4);
		
	}
	
	void stimPack() {	}
}

class Tank extends Unit {
	void move(int x, int y) {
		int total = x+y;
		
		System.out.println("Tank - " + x + ", " + y + " : ������ �̵�. 1m�� 6�ʼҿ�");
		// 1m �̵� - 6��;
		get_time(total, 6);
		
	}
	
	void changeMode() {	}
}

class Dropship extends Unit {
	
	void move(int x, int y) {
		double pow_x = Math.pow(x, 2);
		double pow_y = Math.pow(y, 2);
		double total = Math.sqrt(pow_x + pow_y);
		
		System.out.println("Dropship - " + x + ", " + y + " : �ϴ����� �̵�. 1m�� 2�ʼҿ�");
		// 1m�̵� - 2��
		get_time((int)total, 2);
		
	}
	
	void load() {	}
	
	void unload() {	}
}