
public class CEx20200302_06 {

	public static void main(String[] args) {
		Marine1 m1 = new Marine1();
		Tank1 t1 = new Tank1();
		SCV s1 = new SCV();
		Dropship1 d1 = new Dropship1();

		m1.hitPoint -= 10;	// 마린 데미지 10 받음 : 40-10 = 30;
		System.out.println("마린 데미지 후 체력 : " + m1.hitPoint);
		t1.hitPoint -= 100; // 탱크 데미지 100 받음 : 150-100 = 50;
		System.out.println("탱크 데미지 후 체력 : " + t1.hitPoint);
		d1.hitPoint -= 60; // 드랍쉽 데미지 60 받음 : 100-60 = 30;
		System.out.println("드랍쉽 데미지 후 체력 : " + d1.hitPoint);
		
		
		s1.repair(t1);	// SCV 수리
		s1.repair(d1);
		//s1.repair(m1);	// SCV 수리
							// 인터페이스 Repairable를 상속받지 못하였으므로
							// 수리가 불가능
		
		System.out.println("탱크 SCV수리 후 체력 : " + t1.hitPoint);
		System.out.println("마린 SCV수리 후 체력 : " + m1.hitPoint);
		System.out.println("드랍쉽 SCV수리 후 체력: " + d1.hitPoint);
		
	}
}

interface Repairable{
	
}

class Unit1 {
	int hitPoint;
	final int MAX_HP;
	
	Unit1(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit1 {
	
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit1 {
	
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank1 extends GroundUnit implements Repairable {
	Tank1() {
		super(150);
		hitPoint = MAX_HP;
	}
}

class Marine1 extends GroundUnit {
	Marine1() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class Dropship1 extends AirUnit implements Repairable {
	Dropship1() {
		super(100);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		Unit1 u = (Unit1)r;
		 while(u.hitPoint != u.MAX_HP) {
			 u.hitPoint++;
		 }
	}
}
