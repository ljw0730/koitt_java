
class CEx20200226_08 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		Time t = new Time();
		t.setT(19);	// private�� ���� Ŭ���� �������� ��� �����ϱ�
					// ������ �޼ҵ带 ���� ���� �����ؾ� �Ѵ�.
		System.out.println(t.getT());
		
		t.tt = 29;	// ���� ��Ű�� ���� �ֱ� ������ ������ �����ϴ�
	}

}

class Data {
	int x;
	
}

class Time {
	private int t;
	protected int tt;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
	
	
}