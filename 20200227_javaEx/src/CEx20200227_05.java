
public class CEx20200227_05 {

	public static void main(String[] args) {
		
		Car2 c = new Car2();
		Car2 c2 = null;
		
		FireEngine2 f = null;
		FireEngine2 f2 = new FireEngine2();
		
		c.drive();
		c2 = f2;
		
//		f = (FireEngine2)c;	//�ڵ� ��ü�� ������ �ȳ����� ����� ����
		// c�̹� ��ü�� �����߱� ������... �̸� Ǯ�� ����ϸ�
		// FireEngine2 f = new Car2();
		// �ڼ��� ���������� ������ ��ü�� �����ϴ� ���� �ȵȴ�.
		// ���󿡼� �ڼ����� ���� ������ new�� ������ �Ǿ��ִٸ� �ȵǰ�
		// null�� ������ �Ǿ��ٸ� �����ϴ�.
		
		f = (FireEngine2)c2;
		// �ʱ⿡ null�� ����� Car2 ��ü�� FireEngine2 �� �ּҸ� �Ѱ��־��� ������
		// f�� �ٽ� c2�� �ּҸ� �Ѱ��ָ� �ᱹ���� f2�� �ּҸ� ��� �ִ� ���̹Ƿ� ����� �����ϴ�.
		f.water();
		
		c = f2; // c�� f2�� �ּҸ� �־��ֱ� ������ new Car2()�� ���°��� �ƴ϶� new FireEngine2() �� �ٶ󺻴�. 
		
	}

}

class Car2 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
}

class FireEngine2 extends Car2 {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}