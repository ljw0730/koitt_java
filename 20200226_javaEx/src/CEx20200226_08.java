
class CEx20200226_08 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		Time t = new Time();
		t.setT(19);	// private로 같은 클래스 내에서만 사용 가능하기
					// 때문에 메소드를 통해 값을 변경해야 한다.
		System.out.println(t.getT());
		
		t.tt = 29;	// 같은 패키지 내에 있기 때문에 접근이 가능하다
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