
public class CEx20200227_06 {

	public static void main(String[] args) {
		
		FireEngine3 fe = new FireEngine3();
		
		if(fe instanceof FireEngine3) {
			System.out.println("��. FireEngine ��ü�� �½��ϴ�.");
		}
		
		if(fe instanceof Car3) {
			System.out.println("��. Car ��ü�� �½��ϴ�.");
		}
		
		if(fe instanceof Object) {
			System.out.println("��. Object ��ü�� �½��ϴ�.");
		}
		
	}

}

class Car3 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
}

class FireEngine3 extends Car3 {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance3 extends Car3 {
	
	void siren() {
		System.out.println("���̷��� �︳�ϴ�. �߻ǻ߻�");
	}
	
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
	
}

class Truck3 extends Car3 {
	
	void stuff( ) {
		System.out.println("������ �ű�ϴ�.");
	}
	
}