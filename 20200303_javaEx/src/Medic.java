
public class Medic extends GroundUnit implements Tran {

	Medic() {
		super(2);
	}
	
	@Override
	void move(int x, int y) {
		System.out.println("�޵��� x: " + x + " / y: " + y + "��ǥ�� �̵��մϴ�.");
	}

}
