
public class CEx20200227_04 {

	public static void main(String[] args) {
		
		Car c = new Car();
		FireEngine f = new FireEngine();
		
		Car c2 = new FireEngine();	// ������
//		FireEngine f2 = new Car();	// ����
		FireEngine f2 = new FireEngine();
		c = f2;
		f2 = (FireEngine)c;
		
		FireEngine f3 = null;
		f3 = (FireEngine)c;		//int a = 0;	long b = 1L
								//b = a;	a = (int)b;
		f3.water();
		
		System.out.println("������");
		c.drive();
		c.stop();
//		c.water();	//c�� water()�� ����.
		
		System.out.println("�ҹ���");
		f.drive();
		f.stop();
		f.water();
		
	}

}

class Car {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
}

class FireEngine extends Car {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}