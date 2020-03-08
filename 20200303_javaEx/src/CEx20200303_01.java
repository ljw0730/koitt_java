
public class CEx20200303_01 {

	public static void main(String[] args) {
		// Unit class와 연결되어 있음
		// Medic class와 연결되어 있음
		// Vulture class와 연결되어 있음
		// Loadable interface와 연결되어 있음
		
		

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
		System.out.println("좌표 : " + x + ", " + y);
	}
}

class Marine extends GroundUnit implements Tran{
	
//	final int transit = 3;
	Marine() {
		super(3);
	}
	
	void move(int x, int y) {
		System.out.println("마린이 x: " + x + " / y: " + y + "좌표로 이동합니다.");
	}
	
	void stimPack( ) {}
}

class Tank extends GroundUnit implements Tran{
	
//	final int transit = 4;
	
	Tank() {
		super(4);
	}
	
	void move(int x, int y) {
		System.out.println("탱크가 x: " + x + " / y: " + y + "좌표로 이동합니다.");
	}
	
	void changMode() {}
}

class dropship extends Unit {

	int transit_space; 	// 운송할수 있는 공간 7까지
	GroundUnit[] ground = new GroundUnit[7];
	int i = 0;
	
	void move(int x, int y) {
		System.out.println("드랍쉽이 x: " + x + " / y: " + y + "좌표로 이동합니다.");
	}
	
	void transport(Tran t) {
		GroundUnit g = new GroundUnit();
		if(t instanceof GroundUnit) {
			if((transit_space += g.transit) <= 7) {
				System.out.println("태웠습니다.");
				ground[i] = g;
				i++;
			}
			else {
				System.out.println("공간이 없어 태울 수 없습니다.");
				transit_space -= g.transit;
			}
		}
	}
	
	void load() {
		
	}
	void unload() {}
}