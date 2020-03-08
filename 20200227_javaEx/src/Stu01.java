
class Stu01 extends Object {

//	private static Stu01 s = new Stu01();
	
	static int count = 0;
	int hak_num;
	String name;
	
	{	// 인스턴스 초기화 블럭
		count++;
		hak_num = count;
	}
	
	Stu01() {
		this("홍길동");
	}
	
	Stu01(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return "학번 : " + this.hak_num + " / 이름 : " + this.name;
	}
}
