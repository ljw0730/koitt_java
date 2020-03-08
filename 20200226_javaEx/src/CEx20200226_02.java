
public class CEx20200226_02 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();

	} //main

} //CEx20200226_02 class

class Parent2 {
	int x = 20;
}

class Child2 extends Parent2 {
	
	void method() {
		System.out.println("local x : " + x);
		System.out.println("인스턴스 x : " + this.x);
		System.out.println("조상 x : " + super.x);
	}
}
