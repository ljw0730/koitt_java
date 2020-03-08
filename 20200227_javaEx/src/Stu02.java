
final class Stu02 {

	private static Stu02 s = new Stu02();
	
	private int hak_num;
	private String name;
	private int kor;
	
	private Stu02() {	// private이므로 다른 클래스에서 이 생성자로는 객체생성을 할 수 없다.
		
	}
	
	public static Stu02 getInstance() {
		if(s == null) {
			s = new Stu02();
		}
		
		return s;
	}
	
	public int getHak_num() {
		return hak_num;
	}

	public void setHak_num(int hak_num) {
		this.hak_num = hak_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public String toString() {
		return "학번 : " + this.hak_num + " / 이름 : " + this.name + " / 국어 : " + this.kor;
	}
	
}
