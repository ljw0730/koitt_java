
class Stu01 extends Object {

//	private static Stu01 s = new Stu01();
	
	static int count = 0;
	int hak_num;
	String name;
	
	{	// �ν��Ͻ� �ʱ�ȭ ��
		count++;
		hak_num = count;
	}
	
	Stu01() {
		this("ȫ�浿");
	}
	
	Stu01(String name) {
		super();
		this.name = name;
	}
	
	public String toString() {
		return "�й� : " + this.hak_num + " / �̸� : " + this.name;
	}
}
