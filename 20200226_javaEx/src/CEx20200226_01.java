
public class CEx20200226_01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	} //main

} //CEx20200226_01 class

class Parent {
	int x = 20;
}

class Child extends Parent {
	int x = 50;
	
	void method() {
		int x = 100;
		System.out.println("local x : " + x);
		System.out.println("�ν��Ͻ� x : " + this.x);
		System.out.println("���� x : " + super.x);
	}
}