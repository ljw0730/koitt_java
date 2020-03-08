
public class CEx20200303_02 {

	public static void main(String[] args) {

		A a = new A();
		a.methodA(new B());
		
	}

}

class A {
	public void methodA(I i) {
		System.out.println("methodA 메소드 호출");
		i.methodB();
	}
}

interface I {
	public void methodB();
}

class B implements I {
	public void methodB() {
		System.out.println("methodB 메소드 호출");
	}
}