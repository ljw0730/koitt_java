
public class CEx20200227_07 {

	public static void main(String[] args) {
		// �ں��� ��ü 1�� ����
		// ī��ü�� �ְ�
		// ����̺�޼ҵ� ����
		// ����ȯ �ؼ�
		// �ں��� 1�� ��ü�� �߰��ؾ� �־
		// ���̷��� ������ ������.
		
		Ambulance4 a1 = new Ambulance4();
		Car4 c1 = null;
		
		c1 = a1;
		c1.drive();
		
		Ambulance4 a2 = null;
		
		a2 = (Ambulance4)c1;
		a2.siren();
		
	}

}

class Car4 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
}

class FireEngine4 extends Car4 {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance4 extends Car4 {
	
	void siren() {
		System.out.println("���̷��� �︳�ϴ�. �߻ǻ߻�");
	}
	
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
	
}

class Truck4 extends Car4 {
	
	void stuff( ) {
		System.out.println("������ �ű�ϴ�.");
	}
	
}