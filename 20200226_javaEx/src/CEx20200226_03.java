
public class CEx20200226_03 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method();

	} //main

} //CEx20200226_03 class

class Parent3 extends Object{ //extends�� ���ϰ� �����ϸ� �ڵ����� Object�� extends ���ش�.
	int x = 20;
	
	Parent3() {		//��������ָ� ������ �� �ڵ����� ����
		super();	//��������ָ� ������ �� �ڵ����� ����
	}
}

class Child3 extends Parent3 {

	Child3() {		//��������ָ� ������ �� �ڵ����� ����
		super();	//��������ָ� ������ �� �ڵ����� ����
	}
	
	void method() {
		System.out.println("local x : " + x);
		System.out.println("�ν��Ͻ� x : " + this.x);
		System.out.println("���� x : " + super.x);
	}
}
