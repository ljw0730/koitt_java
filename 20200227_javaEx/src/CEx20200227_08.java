import java.util.Scanner;

public class CEx20200227_08 {

	public static void main(String[] args) {
		// ���� ī ���α׷�
		// 1) �ҹ��� ���� -- Ŭ������ ���� 		// ���� �߻� ���
		// 2) �ں��� ���� -- Ŭ������ ����	// ���̷� ���
		// 3) Ʈ�� ���� -- Ŭ������ ����		// �����̵� ���
		// ----------------
		// 4) �⺻���� ���� -- �޼ҵ�� ����	// �⺻�� �Դϴ�. ���
		// 5) ���� ������ ���� ���� -- �޼ҵ�� ����
		
		Scanner scan = new Scanner(System.in);
		
		FireEngine5 f = null;
		Ambulance5 a = null;
		Truck5 t = null;
		Car5 c1 = null;
		Car5 c2 = null;
		Car5 c3 = null;
		
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("�ҹ��� ����!!");
					f = fireEngine_creation(f);
					f.water();
					
					break;
					
				case 2:
					System.out.println("�ں��� ����!!");
					a = ambulance_creation(a);
					a.siren();
					
					break;
					
				case 3:
					System.out.println("Ʈ�� ����!!");
					t = truck_creation(t);
					t.stuff();
					
					break;
					
				case 4:
					System.out.println("�⺻���� ����!!");
					
					if(f != null) {
						c1 = basic_transformation(f, c1);
						c1.basic_car("�ҹ���");
						
					}
					if(a != null) {
						c2 = basic_transformation(a, c2);
						c2.basic_car("�ں���");
					}
					if(t != null) {
						c3 = basic_transformation(t, c3);
						c3.basic_car("Ʈ��");
					}
					
					break;
					
				case 5:
					System.out.println("���� ������ ���� ����!!");
					
					if(c1 != null) {
						System.out.println("�⺻�� -> �ҹ���");
						f = (FireEngine5)c1;
						f.water();
					}
					if(c2 != null) {
						System.out.println("�⺻�� -> �ں����");
						a = (Ambulance5)c2;
						a.siren();
					}
					if(c3 != null) {
						System.out.println("�⺻�� -> Ʈ��");
						t = (Truck5)c3;
						t.stuff();
					}
					
					break;
					
				case 6:
					System.out.println("���α׷��� �����մϴ�.");
					break Loop1;
			}
		}
	}
	
	static int main_print(Scanner scan) {
		int select = 0;
		System.out.println("==========================");
		System.out.println("[    ���� ī ���α׷�    ]");
		System.out.println(" 1) �ҹ��� ���� ");
		System.out.println(" 2) �ں��� ���� ");
		System.out.println(" 3) Ʈ�� ���� ");
		System.out.println("--------------------------");
		System.out.println(" 4) �⺻�� ���� ");
		System.out.println(" 5) ���� ������ ���� ���� ");
		System.out.println(" 6) ���� ");
		System.out.println("--------------------------");
		System.out.print("���ϴ� ��ȣ�� �Է��� �ּ��� : ");
		select = scan.nextInt();
		scan.nextLine();
		
		return select;
	}
	
	static FireEngine5 fireEngine_creation(FireEngine5 ff) {
		ff = new FireEngine5();
		return ff;
	}
	
	static Ambulance5 ambulance_creation(Ambulance5 aa) {
		aa = new Ambulance5();
		return aa;
	}
	
	static Truck5 truck_creation(Truck5 tt) {
		tt = new Truck5();
		return tt;
	}

	static Car5 basic_transformation(Object o, Car5 c) {
		if (o instanceof FireEngine5) {
			System.out.println("�ҹ��� -> �⺻��");
			c = (Car5)o;
			return c;
		}else if(o instanceof Ambulance5) {
			System.out.println("�ں��� -> �⺻��");
			c = (Car5)o;
			return c;
		}else if(o instanceof Truck5) {
			System.out.println("Ʈ�� -> �⺻��");
			c = (Car5)o;
			return c;
		}
		return c;
	}
		
}

class Car5 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
	void basic_car(String s) {
		System.out.println(s + "(��)�� �⺻���� ���ŵǾ����ϴ�.");
	}
	
}

class FireEngine5 extends Car5 {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance5 extends Car5 {
	
	void siren() {
		System.out.println("���̷��� �︳�ϴ�. �߻ǻ߻�");
	}
	
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
	
}

class Truck5 extends Car5 {
	
	void stuff( ) {
		System.out.println("������ �ű�ϴ�.");
	}
	
}