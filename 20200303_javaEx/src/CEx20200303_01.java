
public class CEx20200303_01 {

	public static void main(String[] args) {
		// Unit class�� ����Ǿ� ����
		// Medic class�� ����Ǿ� ����
		// Vulture class�� ����Ǿ� ����
		// Loadable interface�� ����Ǿ� ����
		
		

	} //main

} // class

interface Tran {	}

class GroundUnit extends Unit {
	int transit;
	
	GroundUnit() {}
	GroundUnit(int transit) {
		this.transit = transit;
	}
	
	void move(int x, int y) {
		System.out.println("��ǥ : " + x + ", " + y);
	}
}

class Marine extends GroundUnit implements Tran{
	
//	final int transit = 3;
	Marine() {
		super(3);
	}
	
	void move(int x, int y) {
		System.out.println("������ x: " + x + " / y: " + y + "��ǥ�� �̵��մϴ�.");
	}
	
	void stimPack( ) {}
}

class Tank extends GroundUnit implements Tran{
	
//	final int transit = 4;
	
	Tank() {
		super(4);
	}
	
	void move(int x, int y) {
		System.out.println("��ũ�� x: " + x + " / y: " + y + "��ǥ�� �̵��մϴ�.");
	}
	
	void changMode() {}
}

class dropship extends Unit {

	int transit_space; 	// ����Ҽ� �ִ� ���� 7����
	GroundUnit[] ground = new GroundUnit[7];
	int i = 0;
	
	void move(int x, int y) {
		System.out.println("������� x: " + x + " / y: " + y + "��ǥ�� �̵��մϴ�.");
	}
	
	void transport(Tran t) {
		GroundUnit g = new GroundUnit();
		if(t instanceof GroundUnit) {
			if((transit_space += g.transit) <= 7) {
				System.out.println("�¿����ϴ�.");
				ground[i] = g;
				i++;
			}
			else {
				System.out.println("������ ���� �¿� �� �����ϴ�.");
				transit_space -= g.transit;
			}
		}
	}
	
	void load() {
		
	}
	void unload() {}
}