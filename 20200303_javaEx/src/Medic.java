
public class Medic extends GroundUnit implements Tran {

	Medic() {
		super(2);
	}
	
	@Override
	void move(int x, int y) {
		System.out.println("메딕이 x: " + x + " / y: " + y + "좌표로 이동합니다.");
	}

}
