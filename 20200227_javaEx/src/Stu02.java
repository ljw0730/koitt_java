
final class Stu02 {

	private static Stu02 s = new Stu02();
	
	private int hak_num;
	private String name;
	private int kor;
	
	private Stu02() {	// private�̹Ƿ� �ٸ� Ŭ�������� �� �����ڷδ� ��ü������ �� �� ����.
		
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
		return "�й� : " + this.hak_num + " / �̸� : " + this.name + " / ���� : " + this.kor;
	}
	
}
