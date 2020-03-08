import java.util.Scanner;

public class CEx20200227_09 {

	public static void main(String[] args) {
		// ���� ī ���α׷�
		// 1) �ҹ��� ���� -- Ŭ������ ���� 		// ���� �߻� ���
		// 2) �ں��� ���� -- Ŭ������ ����	// ���̷� ���
		// 3) Ʈ�� ���� -- Ŭ������ ����		// �����̵� ���
		// ----------------
		// 4) �⺻���� ���� -- �޼ҵ�� ����	// �⺻�� �Դϴ�. ���
		// 5) ���� ������ ���� ���� -- �޼ҵ�� ����
		// 6) ����
		// ver �����
		
		Scanner scan = new Scanner(System.in);
		
		FireEngine6 fire = new FireEngine6();
		Ambulance6 amb = new Ambulance6();;
		Truck6 tru = new Truck6();
		Car6 car = null;
		
		int select = 0;
		
		Loop1: while(true) {
			select = main_print(scan);
			
			switch (select) {
				case 1:
					System.out.println("�ҹ��� ����!!");
					fire.water();
					car = fire;
										
					break;
					
				case 2:
					System.out.println("�ں��� ����!!");
					amb.siren();
					car = amb;
					
					break;
					
				case 3:
					System.out.println("Ʈ�� ����!!");
					tru.stuff();
					car = tru;
					
					break;
					
				case 4:
					System.out.println("�⺻���� ����!!");
					car = fire;
					car.drive();
					
					break;
					
				case 5:
					System.out.println("���� ������ ���� ����!!");
					if(car instanceof FireEngine6) {
						System.out.println("�ҹ����� �ٽ� ����");
						fire = (FireEngine6)car;
						fire.water();
					}
					if(car instanceof Ambulance6) {
						System.out.println("�ں����� �ٽ� ����");
						amb = (Ambulance6)car;
						amb.siren();
					}
					if(car instanceof Truck6) {
						System.out.println("Ʈ������ �ٽ� ����");
						tru = (Truck6)car;
						tru.stuff();
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
	
	
}

class Car6 {
	
	String color;
	int door;
	
	void drive( ) {
		System.out.println("������ ������ ���~~");
	}
	
	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
	void basic_car() {
		System.out.println("�⺻���� ���ŵǾ����ϴ�.");
	}
	
}

class FireEngine6 extends Car6 {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance6 extends Car6 {
	
	void siren() {
		System.out.println("���̷��� �︳�ϴ�. �߻ǻ߻�");
	}
	
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
	
}

class Truck6 extends Car6 {
	
	void stuff( ) {
		System.out.println("������ �ű�ϴ�.");
	}
	
}